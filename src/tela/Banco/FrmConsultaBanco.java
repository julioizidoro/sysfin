/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tela.Banco;

import controller.BancoController;
import controller.ClienteController;
import java.awt.Image;
import java.awt.Toolkit;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import model.Banco;
import model.Cliente;
import tela.Cliente.FrmConsultaCliente;
import tela.util.Formatacao;
import tela.util.UsuarioLogadoBean;

/**
 *
 * @author Wolverine
 */
public class FrmConsultaBanco extends javax.swing.JFrame implements IBanco{
    
    private List<Banco> listaBanco;
    private ConsultaContaTableModel modelBanco;
    private UsuarioLogadoBean usuarioLogadoBean;
    private Cliente cliente;
    
    /**
     * Creates new form FrmConsultaCliente
     */
    public FrmConsultaBanco(UsuarioLogadoBean usuarioLogadoBean) {
        this.usuarioLogadoBean = usuarioLogadoBean;
        initComponents();
        URL url = this.getClass().getResource("/imagens/logoRelatorio/iconetela.png");
        Image imagemTitulo = Toolkit.getDefaultToolkit().getImage(url);
        this.setIconImage(imagemTitulo);
        this.setLocationRelativeTo(null);
        inicializarCliente();
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
        nomejTextField = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        bancojTable = new javax.swing.JTable();
        BarradeTarefasjToolBar3 = new javax.swing.JToolBar();
        AdicionarjButton3 = new javax.swing.JButton();
        EditarjButton = new javax.swing.JButton();
        SeparadordeTarefasjSeparator = new javax.swing.JToolBar.Separator();
        FecharrjButton2 = new javax.swing.JButton();
        selecionarjButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Consulta de Banco");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel1.setText("Cliente");

        nomejTextField.setEditable(false);
        nomejTextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                nomejTextFieldKeyReleased(evt);
            }
        });

        bancojTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Nome", "Agencia", "Conta"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        bancojTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bancojTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(bancojTable);
        if (bancojTable.getColumnModel().getColumnCount() > 0) {
            bancojTable.getColumnModel().getColumn(0).setResizable(false);
            bancojTable.getColumnModel().getColumn(0).setPreferredWidth(300);
            bancojTable.getColumnModel().getColumn(1).setResizable(false);
            bancojTable.getColumnModel().getColumn(1).setPreferredWidth(30);
            bancojTable.getColumnModel().getColumn(2).setResizable(false);
            bancojTable.getColumnModel().getColumn(2).setPreferredWidth(100);
        }

        BarradeTarefasjToolBar3.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        BarradeTarefasjToolBar3.setFloatable(false);
        BarradeTarefasjToolBar3.setRollover(true);

        AdicionarjButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/botoes/adicionar.png"))); // NOI18N
        AdicionarjButton3.setText("Novo");
        AdicionarjButton3.setToolTipText("Adicionar Cliente");
        AdicionarjButton3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        AdicionarjButton3.setMaximumSize(new java.awt.Dimension(80, 90));
        AdicionarjButton3.setMinimumSize(new java.awt.Dimension(80, 90));
        AdicionarjButton3.setName(""); // NOI18N
        AdicionarjButton3.setPreferredSize(new java.awt.Dimension(80, 90));
        AdicionarjButton3.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        AdicionarjButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AdicionarjButton3ActionPerformed(evt);
            }
        });
        BarradeTarefasjToolBar3.add(AdicionarjButton3);

        EditarjButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/botoes/editar.png"))); // NOI18N
        EditarjButton.setText("Editar");
        EditarjButton.setToolTipText("Editar Cliente");
        EditarjButton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        EditarjButton.setMaximumSize(new java.awt.Dimension(80, 90));
        EditarjButton.setMinimumSize(new java.awt.Dimension(80, 90));
        EditarjButton.setPreferredSize(new java.awt.Dimension(80, 90));
        EditarjButton.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        EditarjButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EditarjButtonActionPerformed(evt);
            }
        });
        BarradeTarefasjToolBar3.add(EditarjButton);
        BarradeTarefasjToolBar3.add(SeparadordeTarefasjSeparator);

        FecharrjButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/botoes/fechar.png"))); // NOI18N
        FecharrjButton2.setText("Fechar");
        FecharrjButton2.setToolTipText("Fechar");
        FecharrjButton2.setFocusable(false);
        FecharrjButton2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        FecharrjButton2.setMaximumSize(new java.awt.Dimension(80, 90));
        FecharrjButton2.setMinimumSize(new java.awt.Dimension(80, 90));
        FecharrjButton2.setPreferredSize(new java.awt.Dimension(80, 90));
        FecharrjButton2.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        FecharrjButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FecharrjButton2ActionPerformed(evt);
            }
        });
        BarradeTarefasjToolBar3.add(FecharrjButton2);

        selecionarjButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/botoespequenos/enviar.png"))); // NOI18N
        selecionarjButton.setText("Selecionar");
        selecionarjButton.setToolTipText("Selecionar Cliente");
        selecionarjButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selecionarjButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 746, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(nomejTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 418, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(selecionarjButton, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(BarradeTarefasjToolBar3, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(282, 282, 282))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nomejTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(selecionarjButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 301, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(BarradeTarefasjToolBar3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 770, 490));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void nomejTextFieldKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nomejTextFieldKeyReleased
        
    }//GEN-LAST:event_nomejTextFieldKeyReleased

    private void FecharrjButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FecharrjButton2ActionPerformed
        this.dispose();
    }//GEN-LAST:event_FecharrjButton2ActionPerformed

    private void AdicionarjButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AdicionarjButton3ActionPerformed
        if (cliente==null){
            JOptionPane.showMessageDialog(rootPane, "Cliente não selecionado");
        }else new FrmCadastrarBanco(cliente, null, this);
    }//GEN-LAST:event_AdicionarjButton3ActionPerformed

    private void EditarjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EditarjButtonActionPerformed
        int linha = bancojTable.getSelectedRow();
        if (linha>=0){
            ClienteController clienteController = new ClienteController();
            cliente = clienteController.consultar(listaBanco.get(linha).getCliente());
            nomejTextField.setText(cliente.getNomeFantasia());
            new FrmCadastrarBanco(cliente, listaBanco.get(linha), this);
        }
    }//GEN-LAST:event_EditarjButtonActionPerformed

    private void bancojTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bancojTableMouseClicked
        
    }//GEN-LAST:event_bancojTableMouseClicked

    private void selecionarjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selecionarjButtonActionPerformed
        new FrmConsultaCliente(usuarioLogadoBean, this);
    }//GEN-LAST:event_selecionarjButtonActionPerformed

    /**
     * @param args the command line arguments
     */
   
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AdicionarjButton3;
    private javax.swing.JToolBar BarradeTarefasjToolBar3;
    private javax.swing.JButton EditarjButton;
    private javax.swing.JButton FecharrjButton2;
    private javax.swing.JToolBar.Separator SeparadordeTarefasjSeparator;
    private javax.swing.JTable bancojTable;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField nomejTextField;
    private javax.swing.JButton selecionarjButton;
    // End of variables declaration//GEN-END:variables

    public void carregarModelBanco(){
        BancoController bancoController = new BancoController();
        listaBanco = bancoController.listar(cliente.getIdcliente());
        if (listaBanco==null){
            listaBanco = new ArrayList<Banco>();
        }
        modelBanco = new ConsultaContaTableModel(listaBanco);
        bancojTable.setModel(modelBanco);
        bancojTable.getColumnModel().getColumn(0).setPreferredWidth(200);
        bancojTable.getColumnModel().getColumn(1).setPreferredWidth(50);
        bancojTable.getColumnModel().getColumn(2).setPreferredWidth(80);
        bancojTable.repaint();
    }

    @Override
    public void setModel() {
        if (cliente!=null){
            carregarModelBanco();
        }
    }

    @Override
    public void setCliente(Cliente cliente) {
        if (cliente!=null){
            this.cliente = cliente;
            carregarModelBanco();
            nomejTextField.setText(cliente.getNomeFantasia());
        }
    }
    
    public void inicializarCliente(){
        this.cliente = Formatacao.consultarCliente(usuarioLogadoBean);
        if (cliente!=null){
            nomejTextField.setText(cliente.getNomeFantasia());
            selecionarjButton.setEnabled(false);
        }
    }

   
}
