/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package tela.Banco;

import java.util.List;
import javax.swing.table.AbstractTableModel;
import model.Banco;

/**
 *
 * @author Wolverine
 */
public class ConsultaContaTableModel extends AbstractTableModel{
    
    private List<Banco> listaBanco;
    private String[] colunas ={"Nome", "Agencia", "Conta"};

    public ConsultaContaTableModel(List<Banco> listaBanco) {
        this.listaBanco = listaBanco;
    }

    @Override
    public int getRowCount() {
        return listaBanco.size();
    }

    @Override
    public int getColumnCount() {
        return colunas.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        if (columnIndex==0){
            return listaBanco.get(rowIndex).getNome();
        }else if (columnIndex==1){
            return listaBanco.get(rowIndex).getAgencia();
        }else return listaBanco.get(rowIndex).getConta();
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
