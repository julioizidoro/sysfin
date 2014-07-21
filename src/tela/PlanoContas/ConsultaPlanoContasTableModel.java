package tela.PlanoContas;

import java.util.List;
import javax.swing.table.AbstractTableModel;
import model.Planocontas;


/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */



/**
 *
 * @author Gabi
 */
public class ConsultaPlanoContasTableModel extends AbstractTableModel{
    public List<Planocontas> listaPlanoConta;
    private String[] colunas = {"Nº Conta", "Descrição"};

    public ConsultaPlanoContasTableModel(List<Planocontas> listaPlanoConta){
        this.listaPlanoConta = listaPlanoConta;
    }

    public int getRowCount() {
        return listaPlanoConta.size();
    }

    public int getColumnCount() {
        return colunas.length;
    }

    public Object getValueAt(int rowIndex, int columnIndex) {
        Planocontas Planoconta = listaPlanoConta.get(rowIndex);
        if (columnIndex == 0) {
            return Planoconta.getNumeroConta();
        }else
            return Planoconta.getDescricao();
    }

    @Override
    public String getColumnName(int column) {
        return colunas[column];
    }

    @Override
    public Class<?> getColumnClass(int columnIndex) {
        if (columnIndex == 0) {
            return String.class;
        } else{
            return String.class;
        }
    }
}
