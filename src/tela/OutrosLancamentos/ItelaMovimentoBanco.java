/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package tela.OutrosLancamentos;

import model.Cliente;

/**
 *
 * @author Wolverine
 */
public interface ItelaMovimentoBanco {
    
    void setModel();
    void setCliente(Cliente cliente);
    void exportarExcel(String caminho, String nomeArquivo);
    void setNumeroColuna(int numero);
}
