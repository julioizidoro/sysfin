/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package tela.OutrosLancamentos;

import java.util.Collection;
import java.util.Date;
import java.util.List;
import javax.swing.table.AbstractTableModel;
import model.Movimentobanco;
import tela.util.Formatacao;

/**
 *
 * @author Acer
 */
public class ConsultaMovimentoBancoTableModel extends AbstractTableModel{

   private List<Movimentobanco> listaMovimentoBanco;
   private String[] colunas ={"Data", "Histórico", "Valor Entrada", "Valor Saída"};

    public ConsultaMovimentoBancoTableModel(List<Movimentobanco> listaMovimentoBanco) {
        this.listaMovimentoBanco = listaMovimentoBanco;
    }

    public int getRowCount() {
        return listaMovimentoBanco.size();
    }

    public int getColumnCount() {
        return colunas.length;
    }

    public Object getValueAt(int rowIndex, int columnIndex) {
         Movimentobanco movimentoBanco = listaMovimentoBanco.get(rowIndex);
         if (columnIndex==0){
             return  movimentoBanco.getDataCompensacao();
         }else if (columnIndex==1){
             return movimentoBanco.getDescricao();
         }else if (columnIndex==2){
             return Formatacao.foramtarFloatString(movimentoBanco.getValorEntrada());
         }else return Formatacao.foramtarFloatString(movimentoBanco.getValorSaida());
    }

    public  void adiciona(Movimentobanco movimentoBanco){
        listaMovimentoBanco.add(movimentoBanco);
    }

    public void adiciona(Collection<Movimentobanco> movimentoBanco){
        listaMovimentoBanco.addAll(movimentoBanco);
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
         }else if (columnIndex==2){
             return String.class;
         }else return String.class;
    }

    public Movimentobanco getMovimentobanco(int linha){
        return  listaMovimentoBanco.get(linha);
    }

}
