/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package tela.Vendas;

import java.awt.Image;
import java.util.Date;
import java.util.List;
import javax.swing.table.AbstractTableModel;
import modelView.Viewvendas;
import tela.util.Formatacao;

/**
 *
 * @author Wolverine
 */
public class parcelasTableModel extends AbstractTableModel{
    
    private List<ParcelasBean> listaParcela;
    private String[] colunas ={"No. Documento", "Data Lancamento", "Parcela", "Data Vencimento", " Valor Parcela", "Tipo Documento"};

    public parcelasTableModel(List<ParcelasBean> listaParcela) {
        this.listaParcela = listaParcela;
    }

    @Override
    public int getRowCount() {
        return listaParcela.size();
    }

    @Override
    public int getColumnCount() {
        return colunas.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        if (columnIndex==0){
            return listaParcela.get(rowIndex).getNumeroDocumento();
        }else if (columnIndex==1){
            return listaParcela.get(rowIndex).getDataLancamento();
        }else if (columnIndex==2){
            return listaParcela.get(rowIndex).getNumeroParcela();
        }else if (columnIndex==3){
            return listaParcela.get(rowIndex).getDataVenciemnto();
        }else if (columnIndex==4){
            return Formatacao.foramtarFloatString(listaParcela.get(rowIndex).getValorParcelas());
        }else return listaParcela.get(rowIndex).getTipoDocumento();
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
             return  Date.class;
         }else if (columnIndex==2){
             return Integer.class;
         }else if (columnIndex==3){
             return Date.class;
         }else if (columnIndex==4){
             return String.class;
         }else return String.class;
    }
    
    @Override
    public boolean isCellEditable(int row, int col) {    
        if (col==0){
            return true;
        }else if (col==3){
            return true;
        }else if (col==4){
            return true;
        }
        return false;
    }
    
    
    
}
