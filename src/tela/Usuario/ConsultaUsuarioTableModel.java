/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tela.Usuario;

import java.util.List;
import javax.swing.table.AbstractTableModel;
import model.Usuario;

/**
 *
 * @author Wolverine
 */
public class ConsultaUsuarioTableModel extends AbstractTableModel{
    
    private List<Usuario> listaUusarios;
    private String[] colunas ={"Nome", "Login", "Cliente","E-mail"};

    public ConsultaUsuarioTableModel(List<Usuario> listaUusarios) {
        this.listaUusarios = listaUusarios;
    }

    @Override
    public int getRowCount() {
        return listaUusarios.size();
    }

    @Override
    public int getColumnCount() {
        return colunas.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        if(columnIndex==0){
            return listaUusarios.get(rowIndex).getNome();
        }else if (columnIndex==1){
            return listaUusarios.get(rowIndex).getLogin();
        }else if (columnIndex==2){
            return listaUusarios.get(rowIndex).getCliente();
        }else return listaUusarios.get(rowIndex).getEmail();
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
         }else if (columnIndex==2){
             return Integer.class;
         }else return String.class;
    }
}
