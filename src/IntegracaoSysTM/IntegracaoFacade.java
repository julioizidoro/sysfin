/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package IntegracaoSysTM;

import java.sql.SQLException;
import java.util.List;
import model.Cliente;
import model.Produto;

/**
 *
 * @author Wolverine
 */
public class IntegracaoFacade {
    
    IntegracaoDao integracaoDao;
    
    public Viewvendasintegracao consultarVendas(int idVenda) throws SQLException{
        integracaoDao = new IntegracaoDao();
        return integracaoDao.consultarVendas(idVenda);
    }
    
  
    
    public List<SParcelamentopagamento> listarParcelmanetoFormaPagamento(int idFormaPagamento) throws SQLException{
        integracaoDao = new IntegracaoDao();
        return integracaoDao.listarParcelmanetoFormaPagamento(idFormaPagamento);
    }
    
   
    
    public Produto consultarProduto(int idCliente, int codigosystm) throws SQLException{
        integracaoDao = new IntegracaoDao();
        return integracaoDao.consultarProduto(idCliente, codigosystm);
    }
    
    public Cliente consultarClietne(int codigosystm) throws SQLException{
        integracaoDao = new IntegracaoDao();
        return integracaoDao.consultarClietne(codigosystm);
    }
    
    public Orcamentoprodutosorcamento consultarOrcamentoProdutoOrcamento(int idOrcamento, int idProdutoOrcamento) throws SQLException{
        integracaoDao = new IntegracaoDao();
        return integracaoDao.consultarOrcamentoProdutoOrcamento(idOrcamento, idProdutoOrcamento);
    }
    
}
