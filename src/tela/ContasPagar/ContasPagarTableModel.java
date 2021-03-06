/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tela.ContasPagar;


import java.awt.Image;
import java.awt.Toolkit;
import java.net.URL;
import java.util.Date;
import java.util.List;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.table.AbstractTableModel;
import model.Contaspagar;
import tela.util.Formatacao;

/**
 *
 * @author Wolverine
 */
public class ContasPagarTableModel extends AbstractTableModel{
    
    private List<Contaspagar> listaContasPagar;
    private String[] colunas ={"Status", "Data Vencimento", "Unidade", "Descrição", "Valor da Conta", "Autorizada", "Fornecedor"};

    public ContasPagarTableModel(List<Contaspagar> listaContasPagar) {
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
            return carregarImagem(listaContasPagar.get(rowIndex));
        }else  if (columnIndex==1){
            return listaContasPagar.get(rowIndex).getDataVencimento();
        }else if (columnIndex==2){
            return listaContasPagar.get(rowIndex).getCliente().getNomeFantasia();
        }else if (columnIndex==3){
            return listaContasPagar.get(rowIndex).getDescricao();
        }else  if (columnIndex==4){
            return Formatacao.foramtarFloatString(listaContasPagar.get(rowIndex).getValor());
        } else if (columnIndex==5){
            return carregarImagemAutorizada(listaContasPagar.get(rowIndex));
        }else return listaContasPagar.get(rowIndex).getFornecedor();
    }
    
    @Override
    public String getColumnName(int column) {
        return colunas[column];
    }

    @Override
    public Class<?> getColumnClass(int columnIndex) {
        if (columnIndex==0){
             return Image.class;
        }else if (columnIndex==1){
            return Date.class;
         }else if (columnIndex==2){
             return  String.class;
         }else if (columnIndex==3){
             return String.class;
         }else if (columnIndex==4){
             return String.class;
         }else if (columnIndex==5){
             return Image.class;
         }else return String.class;
    }
    
    public Icon carregarImagem(Contaspagar conta) {
        Date data = new Date();
        if (conta.getDataLiberacao() != null) {
            URL urlVerde = this.getClass().getResource("/imagens/bolas/bolaVerde.png");
            Image imagemTitulo = Toolkit.getDefaultToolkit().getImage(urlVerde);
            ImageIcon imagem = new ImageIcon(imagemTitulo);
            return imagem;
        } else {
            if (!conta.getDataVencimento().after(data)) {
                URL urlVermelha = this.getClass().getResource("/imagens/bolas/bolaVermelha.png");
                Image imagemTitulo = Toolkit.getDefaultToolkit().getImage(urlVermelha);
                ImageIcon imagem = new ImageIcon(imagemTitulo);
                return imagem;
            } else {
                if (conta.getDataAgendamento() == null) {
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
    
    public Icon carregarImagemAutorizada(Contaspagar conta) {
        if (conta.getAutorizarPagamento() == null) {
            URL urlVermelha = this.getClass().getResource("/imagens/botoespequenos/cancel.png");
            Image imagemTitulo = Toolkit.getDefaultToolkit().getImage(urlVermelha);
            ImageIcon imagem = new ImageIcon(imagemTitulo);
            return imagem;
        } else {
            if (conta.getAutorizarPagamento().equalsIgnoreCase("N")) {
                URL urlVermelha = this.getClass().getResource("/imagens/botoespequenos/cancel.png");
                Image imagemTitulo = Toolkit.getDefaultToolkit().getImage(urlVermelha);
                ImageIcon imagem = new ImageIcon(imagemTitulo);
                return imagem;
            } else {
                URL urlVerde = this.getClass().getResource("/imagens/botoespequenos/confirmar.png");
                Image imagemTitulo = Toolkit.getDefaultToolkit().getImage(urlVerde);
                ImageIcon imagem = new ImageIcon(imagemTitulo);
                return imagem;
            }
        }
    }
}
