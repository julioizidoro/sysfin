/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tela.ContasPagar;

import java.io.File;
import model.Cliente;

/**
 *
 * @author Wolverine
 */
public interface IContasPagar {
    
    void setModel();
    void setArquivo(File arquivo, int numeroArquivo);
    void setCliente(Cliente cliente);
    void exportarExcel(String caminho, String nomeArquivo);
}
