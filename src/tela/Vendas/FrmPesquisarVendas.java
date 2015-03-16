/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package tela.Vendas;

import com.toedter.calendar.JTextFieldDateEditor;
import java.awt.Image;
import java.awt.Toolkit;
import java.io.File;
import java.net.URL;
import model.Cliente;
import model.Formapagamento;
import tela.Cliente.FrmConsultaCliente;
import tela.util.Formatacao;
import tela.util.UsuarioLogadoBean;

/**
 *
 * @author Wolverine
 */
public class FrmPesquisarVendas extends javax.swing.JFrame implements IVendas{
    
    private String datePattern;
    private String maskPattern;
    private char placeHolder;
    private Cliente cliente;
    private IVendas telaVendas;
    private UsuarioLogadoBean usuarioLogadoBean;

    /**
     * Creates new form FrmPesquisarVendas
     */
    public FrmPesquisarVendas(UsuarioLogadoBean usuarioLogadoBean, Cliente cliente, IVendas telaVendas) {
        this.cliente = cliente;
        this.usuarioLogadoBean = usuarioLogadoBean;
        this.telaVendas = telaVendas;
        datePattern = "dd/MM/yyyy";
        maskPattern = "##/##/####";
        placeHolder = '_';
        initComponents();
        if (cliente!=null){
            unidadejTextField.setText(cliente.getNomeFantasia());
            selecionarjButton.setEnabled(false);
        }
         URL url = this.getClass().getResource("/imagens/logoRelatorio/iconetela.png");
        Image imagemTitulo = Toolkit.getDefaultToolkit().getImage(url);
        this.setIconImage(imagemTitulo);
        this.setLocationRelativeTo(null);
        this.setVisible(true);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        unidadejTextField = new javax.swing.JTextField();
        selecionarjButton = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        dataIniciojDateChooser = new com.toedter.calendar.JDateChooser(null, null, datePattern, new JTextFieldDateEditor(datePattern,
            maskPattern, placeHolder));
    dataFinaljDateChooser = new com.toedter.calendar.JDateChooser(null, null, datePattern, new JTextFieldDateEditor(datePattern,
        maskPattern, placeHolder));
jLabel4 = new javax.swing.JLabel();
jLabel2 = new javax.swing.JLabel();
nomeClientejTextField = new javax.swing.JTextField();
numeroVendajTextField = new javax.swing.JTextField();
jLabel5 = new javax.swing.JLabel();
situacaojComboBox = new javax.swing.JComboBox();
jLabel6 = new javax.swing.JLabel();
jPanel5 = new javax.swing.JPanel();
confirmajButton = new javax.swing.JButton();
jButton5 = new javax.swing.JButton();

setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
setTitle("Pesquisar Vendas");

jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

jLabel1.setText("Unidade");

unidadejTextField.setEditable(false);

selecionarjButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/botoes/selecionar.png"))); // NOI18N
selecionarjButton.setText("Selecionar");
selecionarjButton.setToolTipText("Selecionar Cliente");
selecionarjButton.addActionListener(new java.awt.event.ActionListener() {
    public void actionPerformed(java.awt.event.ActionEvent evt) {
        selecionarjButtonActionPerformed(evt);
    }
    });

    jLabel3.setText("Data Inicial");

    dataIniciojDateChooser.addFocusListener(new java.awt.event.FocusAdapter() {
        public void focusGained(java.awt.event.FocusEvent evt) {
            dataIniciojDateChooserFocusGained(evt);
        }
    });

    dataFinaljDateChooser.addFocusListener(new java.awt.event.FocusAdapter() {
        public void focusGained(java.awt.event.FocusEvent evt) {
            dataFinaljDateChooserFocusGained(evt);
        }
    });

    jLabel4.setText("Data Final");

    jLabel2.setText("Nome do Cliente");

    numeroVendajTextField.addKeyListener(new java.awt.event.KeyAdapter() {
        public void keyTyped(java.awt.event.KeyEvent evt) {
            numeroVendajTextFieldKeyTyped(evt);
        }
    });

    jLabel5.setText("Nº Venda");

    situacaojComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Todas", "Verde", "Amarelo", "Vermelho" }));

    jLabel6.setText("Situação");

    javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
    jPanel1.setLayout(jPanel1Layout);
    jPanel1Layout.setHorizontalGroup(
        jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(jPanel1Layout.createSequentialGroup()
            .addContainerGap()
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(dataIniciojDateChooser, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel3))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(dataFinaljDateChooser, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel4))
                    .addGap(28, 28, 28)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel6)
                            .addGap(0, 0, Short.MAX_VALUE))
                        .addComponent(situacaojComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel2)
                        .addComponent(nomeClientejTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 274, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(numeroVendajTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel5)))
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addComponent(jLabel1)
                    .addGap(0, 0, Short.MAX_VALUE))
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addComponent(unidadejTextField)
                    .addGap(18, 18, 18)
                    .addComponent(selecionarjButton, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addContainerGap())
    );
    jPanel1Layout.setVerticalGroup(
        jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(jPanel1Layout.createSequentialGroup()
            .addContainerGap()
            .addComponent(jLabel1)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(unidadejTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(selecionarjButton))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(jLabel2)
                .addComponent(jLabel5))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(nomeClientejTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(numeroVendajTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addComponent(jLabel4)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(dataFinaljDateChooser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addComponent(jLabel3)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(dataIniciojDateChooser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addComponent(jLabel6)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(situacaojComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addContainerGap(19, Short.MAX_VALUE))
    );

    jPanel5.setBorder(javax.swing.BorderFactory.createEtchedBorder());

    confirmajButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/botoespequenos/confirmar.png"))); // NOI18N
    confirmajButton.setText("Confirmar");
    confirmajButton.setToolTipText("Confirmar");
    confirmajButton.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            confirmajButtonActionPerformed(evt);
        }
    });

    jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/botoespequenos/cancel.png"))); // NOI18N
    jButton5.setText("Cancelar");
    jButton5.setToolTipText("Cancelar");
    jButton5.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            jButton5ActionPerformed(evt);
        }
    });

    javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
    jPanel5.setLayout(jPanel5Layout);
    jPanel5Layout.setHorizontalGroup(
        jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(jPanel5Layout.createSequentialGroup()
            .addGap(30, 30, 30)
            .addComponent(confirmajButton)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 48, Short.MAX_VALUE)
            .addComponent(jButton5)
            .addGap(34, 34, 34))
    );
    jPanel5Layout.setVerticalGroup(
        jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(jPanel5Layout.createSequentialGroup()
            .addContainerGap()
            .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(confirmajButton)
                .addComponent(jButton5))
            .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
    );

    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
    getContentPane().setLayout(layout);
    layout.setHorizontalGroup(
        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(layout.createSequentialGroup()
            .addContainerGap()
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addContainerGap())
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(58, Short.MAX_VALUE)))
    );
    layout.setVerticalGroup(
        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(layout.createSequentialGroup()
            .addContainerGap()
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addContainerGap(70, Short.MAX_VALUE))
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(190, 190, 190)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
    );

    pack();
    }// </editor-fold>//GEN-END:initComponents

    private void selecionarjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selecionarjButtonActionPerformed
        new FrmConsultaCliente(usuarioLogadoBean, this);
    }//GEN-LAST:event_selecionarjButtonActionPerformed

    private void dataFinaljDateChooserFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_dataFinaljDateChooserFocusGained

    }//GEN-LAST:event_dataFinaljDateChooserFocusGained

    private void dataIniciojDateChooserFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_dataIniciojDateChooserFocusGained

    }//GEN-LAST:event_dataIniciojDateChooserFocusGained

    private void confirmajButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_confirmajButtonActionPerformed
        this.telaVendas.pesquisar(gerarSql(), " order by v.dataVenda");
        this.dispose();
    }//GEN-LAST:event_confirmajButtonActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        this.dispose();
    }//GEN-LAST:event_jButton5ActionPerformed

    private void numeroVendajTextFieldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_numeroVendajTextFieldKeyTyped
        String caracteres = "0987654321";
        if (evt.getKeyChar() != '\b') {
            if (!caracteres.contains(evt.getKeyChar() + "")) {
                evt.consume();
            }
        }
    }//GEN-LAST:event_numeroVendajTextFieldKeyTyped

    /**
     * @param args the command line arguments
     */
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton confirmajButton;
    private com.toedter.calendar.JDateChooser dataFinaljDateChooser;
    private com.toedter.calendar.JDateChooser dataIniciojDateChooser;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JTextField nomeClientejTextField;
    private javax.swing.JTextField numeroVendajTextField;
    private javax.swing.JButton selecionarjButton;
    private javax.swing.JComboBox situacaojComboBox;
    private javax.swing.JTextField unidadejTextField;
    // End of variables declaration//GEN-END:variables

    @Override
    public void setModel() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setCliente(Cliente cliente) {
        if (cliente!=null){
            this.cliente = cliente;
            unidadejTextField.setText(cliente.getNomeFantasia());
        }
    }

    @Override
    public void setArquivo(File arquivo) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setFormaPagamento(Formapagamento formaPagamento) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void exportarExcel(String caminho, String nomeArquivo) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void pesquisar(String sql, String order) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    private String gerarSql(){
        boolean linha = false;
        String sql = " Select v from Viewvendas v where ";
        if ((dataIniciojDateChooser.getDate() != null) && (dataFinaljDateChooser.getDate() != null)) {
            if (!linha) {
                sql = sql + "  v.dataVenda>='" + Formatacao.ConvercaoDataSql(dataIniciojDateChooser.getDate())
                        + "' and v.dataVenda<='" + Formatacao.ConvercaoDataSql(dataFinaljDateChooser.getDate()) + "'";
                linha = true;
            }
        }
        if (!situacaojComboBox.getSelectedItem().toString().equalsIgnoreCase("Todas")){
            if (!linha){
                sql = sql + " v.situacao='" + situacaojComboBox.getSelectedItem().toString() + "'";
                linha = true;
            }else{
                sql = sql + " and v.situacao='" + situacaojComboBox.getSelectedItem().toString() + "'";
            }
        }
        if (cliente!=null){
            if (!linha){
                sql = sql + " v.clienteIdcliente=" + cliente.getIdcliente();
                linha = true;
            }else {
                sql = sql + " and v.clienteIdcliente=" + cliente.getIdcliente();
            }
        }else {
            if (!linha){
                sql = sql + " v.visualizacao='Operacional'";
                linha=true;
            }else {
                sql = sql + " and v.visualizacao='Operacional'";
            }
        }
        if (numeroVendajTextField.getText().length()>0){
            int numero = Integer.parseInt(numeroVendajTextField.getText());
            if (!linha){
                sql = sql + " v.idvendas=" + numero;
                linha = true;
            }else {
                sql = sql + " and v.idvendas=" + numero;
            }
        }
        if (nomeClientejTextField.getText().length()>0){
            if (!linha){
                sql = sql + " v.nomeCliente like '%" + nomeClientejTextField.getText() + "%'";
            }else{
                sql = sql + " and v.nomeCliente like '%" + nomeClientejTextField.getText() + "%'";
            }
        }
        return sql;
    }

    @Override
    public void setNumeroColuna(int numero) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
