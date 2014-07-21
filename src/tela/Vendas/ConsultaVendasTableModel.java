/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package tela.Vendas;

import java.awt.Image;
import java.awt.Toolkit;
import java.net.URL;
import java.util.Date;
import java.util.List;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.table.AbstractTableModel;
import modelView.Viewvendas;
import tela.util.Formatacao;

/**
 *
 * @author Wolverine
 */
public class ConsultaVendasTableModel extends AbstractTableModel{
    
    private List<Viewvendas> listaVendas;
    private String[] colunas ={"No. da Venda", "Situação", "Data Venda", "Unidade", "Cliente", "Valor Bruto"};

    public ConsultaVendasTableModel(List<Viewvendas> listaVendas) {
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
            return carregarImagem(listaVendas.get(rowIndex));
        }else if (columnIndex==2){
            return listaVendas.get(rowIndex).getDataVenda();
        }else if (columnIndex==3){
            return listaVendas.get(rowIndex).getNomeFantasia();
        }else if (columnIndex==4){
            return listaVendas.get(rowIndex).getNomeCliente();
        }else return Formatacao.foramtarFloatString(listaVendas.get(rowIndex).getValorBruto());
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
            return Image.class;
        }else if (columnIndex==2){
             return Date.class;
         }else if (columnIndex==3){
             return  String.class;
         }else if (columnIndex==4){
             return String.class;
         }else return String.class;
    }
    
    public Icon carregarImagem(Viewvendas venda) {
        if (venda.getSituacao().equalsIgnoreCase("vermelho")) {
            URL urlVermelha = this.getClass().getResource("/imagens/bolas/bolaVermelha.png");
            Image imagemTitulo = Toolkit.getDefaultToolkit().getImage(urlVermelha);
            ImageIcon imagem = new ImageIcon(imagemTitulo);
            return imagem;
        } else {
            if (venda.getSituacao().equalsIgnoreCase("amarelo")) {
                URL urlAmarela = this.getClass().getResource("/imagens/bolas/bolaAmarela.png");
                Image imagemTitulo = Toolkit.getDefaultToolkit().getImage(urlAmarela);
                ImageIcon imagem = new ImageIcon(imagemTitulo);
                return imagem;
            } else {
                URL urlVerde = this.getClass().getResource("/imagens/bolas/bolaVerde.png");
                Image imagemTitulo = Toolkit.getDefaultToolkit().getImage(urlVerde);
                ImageIcon imagem = new ImageIcon(imagemTitulo);
                return imagem;
            }
        }
    }    
    
}
