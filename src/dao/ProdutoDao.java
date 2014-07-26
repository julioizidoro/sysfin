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
import model.Produto;
import singleton.ConexaoSingleton;


/**
 *
 * @author Wolverine
 */
public class ProdutoDao {
    
    private EntityManager manager;
    
    public List<Produto> listar(int idCliente) throws SQLException{
        manager = ConexaoSingleton.getConexao();
        Query q = manager.createQuery("Select p from Produto p where p.cliente=" + idCliente);
        return q.getResultList();
    }
    
    public Produto consultar(int idProduto) throws SQLException{
        manager = ConexaoSingleton.getConexao();
        //abrindo uma transação
        manager.getTransaction().begin();
        Produto produto = manager.find(Produto.class, idProduto);
        //fechando uma transação
        manager.getTransaction().commit();
        return produto;
    }
    
    public Produto salvar(Produto produto) throws SQLException{
        manager = ConexaoSingleton.getConexao();
        //abrindo uma transação
        manager.getTransaction().begin();
        manager.merge(produto);
        //fechando uma transação
        manager.getTransaction().commit();
        return produto;
    }
    
}
