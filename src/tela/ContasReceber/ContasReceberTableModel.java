/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tela.ContasReceber;



import java.awt.Image;
import java.awt.Toolkit;
import java.net.URL;
import java.util.Date;
import java.util.List;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.table.AbstractTableModel;
import modelView.Viewcontasreceber;
import tela.util.Formatacao;

/**
 *
 * @author Wolverine
 */
public class ContasReceberTableModel extends AbstractTableModel{
    
    private List<Viewcontasreceber> listaContas;
    private String[] colunas ={"Status", "Data Vencimento", "Cliente", "Valor da Conta", "Data Recebimento", "Unidade", "No. Venda"};

    public ContasReceberTableModel(List<Viewcontasreceber> listaContas) {
        this.listaContas = listaContas;
    }

    public int getRowCount() {
        return this.listaContas.size();
    }

    public int getColumnCount() {
        return colunas.length;
    }

    public Object getValueAt(int rowIndex, int columnIndex) {
        if (columnIndex==0){
            return carregarImagem(listaContas.get(rowIndex));
        }else if (columnIndex==1){
            return listaContas.get(rowIndex).getDataVencimento();
        }else if (columnIndex==2){
            return listaContas.get(rowIndex).getNomeCliente();
        }else if (columnIndex==3){
            return Formatacao.foramtarFloatString(listaContas.get(rowIndex).getValorParcela());
        }else if (columnIndex==4){
            return listaContas.get(rowIndex).getDataPagamento();
        }else if (columnIndex==5){
            return listaContas.get(rowIndex).getNomeFantasia();
        }else return listaContas.get(rowIndex).getVenda();
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
             return  Date.class;
         }else if (columnIndex==2){
             return String.class;
         }else if (columnIndex==3){
             return Float.class;
         }else if (columnIndex==4){
             return Date.class;
         }else if (columnIndex==5){
             return String.class;
         }else return Integer.class;
    }
    
    public Icon carregarImagem(Viewcontasreceber conta) {
        if (conta.getDataPagamento() == null) {
            Date data = Formatacao.SomarDiasData(new Date(), -1);
            if (!conta.getDataVencimento().after(data)) {
                URL urlVermelha = this.getClass().getResource("/imagens/bolas/bolaVermelha.png");
                Image imagemTitulo = Toolkit.getDefaultToolkit().getImage(urlVermelha);
                ImageIcon imagem = new ImageIcon(imagemTitulo);
                return imagem;
            } else {
                if (conta.getDataVencimento() == null) {
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
        } else {
            URL urlVerde = this.getClass().getResource("/imagens/bolas/bolaVerde.png");
            Image imagemTitulo = Toolkit.getDefaultToolkit().getImage(urlVerde);
            ImageIcon imagem = new ImageIcon(imagemTitulo);
            return imagem;
        }
    }
}
