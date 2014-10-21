/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package facade;

import dao.FluxoCaixaDao;
import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import model.Fluxocaixa;

/**
 *
 * @author Julio
 */
public class FluxoCaixaFacade {
    
    FluxoCaixaDao fluxoCaixaDao;
    
    public Fluxocaixa salvar(Fluxocaixa fluxo) throws SQLException{
        fluxoCaixaDao = new FluxoCaixaDao();
        return fluxoCaixaDao.salvar(fluxo);
    }
    
    public List<Fluxocaixa> listar(int idCliente) throws SQLException{
        fluxoCaixaDao = new FluxoCaixaDao();
        return fluxoCaixaDao.listar(idCliente);
    }
    
    public void excluir(int idCliente)throws SQLException{
        fluxoCaixaDao = new FluxoCaixaDao();
        fluxoCaixaDao.excluir(idCliente);
    }
    
    public ResultSet ExportarExcel(String nomeRelatorio, String local, String porta, String senha, String banco, String usuario, String caminhoSalvarExcel, String sql) throws IOException {
        fluxoCaixaDao = new FluxoCaixaDao();
        return fluxoCaixaDao.ExportarExcel(nomeRelatorio, local, porta, senha, banco, usuario, caminhoSalvarExcel, sql);
    }
    
}
