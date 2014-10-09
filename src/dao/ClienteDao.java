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
import singleton.ConectionFactory;


/**
 *
 * @author Wolverine
 */
public class ClienteDao {
    
    
    
    public Cliente salvar(Cliente cliente) throws SQLException{
        ConectionFactory conexao = new ConectionFactory();
        EntityManager manager = conexao.getConnection();
        manager.getTransaction().begin();
        cliente = manager.merge(cliente);
        manager.getTransaction().commit();
        manager.close();
        return cliente;
    }
    
    public Cliente consultar(int idCliente) throws SQLException{
        ConectionFactory conexao = new ConectionFactory();
        EntityManager manager = conexao.getConnection();
        Query q = manager.createQuery("select c from Cliente c where c.idcliente=" + idCliente);
        Cliente cliente = null;
        if (q.getResultList().size()>0){
            cliente = (Cliente) q.getResultList().get(0);
        }
        manager.close();
        return cliente;
    }
    
    public List<Cliente> listar(String nome) throws SQLException{
        ConectionFactory conexao = new ConectionFactory();
        EntityManager manager = conexao.getConnection();
        Query q = manager.createQuery("select c from Cliente c where c.nomeFantasia like '%" +nome + "%' order by c.razaoSocial");
        List<Cliente> lista = q.getResultList();
        manager.close();
        return lista;
    }
    
}
