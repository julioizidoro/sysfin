/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package tela.Vendas;

import java.io.File;
import model.Cliente;
import model.Formapagamento;

/**
 *
 * @author Wolverine
 */
public interface IVendas {
    
    void setModel();
    void setCliente(Cliente cliente);
    void setArquivo(File arquivo);
    void setFormaPagamento(Formapagamento formaPagamento);
    void exportarExcel(String caminho, String nomeArquivo);
    void pesquisar(String sql);
}
