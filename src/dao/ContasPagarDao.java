/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package dao;

import java.io.FileWriter;
import java.io.IOException;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Query;
import javax.swing.JOptionPane;
import model.Arquivocontaspagar;
import model.Contaspagar;
import modelView.Viewcontaspagar;
import modelView.Viewcontaspagarfluxo;
import singleton.ConectionFactory;


/**
 *
 * @author Wolverine
 */
public class ContasPagarDao {
    
    public Contaspagar salvar(Contaspagar conta) throws SQLException{
        EntityManager manager = ConectionFactory.getConnection();
        //abrindo uma transação
        manager.getTransaction().begin();
        conta = manager.merge(conta);
        //fechando uma transação
        manager.getTransaction().commit();
        return conta;
    }
    
    public List<Viewcontaspagar> listar(String sql) throws SQLException{
        EntityManager manager = ConectionFactory.getConnection();
        manager.getTransaction().begin();
        Query q = manager.createQuery(sql);
        List<Viewcontaspagar> listaContas = q.getResultList();
        manager.getTransaction().commit();
        return listaContas;
    }

    public List<Contaspagar> listarContas(String sql) throws SQLException{
        EntityManager manager = ConectionFactory.getConnection();
        manager.getTransaction().begin();
        Query q = manager.createQuery(sql);
        List<Contaspagar> listaContas = q.getResultList();
        manager.getTransaction().commit();
        return listaContas;
    }

    
    public Contaspagar consultar(int idConta) throws SQLException{
        EntityManager manager = ConectionFactory.getConnection();
        manager.getTransaction().begin();
        Contaspagar conta = manager.find(Contaspagar.class, idConta);
        manager.getTransaction().commit();
        return conta;
    }
    
    public void excluir(int idConta) throws SQLException{
        EntityManager manager = ConectionFactory.getConnection();
        manager.getTransaction().begin();
        Contaspagar conta = manager.find(Contaspagar.class, idConta);
        manager.remove(conta);
        manager.getTransaction().commit();
    }
    
    public ResultSet ExportarExcel(String nomeRelatorio, String local, String porta, String senha, String banco, String usuario, String caminhoSalvarExcel, String sql) throws IOException {
        try {
            ResultSet rs;
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            try {String conexao = "jdbc:mysql://" + local + ":" + porta + "/" + banco;
                com.mysql.jdbc.Connection conn = (com.mysql.jdbc.Connection) DriverManager.getConnection(conexao, usuario, senha);
                com.mysql.jdbc.Statement stm = (com.mysql.jdbc.Statement) conn.createStatement();

                stm.execute("USE sysfin"); //Nome do DATABASE A SER ACESSADO  
                rs = stm.executeQuery(sql);
                //GiroProdutoController giroProdutoController = new GiroProdutoController();
                
                    StringBuffer contenu; //// acho que seria melhor usar o StringBuilder
                    contenu = new StringBuffer("");
                    ResultSetMetaData rsMeta = rs.getMetaData();
                    for (int i = 1; i <= rsMeta.getColumnCount(); i++) {
                    contenu.append(rsMeta.getColumnLabel(i) + "\t"); /// nesta linha imprime somente os nome dos campos da tabela  
                }
                contenu.append("\n"); // e temos que colocar todos os dados no StringBuffer  
                rs.beforeFirst();
                while (rs.next()) {
                    for (int i = 1; i <= rsMeta.getColumnCount(); i++) {
                        contenu.append(rs.getString(i) + "\t"); /// aqui mostra todos os dados  
                    }
                    contenu.append("\n");

                } //fim do while  
                //agora, salvando o StringBuffer no arquivo  
                FileWriter excelFile = new FileWriter(caminhoSalvarExcel); // nome do arquivo  
                excelFile.write(new String(contenu)); //aqui ele passa a String para salvar  
                excelFile.close();
                JOptionPane.showMessageDialog(null, "Controle Exportado com Sucesso");
                conn.close();
                return rs;
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, ex);
            }
        } catch (ClassNotFoundException ex) {
            ex.printStackTrace();
        } catch (InstantiationException ex) {
            ex.printStackTrace();
        } catch (IllegalAccessException ex) {
            ex.printStackTrace();
        }
        return null;
    }
    
    public Contaspagar consultarVenda(String sql) throws SQLException{
        EntityManager manager = ConectionFactory.getConnection();
        manager.getTransaction().begin();
        Query q = manager.createQuery(sql);
        Contaspagar conta = null;
        if (q.getResultList().size()>0){
            conta = (Contaspagar) q.getResultList().get(0);
        }
        manager.getTransaction().commit();
        return conta;
    }
    
   
    
    public void salvarArquivo(Arquivocontaspagar arquivo) throws SQLException{
        EntityManager manager = ConectionFactory.getConnection();
        //abrindo uma transação
        manager.getTransaction().begin();
        manager.merge(arquivo);
        //fechando uma transação
        manager.getTransaction().commit();
    }
    
    public Arquivocontaspagar consultarArquivo(int idContasPagar) throws SQLException{
        EntityManager manager = ConectionFactory.getConnection();
        manager.getTransaction().begin();
        Query q = manager.createQuery("Select c from  Arquivocontaspagar  c where c.contasPagar=" + idContasPagar);
        Arquivocontaspagar arquivo = null;
        if (q.getResultList().size()>0){
            arquivo =  (Arquivocontaspagar) q.getResultList().get(0);
        }
        manager.getTransaction().commit();
        return arquivo;
    }
    
    public void excluirArquivo(int idArquivo) throws SQLException{
        EntityManager manager = ConectionFactory.getConnection();
        manager.getTransaction().begin();
        Arquivocontaspagar arquivo = manager.find(Arquivocontaspagar.class, idArquivo);
        if (arquivo!=null){
            manager.remove(arquivo);
        }
        manager.getTransaction().commit();
    }
    
    public List<Viewcontaspagarfluxo> listaFluxo(String sql) throws SQLException{
        EntityManager manager = ConectionFactory.getConnection();
        manager.getTransaction().begin();
        Query q = manager.createQuery(sql);
        List<Viewcontaspagarfluxo> listaFluxo= q.getResultList();
        manager.getTransaction().commit();
        return listaFluxo;
    }
    
}
