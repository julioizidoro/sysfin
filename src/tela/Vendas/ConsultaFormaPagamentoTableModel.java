/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package tela.Vendas;

import java.util.Date;
import java.util.List;
import javax.swing.table.AbstractTableModel;
import model.Formapagamento;
import tela.util.Formatacao;

/**
 *
 * @author Wolverine
 */
public class ConsultaFormaPagamentoTableModel extends AbstractTableModel{
    
    private List<Formapagamento> lista;
    private String[] colunas ={"Tipo Documento", "Data Vencimento", "No. Parcelas", "Valor"};

    public ConsultaFormaPagamentoTableModel(List<Formapagamento> lista) {
        this.lista = lista;
    }

    @Override
    public int getRowCount() {
        return lista.size();
    }

    @Override
    public int getColumnCount() {
        return colunas.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        if (columnIndex==0){
            return lista.get(rowIndex).getTipoDocumento();
        }else if (columnIndex==1){
            return lista.get(rowIndex).getDataVencimento();
        }else if (columnIndex==2){
            return lista.get(rowIndex).getNumeroParcelas();
        }else return Formatacao.foramtarFloatString(lista.get(rowIndex).getValor());
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
         }else return String.class;
    }
    
    
    
}
