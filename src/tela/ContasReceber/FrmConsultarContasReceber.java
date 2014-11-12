/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package tela.ContasReceber;

import tela.ContasPagar.*;
import com.toedter.calendar.JTextFieldDateEditor;
import controller.ContasReceberController;
import java.awt.Image;
import java.awt.Toolkit;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.TableColumnModel;
import model.Cliente;
import model.Contasreceber;
import modelView.Viewcontasreceber;
import tela.Cliente.FrmConsultaCliente;
import tela.util.Formatacao;
import tela.util.UsuarioLogadoBean;

/**
 *
 * @author Wolverine
 */
public class FrmConsultarContasReceber extends javax.swing.JFrame implements IContasReceber{
    
    private String datePattern;
    private String maskPattern;
    private char placeHolder;
    private List<Viewcontasreceber> listaContas;
    private ContasReceberTableModel modelContas;
    private UsuarioLogadoBean usuarioLogadoBean;
    private Cliente cliente;
    private String sql;
    /**
     * Creates new form FrmConsultarContasPagar
     */
    public FrmConsultarContasReceber(UsuarioLogadoBean usuarioLogadoBean) {
        datePattern = "dd/MM/yyyy";
        maskPattern = "##/##/####";
        placeHolder = '_';
        this.usuarioLogadoBean = usuarioLogadoBean;
        initComponents();
        inicializarCliente();
        URL url = this.getClass().getResource("/imagens/logoRelatorio/iconetela.png");
        Image imagemTitulo = Toolkit.getDefaultToolkit().getImage(url);
        this.setIconImage(imagemTitulo);
        this.setLocationRelativeTo(null);
        criarConsultaContasPagarInicial();
        if (usuarioLogadoBean.getUsuario().getCliente()>0){
            unidadejTextField.setEnabled(true);
        }
        contasReceberjTable.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);  
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
        jScrollPane1 = new javax.swing.JScrollPane();
        contasReceberjTable = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        unidadejTextField = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        dataIniciojDateChooser = new com.toedter.calendar.JDateChooser(null, null, datePattern, new JTextFieldDateEditor(datePattern,
            maskPattern, placeHolder));
    jLabel4 = new javax.swing.JLabel();
    dataFinaljDateChooser = new com.toedter.calendar.JDateChooser(null, null, datePattern, new JTextFieldDateEditor(datePattern,
        maskPattern, placeHolder));
jButton1 = new javax.swing.JButton();
selecionarjButton = new javax.swing.JButton();
recebidasjCheckBox = new javax.swing.JCheckBox();
BarradeTarefasjToolBar = new javax.swing.JToolBar();
adicionarAPagarjButton = new javax.swing.JButton();
editarAPagarjButton = new javax.swing.JButton();
excluirAPagarjButton = new javax.swing.JButton();
SeparadordeTarefasjSeparator = new javax.swing.JToolBar.Separator();
gerarParcelasjButton2 = new javax.swing.JButton();
excluirAPagarjButton1 = new javax.swing.JButton();
voltarTelajButton = new javax.swing.JButton();

setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
setTitle("Consultar Contas a Receber");

jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

contasReceberjTable.setModel(new javax.swing.table.DefaultTableModel(
    new Object [][] {
        {null, null, null, null, null},
        {null, null, null, null, null},
        {null, null, null, null, null},
        {null, null, null, null, null}
    },
    new String [] {
        "Status", "Data Vencimento", "Cliente", "Descrição", "Valor Conta"
    }
    ) {
        boolean[] canEdit = new boolean [] {
            false, false, false, false, false
        };

        public boolean isCellEditable(int rowIndex, int columnIndex) {
            return canEdit [columnIndex];
        }
    });
    jScrollPane1.setViewportView(contasReceberjTable);
    if (contasReceberjTable.getColumnModel().getColumnCount() > 0) {
        contasReceberjTable.getColumnModel().getColumn(0).setResizable(false);
        contasReceberjTable.getColumnModel().getColumn(1).setResizable(false);
        contasReceberjTable.getColumnModel().getColumn(2).setResizable(false);
        contasReceberjTable.getColumnModel().getColumn(3).setResizable(false);
        contasReceberjTable.getColumnModel().getColumn(4).setResizable(false);
    }

    javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
    jPanel1.setLayout(jPanel1Layout);
    jPanel1Layout.setHorizontalGroup(
        jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(jPanel1Layout.createSequentialGroup()
            .addContainerGap()
            .addComponent(jScrollPane1)
            .addContainerGap())
    );
    jPanel1Layout.setVerticalGroup(
        jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(jPanel1Layout.createSequentialGroup()
            .addContainerGap()
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 361, Short.MAX_VALUE)
            .addContainerGap())
    );

    jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

    jLabel1.setText("Unidade");

    unidadejTextField.setEditable(false);

    jLabel3.setText("Data Inicial");

    dataIniciojDateChooser.addFocusListener(new java.awt.event.FocusAdapter() {
        public void focusGained(java.awt.event.FocusEvent evt) {
            dataIniciojDateChooserFocusGained(evt);
        }
    });

    jLabel4.setText("Data Final");

    dataFinaljDateChooser.addFocusListener(new java.awt.event.FocusAdapter() {
        public void focusGained(java.awt.event.FocusEvent evt) {
            dataFinaljDateChooserFocusGained(evt);
        }
    });

    jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/botoes/selecionar.png"))); // NOI18N
    jButton1.setText("Pesquisar");
    jButton1.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            jButton1ActionPerformed(evt);
        }
    });

    selecionarjButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/botoes/selecionar.png"))); // NOI18N
    selecionarjButton.setText("Selecionar");
    selecionarjButton.setToolTipText("Selecionar Cliente");
    selecionarjButton.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            selecionarjButtonActionPerformed(evt);
        }
    });

    recebidasjCheckBox.setText("Recebidas");

    javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
    jPanel2.setLayout(jPanel2Layout);
    jPanel2Layout.setHorizontalGroup(
        jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(jPanel2Layout.createSequentialGroup()
            .addContainerGap()
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jLabel1)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addComponent(unidadejTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(selecionarjButton)))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 57, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                    .addComponent(jLabel3)
                    .addGap(57, 57, 57))
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                    .addComponent(dataIniciojDateChooser, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(18, 18, 18)))
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(dataFinaljDateChooser, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(jLabel4))
            .addGap(18, 18, 18)
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(recebidasjCheckBox)
                .addComponent(jButton1))
            .addContainerGap())
    );
    jPanel2Layout.setVerticalGroup(
        jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
            .addContainerGap(16, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel1)
                        .addComponent(jLabel4)
                        .addComponent(jLabel3))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(dataIniciojDateChooser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(unidadejTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(selecionarjButton))
                        .addComponent(dataFinaljDateChooser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addComponent(recebidasjCheckBox)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(jButton1)))
            .addContainerGap())
    );

    BarradeTarefasjToolBar.setFloatable(false);
    BarradeTarefasjToolBar.setRollover(true);

    adicionarAPagarjButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/botoes/adicionar.png"))); // NOI18N
    adicionarAPagarjButton.setText("Adicionar");
    adicionarAPagarjButton.setToolTipText("Adicionar Contas a Receber");
    adicionarAPagarjButton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
    adicionarAPagarjButton.setMaximumSize(new java.awt.Dimension(80, 90));
    adicionarAPagarjButton.setMinimumSize(new java.awt.Dimension(80, 90));
    adicionarAPagarjButton.setName(""); // NOI18N
    adicionarAPagarjButton.setPreferredSize(new java.awt.Dimension(80, 90));
    adicionarAPagarjButton.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
    adicionarAPagarjButton.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            adicionarAPagarjButtonActionPerformed(evt);
        }
    });
    BarradeTarefasjToolBar.add(adicionarAPagarjButton);

    editarAPagarjButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/botoes/editar.png"))); // NOI18N
    editarAPagarjButton.setText("Editar");
    editarAPagarjButton.setToolTipText("Editar Contas a Receber");
    editarAPagarjButton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
    editarAPagarjButton.setMaximumSize(new java.awt.Dimension(80, 90));
    editarAPagarjButton.setMinimumSize(new java.awt.Dimension(80, 90));
    editarAPagarjButton.setPreferredSize(new java.awt.Dimension(80, 90));
    editarAPagarjButton.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
    editarAPagarjButton.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            editarAPagarjButtonActionPerformed(evt);
        }
    });
    BarradeTarefasjToolBar.add(editarAPagarjButton);

    excluirAPagarjButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/botoes/excluir.png"))); // NOI18N
    excluirAPagarjButton.setText("Excluir");
    excluirAPagarjButton.setToolTipText("Excluir Contas a Receber");
    excluirAPagarjButton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
    excluirAPagarjButton.setMaximumSize(new java.awt.Dimension(80, 90));
    excluirAPagarjButton.setMinimumSize(new java.awt.Dimension(80, 90));
    excluirAPagarjButton.setPreferredSize(new java.awt.Dimension(80, 90));
    excluirAPagarjButton.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
    excluirAPagarjButton.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            excluirAPagarjButtonActionPerformed(evt);
        }
    });
    BarradeTarefasjToolBar.add(excluirAPagarjButton);
    BarradeTarefasjToolBar.add(SeparadordeTarefasjSeparator);

    gerarParcelasjButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/botoes/pesquisar.png"))); // NOI18N
    gerarParcelasjButton2.setText("Pesquisar");
    gerarParcelasjButton2.setToolTipText("");
    gerarParcelasjButton2.setFocusable(false);
    gerarParcelasjButton2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
    gerarParcelasjButton2.setMaximumSize(new java.awt.Dimension(80, 90));
    gerarParcelasjButton2.setMinimumSize(new java.awt.Dimension(80, 90));
    gerarParcelasjButton2.setPreferredSize(new java.awt.Dimension(80, 90));
    gerarParcelasjButton2.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
    gerarParcelasjButton2.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            gerarParcelasjButton2ActionPerformed(evt);
        }
    });
    BarradeTarefasjToolBar.add(gerarParcelasjButton2);

    excluirAPagarjButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/botoes/liberar.png"))); // NOI18N
    excluirAPagarjButton1.setText("Receber");
    excluirAPagarjButton1.setToolTipText("Receber Conta");
    excluirAPagarjButton1.setFocusable(false);
    excluirAPagarjButton1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
    excluirAPagarjButton1.setMaximumSize(new java.awt.Dimension(80, 90));
    excluirAPagarjButton1.setMinimumSize(new java.awt.Dimension(80, 90));
    excluirAPagarjButton1.setPreferredSize(new java.awt.Dimension(80, 90));
    excluirAPagarjButton1.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
    excluirAPagarjButton1.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            excluirAPagarjButton1ActionPerformed(evt);
        }
    });
    BarradeTarefasjToolBar.add(excluirAPagarjButton1);

    voltarTelajButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/botoes/voltar.png"))); // NOI18N
    voltarTelajButton.setText("Voltar");
    voltarTelajButton.setToolTipText("Voltar");
    voltarTelajButton.setFocusable(false);
    voltarTelajButton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
    voltarTelajButton.setMaximumSize(new java.awt.Dimension(80, 90));
    voltarTelajButton.setMinimumSize(new java.awt.Dimension(80, 90));
    voltarTelajButton.setPreferredSize(new java.awt.Dimension(80, 90));
    voltarTelajButton.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
    voltarTelajButton.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            voltarTelajButtonActionPerformed(evt);
        }
    });
    BarradeTarefasjToolBar.add(voltarTelajButton);

    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
    getContentPane().setLayout(layout);
    layout.setHorizontalGroup(
        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(layout.createSequentialGroup()
            .addContainerGap()
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addContainerGap())
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(123, Short.MAX_VALUE)
                .addComponent(BarradeTarefasjToolBar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(168, Short.MAX_VALUE)))
    );
    layout.setVerticalGroup(
        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(layout.createSequentialGroup()
            .addContainerGap()
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addContainerGap(106, Short.MAX_VALUE))
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(501, Short.MAX_VALUE)
                .addComponent(BarradeTarefasjToolBar, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap()))
    );

    pack();
    }// </editor-fold>//GEN-END:initComponents

    private void dataIniciojDateChooserFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_dataIniciojDateChooserFocusGained

    }//GEN-LAST:event_dataIniciojDateChooserFocusGained

    private void dataFinaljDateChooserFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_dataFinaljDateChooserFocusGained

    }//GEN-LAST:event_dataFinaljDateChooserFocusGained

    private void adicionarAPagarjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adicionarAPagarjButtonActionPerformed
        new FrmCadastarContasReceber(usuarioLogadoBean, null, this);

    }//GEN-LAST:event_adicionarAPagarjButtonActionPerformed

    private void editarAPagarjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editarAPagarjButtonActionPerformed
        int linha = contasReceberjTable.getSelectedRow();
        if (linha>=0){
            ContasReceberController contasReceberController = new ContasReceberController();
            Contasreceber contas = contasReceberController.consultar(listaContas.get(linha).getIdContasReceber());
            new FrmCadastarContasReceber(usuarioLogadoBean, contas, this);
        }
    }//GEN-LAST:event_editarAPagarjButtonActionPerformed

    private void excluirAPagarjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_excluirAPagarjButtonActionPerformed
        int linha = contasReceberjTable.getSelectedRow();
        if(linha>=0){
            ContasReceberController contasReceberController = new ContasReceberController();
            contasReceberController.excluir(listaContas.get(linha).getIdContasReceber());
            JOptionPane.showMessageDialog(rootPane, " Conta excluida com sucesso");
            criarConsultaContasPagarInicial();
        } 
    }//GEN-LAST:event_excluirAPagarjButtonActionPerformed

    private void voltarTelajButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_voltarTelajButtonActionPerformed
        //this.dispose();
        gerarBoletoAcbr boleto = new gerarBoletoAcbr();
        try {
            boleto.gerarBoleto();
        } catch (IOException ex) {
            Logger.getLogger(FrmConsultarContasReceber.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_voltarTelajButtonActionPerformed

    private void excluirAPagarjButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_excluirAPagarjButton1ActionPerformed
        int linha = contasReceberjTable.getSelectedRow();
        if (linha>=0){
            ContasReceberController contasReceberController = new ContasReceberController();
            Contasreceber contas = contasReceberController.consultar(listaContas.get(linha).getIdContasReceber());
            if (contas.getValorPago()>0){
                JOptionPane.showMessageDialog(rootPane, " Conta já recebida em " + Formatacao.ConvercaoDataPadrao(contas.getDataPagamento()));
            }else new FrmReceberConta(contas, usuarioLogadoBean, this);
        }
    }//GEN-LAST:event_excluirAPagarjButton1ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        sql = "Select v from Viewcontasreceber v where ";
        if (recebidasjCheckBox.isSelected()) {
            if (cliente != null) {
                sql = sql + " v.clienteIdcliente=" + cliente.getIdcliente() + " and ";
            }
            sql = sql + "v.dataPagamento>='" + Formatacao.ConvercaoDataSql(dataIniciojDateChooser.getDate())
                    + "' and v.dataPagamento<='" + Formatacao.ConvercaoDataSql(dataFinaljDateChooser.getDate())
                    + "' and valorPago>0 order by v.dataPagamento";
        } else {
            if (cliente != null) {
                sql = sql + " v.clienteIdcliente=" + cliente.getIdcliente() + " and ";
            }
            sql = sql + "v.dataVencimento>='" + Formatacao.ConvercaoDataSql(dataIniciojDateChooser.getDate())
                    + "' and v.dataVencimento<='" + Formatacao.ConvercaoDataSql(dataFinaljDateChooser.getDate())
                    + "' and valorPago=0 order by v.dataVencimento";
        }
        carregarModel();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void selecionarjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selecionarjButtonActionPerformed
        new FrmConsultaCliente(usuarioLogadoBean, this);
    }//GEN-LAST:event_selecionarjButtonActionPerformed

    private void gerarParcelasjButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gerarParcelasjButton2ActionPerformed
        new FrmPesquisarContasReceber(usuarioLogadoBean, cliente, this);
    }//GEN-LAST:event_gerarParcelasjButton2ActionPerformed

    /**
     * @param args the command line arguments
     */
   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToolBar BarradeTarefasjToolBar;
    private javax.swing.JToolBar.Separator SeparadordeTarefasjSeparator;
    private javax.swing.JButton adicionarAPagarjButton;
    private javax.swing.JTable contasReceberjTable;
    private com.toedter.calendar.JDateChooser dataFinaljDateChooser;
    private com.toedter.calendar.JDateChooser dataIniciojDateChooser;
    private javax.swing.JButton editarAPagarjButton;
    private javax.swing.JButton excluirAPagarjButton;
    private javax.swing.JButton excluirAPagarjButton1;
    private javax.swing.JButton gerarParcelasjButton2;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JCheckBox recebidasjCheckBox;
    private javax.swing.JButton selecionarjButton;
    private javax.swing.JTextField unidadejTextField;
    private javax.swing.JButton voltarTelajButton;
    // End of variables declaration//GEN-END:variables

    public void carregarModel(){
        ContasReceberController contasReceberController = new ContasReceberController();
        listaContas = contasReceberController.listar(sql);
        if (listaContas==null){
            listaContas = new ArrayList<Viewcontasreceber>();
        }
        
        modelContas = new ContasReceberTableModel(listaContas);
        contasReceberjTable.setModel(modelContas);
        TableColumnModel ColumnModel = contasReceberjTable.getColumnModel();  
        JTableRenderer renderer = new JTableRenderer();  
        ColumnModel.getColumn(0).setCellRenderer(renderer);
        DefaultTableCellRenderer rendererValor = new DefaultTableCellRenderer();
        rendererValor.setHorizontalAlignment(SwingConstants.RIGHT);
        contasReceberjTable.getColumnModel().getColumn(0).setPreferredWidth(10);
        contasReceberjTable.getColumnModel().getColumn(1).setPreferredWidth(80);
        contasReceberjTable.getColumnModel().getColumn(2).setPreferredWidth(190);
        contasReceberjTable.getColumnModel().getColumn(3).setCellRenderer(rendererValor);
        contasReceberjTable.getColumnModel().getColumn(3).setPreferredWidth(80);
        contasReceberjTable.getColumnModel().getColumn(4).setPreferredWidth(80);
        contasReceberjTable.getColumnModel().getColumn(5).setPreferredWidth(80);
        contasReceberjTable.getColumnModel().getColumn(6).setPreferredWidth(50);
        contasReceberjTable.repaint();
    }
    
    public void criarConsultaContasPagarInicial(){
        String data = Formatacao.ConvercaoDataPadrao(new Date());
        String mesString = data.substring(3, 5);
        String anoString = data.substring(6, 10);
        int mesInicio = Integer.parseInt(mesString);
        int anoInicio = Integer.parseInt(anoString);
        int mescInicio;
        int mescFinal;
        int anocInicio = 0;
        int anocFinal = 0;
        if (mesInicio==1){
            mescInicio=12;
            anocInicio=anoInicio - 1;
        }else {
            mescInicio = mesInicio - 1;
            anocInicio = anoInicio;
        }
        if (mesInicio==12){
            mescFinal=1;
            anocFinal=anoInicio+1;
        }else {
            mescFinal = mesInicio  + 1;
            anocFinal = anoInicio;
        }
        String dataInicial = anocInicio + "-" + Formatacao.retornaDataInicia(mescInicio);
        String dataFinal = anocFinal + "-" + Formatacao.retornaDataFinal(mescFinal);
        dataIniciojDateChooser.setDate(Formatacao.ConvercaoStringData(dataInicial));
        dataFinaljDateChooser.setDate(Formatacao.ConvercaoStringData(dataFinal));
        if (usuarioLogadoBean.getUsuario().getCliente()>0){
            sql = " Select v from Viewcontasreceber v where v.dataVencimento<='" + dataFinal + 
                "' and v.valorPago=0 and v.clienteIdcliente=" + usuarioLogadoBean.getUsuario().getCliente() + 
                    " order by v.dataVencimento, v.nomeCliente";
        }else {
            sql = " Select v from Viewcontasreceber v where v.dataVencimento<='" + dataFinal + 
                "' and v.valorPago=0 order by v.dataVencimento, v.nomeCliente";
        }
        carregarModel();
    }

    @Override
    public void setModel() {
        carregarModel();
    }

    @Override
    public void setCliente(Cliente cliente) {
        if (cliente!=null){
            this.cliente = cliente;
            unidadejTextField.setText(cliente.getNomeFantasia());
        }
    }
    
    public void inicializarCliente(){
        this.cliente = Formatacao.consultarCliente(usuarioLogadoBean);
        if (cliente!=null){
            unidadejTextField.setText(cliente.getNomeFantasia());
            selecionarjButton.setEnabled(false);
        }
    }
    
    @Override
    public void exportarExcel(String caminho, String nomeArquivo) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void pesquisar(String sql) {
        if (sql!=null){
            this.sql = sql;
            carregarModel();
        }else criarConsultaContasPagarInicial();
    }

}
