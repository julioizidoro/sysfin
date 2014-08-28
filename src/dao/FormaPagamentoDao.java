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
import singleton.ConectionFactory;

/**
 *
 * @author Wolverine
 */
public class FormaPagamentoDao {
    
    public Formapagamento salvar(Formapagamento formaPagamento) throws SQLException{
        ConectionFactory conexao = new ConectionFactory();
        EntityManager manager = conexao.getConnection();
        manager.getTransaction().begin();
        formaPagamento = manager.merge(formaPagamento);
        manager.getTransaction().commit();
        manager.close();
        return formaPagamento;
    }
    
    public void Excluir(int idFormaPagamento) throws SQLException{
        ConectionFactory conexao = new ConectionFactory();
        EntityManager manager = conexao.getConnection();
        manager.getTransaction().begin();
        Formapagamento formaPagamento = manager.find(Formapagamento.class, idFormaPagamento);
        manager.remove(formaPagamento);
        manager.getTransaction().commit();
        manager.close();
    }
    
    public List<Formapagamento> listar(int idVenda) throws SQLException{
        ConectionFactory conexao = new ConectionFactory();
        EntityManager manager = conexao.getConnection();
        Query q = manager.createQuery("select f from Formapagamento f where f.vendas=" + idVenda) ;
        List<Formapagamento> lista = q.getResultList();
        manager.close();
        return lista;
    }
    
}
