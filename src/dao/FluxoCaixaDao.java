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
import model.Fluxocaixa;
import singleton.ConectionFactory;

/**
 *
 * @author Julio
 */
public class FluxoCaixaDao {
    
    public Fluxocaixa salvar(Fluxocaixa fluxo) throws SQLException{
        ConectionFactory conexao = new ConectionFactory();
        EntityManager manager = conexao.getConnection();
        manager.getTransaction().begin();
        fluxo = manager.merge(fluxo);
        manager.getTransaction().commit();
        manager.close();
        return fluxo;
    }
    
    public List<Fluxocaixa> listar(int idCliente) throws SQLException{
        ConectionFactory conexao = new ConectionFactory();
        EntityManager manager = conexao.getConnection();
        Query q = manager.createQuery("select f from Fluxocaixa f where f.cliente.idcliente=" + idCliente);
        List<Fluxocaixa> listaFluxo = q.getResultList();
        manager.close();
        return listaFluxo;
    }
    
    public void excluir(int idCliente) throws SQLException{
        ConectionFactory conexao = new ConectionFactory();
        EntityManager manager = conexao.getConnection();
        manager.getTransaction().begin();
        Query q = manager.createNativeQuery("Delete from fluxocaixa where cliente_idcliente=" + idCliente);
        q.executeUpdate();
        manager.getTransaction().commit();
        manager.close();
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
                JOptionPane.showMessageDialog(null, "Fluxo de Caixa Exportado com Sucesso");
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
    
}
