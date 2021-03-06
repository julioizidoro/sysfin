/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package dao;

import java.sql.SQLException;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Query;
import model.Planocontas;
import singleton.ConectionFactory;

/**
 *
 * @author Wolverine
 */
public class PlanoContasDao {
    
    public Planocontas salvar(Planocontas plano) throws SQLException{
        EntityManager manager = ConectionFactory.getConnection();
        manager.getTransaction().begin();
        plano = manager.merge(plano);
        manager.getTransaction().commit();
        return plano;
    }
    
    public List<Planocontas> listar() throws SQLException{
        EntityManager manager = ConectionFactory.getConnection();
        manager.getTransaction().begin();
        Query q = manager.createQuery("Select p from Planocontas p order by p.descricao");
        List<Planocontas> lista = q.getResultList();
        manager.getTransaction().commit();
        return lista;
    }
    
    public List<Planocontas> listar(String descricao) throws SQLException{
        EntityManager manager = ConectionFactory.getConnection();
        manager.getTransaction().begin();
        Query q = manager.createQuery("Select p from Planocontas p where p.descricao like '%" + descricao + "%'  order by p.descricao"); 
        List<Planocontas> lista = q.getResultList();
        manager.getTransaction().commit();
        return lista;
    }
    
    public Planocontas consultar(int idPlanoContas) throws SQLException{
        EntityManager manager = ConectionFactory.getConnection();
        manager.getTransaction().begin();
        Planocontas plano = manager.find(Planocontas.class, idPlanoContas);
        manager.getTransaction().commit();
        return plano;
    }
    
}
