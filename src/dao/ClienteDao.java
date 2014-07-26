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
import model.Cliente;
import singleton.ConexaoSingleton;

/**
 *
 * @author Wolverine
 */
public class ClienteDao {
    
    private EntityManager manager;
    
    public Cliente salvar(Cliente cliente) throws SQLException{
        manager = ConexaoSingleton.getConexao();
        //abrindo uma transação
        manager.getTransaction().begin();
        cliente = manager.merge(cliente);
        //fechando uma transação
        manager.getTransaction().commit();
        return cliente;
    }
    
    public Cliente consultar(int idCliente) throws SQLException{
        manager = ConexaoSingleton.getConexao();
        Query q = manager.createQuery("select c from Cliente c where c.idcliente=" + idCliente);
        if (q.getResultList().size()>0){
            return (Cliente) q.getResultList().get(0);
        }
        return null;
    }
    
    public List<Cliente> listar(String nome) throws SQLException{
        manager = ConexaoSingleton.getConexao();
        Query q = manager.createQuery("select c from Cliente c where c.nomeFantasia like '%" +nome + "%' order by c.razaoSocial");
        return q.getResultList();
    }
    
}
