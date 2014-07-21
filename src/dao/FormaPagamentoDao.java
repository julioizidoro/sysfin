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
import model.Formapagamento;
import singleton.ConexaoSingleton;

/**
 *
 * @author Wolverine
 */
public class FormaPagamentoDao {
    
    private EntityManager manager;
    
    public Formapagamento salvar(Formapagamento formaPagamento) throws SQLException{
        manager = ConexaoSingleton.getConexao();
        //abrindo uma transação
        manager.getTransaction().begin();
        formaPagamento = manager.merge(formaPagamento);
        //fechando uma transação
        manager.getTransaction().commit();
        return formaPagamento;
    }
    
    public void Excluir(int idFormaPagamento) throws SQLException{
        manager = ConexaoSingleton.getConexao();
        //abrindo uma transação
        manager.getTransaction().begin();
        Formapagamento formaPagamento = manager.find(Formapagamento.class, idFormaPagamento);
        manager.remove(formaPagamento);
        //fechando uma transação
        manager.getTransaction().commit();
    }
    
    public List<Formapagamento> listar(int idVenda) throws SQLException{
        manager = ConexaoSingleton.getConexao();
        Query q = manager.createQuery("select f from Formapagamento f where f.vendas=" + idVenda) ;
        return q.getResultList();
    }
    
}
