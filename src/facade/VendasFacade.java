/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package facade;

import dao.VendasDao;
import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import model.Vendas;
import modelView.Viewvendas;

/**
 *
 * @author Wolverine
 */
public class VendasFacade {
    
    VendasDao vendasDao;
    
    public Vendas salvar(Vendas venda) throws SQLException{
        vendasDao = new VendasDao();
        return vendasDao.salvar(venda);
    }
    
    public List<Viewvendas> listar(String sql) throws SQLException{
        vendasDao = new VendasDao();
        return vendasDao.listar(sql);
    }
    
    public Vendas consultar(int idVenda) throws SQLException{
        vendasDao = new VendasDao();
        return vendasDao.consultar(idVenda);
    }
    
    public void Excluir(int idVendas) throws SQLException{
        vendasDao = new VendasDao();
        vendasDao.Excluir(idVendas);
    }
    
    public ResultSet ExportarExcel(String nomeRelatorio, String local, String porta, String senha, String banco, String usuario, String caminhoSalvarExcel, String sql) throws IOException {
        vendasDao = new VendasDao();
        return vendasDao.ExportarExcel(nomeRelatorio, local, porta, senha, banco, usuario, caminhoSalvarExcel, sql);
    }
    
}
