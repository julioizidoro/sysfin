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
        ConectionFactory conexao = new ConectionFactory();
        EntityManager manager = conexao.getConnection();
        manager.getTransaction().begin();
        banco = manager.merge(banco);
        manager.getTransaction().commit();
        manager.close();
        return banco;
    }
    
    public List<Banco> listar(int idCliente) throws SQLException{
        ConectionFactory conexao = new ConectionFactory();
        EntityManager manager = conexao.getConnection();
        Query q = manager.createQuery("Select b from Banco b where b.cliente=" + idCliente);
        List<Banco> lista = q.getResultList();
        manager.close();
        return lista;
    }
    
    public Banco consultar(int idBanco) throws SQLException{
        ConectionFactory conexao = new ConectionFactory();
        EntityManager manager = conexao.getConnection();
        Banco banco = manager.find(Banco.class, idBanco);
        manager.close();
        return banco;
    }
    
    public Banco consultar(int idCliente, String nome) throws SQLException{
        ConectionFactory conexao = new ConectionFactory();
        EntityManager manager = conexao.getConnection();
        Query q = manager.createQuery("Select b from Banco b where b.cliente=" + idCliente +
                " and b.nome='" + nome + "'");
        Banco banco = null;
        if (q.getResultList().size()>0){
            banco= (Banco) q.getResultList().get(0);
        }
        manager.close();
        return banco;
    }
}
