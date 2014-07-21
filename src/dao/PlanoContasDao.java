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
import singleton.ConexaoSingleton;

/**
 *
 * @author Wolverine
 */
public class PlanoContasDao {
    
    private EntityManager manager;
    
    public Planocontas salvar(Planocontas plano) throws SQLException{
        manager = ConexaoSingleton.getConexao();
        //abrindo uma transação
        manager.getTransaction().begin();
        plano = manager.merge(plano);
        //fechando uma transação
        manager.getTransaction().commit();
        return plano;
    }
    
    public List<Planocontas> listar() throws SQLException{
        manager = ConexaoSingleton.getConexao();
        Query q = manager.createQuery("Select p from Planocontas p order by p.descricao");
        return q.getResultList();
    }
    
    public List<Planocontas> listar(String descricao) throws SQLException{
        manager = ConexaoSingleton.getConexao();
        Query q = manager.createQuery("Select p from Planocontas p where p.descricao like '%" + descricao + "%'  order by p.descricao"); 
        return q.getResultList();
    }
    
    public Planocontas consultar(int idPlanoContas) throws SQLException{
        manager = ConexaoSingleton.getConexao();
        //abrindo uma transação
        manager.getTransaction().begin();
        Planocontas plano = manager.find(Planocontas.class, idPlanoContas);
        //fechando uma transação
        manager.getTransaction().commit();
        return plano;
    }
    
}
