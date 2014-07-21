/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package tela.util;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JTable;
import javax.swing.table.JTableHeader;
import javax.swing.table.TableColumnModel;
import tela.OutrosLancamentos.ItelaMovimentoBanco;

/**
 *
 * @author Wolverine
 */
public class clickColunas extends MouseAdapter{
    
    private ItelaMovimentoBanco telaOutros;
    
   

    public clickColunas(ItelaMovimentoBanco tela) {
        this.telaOutros = tela;
    }
    
    public void mouseClicked(MouseEvent evt) {
        JTable table = ((JTableHeader) evt.getSource()).getTable();
        TableColumnModel colModel = table.getColumnModel();

        // índice da coluna cujo titulo foi clicado
        int vColIndex = colModel.getColumnIndexAtX(evt.getX());
        int mColIndex = table.convertColumnIndexToModel(vColIndex);

        if (vColIndex == -1) {
            return;
        }
        if (telaOutros!=null){
            telaOutros.setNumeroColuna(mColIndex);
        }
  }
}
    

