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
import model.Banco;
import singleton.ConectionFactory;

/**
 *
 * @author Wolverine
 */
public class BancoDao {
    
    public Banco salvar(Banco banco) throws SQLException{
        EntityManager manager = ConectionFactory.getConnection();
        manager.getTransaction().begin();
        banco = manager.merge(banco);
        manager.getTransaction().commit();
        return banco;
    }
    
    public List<Banco> listar(int idCliente) throws SQLException{
        EntityManager manager = ConectionFactory.getConnection();
        manager.getTransaction().begin();
        Query q = manager.createQuery("Select b from Banco b where b.cliente=" + idCliente);
        List<Banco> lista = q.getResultList();
        manager.getTransaction().commit();
        return lista;
    }
    
    public Banco consultar(int idBanco) throws SQLException{
        EntityManager manager = ConectionFactory.getConnection();
        manager.getTransaction().begin();
        Banco banco = manager.find(Banco.class, idBanco);
        manager.getTransaction().commit();
        return banco;
    }
    
    public Banco consultar(int idCliente, String nome) throws SQLException{
        EntityManager manager = ConectionFactory.getConnection();
        manager.getTransaction().begin();
        Query q = manager.createQuery("Select b from Banco b where b.cliente=" + idCliente +
                " and b.nome='" + nome + "'");
        Banco banco = null;
        if (q.getResultList().size()>0){
            banco= (Banco) q.getResultList().get(0);
        }
        manager.getTransaction().commit();
        return banco;
    }
}
