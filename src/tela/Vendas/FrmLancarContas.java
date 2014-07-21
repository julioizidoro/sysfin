/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package tela.Vendas;

import com.toedter.calendar.JTextFieldDateEditor;
import controller.BancoController;
import controller.ContasPagarController;
import controller.ContasReceberController;
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
import model.Contaspagar;
import model.Contasreceber;
import model.Planocontas;
import model.Vendas;
import tela.ContasPagar.FrmCadastarContasPagar;
import tela.util.Formatacao;
import tela.util.UsuarioLogadoBean;

/**
 *
 * @author Wolverine
 */
public class FrmLancarContas extends javax.swing.JFrame {
    
    private String datePattern;
    private String maskPattern;
    private char placeHolder;
    private UsuarioLogadoBean usuarioLogadoBean;
    private Vendas venda;
    /**
     * Creates new form FrmLancarContas
     */
    public FrmLancarContas(UsuarioLogadoBean usuarioLogadoBean, Vendas venda) {
        datePattern = "dd/MM/yyyy";
        maskPattern = "##/##/####";
        placeHolder = '_';
        this.usuarioLogadoBean = usuarioLogadoBean;
        this.venda = venda;
        initComponents();
        URL url = this.getClass().getResource("/imagens/logoRelatorio/iconetela.png");
        Image imagemTitulo = Toolkit.getDefaultToolkit().getImage(url);
        this.setIconImage(imagemTitulo);
        inicializarDados();
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

        jPanel3 = new javax.swing.JPanel();
        datajLabel = new javax.swing.JLabel();
        dataComissaojDateChooser = new com.toedter.calendar.JDateChooser(null, null, datePattern, new JTextFieldDateEditor(datePattern,
            maskPattern, placeHolder));
    jLabel7 = new javax.swing.JLabel();
    planoContasComissaojComboBox = new javax.swing.JComboBox();
    jLabel8 = new javax.swing.JLabel();
    tipoDocumentoComissaojComboBox = new javax.swing.JComboBox();
    valorjLabel = new javax.swing.JLabel();
    valorComissaojTextField = new javax.swing.JTextField();
    jPanel4 = new javax.swing.JPanel();
    registrarContaComissaojButton = new javax.swing.JButton();
    jLabel10 = new javax.swing.JLabel();
    competenciajFormattedTextField = new javax.swing.JFormattedTextField();
    jPanel5 = new javax.swing.JPanel();
    jButton1 = new javax.swing.JButton();

    setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
    setTitle("Lançar Contas");

    jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Pagar / Receber"));

    datajLabel.setText("Data");

    dataComissaojDateChooser.addFocusListener(new java.awt.event.FocusAdapter() {
        public void focusGained(java.awt.event.FocusEvent evt) {
            dataComissaojDateChooserFocusGained(evt);
        }
    });

    jLabel7.setText("Plano de Contas");

    jLabel8.setText("Tipo Documento");

    tipoDocumentoComissaojComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Cheque", "Dinheiro", "Boleto", "Cartão", "Debito em Conta", "Depósito" }));

    valorjLabel.setText("Valor");

    valorComissaojTextField.setEditable(false);
    valorComissaojTextField.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

    jPanel4.setBorder(javax.swing.BorderFactory.createEtchedBorder());

    registrarContaComissaojButton.setText("Registar Contas a Pagar");
    registrarContaComissaojButton.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            registrarContaComissaojButtonActionPerformed(evt);
        }
    });

    javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
    jPanel4.setLayout(jPanel4Layout);
    jPanel4Layout.setHorizontalGroup(
        jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
            .addContainerGap(20, Short.MAX_VALUE)
            .addComponent(registrarContaComissaojButton)
            .addContainerGap())
    );
    jPanel4Layout.setVerticalGroup(
        jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(jPanel4Layout.createSequentialGroup()
            .addContainerGap()
            .addComponent(registrarContaComissaojButton)
            .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
    );

    jLabel10.setText("Competência");

    competenciajFormattedTextField.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("##/####"))));
    competenciajFormattedTextField.setText("  /    ");
    competenciajFormattedTextField.addKeyListener(new java.awt.event.KeyAdapter() {
        public void keyTyped(java.awt.event.KeyEvent evt) {
            competenciajFormattedTextFieldKeyTyped(evt);
        }
    });

    javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
    jPanel3.setLayout(jPanel3Layout);
    jPanel3Layout.setHorizontalGroup(
        jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(jPanel3Layout.createSequentialGroup()
            .addContainerGap()
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(jPanel3Layout.createSequentialGroup()
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel8)
                                .addComponent(tipoDocumentoComissaojComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(18, 18, 18)
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel10)
                                .addComponent(competenciajFormattedTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addComponent(planoContasComissaojComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 301, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(jPanel3Layout.createSequentialGroup()
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                            .addComponent(dataComissaojDateChooser, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(94, 94, 94))
                        .addGroup(jPanel3Layout.createSequentialGroup()
                            .addComponent(datajLabel)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(valorjLabel)
                        .addComponent(valorComissaojTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))))
            .addGap(0, 20, Short.MAX_VALUE))
        .addGroup(jPanel3Layout.createSequentialGroup()
            .addGap(64, 64, 64)
            .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(0, 0, Short.MAX_VALUE))
    );
    jPanel3Layout.setVerticalGroup(
        jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(jPanel3Layout.createSequentialGroup()
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                .addGroup(jPanel3Layout.createSequentialGroup()
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(valorjLabel, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(datajLabel))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(dataComissaojDateChooser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addComponent(valorComissaojTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(jLabel7)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                .addGroup(jPanel3Layout.createSequentialGroup()
                    .addComponent(planoContasComissaojComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addComponent(jLabel8)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(tipoDocumentoComissaojComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel3Layout.createSequentialGroup()
                    .addComponent(jLabel10)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(competenciajFormattedTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addGap(18, 18, 18)
            .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
    );

    jPanel5.setBorder(javax.swing.BorderFactory.createEtchedBorder());

    jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/botoespequenos/cancel.png"))); // NOI18N
    jButton1.setText("Fechar");
    jButton1.setToolTipText("Fechar");
    jButton1.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            jButton1ActionPerformed(evt);
        }
    });

    javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
    jPanel5.setLayout(jPanel5Layout);
    jPanel5Layout.setHorizontalGroup(
        jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(jPanel5Layout.createSequentialGroup()
            .addGap(98, 98, 98)
            .addComponent(jButton1)
            .addContainerGap(100, Short.MAX_VALUE))
    );
    jPanel5Layout.setVerticalGroup(
        jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(jPanel5Layout.createSequentialGroup()
            .addContainerGap()
            .addComponent(jButton1)
            .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
    );

    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
    getContentPane().setLayout(layout);
    layout.setHorizontalGroup(
        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(layout.createSequentialGroup()
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createSequentialGroup()
                    .addGap(38, 38, 38)
                    .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
    );
    layout.setVerticalGroup(
        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(layout.createSequentialGroup()
            .addGap(4, 4, 4)
            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
            .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
    );

    pack();
    }// </editor-fold>//GEN-END:initComponents

    private void dataComissaojDateChooserFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_dataComissaojDateChooserFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_dataComissaojDateChooserFocusGained

    private void registrarContaComissaojButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registrarContaComissaojButtonActionPerformed
        BancoController bancoController = new BancoController();
        Banco banco = bancoController.consultar(venda.getCliente(), " Nenhum");
        if (venda.getLiquidoReceber() > 0) {
            Contaspagar conta = new Contaspagar();
            conta.setCliente(venda.getCliente());
            conta.setContaPaga("N");
            conta.setDataVencimento(dataComissaojDateChooser.getDate());
            conta.setDataEnvio(new Date());
            conta.setDescricao("PAGAMENTO FORNECEDOR " + venda.getNomeFornecedor());
            conta.setMovimentoBanco(0);
            conta.setBanco(banco.getIdbanco());
            conta.setUsuarioAgendou(0);
            conta.setUsuarioBaixou(0);
            Planocontas plano = (Planocontas) planoContasComissaojComboBox.getSelectedItem();
            conta.setPlanocontas(plano.getIdplanoContas());
            conta.setTipoDocumento(tipoDocumentoComissaojComboBox.getSelectedItem().toString());
            conta.setUsuarioCadastrou(usuarioLogadoBean.getUsuario().getIdusuario());
            String novoValor = Formatacao.retirarNegativo(valorComissaojTextField.getText());
            conta.setValor(Formatacao.ConvercaoMonetariaFloat(novoValor));
            conta.setCompetencia(competenciajFormattedTextField.getText());
            conta.setVendaComissao(venda.getIdvendas());
            ContasPagarController contasPagarController = new ContasPagarController();
            contasPagarController.salvar(conta);
            JOptionPane.showMessageDialog(rootPane, "Conta Registrada com Sucesso");
            this.dispose();
        }else {
            Contasreceber conta = new Contasreceber();
            conta.setBanco(banco.getIdbanco());
            conta.setCliente(venda.getCliente());
            conta.setDataVencimento(dataComissaojDateChooser.getDate());
            conta.setDesagio(0.0f);
            conta.setJuros(0.0f);
            conta.setMovimentoBanco(0);
            conta.setNomeCliente(venda.getNomeFornecedor());
            conta.setNumeroDocumento("VENDA-" + String.valueOf(venda.getIdvendas()));
            conta.setNumeroParcela(1);
            Planocontas plano = (Planocontas) planoContasComissaojComboBox.getSelectedItem();
            conta.setPlanocontas(plano.getIdplanoContas());
            conta.setTipodocumento(tipoDocumentoComissaojComboBox.getSelectedItem().toString());
            conta.setUsuario(usuarioLogadoBean.getUsuario().getIdusuario());
            conta.setValorPago(00.f);
            conta.setValorParcela(venda.getLiquidoReceber()*(-1));
            conta.setVenda(venda.getIdvendas());
            conta.setVendaComissao(venda.getIdvendas());
            ContasReceberController contasReceberController = new ContasReceberController();
            contasReceberController.salvar(conta);   
            JOptionPane.showMessageDialog(rootPane, "Conta Registrada com Sucesso");
            this.dispose();
        }
    }//GEN-LAST:event_registrarContaComissaojButtonActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void competenciajFormattedTextFieldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_competenciajFormattedTextFieldKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_competenciajFormattedTextFieldKeyTyped

    /**
     * @param args the command line arguments
     */
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JFormattedTextField competenciajFormattedTextField;
    private com.toedter.calendar.JDateChooser dataComissaojDateChooser;
    private javax.swing.JLabel datajLabel;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JComboBox planoContasComissaojComboBox;
    private javax.swing.JButton registrarContaComissaojButton;
    private javax.swing.JComboBox tipoDocumentoComissaojComboBox;
    private javax.swing.JTextField valorComissaojTextField;
    private javax.swing.JLabel valorjLabel;
    // End of variables declaration//GEN-END:variables

    public void inicializarDados(){
        try {           
            competenciajFormattedTextField.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/####")));
        } catch (ParseException ex) {
            Logger.getLogger(FrmCadastarContasPagar.class.getName()).log(Level.SEVERE, null, ex);
        }
        PlanoContasController planoContasController = new PlanoContasController();
        List<Planocontas> listaPlano = planoContasController.listar();
        if (listaPlano!=null){
            planoContasComissaojComboBox = Formatacao.preencherComobox(listaPlano, planoContasComissaojComboBox);
        }
        ContasPagarController contasPagarController = new ContasPagarController();
        String sql = "Select c from Contaspagar c where c.vendaComissao=" + venda.getIdvendas();
        Contaspagar contaComissao = null;
        valorComissaojTextField.setText(Formatacao.foramtarFloatString(venda.getLiquidoReceber()));
        if (venda.getLiquidoReceber()>0){
            sql = "Select c from Contaspagar c where c.vendaComissao=" + venda.getIdvendas();
            contaComissao = contasPagarController.consultarVenda(sql);
            datajLabel.setText("Data Pagamento");
            valorjLabel.setText("Valor a Pagar");
            registrarContaComissaojButton.setText("Registar Contas a Pagar");
            if (contaComissao!=null){
                registrarContaComissaojButton.setEnabled(false);
                dataComissaojDateChooser.setDate(contaComissao.getDataVencimento());
                Planocontas plano = planoContasController.consultar(contaComissao.getPlanocontas());
                valorComissaojTextField.setText(Formatacao.foramtarFloatString(contaComissao.getValor()));
                registrarContaComissaojButton.setEnabled(false);
                if (plano!=null){
                    planoContasComissaojComboBox.setSelectedItem(plano);
                }
                tipoDocumentoComissaojComboBox.setSelectedItem(contaComissao.getTipoDocumento());
                competenciajFormattedTextField.setText(contaComissao.getCompetencia());
                competenciajFormattedTextField.setEnabled(false);
                dataComissaojDateChooser.setEnabled(false);
                planoContasComissaojComboBox.setEnabled(false);
                tipoDocumentoComissaojComboBox.setEnabled(false);
                competenciajFormattedTextField.setEnabled(false);
                JOptionPane.showMessageDialog(rootPane, "Venda já registrada");
            }
        }else {
            ContasReceberController contasReceberController = new ContasReceberController();
            Contasreceber contaReceber = contasReceberController.consultarVendaFornecedor(venda.getIdvendas());
            datajLabel.setText("Data Recebimento");
            valorjLabel.setText("Valor a Receber");
            registrarContaComissaojButton.setText("Registar Contas a Receber");
            if (contaReceber!=null){
                dataComissaojDateChooser.setDate(contaReceber.getDataVencimento());
                dataComissaojDateChooser.setEnabled(false);
                registrarContaComissaojButton.setEnabled(false);
                Planocontas plano = planoContasController.consultar(contaReceber.getPlanocontas());
                if (plano!=null){
                    planoContasComissaojComboBox.setSelectedItem(plano);
                }
                tipoDocumentoComissaojComboBox.setSelectedItem(contaReceber.getTipodocumento());
                registrarContaComissaojButton.setEnabled(false);
                competenciajFormattedTextField.setEnabled(false);
                dataComissaojDateChooser.setEnabled(false);
                planoContasComissaojComboBox.setEnabled(false);
                tipoDocumentoComissaojComboBox.setEnabled(false);
                competenciajFormattedTextField.setEnabled(false);
                JOptionPane.showMessageDialog(rootPane, "Venda já registrada");
            }
        }
    }

}
