/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 *
 *
 * Created on 20/03/2012, 08:19:50
 */
package tela.Cliente;

import controller.BancoController;
import controller.ClienteController;
import controller.PlanoContasController;
import java.awt.Image;
import java.awt.Toolkit;
import java.net.URL;
import java.text.ParseException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import model.*;
import tela.util.Formatacao;



/**
 *
 * @author Wolverine
 */
public class FrmCadastrarCliente extends javax.swing.JFrame {
    
    private Cliente cliente;
    private ICliente telaCliente;
    
    /** Creates new form FrmCadastrarClientePJ */
    public FrmCadastrarCliente(Cliente cliente, ICliente telaCliente) {
        this.telaCliente = telaCliente;
        initComponents();
        URL url = this.getClass().getResource("/imagens/logoRelatorio/iconetela.png");
        Image imagemTitulo = Toolkit.getDefaultToolkit().getImage(url);
        this.setIconImage(imagemTitulo);
        formatarCampos();
        carregarComboBox();
        if (cliente!=null){
            this.cliente = cliente;
            preencherCampos();
        }else {
            this.cliente = new Cliente();
        }
        this.setLocationRelativeTo(null);
        razaoSocialjTextField.requestFocus();
        this.setVisible(true);
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        jLabel40 = new javax.swing.JLabel();
        razaoSocialjTextField = new javax.swing.JTextField();
        jLabel41 = new javax.swing.JLabel();
        nomeFantasiajTextField = new javax.swing.JTextField();
        jLabel42 = new javax.swing.JLabel();
        cnpjjFormattedTextField = new javax.swing.JFormattedTextField();
        jLabel43 = new javax.swing.JLabel();
        foneFixojFormattedTextField = new javax.swing.JFormattedTextField();
        jLabel44 = new javax.swing.JLabel();
        emailjTextField = new javax.swing.JTextField();
        jLabel45 = new javax.swing.JLabel();
        tipoLogradourojComboBox = new javax.swing.JComboBox();
        jLabel46 = new javax.swing.JLabel();
        logradourojTextField = new javax.swing.JTextField();
        jLabel47 = new javax.swing.JLabel();
        numerojTextField = new javax.swing.JTextField();
        jLabel48 = new javax.swing.JLabel();
        complementojTextField = new javax.swing.JTextField();
        bairrojTextField = new javax.swing.JTextField();
        jLabel49 = new javax.swing.JLabel();
        cepjFormattedTextField = new javax.swing.JFormattedTextField();
        jLabel50 = new javax.swing.JLabel();
        cidadejTextField = new javax.swing.JTextField();
        estadojTextField = new javax.swing.JTextField();
        jLabel51 = new javax.swing.JLabel();
        jLabel52 = new javax.swing.JLabel();
        responsaveljTextField = new javax.swing.JTextField();
        jLabel53 = new javax.swing.JLabel();
        planoContasVendasjComboBox = new javax.swing.JComboBox();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        planoContasRecebimentojComboBox = new javax.swing.JComboBox();
        codigosystmjTextField = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        visualizacaojComboBox = new javax.swing.JComboBox();
        jPanel7 = new javax.swing.JPanel();
        salvarjButton = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cadastro de Cliente Pessoa Jurídica");

        jLabel40.setText("Razão Social");

        jLabel41.setText("Nome Fantasia");

        jLabel42.setText("Nº CNPJ");

        cnpjjFormattedTextField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                cnpjjFormattedTextFieldFocusLost(evt);
            }
        });

        jLabel43.setText("Telefone");

        jLabel44.setText("E-mail");

        jLabel45.setText("Tipo Logradouro");

        tipoLogradourojComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "AVENIDA", "BR", "ESTRADA", "RODOVIA", "RUA", "SERVIDÃO" }));

        jLabel46.setText("Logradouro");

        jLabel47.setText("Número");

        jLabel48.setText("Complemento");

        jLabel49.setText("CEP");

        jLabel50.setText("Cidade");

        jLabel51.setText("Bairro");

        jLabel52.setText("Estado");

        jLabel53.setText("Responsável");

        jLabel1.setText("Selecionar Plano de Conta para Vendas");

        jLabel2.setText("Selecionar Plano de Conta para Recebimentos");

        codigosystmjTextField.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        codigosystmjTextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                codigosystmjTextFieldKeyTyped(evt);
            }
        });

        jLabel3.setText("Código SysTM");

        jLabel4.setText("Visualização");

        visualizacaojComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Unidade", "Operacional" }));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addComponent(planoContasVendasjComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 138, Short.MAX_VALUE)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(planoContasRecebimentojComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jLabel41)
                                                .addComponent(jLabel40)
                                                .addComponent(nomeFantasiajTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 360, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(razaoSocialjTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 360, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGap(28, 28, 28)
                                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                    .addComponent(jLabel42, javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(cnpjjFormattedTextField, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addComponent(foneFixojFormattedTextField, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(jLabel43, javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(numerojTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                                        .addComponent(jLabel47)
                                                        .addGap(34, 34, 34)))))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel51)
                                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addComponent(bairrojTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGroup(jPanel2Layout.createSequentialGroup()
                                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(cepjFormattedTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jLabel49))
                                                    .addGap(18, 18, 18)
                                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(jLabel52)
                                                        .addComponent(estadojTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                                    .addComponent(jLabel44))
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addComponent(emailjTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(responsaveljTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel53))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                            .addComponent(jLabel3)
                                            .addGap(0, 0, Short.MAX_VALUE))
                                        .addComponent(codigosystmjTextField)))))
                        .addContainerGap(14, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel45)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(tipoLogradourojComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(27, 27, 27)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel46)
                                    .addComponent(logradourojTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 348, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jLabel48)
                            .addComponent(jLabel50)
                            .addComponent(cidadejTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 328, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(complementojTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4)
                            .addComponent(visualizacaojComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel40)
                        .addGap(26, 26, 26))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel42)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cnpjjFormattedTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(razaoSocialjTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel41)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(nomeFantasiajTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel43)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(foneFixojFormattedTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel45)
                    .addComponent(jLabel46)
                    .addComponent(jLabel47))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tipoLogradourojComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(logradourojTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(numerojTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel48)
                            .addComponent(jLabel51))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(complementojTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(bairrojTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel50)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cidadejTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel52)
                            .addComponent(jLabel49))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cepjFormattedTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(estadojTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel44)
                    .addComponent(jLabel53)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(emailjTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(responsaveljTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(codigosystmjTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(planoContasVendasjComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(planoContasRecebimentojComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(visualizacaojComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(28, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Dados de Identificação", jPanel2);

        jPanel7.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        salvarjButton.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        salvarjButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/botoespequenos/confirmar.png"))); // NOI18N
        salvarjButton.setText("Confirmar");
        salvarjButton.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        salvarjButton.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        salvarjButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salvarjButtonActionPerformed(evt);
            }
        });
        jPanel7.add(salvarjButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 10, -1, -1));

        jButton3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/botoespequenos/cancel.png"))); // NOI18N
        jButton3.setText("Cancelar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel7.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 10, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 575, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(100, 100, 100)
                        .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, 393, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void salvarjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salvarjButtonActionPerformed
        salvarDados();
        this.dispose();
    }//GEN-LAST:event_salvarjButtonActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        this.dispose();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void cnpjjFormattedTextFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_cnpjjFormattedTextFieldFocusLost
        if (!Formatacao.ValidaCNPJ(cnpjjFormattedTextField.getText())){
            JOptionPane.showMessageDialog(rootPane, "Número do CNPJ Inválido");
        }
    }//GEN-LAST:event_cnpjjFormattedTextFieldFocusLost

    private void codigosystmjTextFieldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_codigosystmjTextFieldKeyTyped
        String caracteres = "0987654321";
        if (evt.getKeyChar() != '\b') {
            if (!caracteres.contains(evt.getKeyChar() + "")) {
                evt.consume();
            }
        }
    }//GEN-LAST:event_codigosystmjTextFieldKeyTyped

    /**
     * @param args the command line arguments
     */
   
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField bairrojTextField;
    private javax.swing.JFormattedTextField cepjFormattedTextField;
    private javax.swing.JTextField cidadejTextField;
    private javax.swing.JFormattedTextField cnpjjFormattedTextField;
    private javax.swing.JTextField codigosystmjTextField;
    private javax.swing.JTextField complementojTextField;
    private javax.swing.JTextField emailjTextField;
    private javax.swing.JTextField estadojTextField;
    private javax.swing.JFormattedTextField foneFixojFormattedTextField;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel52;
    private javax.swing.JLabel jLabel53;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextField logradourojTextField;
    private javax.swing.JTextField nomeFantasiajTextField;
    private javax.swing.JTextField numerojTextField;
    private javax.swing.JComboBox planoContasRecebimentojComboBox;
    private javax.swing.JComboBox planoContasVendasjComboBox;
    private javax.swing.JTextField razaoSocialjTextField;
    private javax.swing.JTextField responsaveljTextField;
    private javax.swing.JButton salvarjButton;
    private javax.swing.JComboBox tipoLogradourojComboBox;
    private javax.swing.JComboBox visualizacaojComboBox;
    // End of variables declaration//GEN-END:variables

    public void preencherCampos(){
        if (cliente!=null){
            popularTelaDadosIdentificacao();
        }
    }
    
    public void popularTelaDadosIdentificacao(){
        razaoSocialjTextField.setText(cliente.getRazaoSocial());
        cnpjjFormattedTextField.setText(cliente.getCnpj());
        nomeFantasiajTextField.setText(cliente.getNomeFantasia());
        foneFixojFormattedTextField.setText(cliente.getFoneFixo());
        emailjTextField.setText(cliente.getEmail());
        tipoLogradourojComboBox.setSelectedItem(cliente.getTipoLogradouro());
        logradourojTextField.setText(cliente.getLogradouro());
        numerojTextField.setText(cliente.getNumero());
        complementojTextField.setText(cliente.getComplemento());
        bairrojTextField.setText(cliente.getBairro());
        cepjFormattedTextField.setText(cliente.getCep());
        cidadejTextField.setText(cliente.getCidade());
        estadojTextField.setText(cliente.getEstado());
        visualizacaojComboBox.setSelectedItem(cliente.getVisualizacao());
        responsaveljTextField.setText(cliente.getAdministrador());
        codigosystmjTextField.setText(String.valueOf(cliente.getCodigosystm()));
        PlanoContasController planoContasController = new PlanoContasController();
        Planocontas plano = planoContasController.consultar(cliente.getContaReceita());
        if (plano!=null){
            planoContasVendasjComboBox.setSelectedItem(plano);
        }
        plano = planoContasController.consultar(cliente.getContaRecebimento());
        if (plano!=null){
            planoContasRecebimentojComboBox.setSelectedItem(plano);
        }
    }
    //Ppopular objetos
    
    public void popularCliente(){
        cliente.setCnpj(cnpjjFormattedTextField.getText());
        cliente.setEmail(emailjTextField.getText());
        cliente.setAdministrador(responsaveljTextField.getText());
        cliente.setFoneFixo(foneFixojFormattedTextField.getText());
        cliente.setRazaoSocial(razaoSocialjTextField.getText());
        cliente.setNomeFantasia(nomeFantasiajTextField.getText());
        cliente.setBairro(bairrojTextField.getText());
        cliente.setCep(cepjFormattedTextField.getText());
        cliente.setComplemento(complementojTextField.getText());
        cliente.setEstado(estadojTextField.getText());
        cliente.setLogradouro(logradourojTextField.getText());
        cliente.setCidade(cidadejTextField.getText());
        cliente.setNumero(numerojTextField.getText());
        cliente.setVisualizacao(visualizacaojComboBox.getSelectedItem().toString());
        cliente.setTipoLogradouro(tipoLogradourojComboBox.getSelectedItem().toString());
        Planocontas plano = (Planocontas) planoContasVendasjComboBox.getSelectedItem();
        if (plano!=null){
            cliente.setContaReceita(plano.getIdplanoContas());
        }else cliente.setContaReceita(0);
        plano = (Planocontas) planoContasRecebimentojComboBox.getSelectedItem();
        if (plano!=null){
            cliente.setContaRecebimento(plano.getIdplanoContas());
        }else cliente.setContaRecebimento(0);
        if (codigosystmjTextField.getText().length()>0){
            cliente.setCodigosystm(Integer.parseInt(codigosystmjTextField.getText()));
        }else cliente.setCodigosystm(0);
    }
    
    
    // Validar Campos
    
    public String validarTelaDadosIdentificacao(){
        if (razaoSocialjTextField.getText()==null){
            return "Razão Social campo obrigatório";
        }
        if (cnpjjFormattedTextField.getText()==null){
            return  "CNPJ campo obrigatório";
        }
        if (logradourojTextField.getText()==null){
            return "Logradouro campo obrigatório";
        }
        if (nomeFantasiajTextField.getText().length()==0)
        if (numerojTextField.getText()==null){
            return  "NomeFantasia obrigatório";
        }
        if (bairrojTextField.getText()==null){
            return "Bairro campo obrigatório";
        }
        if (cepjFormattedTextField.getText()==null){
            return "CEP campo obrigatório";
        }
        if (cidadejTextField.getText()==null){
            return "Cidade campo obrigatório";
        }
        if (tipoLogradourojComboBox.getSelectedItem().toString()==null){
            return "Tipo de Logradouro não selecinado";
        }
        return " ";
    }
    
    
    
    public void salvarDados() {
        String msg = validarTelaDadosIdentificacao();
        if (msg.length() < 5) {
            popularCliente();
            Banco banco = null;
            if (cliente.getIdcliente()== null) {
                banco = new Banco();
                banco.setNome(" Nenhum");
                banco.setNumeroBanco("0");
                banco.setAgencia("0");
                banco.setConta("0");
            }
            ClienteController clienteController = new ClienteController();
            cliente = clienteController.salvar(cliente);
            if (banco != null) {
                banco.setCliente(cliente);
                BancoController bancoController = new BancoController();
                bancoController.salvar(banco);
            }
            this.telaCliente.setModel();
        } else {
            JOptionPane.showMessageDialog(rootPane, msg);
        }
    }
    
    
    public void formatarCampos() {
        try {
            cnpjjFormattedTextField.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##.###.###/####-##")));
            foneFixojFormattedTextField.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##)####-####")));
            cepjFormattedTextField.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("#####-###")));
        } catch (ParseException ex) {
            Logger.getLogger(FrmCadastrarCliente.class.getName()).log(Level.SEVERE, null, ex);
        }  
    }
    
    public void carregarComboBox(){
        PlanoContasController planoContasController = new PlanoContasController();
        List<Planocontas> listaPlano = planoContasController.listar();
        if (listaPlano!=null){
            planoContasVendasjComboBox = Formatacao.preencherComobox(listaPlano, planoContasVendasjComboBox);
            planoContasRecebimentojComboBox = Formatacao.preencherComobox(listaPlano, planoContasRecebimentojComboBox);
        }
        
    }
    
    
}
