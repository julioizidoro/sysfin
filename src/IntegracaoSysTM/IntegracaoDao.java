/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package IntegracaoSysTM;

import java.io.IOException;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.persistence.EntityManager;
import javax.persistence.Query;
import model.Cliente;
import model.Produto;
import singleton.ConectionFactory;
import singleton.ConexaoSingletonTM;

/**
 *
 * @author Wolverine
 */
public class IntegracaoDao {
    
    private EntityManager manager;
    
    
    
    public Viewvendasintegracao consultarVendas(int idVenda) throws SQLException{
        manager = ConexaoSingletonTM.getConexao();
        Query q = manager.createQuery("select v from Viewvendasintegracao v where v.idvendas=" + idVenda);
        if (q.getResultList().size() > 0) {
            return  (Viewvendasintegracao) q.getResultList().get(0);
        } else {
            return null;
        }
    }
    
    public List<SParcelamentopagamento> listarParcelmanetoFormaPagamento(int idFormaPagamento) throws SQLException{
        manager = ConexaoSingletonTM.getConexao();
        Query q = manager.createQuery("select p from SParcelamentopagamento p where p.idformapagamento=" + idFormaPagamento);
        return q.getResultList();
    }
    
    
    public Produto consultarProduto(int idCliente, int codigosystm) throws SQLException{
        EntityManager manager = ConectionFactory.getConnection();
        Query q = manager.createQuery("Select p from Produto p where p.cliente=" + idCliente + " and p.codigosystm=" + codigosystm);
        Produto produto = null;
        if (q.getResultList().size()>0){
            produto = (Produto) q.getResultList().get(0);
        }
        return null;
    }
    
    public Cliente consultarClietne(int codigosystm) throws SQLException{
        EntityManager manager = ConectionFactory.getConnection();
        Query q = manager.createQuery("select c from Cliente c where c.codigosystm=" + codigosystm);
        Cliente cliente = null;
        if (q.getResultList().size()>0){
            cliente = (Cliente) q.getResultList().get(0);
        }
        return cliente;
    }
    
    public Orcamentoprodutosorcamento consultarOrcamentoProdutoOrcamento(int idOrcamento, int idProdutoOrcamento) throws SQLException{
        EntityManager manager = ConectionFactory.getConnection();
        Query q = manager.createQuery("select o from Orcamentoprodutosorcamento o where o.orcamento=" + idOrcamento + 
                " and o.produtosOrcamento=" + idProdutoOrcamento);
        if (q.getResultList().size() > 0) {
            return  (Orcamentoprodutosorcamento) q.getResultList().get(0);
        } else {
            return null;
        }
    }
    
    public void salvar(String local, String porta, String senha, String banco, String usuario, int idVenda) throws IOException {

        ResultSet rs;
        try {
            Class.forName("com.mysql.jdbc.Driver").newInstance();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(IntegracaoDao.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            Logger.getLogger(IntegracaoDao.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            Logger.getLogger(IntegracaoDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        String conexao = "jdbc:mysql://" + local + ":" + porta + "/" + banco;
        com.mysql.jdbc.Connection conn = null;
        try {
            conn = (com.mysql.jdbc.Connection) DriverManager.getConnection(conexao, usuario, senha);
        } catch (SQLException ex) {
            Logger.getLogger(IntegracaoDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        com.mysql.jdbc.Statement stm = null;
        try {
            stm = (com.mysql.jdbc.Statement) conn.createStatement();
        } catch (SQLException ex) {
            Logger.getLogger(IntegracaoDao.class.getName()).log(Level.SEVERE, null, ex);
        }

        try {
            stm.execute("USE systm"); //Nome do DATABASE A SER ACESSADO  
        } catch (SQLException ex) {
            Logger.getLogger(IntegracaoDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        String sql = "Update vendas set vendaimportada=1 where idvendas=" + idVenda + " ";
        try {
            stm.executeUpdate(sql);
            conn.close();
        } catch (SQLException ex) {
            Logger.getLogger(IntegracaoDao.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
    
   
