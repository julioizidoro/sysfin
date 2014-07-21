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
import singleton.ConexaoSingleton;

/**
 *
 * @author Wolverine
 */
public class BancoDao {
    
    private EntityManager manager;
    
    public Banco salvar(Banco banco) throws SQLException{
        manager = ConexaoSingleton.getConexao();
        //abrindo uma transação
        manager.getTransaction().begin();
        banco = manager.merge(banco);
        //fechando uma transação
        manager.getTransaction().commit();
        return banco;
    }
    
    public List<Banco> listar(int idCliente) throws SQLException{
        manager = ConexaoSingleton.getConexao();
        Query q = manager.createQuery("Select b from Banco b where b.cliente=" + idCliente);
        return q.getResultList();
    }
    
    public Banco consultar(int idBanco) throws SQLException{
        manager = ConexaoSingleton.getConexao();
        //abrindo uma transação
        manager.getTransaction().begin();
        Banco banco = manager.find(Banco.class, idBanco);
        //fechando uma transação
        manager.getTransaction().commit();
        return banco;
    }
    
    public Banco consultar(int idCliente, String nome) throws SQLException{
        manager = ConexaoSingleton.getConexao();
        Query q = manager.createQuery("Select b from Banco b where b.cliente=" + idCliente +
                " and b.nome='" + nome + "'");
        if (q.getResultList().size()>0){
            return (Banco) q.getResultList().get(0);
        }
        return null;
    }
    
   
    
}
