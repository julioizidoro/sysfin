/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tela.ContasPagar;


import java.util.Date;
import java.util.List;
import javax.swing.table.AbstractTableModel;
import model.Contaspagar;
import tela.util.Formatacao;

/**
 *
 * @author Wolverine
 */
public class LiberarContasPagarTableModel extends AbstractTableModel{
    
    private List<Contaspagar> listaContasPagar;
    private String[] colunas ={"Data Vencimento", "Descrição", "Valor da Conta"};

    public LiberarContasPagarTableModel(List<Contaspagar> listaContasPagar) {
        this.listaContasPagar = listaContasPagar;
    }

    public int getRowCount() {
        return this.listaContasPagar.size();
    }

    public int getColumnCount() {
        return colunas.length;
    }

    public Object getValueAt(int rowIndex, int columnIndex) {
        if (columnIndex==0){
            return listaContasPagar.get(rowIndex).getDataVencimento();
        }else if (columnIndex==1){
            return listaContasPagar.get(rowIndex).getDescricao();
        }else return Formatacao.foramtarFloatString(listaContasPagar.get(rowIndex).getValor());
    }
    
    @Override
    public String getColumnName(int column) {
        return colunas[column];
    }

    @Override
    public Class<?> getColumnClass(int columnIndex) {
        if (columnIndex==0){
             return  Date.class;
         }else if (columnIndex==1){
             return String.class;
         }else return String.class;
    }
}
