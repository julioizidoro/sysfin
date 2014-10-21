/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package facade;

import dao.ContasReceberDao;
import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import model.Contasreceber;
import modelView.Viewcontasreceber;
import modelView.Viewcontasreceberfluxo;

/**
 *
 * @author Wolverine
 */
public class ContasReceberFacade {
    
    ContasReceberDao contasReceberDao;
    
    public Contasreceber salvar(Contasreceber conta) throws SQLException{
        contasReceberDao = new ContasReceberDao();
        return contasReceberDao.salvar(conta);
    }
    
    public List<Viewcontasreceber> listar(String sql) throws SQLException{
        contasReceberDao = new ContasReceberDao();
        return contasReceberDao.listar(sql);  
    }
    
    public Contasreceber consultar(int idConta) throws SQLException{
        contasReceberDao = new ContasReceberDao();
        return contasReceberDao.consultar(idConta);
    }
    
    public void excluir(int idConta) throws SQLException{
        contasReceberDao = new ContasReceberDao();
        contasReceberDao.excluir(idConta);
    }
    
    public Contasreceber consultarVendaFornecedor(int idVenda) throws SQLException{
        contasReceberDao = new ContasReceberDao();
        return contasReceberDao.consultarVendaFornecedor(idVenda);
    }
    
    public ResultSet ExportarExcel(String nomeRelatorio, String local, String porta, String senha, String banco, String usuario, String caminhoSalvarExcel, String sql) throws IOException {
        contasReceberDao = new ContasReceberDao();
        return contasReceberDao.ExportarExcel(nomeRelatorio, local, porta, senha, banco, usuario, caminhoSalvarExcel, sql);
    }
    
    public List<Viewcontasreceberfluxo> listaFluxo(String sql) throws SQLException{
        contasReceberDao = new ContasReceberDao();
        return contasReceberDao.listaFluxo(sql);
    }
    
}
