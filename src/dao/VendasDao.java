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
import model.Emissaonota;
import model.Vendas;
import modelView.Viewvendas;
import singleton.ConectionFactory;

/**
 *
 * @author Wolverine
 */
public class VendasDao {
    
    public Vendas salvar(Vendas venda) throws SQLException{
        EntityManager manager = ConectionFactory.getConnection();
        manager.getTransaction().begin();
        venda = manager.merge(venda);
        manager.getTransaction().commit();
        return venda;
    }
    
    public List<Viewvendas> listar(String sql) throws SQLException{
        EntityManager manager = ConectionFactory.getConnection();
        manager.getTransaction().begin();
        Query q = manager.createQuery(sql);
        List<Viewvendas> lista = q.getResultList();
        manager.getTransaction().commit();
        return lista;
    }
    
    public Vendas consultar(int idVenda) throws SQLException{
        EntityManager manager = ConectionFactory.getConnection();
        manager.getTransaction().begin();
        Vendas venda = manager.find(Vendas.class, idVenda);
        manager.getTransaction().commit();
        return venda;
    }
    
    public void Excluir(int idVendas) throws SQLException{
        EntityManager manager = ConectionFactory.getConnection();
        manager.getTransaction().begin();
        Vendas venda = manager.find(Vendas.class, idVendas);
        if (venda!=null){
            manager.remove(venda);
        }
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
                JOptionPane.showMessageDialog(null, "Vendas Exportada com Sucesso");
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
    
    public Emissaonota salvar(Emissaonota emissaonota)throws SQLException{
        EntityManager manager = ConectionFactory.getConnection();
        manager.getTransaction().begin();
        emissaonota = manager.merge(emissaonota);
        manager.getTransaction().commit();
        return emissaonota;
    }
    
    public Emissaonota getEmissao(int idVendas) throws SQLException{
        EntityManager manager = ConectionFactory.getConnection();
        manager.getTransaction().begin();
        Query q = manager.createQuery("select e from Emissaonota e where e.vendas=" + idVendas);
        manager.getTransaction().commit();
        if (q.getResultList().size()>0){
            Emissaonota emissor = (Emissaonota) q.getResultList().get(0);
            return emissor;
        }
        
        return null;
    }
    
}
