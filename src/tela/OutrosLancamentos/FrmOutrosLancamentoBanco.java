/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * FrmLancamentoCaixa.java
 *
 * Created on 11/11/2009, 13:06:17
 */

package tela.OutrosLancamentos;

import com.toedter.calendar.JTextFieldDateEditor;
import controller.BancoController;
import controller.MovimentoBancoController;
import controller.PlanoContasController;
import java.awt.Image;
import java.awt.Toolkit;
import java.net.URL;
import java.text.ParseException;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import model.Banco;
import model.Cliente;
import model.Movimentobanco;
import model.Planocontas;
import tela.ContasPagar.FrmCadastarContasPagar;
import tela.util.Formatacao;
import tela.util.UsuarioLogadoBean;


/**
 *
 * @author Acer
 */
public class FrmOutrosLancamentoBanco extends javax.swing.JFrame implements ItelaMovimentoBanco {
    
  
    private String datePattern;
    private String maskPattern;
    private char placeHolder;
    private Movimentobanco movimento;
    private UsuarioLogadoBean usuarioLogadoBean;
    private Cliente cliente;
    private Movimentobanco repetir;
    
    



    /** Creates new form FrmLancamentoCaixa */
    public FrmOutrosLancamentoBanco(UsuarioLogadoBean usuarioLogadoBean,  Movimentobanco movimento, Cliente cliente) {
        this.usuarioLogadoBean = usuarioLogadoBean;
        datePattern = "dd/MM/yyyy";
        maskPattern = "##/##/##";
        placeHolder = '_';
        this.movimento = movimento;
        this.cliente = cliente;
        initComponents();
        URL url = this.getClass().getResource("/imagens/logoRelatorio/iconetela.png");
        Image imagemTitulo = Toolkit.getDefaultToolkit().getImage(url);
        this.setIconImage(imagemTitulo);
        dataRegistrojDateChooser.setDate((new Date()));
        this.setLocationRelativeTo(null);
        if (movimento==null){
            this.movimento = new Movimentobanco();
            carregarPlanoContas();
        }else {
            popularTela();
        }
        setVisible(true);
    }


    private void popularTela(){
        carregarPlanoContas();
        planoContasjComboBox.setSelectedItem(movimento.getPlanocontas());
        contajComboBox.setSelectedItem(movimento.getBanco());
        tipojComboBox.setSelectedItem(movimento.getTipoDocumento());
        dataRegistrojDateChooser.setDate(movimento.getDataRegistro());
        dataVencimentojDateChooser.setDate(movimento.getDataVencimento());
        dataCompnesacaojDateChooser.setDate(movimento.getDataCompensacao());
        descricaojTextField.setText(movimento.getDescricao());
        valorEntradajTextField.setText(Formatacao.foramtarFloatString(movimento.getValorEntrada()));
        valorSaidajTextField.setText(Formatacao.foramtarFloatString(movimento.getValorSaida()));
        competenciajFormattedTextField.setText(movimento.getCompentencia());
    }
    
    public void carregarPlanoContas() {
        try {
            competenciajFormattedTextField.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/####")));
        } catch (ParseException ex) {
            Logger.getLogger(FrmCadastarContasPagar.class.getName()).log(Level.SEVERE, null, ex);
        }
        PlanoContasController planoContasController = new PlanoContasController();
        List<Planocontas> listaPlano = planoContasController.listar();
        if (listaPlano != null) {
            planoContasjComboBox = Formatacao.preencherComobox(listaPlano, planoContasjComboBox);
        }
        BancoController bancoController = new BancoController();
        List<Banco> listaBanco = bancoController.listar(cliente.getIdcliente());
        if (listaBanco!=null){
            contajComboBox = Formatacao.preencherComobox(listaBanco, contajComboBox);
        }

    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        descricaojTextField = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        planoContasjComboBox = new javax.swing.JComboBox();
        jLabel7 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        valorSaidajTextField = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        dataVencimentojDateChooser = new com.toedter.calendar.JDateChooser(null, null, datePattern, new JTextFieldDateEditor(datePattern,
            maskPattern, placeHolder));
    jLabel10 = new javax.swing.JLabel();
    dataCompnesacaojDateChooser = new com.toedter.calendar.JDateChooser(null, null, datePattern, new JTextFieldDateEditor(datePattern,
        maskPattern, placeHolder));
competenciajFormattedTextField = new javax.swing.JFormattedTextField();
jLabel11 = new javax.swing.JLabel();
jLabel13 = new javax.swing.JLabel();
tipojComboBox = new javax.swing.JComboBox();
valorEntradajTextField = new javax.swing.JTextField();
contajComboBox = new javax.swing.JComboBox();
jLabel1 = new javax.swing.JLabel();
dataRegistrojDateChooser = new com.toedter.calendar.JDateChooser(null, null, datePattern, new JTextFieldDateEditor(datePattern,
    maskPattern, placeHolder));
    jPanel3 = new javax.swing.JPanel();
    SalvarjButton = new javax.swing.JButton();
    jButton4 = new javax.swing.JButton();
    jButton5 = new javax.swing.JButton();

    setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
    setTitle("Outros Lançamentos");
    setResizable(false);

    jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

    jLabel4.setText("Conta");

    descricaojTextField.addFocusListener(new java.awt.event.FocusAdapter() {
        public void focusLost(java.awt.event.FocusEvent evt) {
            descricaojTextFieldFocusLost(evt);
        }
    });

    jLabel5.setText("Valor Entrada");

    jLabel7.setText("Descrição");

    jLabel3.setText("Data Registro");

    valorSaidajTextField.addKeyListener(new java.awt.event.KeyAdapter() {
        public void keyTyped(java.awt.event.KeyEvent evt) {
            valorSaidajTextFieldKeyTyped(evt);
        }
    });

    jLabel9.setText("Valor Saída");

    jLabel6.setText("Data Vencimento");

    dataVencimentojDateChooser.addFocusListener(new java.awt.event.FocusAdapter() {
        public void focusGained(java.awt.event.FocusEvent evt) {
            dataVencimentojDateChooserFocusGained(evt);
        }
    });

    jLabel10.setText("Data Compensação");

    dataCompnesacaojDateChooser.addFocusListener(new java.awt.event.FocusAdapter() {
        public void focusGained(java.awt.event.FocusEvent evt) {
            dataCompnesacaojDateChooserFocusGained(evt);
        }
    });

    competenciajFormattedTextField.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("##/####"))));
    competenciajFormattedTextField.setText("  /    ");
    competenciajFormattedTextField.addKeyListener(new java.awt.event.KeyAdapter() {
        public void keyTyped(java.awt.event.KeyEvent evt) {
            competenciajFormattedTextFieldKeyTyped(evt);
        }
    });

    jLabel11.setText("Competência");

    jLabel13.setText("Tipo de Documento");

    tipojComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Cheque", "Dinheiro", "Boleto", "Cartão", "Debito em Conta", "Depósito" }));

    valorEntradajTextField.addKeyListener(new java.awt.event.KeyAdapter() {
        public void keyTyped(java.awt.event.KeyEvent evt) {
            valorEntradajTextFieldKeyTyped(evt);
        }
    });

    jLabel1.setText("Plano de Contas");

    dataRegistrojDateChooser.addFocusListener(new java.awt.event.FocusAdapter() {
        public void focusGained(java.awt.event.FocusEvent evt) {
            dataRegistrojDateChooserFocusGained(evt);
        }
    });

    javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
    jPanel1.setLayout(jPanel1Layout);
    jPanel1Layout.setHorizontalGroup(
        jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
            .addContainerGap()
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel13, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(tipojComboBox, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.LEADING))
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(valorEntradajTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel5))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(valorSaidajTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel9)))
                        .addComponent(descricaojTextField, javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel3)
                                .addComponent(dataRegistrojDateChooser, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel6)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel11)
                                            .addComponent(competenciajFormattedTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addComponent(jLabel10)))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(dataVencimentojDateChooser, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(dataCompnesacaojDateChooser, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel4)
                                    .addGap(131, 131, 131))
                                .addComponent(contajComboBox, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel1)
                                .addComponent(planoContasjComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGap(44, 44, 44))))
    );
    jPanel1Layout.setVerticalGroup(
        jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(jPanel1Layout.createSequentialGroup()
            .addContainerGap()
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(jLabel1))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(planoContasjComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(contajComboBox, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addComponent(jLabel13)
                    .addGap(4, 4, 4)
                    .addComponent(tipojComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addComponent(jLabel11)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(competenciajFormattedTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addComponent(jLabel3)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(dataRegistrojDateChooser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addComponent(jLabel6)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(dataVencimentojDateChooser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addComponent(jLabel10)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(dataCompnesacaojDateChooser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(jLabel7)
            .addGap(7, 7, 7)
            .addComponent(descricaojTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(jLabel9))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(valorSaidajTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(valorEntradajTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addContainerGap(33, Short.MAX_VALUE))
    );

    jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
    jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

    SalvarjButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/botoespequenos/confirmar.png"))); // NOI18N
    SalvarjButton.setText("Confirmar");
    SalvarjButton.setToolTipText("Confirma Lançamento");
    SalvarjButton.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            SalvarjButtonActionPerformed(evt);
        }
    });
    jPanel3.add(SalvarjButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));

    jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/botoespequenos/enviar.png"))); // NOI18N
    jButton4.setText("Repetir");
    jButton4.setToolTipText("Repetir ultimo lançamento");
    jButton4.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            jButton4ActionPerformed(evt);
        }
    });
    jPanel3.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 10, -1, -1));

    jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/botoespequenos/cancel.png"))); // NOI18N
    jButton5.setText("Cancela");
    jButton5.setToolTipText("Cancela");
    jButton5.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            jButton5ActionPerformed(evt);
        }
    });
    jPanel3.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 10, -1, -1));

    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
    getContentPane().setLayout(layout);
    layout.setHorizontalGroup(
        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(layout.createSequentialGroup()
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(48, 48, 48)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 346, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 439, javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
    );
    layout.setVerticalGroup(
        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(layout.createSequentialGroup()
            .addGap(10, 10, 10)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addContainerGap())
    );

    pack();
    }// </editor-fold>//GEN-END:initComponents

    private void descricaojTextFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_descricaojTextFieldFocusLost
        
    }//GEN-LAST:event_descricaojTextFieldFocusLost

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        if (this.repetir==null){
            JOptionPane.showMessageDialog(rootPane,"Não possui lançamento para repetir");
        }else repetirLancamento();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void SalvarjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SalvarjButtonActionPerformed
        salvar();
    }//GEN-LAST:event_SalvarjButtonActionPerformed

    private void dataVencimentojDateChooserFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_dataVencimentojDateChooserFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_dataVencimentojDateChooserFocusGained

    private void dataCompnesacaojDateChooserFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_dataCompnesacaojDateChooserFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_dataCompnesacaojDateChooserFocusGained

    private void competenciajFormattedTextFieldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_competenciajFormattedTextFieldKeyTyped
        String caracteres = "0987654321/";
        if (evt.getKeyChar() != '\b') {
            if (!caracteres.contains(evt.getKeyChar() + "")) {
                evt.consume();
            }
        }
    }//GEN-LAST:event_competenciajFormattedTextFieldKeyTyped

    private void valorSaidajTextFieldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_valorSaidajTextFieldKeyTyped
        if (evt.getKeyChar()=='.'){
            evt.setKeyChar(',');
        }
        String caracteres = "0987654321,-";
        if (evt.getKeyChar() != '\b') {
            if (!caracteres.contains(evt.getKeyChar() + "")) {
                evt.consume();
            }
        }
    }//GEN-LAST:event_valorSaidajTextFieldKeyTyped

    private void valorEntradajTextFieldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_valorEntradajTextFieldKeyTyped
        if (evt.getKeyChar()=='.'){
            evt.setKeyChar(',');
        }
        String caracteres = "0987654321,-";
        if (evt.getKeyChar() != '\b') {
            if (!caracteres.contains(evt.getKeyChar() + "")) {
                evt.consume();
            }
        }
    }//GEN-LAST:event_valorEntradajTextFieldKeyTyped

    private void dataRegistrojDateChooserFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_dataRegistrojDateChooserFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_dataRegistrojDateChooserFocusGained

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        this.dispose();
    }//GEN-LAST:event_jButton5ActionPerformed

    /**
    * @param args the command line arguments
    */
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton SalvarjButton;
    private javax.swing.JFormattedTextField competenciajFormattedTextField;
    private javax.swing.JComboBox contajComboBox;
    private com.toedter.calendar.JDateChooser dataCompnesacaojDateChooser;
    private com.toedter.calendar.JDateChooser dataRegistrojDateChooser;
    private com.toedter.calendar.JDateChooser dataVencimentojDateChooser;
    private javax.swing.JTextField descricaojTextField;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JComboBox planoContasjComboBox;
    private javax.swing.JComboBox tipojComboBox;
    private javax.swing.JTextField valorEntradajTextField;
    private javax.swing.JTextField valorSaidajTextField;
    // End of variables declaration//GEN-END:variables
    

    public boolean validarCaixa(){
        if (descricaojTextField.getText().length()<=0){
            JOptionPane.showMessageDialog(null, "Histórico obrigatório");
            return false;
        }else  if ((valorSaidajTextField.getText().length()<=0) && (valorSaidajTextField.getText().length()<=0)){
            JOptionPane.showMessageDialog(null, "Campo Valor obrigatório");
            return false;
        }else if (dataRegistrojDateChooser.getDate()==null){
            JOptionPane.showMessageDialog(null, "Data inválida");
            return  false;
        }
        return true;
    }
    

    public void setForPedido(Object objeto) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    

    @Override
    public void setModel() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
    public void salvar() {
        Banco banco = (Banco) contajComboBox.getSelectedItem();
        movimento.setBanco(banco);
        movimento.setCliente(cliente);
        movimento.setDataVencimento(dataVencimentojDateChooser.getDate());
        movimento.setDataCompensacao(dataCompnesacaojDateChooser.getDate());
        movimento.setDataRegistro(dataRegistrojDateChooser.getDate());
        movimento.setCompentencia(competenciajFormattedTextField.getText());
        movimento.setTipoDocumento(tipojComboBox.getSelectedItem().toString());
        movimento.setDescricao(descricaojTextField.getText());
        Planocontas plano = (Planocontas) planoContasjComboBox.getSelectedItem();
        movimento.setPlanocontas(plano);
        movimento.setUsuario(usuarioLogadoBean.getUsuario());
        if (valorEntradajTextField.getText().length() > 0) {
            movimento.setValorEntrada(Formatacao.formatarStringfloat(valorEntradajTextField.getText()));
        } else {
            movimento.setValorEntrada(0.0f);
        }
        if (valorSaidajTextField.getText().length() > 0) {
            movimento.setValorSaida(Formatacao.formatarStringfloat(valorSaidajTextField.getText()));
        } else {
            movimento.setValorSaida(0.0f);
        }
        MovimentoBancoController movimentoBancoController = new MovimentoBancoController();
        repetir = new Movimentobanco();
        repetir = movimentoBancoController.salvar(movimento);
        movimento = new Movimentobanco();
        carregarPlanoContas();
        dataRegistrojDateChooser.setDate(null);
        dataVencimentojDateChooser.setDate(null);
        dataCompnesacaojDateChooser.setDate(null);
        competenciajFormattedTextField.setText(null);
        descricaojTextField.setText("");
        valorEntradajTextField.setText("");
        valorSaidajTextField.setText("");
    }

    @Override
    public void setCliente(Cliente cliente) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void exportarExcel(String caminho, String nomeArquivo) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setNumeroColuna(int numero) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    private void repetirLancamento(){
        carregarPlanoContas();
        planoContasjComboBox.setSelectedItem(repetir.getPlanocontas());
        contajComboBox.setSelectedItem(repetir.getBanco());
        tipojComboBox.setSelectedItem(repetir.getTipoDocumento());
        dataRegistrojDateChooser.setDate(repetir.getDataRegistro());
        dataVencimentojDateChooser.setDate(repetir.getDataVencimento());
        dataCompnesacaojDateChooser.setDate(repetir.getDataCompensacao());
        descricaojTextField.setText(repetir.getDescricao());
        valorEntradajTextField.setText(Formatacao.foramtarFloatString(repetir.getValorEntrada()));
        valorSaidajTextField.setText(Formatacao.foramtarFloatString(repetir.getValorSaida()));
        competenciajFormattedTextField.setText(repetir.getCompentencia());
    }
}
