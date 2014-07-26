/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package tela.ContasReceber;

import model.Cliente;

/**
 *
 * @author Wolverine
 */
public interface IContasReceber {
    
    void setModel();
    void setCliente(Cliente cliente);
    void exportarExcel(String caminho, String nomeArquivo);
    void pesquisar(String sql);
    
}
