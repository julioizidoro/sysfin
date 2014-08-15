/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package tela.ContasPagar;

import com.toedter.calendar.JTextFieldDateEditor;
import controller.ContasPagarController;
import controller.MovimentoBancoController;
import java.awt.Image;
import java.awt.Toolkit;
import java.net.URL;
import java.util.Date;
import java.util.List;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import model.Contaspagar;
import model.Movimentobanco;
import tela.util.Formatacao;
import tela.util.UsuarioLogadoBean;

/**
 *
 * @author Wolverine
 */
public class FrmLibearConta extends javax.swing.JFrame {
    
    private String datePattern;
    private String maskPattern;
    private char placeHolder;
    private UsuarioLogadoBean usuarioLogadoBean;
    private List<Contaspagar> listaConta;
    private IContasPagar telaContas;
    private LiberarContasPagarTableModel modelLiberar;

    /**
     * Creates new form FrmLibearConta
     */
    public FrmLibearConta(UsuarioLogadoBean usuarioLogadoBean, IContasPagar telaContas, List<Contaspagar> listaConta) {
        datePattern = "dd/MM/yyyy";
        maskPattern = "##/##/####";
        placeHolder = '_';
        this.usuarioLogadoBean = usuarioLogadoBean;
        this.telaContas = telaContas;
        this.listaConta = listaConta;
        initComponents();
        URL url = this.getClass().getResource("/imagens/logoRelatorio/iconetela.png");
        Image imagemTitulo = Toolkit.getDefaultToolkit().getImage(url);
        this.setIconImage(imagemTitulo);
        this.setLocationRelativeTo(null);
        carregarModelContas();
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
        jPanel2 = new javax.swing.JPanel();
        dataLiberacaojDateChooser = new com.toedter.calendar.JDateChooser(null, null, datePattern, new JTextFieldDateEditor(datePattern,
            maskPattern, placeHolder));
    jPanel3 = new javax.swing.JPanel();
    valorTotaljTextField = new javax.swing.JTextField();
    jPanel5 = new javax.swing.JPanel();
    jButton3 = new javax.swing.JButton();
    jButton4 = new javax.swing.JButton();
    jScrollPane2 = new javax.swing.JScrollPane();
    liberarjTable = new javax.swing.JTable();

    setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

    jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

    jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Data da Liberação", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION));

    dataLiberacaojDateChooser.addFocusListener(new java.awt.event.FocusAdapter() {
        public void focusGained(java.awt.event.FocusEvent evt) {
            dataLiberacaojDateChooserFocusGained(evt);
        }
    });

    javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
    jPanel2.setLayout(jPanel2Layout);
    jPanel2Layout.setHorizontalGroup(
        jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
            .addContainerGap(63, Short.MAX_VALUE)
            .addComponent(dataLiberacaojDateChooser, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(58, 58, 58))
    );
    jPanel2Layout.setVerticalGroup(
        jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(jPanel2Layout.createSequentialGroup()
            .addContainerGap()
            .addComponent(dataLiberacaojDateChooser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
    );

    jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Valor Total a Liberar", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION));

    valorTotaljTextField.setEditable(false);
    valorTotaljTextField.setForeground(new java.awt.Color(204, 51, 0));
    valorTotaljTextField.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

    javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
    jPanel3.setLayout(jPanel3Layout);
    jPanel3Layout.setHorizontalGroup(
        jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
            .addContainerGap(38, Short.MAX_VALUE)
            .addComponent(valorTotaljTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(20, 20, 20))
    );
    jPanel3Layout.setVerticalGroup(
        jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
            .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(valorTotaljTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addContainerGap())
    );

    javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
    jPanel1.setLayout(jPanel1Layout);
    jPanel1Layout.setHorizontalGroup(
        jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
            .addContainerGap()
            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addContainerGap())
    );
    jPanel1Layout.setVerticalGroup(
        jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(jPanel1Layout.createSequentialGroup()
            .addContainerGap()
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
    );

    jPanel5.setBorder(javax.swing.BorderFactory.createEtchedBorder());

    jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/botoespequenos/confirmar.png"))); // NOI18N
    jButton3.setText("Confirmar");
    jButton3.setToolTipText("Confirmar");
    jButton3.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            jButton3ActionPerformed(evt);
        }
    });

    jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/botoespequenos/cancel.png"))); // NOI18N
    jButton4.setText("Cancelar");
    jButton4.setToolTipText("Cancelar");
    jButton4.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            jButton4ActionPerformed(evt);
        }
    });

    javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
    jPanel5.setLayout(jPanel5Layout);
    jPanel5Layout.setHorizontalGroup(
        jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(jPanel5Layout.createSequentialGroup()
            .addGap(30, 30, 30)
            .addComponent(jButton3)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 48, Short.MAX_VALUE)
            .addComponent(jButton4)
            .addGap(34, 34, 34))
    );
    jPanel5Layout.setVerticalGroup(
        jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(jPanel5Layout.createSequentialGroup()
            .addContainerGap()
            .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(jButton3)
                .addComponent(jButton4))
            .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
    );

    liberarjTable.setModel(new javax.swing.table.DefaultTableModel(
        new Object [][] {
            {null, null, null},
            {null, null, null},
            {null, null, null},
            {null, null, null}
        },
        new String [] {
            "Data Vencimento", "Descrição", "Valor"
        }
    ) {
        boolean[] canEdit = new boolean [] {
            false, false, false
        };

        public boolean isCellEditable(int rowIndex, int columnIndex) {
            return canEdit [columnIndex];
        }
    });
    liberarjTable.addMouseListener(new java.awt.event.MouseAdapter() {
        public void mouseClicked(java.awt.event.MouseEvent evt) {
            liberarjTableMouseClicked(evt);
        }
    });
    jScrollPane2.setViewportView(liberarjTable);
    if (liberarjTable.getColumnModel().getColumnCount() > 0) {
        liberarjTable.getColumnModel().getColumn(0).setResizable(false);
        liberarjTable.getColumnModel().getColumn(0).setPreferredWidth(80);
        liberarjTable.getColumnModel().getColumn(1).setResizable(false);
        liberarjTable.getColumnModel().getColumn(2).setResizable(false);
        liberarjTable.getColumnModel().getColumn(2).setPreferredWidth(80);
    }

    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
    getContentPane().setLayout(layout);
    layout.setHorizontalGroup(
        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(layout.createSequentialGroup()
            .addContainerGap()
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 516, Short.MAX_VALUE))
            .addContainerGap())
        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
            .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(112, 112, 112))
    );
    layout.setVerticalGroup(
        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
            .addContainerGap()
            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
    );

    pack();
    }// </editor-fold>//GEN-END:initComponents

    private void dataLiberacaojDateChooserFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_dataLiberacaojDateChooserFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_dataLiberacaojDateChooserFocusGained

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        for(int i=0;i <listaConta.size();i++){
            salvarConta(listaConta.get(i));
        }
        this.telaContas.setModel();
        this.dispose();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        this.dispose();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void liberarjTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_liberarjTableMouseClicked
    }//GEN-LAST:event_liberarjTableMouseClicked

    /**
     * @param args the command line arguments
     */
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.toedter.calendar.JDateChooser dataLiberacaojDateChooser;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable liberarjTable;
    private javax.swing.JTextField valorTotaljTextField;
    // End of variables declaration//GEN-END:variables

    public void carregarModelContas(){
        float valor=0.0f;
        for(int i=0;i<listaConta.size();i++){
            valor = valor + listaConta.get(i).getValor();
        }
        valorTotaljTextField.setText(Formatacao.foramtarFloatString(valor));
        modelLiberar = new LiberarContasPagarTableModel(listaConta);
        liberarjTable.setModel(modelLiberar);
        DefaultTableCellRenderer rendererValor = new DefaultTableCellRenderer();
        rendererValor.setHorizontalAlignment(SwingConstants.RIGHT);
        liberarjTable.getColumnModel().getColumn(0).setPreferredWidth(80);
        liberarjTable.getColumnModel().getColumn(1).setPreferredWidth(200);
        liberarjTable.getColumnModel().getColumn(2).setCellRenderer(rendererValor);
        liberarjTable.getColumnModel().getColumn(2).setPreferredWidth(80);
        liberarjTable.repaint();
    }
    
    
    
    public void salvarConta(Contaspagar conta){
        if (dataLiberacaojDateChooser.getDate()!=null){
            conta.setDataLiberacao(dataLiberacaojDateChooser.getDate());
            conta.setContaPaga("S");
            conta.setUsuarioBaixou(usuarioLogadoBean.getUsuario().getIdusuario());
            String data = Formatacao.ConvercaoDataPadrao(new Date()) + "_" + Formatacao.foramtarHoraString();
            conta.setDataHoraLiberou(data);
            Movimentobanco movimentoBanco = new Movimentobanco();
            movimentoBanco.setBanco(conta.getBanco().getIdbanco());
            movimentoBanco.setCliente(conta.getCliente().getIdcliente());
            movimentoBanco.setDataVencimento(conta.getDataVencimento());
            movimentoBanco.setDataRegistro(new Date());
            movimentoBanco.setPlanocontas(conta.getPlanocontas().getIdplanoContas());
            movimentoBanco.setUsuario(usuarioLogadoBean.getUsuario().getIdusuario());
            movimentoBanco.setValorEntrada(0.0f);
            movimentoBanco.setValorSaida(conta.getValor());
            movimentoBanco.setDataRegistro(new Date());
            movimentoBanco.setDataCompensacao(conta.getDataCompensacao());
            movimentoBanco.setTipoDocumento(conta.getTipoDocumento());
            movimentoBanco.setDescricao(conta.getDescricao());
            movimentoBanco.setCompentencia(conta.getCompetencia());
            MovimentoBancoController movimentoBancoController = new MovimentoBancoController();
            movimentoBanco = movimentoBancoController.salvar(movimentoBanco);
            conta.setMovimentoBanco(movimentoBanco.getIdmovimentoBanco());
            ContasPagarController contasPagarController = new ContasPagarController();
            contasPagarController.salvar(conta);
        }
    }
    
}
