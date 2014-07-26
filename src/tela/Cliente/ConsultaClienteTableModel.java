/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tela.Cliente;

import java.util.List;
import javax.swing.table.AbstractTableModel;
import model.Cliente;


/**
 *
 * @author Wolverine
 */
public class ConsultaClienteTableModel extends AbstractTableModel{
    
    private List<Cliente> listaCliente;
    private String[] colunas ={"Nome", "Fone Fixo", "E-mail"};

    public ConsultaClienteTableModel(List<Cliente> listaCliente) {
        this.listaCliente = listaCliente;
    }

    @Override
    public int getRowCount() {
        return listaCliente.size();
    }

    @Override
    public int getColumnCount() {
        return colunas.length;    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        if (columnIndex==0){
            return listaCliente.get(rowIndex).getNomeFantasia();
        }else if (columnIndex==1){
            return listaCliente.get(rowIndex).getFoneFixo();
        }else return listaCliente.get(rowIndex).getEmail();
    }
    
    @Override
    public String getColumnName(int column) {
        return colunas[column];
    }

    @Override
    public Class<?> getColumnClass(int columnIndex) {
        if (columnIndex==0){
             return String.class;
         }else if (columnIndex==1){
             return  String.class;
         }else return String.class;
    }
    
    
    
}
