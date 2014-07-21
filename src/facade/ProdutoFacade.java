/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package facade;

import dao.ProdutoDao;
import java.sql.SQLException;
import java.util.List;
import model.Produto;

/**
 *
 * @author Wolverine
 */
public class ProdutoFacade {
    
    ProdutoDao produtoDao;
    
    public List<Produto> listar(int idCliente) throws SQLException{
        produtoDao = new ProdutoDao();
        return produtoDao.listar(idCliente);
    }
    
    public Produto consultar(int idProduto) throws SQLException{
        produtoDao = new ProdutoDao();
        return produtoDao.consultar(idProduto);
    }
    
    public Produto salvar(Produto produto) throws SQLException{
        produtoDao = new ProdutoDao();
        return produtoDao.salvar(produto);
    }
    
}
