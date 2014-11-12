/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package tela.util;

import javax.swing.text.AttributeSet;
import javax.swing.text.BadLocationException;
import javax.swing.text.PlainDocument;

/**
 *
 * @author Wolverine
 */
public class LimiteTextoJedit extends PlainDocument{
    
    private int tamanhoMaximo;

    public LimiteTextoJedit(int tamanhoMaximo) {
        this.tamanhoMaximo = tamanhoMaximo;
    }
    
    
    @Override
    public void insertString(int offset, String str, AttributeSet attr) throws BadLocationException {

        if (str == null) {
            return;
        }

        String stringAntiga = getText(0, getLength());
        int tamanhoNovo = stringAntiga.length() + str.length();

        if (tamanhoNovo <= tamanhoMaximo) {
            super.insertString(offset, str, attr);
        } else {
            super.insertString(offset, "", attr);
        }
    }
}
