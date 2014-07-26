/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package controller;


import facade.VendasFacade;
import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import model.Vendas;
import modelView.Viewvendas;

/**
 *
 * @author Wolverine
 */
public class VendasController {
    
    VendasFacade vendasFacade;
    
    public Vendas salvar(Vendas venda) {
        vendasFacade = new VendasFacade();
        try {
            return vendasFacade.salvar(venda);
        } catch (SQLException ex) {
            Logger.getLogger(VendasController.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, " Erro Salvar Vendas");
            return null;
        }
    }
    
    public List<Viewvendas> listar(String sql) {
        vendasFacade = new VendasFacade();
        try {
            return vendasFacade.listar(sql);
        } catch (SQLException ex) {
            Logger.getLogger(VendasController.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, " Erro Listar Vendas");
            return null;
        }
    }
    
    public Vendas consultar(int idVenda) {
        vendasFacade = new VendasFacade();
        try {
            return vendasFacade.consultar(idVenda);
        } catch (SQLException ex) {
            Logger.getLogger(VendasController.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, " Erro Consultar Vendas");
            return null;
        }
    }
    
    public void Excluir(int idVendas) {
        vendasFacade = new VendasFacade();
        try {
            vendasFacade.Excluir(idVendas);
        } catch (SQLException ex) {
            Logger.getLogger(VendasController.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, " Erro Excluir Vendas");
        }
    }
    
    public ResultSet ExportarExcel(String nomeRelatorio, String local, String porta, String senha, String banco, String usuario, String caminhoSalvarExcel, String sql)  {
         vendasFacade = new VendasFacade();
        try {
            return vendasFacade.ExportarExcel(nomeRelatorio, local, porta, senha, banco, usuario, caminhoSalvarExcel, sql);
        } catch (IOException ex) {
             Logger.getLogger(VendasController.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Erro exportar relatório Vendas");
            return null;
        }
    }
    
}
