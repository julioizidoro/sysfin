/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package facade;

import dao.FormaPagamentoDao;
import java.sql.SQLException;
import java.util.List;
import model.Formapagamento;

/**
 *
 * @author Wolverine
 */
public class FormaPagamentoFacade {
    
    FormaPagamentoDao formaPagamentoDao;
    
    public Formapagamento salvar(Formapagamento formaPagamento) throws SQLException{
        formaPagamentoDao = new FormaPagamentoDao();
        return formaPagamentoDao.salvar(formaPagamento);
    }
    
    public void Excluir(int idFormaPagamento) throws SQLException{
        formaPagamentoDao = new FormaPagamentoDao();
        formaPagamentoDao.Excluir(idFormaPagamento);
    }
    
    public List<Formapagamento> listar(int idVenda) throws SQLException{
        formaPagamentoDao = new FormaPagamentoDao();
        return formaPagamentoDao.listar(idVenda);
    }
    
}
