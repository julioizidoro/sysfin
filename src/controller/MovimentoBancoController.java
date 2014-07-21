/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package controller;

import facade.MovimentoBancoFacade;
import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import model.Banco;
import model.Movimentobanco;

/**
 *
 * @author Wolverine
 */
public class MovimentoBancoController {
    
    MovimentoBancoFacade movimentoBancoFacade;
    
    public Movimentobanco salvar(Movimentobanco movimento) {
        movimentoBancoFacade = new MovimentoBancoFacade();
        try {
            return movimentoBancoFacade.salvar(movimento);
        } catch (SQLException ex) {
            Logger.getLogger(MovimentoBancoController.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Erro Salvar Movimento Banco " + ex);
            return null;
        }
    }
    
    public List<Movimentobanco> listaMovimento(String sql) {
        movimentoBancoFacade = new MovimentoBancoFacade();
        try {
            return movimentoBancoFacade.listaMovimento(sql);
        } catch (SQLException ex) {
            Logger.getLogger(MovimentoBancoController.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Erro Listar Movimento Banco " + ex);
            return null;
        }
    }
    
   
    public void excluir(int idMovimento) {
        movimentoBancoFacade = new MovimentoBancoFacade();
        try {
            movimentoBancoFacade.excluir(idMovimento);
        } catch (SQLException ex) {
            Logger.getLogger(MovimentoBancoController.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Erro Excluir Movimento Banco " + ex);
        }
    }
    
    public ResultSet ExportarExcel(String nomeRelatorio, String local, String porta, String senha, String banco, String usuario, String caminhoSalvarExcel, String sql)  {
        movimentoBancoFacade = new MovimentoBancoFacade();
        try {
            return movimentoBancoFacade.ExportarExcel(nomeRelatorio, local, porta, senha, banco, usuario, caminhoSalvarExcel, sql);
        } catch (IOException ex) {
            Logger.getLogger(MovimentoBancoController.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Erro exportar relatório de conciliação " + ex);
            return null;
        }
    }
    
}
