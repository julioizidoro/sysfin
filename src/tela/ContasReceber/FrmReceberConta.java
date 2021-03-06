/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package tela.ContasReceber;

import com.toedter.calendar.JTextFieldDateEditor;
import controller.BancoController;
import controller.ContasReceberController;
import controller.MovimentoBancoController;
import java.awt.Image;
import java.awt.Toolkit;
import java.net.URL;
import java.util.Date;
import java.util.List;
import model.Banco;
import model.Cliente;
import model.Contasreceber;
import model.Movimentobanco;
import tela.util.Formatacao;
import tela.util.UsuarioLogadoBean;

/**
 *
 * @author Wolverine
 */
public class FrmReceberConta extends javax.swing.JFrame {
    
    private String datePattern;
    private String maskPattern;
    private char placeHolder;
    private UsuarioLogadoBean usuarioLogadoBean;
    private Contasreceber conta;
    private Cliente cliente;
    private IContasReceber telaContas;

    /**
     * Creates new form FrmReceberConta
     */
    public FrmReceberConta(Contasreceber conta, UsuarioLogadoBean usuarioLogadoBean, IContasReceber telaContas) {
        datePattern = "dd/MM/yyyy";
        maskPattern = "##/##/####";
        placeHolder = '_';
        this.usuarioLogadoBean = usuarioLogadoBean;
        this.telaContas = telaContas;
        initComponents();
        URL url = this.getClass().getResource("/imagens/logoRelatorio/iconetela.png");
        Image imagemTitulo = Toolkit.getDefaultToolkit().getImage(url);
        this.setIconImage(imagemTitulo);
        inicilizarContasReceber(conta);
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
        clientejTextField = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        nomeClientejTextField = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        dataVencimentojDateChooser = new com.toedter.calendar.JDateChooser(null, null, datePattern, new JTextFieldDateEditor(datePattern,
            maskPattern, placeHolder));
    numeroDocumentojTextField = new javax.swing.JTextField();
    jLabel14 = new javax.swing.JLabel();
    numeroParcelajTextField = new javax.swing.JTextField();
    jLabel15 = new javax.swing.JLabel();
    valorjTextField = new javax.swing.JTextField();
    jLabel8 = new javax.swing.JLabel();
    jLabel11 = new javax.swing.JLabel();
    dataPagamentojDateChooser = new com.toedter.calendar.JDateChooser(null, null, datePattern, new JTextFieldDateEditor(datePattern,
        maskPattern, placeHolder));
desagiojTextField = new javax.swing.JTextField();
jLabel16 = new javax.swing.JLabel();
jurosjTextField = new javax.swing.JTextField();
jLabel17 = new javax.swing.JLabel();
valorRecebidojTextField = new javax.swing.JTextField();
jLabel9 = new javax.swing.JLabel();
contajComboBox = new javax.swing.JComboBox();
jLabel6 = new javax.swing.JLabel();
jPanel4 = new javax.swing.JPanel();
jButton1 = new javax.swing.JButton();
jButton2 = new javax.swing.JButton();

setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

jLabel1.setText("Unidade");

clientejTextField.setEnabled(false);

jLabel2.setText("Nome do Cliente");

nomeClientejTextField.setEnabled(false);

jLabel10.setText("Data Vencimento");

dataVencimentojDateChooser.setEnabled(false);
dataVencimentojDateChooser.addFocusListener(new java.awt.event.FocusAdapter() {
    public void focusGained(java.awt.event.FocusEvent evt) {
        dataVencimentojDateChooserFocusGained(evt);
    }
    });

    numeroDocumentojTextField.setHorizontalAlignment(javax.swing.JTextField.LEFT);
    numeroDocumentojTextField.setEnabled(false);
    numeroDocumentojTextField.addKeyListener(new java.awt.event.KeyAdapter() {
        public void keyTyped(java.awt.event.KeyEvent evt) {
            numeroDocumentojTextFieldKeyTyped(evt);
        }
    });

    jLabel14.setText("No. Documento");

    numeroParcelajTextField.setHorizontalAlignment(javax.swing.JTextField.LEFT);
    numeroParcelajTextField.setEnabled(false);
    numeroParcelajTextField.addKeyListener(new java.awt.event.KeyAdapter() {
        public void keyTyped(java.awt.event.KeyEvent evt) {
            numeroParcelajTextFieldKeyTyped(evt);
        }
    });

    jLabel15.setText("Numero Parcela");

    valorjTextField.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
    valorjTextField.setEnabled(false);
    valorjTextField.addKeyListener(new java.awt.event.KeyAdapter() {
        public void keyTyped(java.awt.event.KeyEvent evt) {
            valorjTextFieldKeyTyped(evt);
        }
    });

    jLabel8.setText("Valor R$");

    jLabel11.setText("Data Recebimento");

    dataPagamentojDateChooser.addFocusListener(new java.awt.event.FocusAdapter() {
        public void focusGained(java.awt.event.FocusEvent evt) {
            dataPagamentojDateChooserFocusGained(evt);
        }
    });

    desagiojTextField.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
    desagiojTextField.addFocusListener(new java.awt.event.FocusAdapter() {
        public void focusLost(java.awt.event.FocusEvent evt) {
            desagiojTextFieldFocusLost(evt);
        }
    });
    desagiojTextField.addKeyListener(new java.awt.event.KeyAdapter() {
        public void keyTyped(java.awt.event.KeyEvent evt) {
            desagiojTextFieldKeyTyped(evt);
        }
    });

    jLabel16.setText("Desagio");

    jurosjTextField.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
    jurosjTextField.addFocusListener(new java.awt.event.FocusAdapter() {
        public void focusLost(java.awt.event.FocusEvent evt) {
            jurosjTextFieldFocusLost(evt);
        }
    });
    jurosjTextField.addKeyListener(new java.awt.event.KeyAdapter() {
        public void keyTyped(java.awt.event.KeyEvent evt) {
            jurosjTextFieldKeyTyped(evt);
        }
    });

    jLabel17.setText("Juros");

    valorRecebidojTextField.setEditable(false);
    valorRecebidojTextField.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
    valorRecebidojTextField.addKeyListener(new java.awt.event.KeyAdapter() {
        public void keyTyped(java.awt.event.KeyEvent evt) {
            valorRecebidojTextFieldKeyTyped(evt);
        }
    });

    jLabel9.setText("Valor Recebido");

    jLabel6.setText("Conta");

    javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
    jPanel1.setLayout(jPanel1Layout);
    jPanel1Layout.setHorizontalGroup(
        jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(jPanel1Layout.createSequentialGroup()
            .addGap(18, 18, 18)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel11)
                        .addComponent(dataPagamentojDateChooser, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(18, 18, 18)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(desagiojTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel16))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(22, 22, 22)
                            .addComponent(jurosjTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(valorRecebidojTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(19, 19, 19)
                            .addComponent(jLabel17)
                            .addGap(0, 0, Short.MAX_VALUE))))
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel2)
                        .addComponent(jLabel1)
                        .addComponent(jLabel6))
                    .addGap(0, 0, Short.MAX_VALUE))
                .addComponent(clientejTextField)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel10)
                        .addComponent(dataVencimentojDateChooser, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(18, 18, 18)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(numeroDocumentojTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel14))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 19, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(numeroParcelajTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel15))
                    .addGap(29, 29, 29)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel8)
                        .addComponent(valorjTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel9)))
                .addComponent(contajComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(nomeClientejTextField, javax.swing.GroupLayout.Alignment.TRAILING))
            .addContainerGap())
    );
    jPanel1Layout.setVerticalGroup(
        jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(jPanel1Layout.createSequentialGroup()
            .addContainerGap()
            .addComponent(jLabel1)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(clientejTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(jLabel2)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(nomeClientejTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel8)
                        .addComponent(jLabel15))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(valorjTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(numeroParcelajTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(numeroDocumentojTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel10)
                        .addComponent(jLabel14))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(dataVencimentojDateChooser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(20, 20, 20)
                    .addComponent(desagiojTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel11)
                        .addComponent(jLabel16))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(dataPagamentojDateChooser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel17)
                        .addComponent(jLabel9))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(valorRecebidojTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jurosjTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(jLabel6)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(contajComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
    );

    jPanel4.setBorder(javax.swing.BorderFactory.createEtchedBorder());

    jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/botoespequenos/confirmar.png"))); // NOI18N
    jButton1.setText("Confirmar");
    jButton1.setToolTipText("Confirmar");
    jButton1.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            jButton1ActionPerformed(evt);
        }
    });

    jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/botoespequenos/cancel.png"))); // NOI18N
    jButton2.setText("Cancelar");
    jButton2.setToolTipText("Cancelar");
    jButton2.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            jButton2ActionPerformed(evt);
        }
    });

    javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
    jPanel4.setLayout(jPanel4Layout);
    jPanel4Layout.setHorizontalGroup(
        jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(jPanel4Layout.createSequentialGroup()
            .addGap(30, 30, 30)
            .addComponent(jButton1)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 48, Short.MAX_VALUE)
            .addComponent(jButton2)
            .addGap(34, 34, 34))
    );
    jPanel4Layout.setVerticalGroup(
        jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(jPanel4Layout.createSequentialGroup()
            .addContainerGap()
            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(jButton1)
                .addComponent(jButton2))
            .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
    );

    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
    getContentPane().setLayout(layout);
    layout.setHorizontalGroup(
        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(layout.createSequentialGroup()
            .addContainerGap()
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
            .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(100, 100, 100))
    );
    layout.setVerticalGroup(
        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(layout.createSequentialGroup()
            .addContainerGap()
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
            .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
    );

    pack();
    }// </editor-fold>//GEN-END:initComponents

    private void dataVencimentojDateChooserFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_dataVencimentojDateChooserFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_dataVencimentojDateChooserFocusGained

    private void numeroDocumentojTextFieldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_numeroDocumentojTextFieldKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_numeroDocumentojTextFieldKeyTyped

    private void numeroParcelajTextFieldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_numeroParcelajTextFieldKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_numeroParcelajTextFieldKeyTyped

    private void valorjTextFieldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_valorjTextFieldKeyTyped
        if (evt.getKeyChar()=='.'){
            evt.setKeyChar(',');
        }
        String caracteres = "0987654321,-";
        if (evt.getKeyChar() != '\b') {
            if (!caracteres.contains(evt.getKeyChar() + "")) {
                evt.consume();
            }
        }
    }//GEN-LAST:event_valorjTextFieldKeyTyped

    private void dataPagamentojDateChooserFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_dataPagamentojDateChooserFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_dataPagamentojDateChooserFocusGained

    private void desagiojTextFieldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_desagiojTextFieldKeyTyped
        if (evt.getKeyChar()=='.'){
            evt.setKeyChar(',');
        }
        String caracteres = "0987654321,-";
        if (evt.getKeyChar() != '\b') {
            if (!caracteres.contains(evt.getKeyChar() + "")) {
                evt.consume();
            }
        }
    }//GEN-LAST:event_desagiojTextFieldKeyTyped

    private void jurosjTextFieldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jurosjTextFieldKeyTyped
        if (evt.getKeyChar()=='.'){
            evt.setKeyChar(',');
        }
        String caracteres = "0987654321,-";
        if (evt.getKeyChar() != '\b') {
            if (!caracteres.contains(evt.getKeyChar() + "")) {
                evt.consume();
            }
        }
    }//GEN-LAST:event_jurosjTextFieldKeyTyped

    private void valorRecebidojTextFieldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_valorRecebidojTextFieldKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_valorRecebidojTextFieldKeyTyped

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        salvar();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        this.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void desagiojTextFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_desagiojTextFieldFocusLost
        float desagio=0.0f;
        float juros = 0.0f;
        float recebido= 0.0f;
        if (desagiojTextField.getText().length()>0){
            desagio = Formatacao.ConvercaoMonetariaFloat(desagiojTextField.getText());
        }
        if (jurosjTextField.getText().length()>0){
            juros = Formatacao.ConvercaoMonetariaFloat(jurosjTextField.getText());
        }
        recebido = (conta.getValorParcela() + juros) - desagio;
        valorRecebidojTextField.setText(Formatacao.foramtarFloatString(recebido));
    }//GEN-LAST:event_desagiojTextFieldFocusLost

    private void jurosjTextFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jurosjTextFieldFocusLost
        float desagio=0.0f;
        float juros = 0.0f;
        float recebido= 0.0f;
        if (desagiojTextField.getText().length()>0){
            desagio = Formatacao.ConvercaoMonetariaFloat(desagiojTextField.getText());
        }
        if (jurosjTextField.getText().length()>0){
            juros = Formatacao.ConvercaoMonetariaFloat(jurosjTextField.getText());
        }
        recebido = (conta.getValorParcela() + juros) - desagio;
        valorRecebidojTextField.setText(Formatacao.foramtarFloatString(recebido));
    }//GEN-LAST:event_jurosjTextFieldFocusLost

    /**
     * @param args the command line arguments
     */
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField clientejTextField;
    private javax.swing.JComboBox contajComboBox;
    private com.toedter.calendar.JDateChooser dataPagamentojDateChooser;
    private com.toedter.calendar.JDateChooser dataVencimentojDateChooser;
    private javax.swing.JTextField desagiojTextField;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JTextField jurosjTextField;
    private javax.swing.JTextField nomeClientejTextField;
    private javax.swing.JTextField numeroDocumentojTextField;
    private javax.swing.JTextField numeroParcelajTextField;
    private javax.swing.JTextField valorRecebidojTextField;
    private javax.swing.JTextField valorjTextField;
    // End of variables declaration//GEN-END:variables

    public void inicilizarContasReceber(Contasreceber conta){
        if (conta!=null){
            this.conta = conta;
            cliente = conta.getCliente();
            if (cliente!=null){
                clientejTextField.setText(cliente.getNomeFantasia());
                carregarComboBox();
            }
            clientejTextField.setText(cliente.getNomeFantasia());
            dataVencimentojDateChooser.setDate(conta.getDataVencimento());
            nomeClientejTextField.setText(conta.getNomeCliente());
            numeroDocumentojTextField.setText(conta.getNumeroDocumento());
            numeroParcelajTextField.setText(String.valueOf(conta.getNumeroParcela()));
            valorjTextField.setText(Formatacao.foramtarFloatString(conta.getValorParcela()));
            if (conta.getValorPago()==0){
                valorRecebidojTextField.setText(Formatacao.foramtarFloatString(conta.getValorParcela()));
            }else valorRecebidojTextField.setText(Formatacao.foramtarFloatString(conta.getValorPago()));
            contajComboBox.setSelectedItem(conta.getBanco());
        }
    }

    public void carregarComboBox(){
        BancoController bancoController = new BancoController();
        List<Banco> listaBanco = bancoController.listar(cliente.getIdcliente());
        if (listaBanco!=null){
            contajComboBox = Formatacao.preencherComobox(listaBanco, contajComboBox);
        }
        
    }
    
    public void salvar(){
        if (desagiojTextField.getText().length()>0){
            conta.setDesagio(Formatacao.ConvercaoMonetariaFloat(desagiojTextField.getText()));
        }
        if (jurosjTextField.getText().length()>0){
            conta.setJuros(Formatacao.ConvercaoMonetariaFloat(jurosjTextField.getText()));
        }
        if (valorRecebidojTextField.getText().length()>0){
            conta.setValorPago(Formatacao.ConvercaoMonetariaFloat(valorRecebidojTextField.getText()));
        }
        if (dataPagamentojDateChooser.getDate()!=null){
            conta.setDataPagamento(dataPagamentojDateChooser.getDate());
        }
        Banco banco = (Banco) contajComboBox.getSelectedItem();
        conta.setBanco(banco);
        Movimentobanco mb = new Movimentobanco();
        mb.setBanco(conta.getBanco());
        mb.setCliente(cliente);
        mb.setDataVencimento(conta.getDataVencimento());
        mb.setDataRegistro(new Date());
        mb.setPlanocontas(conta.getPlanocontas());
        mb.setUsuario(usuarioLogadoBean.getUsuario());
        mb.setValorEntrada(conta.getValorPago());
        mb.setValorSaida(0.0f);
        mb.setDataCompensacao(conta.getDataPagamento());
        String data = Formatacao.ConvercaoDataPadrao(conta.getDataVencimento());
        String mesString = data.substring(3, 5);
        String anoString = data.substring(6, 10);
        int mesInicio = Integer.parseInt(mesString);
        int anoInicio = Integer.parseInt(anoString);
        mb.setCompentencia(mesString + "/" + anoString);
        String nome = conta.getNomeCliente();
        if (conta.getNomeCliente().length()>80){
            nome = nome.substring(0,79);
        }
        mb.setDescricao("Recebimento " + nome);
        mb.setTipoDocumento(conta.getTipodocumento());
        MovimentoBancoController movimentoBancoController = new MovimentoBancoController();
        mb = movimentoBancoController.salvar(mb);
        conta.setMovimentoBanco(mb.getIdmovimentoBanco());
        ContasReceberController contasReceberController = new ContasReceberController();
        contasReceberController.salvar(conta);
        this.telaContas.setModel();
        this.dispose();
    }
}


