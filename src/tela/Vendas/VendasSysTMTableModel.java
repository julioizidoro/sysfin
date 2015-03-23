/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tela.Vendas;

import IntegracaoSysTM.Viewvendasintegracao;
import java.util.Date;
import java.util.List;
import javax.swing.table.AbstractTableModel;
import tela.util.Formatacao;

/**
 *
 * @author Wolverine
 */
public class VendasSysTMTableModel extends AbstractTableModel{
    
    private List<Viewvendasintegracao> listaVendas;
    private String[] colunas ={"No. da Venda", "Data Venda", "Nome Cliente", "Unidade", "Valor Total", "Produto"};
    

    public VendasSysTMTableModel(List<Viewvendasintegracao> listaVendas) {
        this.listaVendas = listaVendas;
    }

    @Override
    public int getRowCount() {
        return listaVendas.size();
    }

    @Override
    public int getColumnCount() {
        return colunas.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        if (columnIndex==0){
            return listaVendas.get(rowIndex).getIdvendas();
        }else if (columnIndex==1){
            return listaVendas.get(rowIndex).getDataVenda();
        }else if (columnIndex==2){
            return listaVendas.get(rowIndex).getNomeCliente();
        }else if (columnIndex==3){
            return listaVendas.get(rowIndex).getNomeFantasia();
        }else if (columnIndex==4){
            return Formatacao.foramtarFloatString(listaVendas.get(rowIndex).getTotalMoedaNacional());
        }else return listaVendas.get(rowIndex).getDescricao();
    }
    
    @Override
    public String getColumnName(int column) {
        return colunas[column];
    }

    @Override
    public Class<?> getColumnClass(int columnIndex) {
        if (columnIndex==0){
            return Integer.class;
        }else if (columnIndex==1){
            return Date.class;
        }else if (columnIndex==2){
             return String.class;
         }else if (columnIndex==3){
             return  String.class;
         }else if (columnIndex==4){
             return String.class;
         }else return String.class;
    }
    
    
    
}
