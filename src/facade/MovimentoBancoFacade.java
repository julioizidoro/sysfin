/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package facade;

import dao.MovimentoBancoDao;
import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import model.Banco;
import model.Movimentobanco;

/**
 *
 * @author Wolverine
 */
public class MovimentoBancoFacade {
    
    MovimentoBancoDao movimentoBancoDao;
    
    public Movimentobanco salvar(Movimentobanco movimento) throws SQLException{
        movimentoBancoDao = new MovimentoBancoDao();
        return movimentoBancoDao.salvar(movimento);
    }
    
    public List<Movimentobanco> listaMovimento(String sql) throws SQLException{
        movimentoBancoDao = new MovimentoBancoDao();
        return movimentoBancoDao.listaMovimento(sql);
    }
    
    public void excluir(int idMovimento) throws SQLException{
        movimentoBancoDao = new MovimentoBancoDao();
        movimentoBancoDao.excluir(idMovimento);
    }
    
    public ResultSet ExportarExcel(String nomeRelatorio, String local, String porta, String senha, String banco, String usuario, String caminhoSalvarExcel, String sql) throws IOException {
        movimentoBancoDao = new MovimentoBancoDao();
        return movimentoBancoDao.ExportarExcel(nomeRelatorio, local, porta, senha, banco, usuario, caminhoSalvarExcel, sql);
    }
}
