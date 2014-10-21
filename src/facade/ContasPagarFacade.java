/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package facade;

import dao.ContasPagarDao;
import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import model.Arquivocontaspagar;
import model.Contaspagar;
import modelView.Viewcontaspagar;
import modelView.Viewcontaspagarfluxo;

/**
 *
 * @author Wolverine
 */
public class ContasPagarFacade {
    
    ContasPagarDao contasPagarDao;
    
    public Contaspagar salvar(Contaspagar conta) throws SQLException{
        contasPagarDao = new ContasPagarDao();
        return contasPagarDao.salvar(conta);
    }
    
    public List<Viewcontaspagar> listar(String sql) throws SQLException{
        contasPagarDao = new ContasPagarDao();
        return contasPagarDao.listar(sql);
    }
    
    public List<Contaspagar> listarContas(String sql) throws SQLException{
        contasPagarDao = new ContasPagarDao();
        return contasPagarDao.listarContas(sql);
    }
    
    public Contaspagar consultar(int idConta) throws SQLException{
        contasPagarDao = new ContasPagarDao();
        return contasPagarDao.consultar(idConta);
    }
    
    public void excluir(int idConta) throws SQLException{
        contasPagarDao = new ContasPagarDao();
        contasPagarDao.excluir(idConta);
    }
    
    public ResultSet ExportarExcel(String nomeRelatorio, String local, String porta, String senha, String banco, String usuario, String caminhoSalvarExcel, String sql) throws IOException {
        contasPagarDao = new ContasPagarDao();
        return contasPagarDao.ExportarExcel(nomeRelatorio, local, porta, senha, banco, usuario, caminhoSalvarExcel, sql);
    }
    
    public Contaspagar consultarVenda(String sql) throws SQLException{
        contasPagarDao = new ContasPagarDao();
        return contasPagarDao.consultarVenda(sql);
    }
    
    public void salvarArquivo(Arquivocontaspagar arquivo) throws SQLException{
        contasPagarDao = new ContasPagarDao();
        contasPagarDao.salvarArquivo(arquivo);
    }
    
    public Arquivocontaspagar consultarArquivo(int idContasPagar) throws SQLException{
        contasPagarDao = new ContasPagarDao();
        return contasPagarDao.consultarArquivo(idContasPagar);
    }
    
    public void excluirArquivo(int idArquivo) throws SQLException{
        contasPagarDao = new ContasPagarDao();
        contasPagarDao.excluirArquivo(idArquivo);
    }
    
    public List<Viewcontaspagarfluxo> listaFluxo(String sql) throws SQLException{
        contasPagarDao = new ContasPagarDao();
        return contasPagarDao.listaFluxo(sql);
    }
}
