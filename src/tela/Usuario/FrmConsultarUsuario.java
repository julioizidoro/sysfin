/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tela.Usuario;

import controller.UsuarioController;
import java.awt.Image;
import java.awt.Toolkit;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import model.Cliente;
import model.Usuario;
import tela.util.Formatacao;
import tela.util.UsuarioLogadoBean;

/**
 *
 * @author Wolverine
 */
public class FrmConsultarUsuario extends javax.swing.JFrame implements IUsuario{
    
    private List<Usuario> listaUsuario;
    private ConsultaUsuarioTableModel modelUsuario;
    private boolean habilitar = false;
    private UsuarioLogadoBean usuarioLogadoBean;
    

    /**
     * Creates new form FrmConsultarUsuario
     */
    public FrmConsultarUsuario(UsuarioLogadoBean usuarioLogadoBean) {
        this.usuarioLogadoBean = usuarioLogadoBean;
        initComponents();
        URL url = this.getClass().getResource("/imagens/logoRelatorio/iconetela.png");
        Image imagemTitulo = Toolkit.getDefaultToolkit().getImage(url);
        this.setIconImage(imagemTitulo);
        carregarModelUsuario();
        this.setLocationRelativeTo(null);
        senhajPasswordField.setVisible(false);
        habilitar = true;
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
        usuariojTable = new javax.swing.JTable();
        BarradeTarefasjToolBar = new javax.swing.JToolBar();
        AdicionarjButton = new javax.swing.JButton();
        EditarjButton = new javax.swing.JButton();
        SeparadordeTarefasjSeparator = new javax.swing.JToolBar.Separator();
        resetjButton = new javax.swing.JButton();
        FecharrjButton1 = new javax.swing.JButton();
        senhajPasswordField = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("SysTM - Consulta de Usuários");

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel1.setText("Pesquisar Nome do Usuário");

        nomejTextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                nomejTextFieldKeyReleased(evt);
            }
        });

        usuariojTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Nome", "Login", "Unidade Negocio", "Situação"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        usuariojTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                usuariojTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(usuariojTable);
        if (usuariojTable.getColumnModel().getColumnCount() > 0) {
            usuariojTable.getColumnModel().getColumn(0).setResizable(false);
            usuariojTable.getColumnModel().getColumn(0).setPreferredWidth(150);
            usuariojTable.getColumnModel().getColumn(1).setResizable(false);
            usuariojTable.getColumnModel().getColumn(1).setPreferredWidth(100);
            usuariojTable.getColumnModel().getColumn(2).setResizable(false);
            usuariojTable.getColumnModel().getColumn(2).setPreferredWidth(250);
            usuariojTable.getColumnModel().getColumn(3).setResizable(false);
            usuariojTable.getColumnModel().getColumn(3).setPreferredWidth(150);
        }

        BarradeTarefasjToolBar.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        BarradeTarefasjToolBar.setFloatable(false);
        BarradeTarefasjToolBar.setRollover(true);

        AdicionarjButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/botoes/adicionar.png"))); // NOI18N
        AdicionarjButton.setText("Novo");
        AdicionarjButton.setToolTipText("Adicionar Usuário");
        AdicionarjButton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        AdicionarjButton.setMaximumSize(new java.awt.Dimension(80, 90));
        AdicionarjButton.setMinimumSize(new java.awt.Dimension(80, 90));
        AdicionarjButton.setName(""); // NOI18N
        AdicionarjButton.setPreferredSize(new java.awt.Dimension(80, 90));
        AdicionarjButton.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        AdicionarjButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AdicionarjButtonActionPerformed(evt);
            }
        });
        BarradeTarefasjToolBar.add(AdicionarjButton);

        EditarjButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/botoes/editar.png"))); // NOI18N
        EditarjButton.setText("Editar");
        EditarjButton.setToolTipText("Editar Usuário");
        EditarjButton.setEnabled(false);
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
        BarradeTarefasjToolBar.add(EditarjButton);
        BarradeTarefasjToolBar.add(SeparadordeTarefasjSeparator);

        resetjButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/botoes/fechar.png"))); // NOI18N
        resetjButton.setText("Resetar");
        resetjButton.setToolTipText("Resetar Senha do Usuário");
        resetjButton.setFocusable(false);
        resetjButton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        resetjButton.setMaximumSize(new java.awt.Dimension(80, 90));
        resetjButton.setMinimumSize(new java.awt.Dimension(80, 90));
        resetjButton.setPreferredSize(new java.awt.Dimension(80, 90));
        resetjButton.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        resetjButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetjButtonActionPerformed(evt);
            }
        });
        BarradeTarefasjToolBar.add(resetjButton);

        FecharrjButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/botoes/fechar.png"))); // NOI18N
        FecharrjButton1.setText("Fechar");
        FecharrjButton1.setToolTipText("Fechar");
        FecharrjButton1.setFocusable(false);
        FecharrjButton1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        FecharrjButton1.setMaximumSize(new java.awt.Dimension(80, 90));
        FecharrjButton1.setMinimumSize(new java.awt.Dimension(80, 90));
        FecharrjButton1.setPreferredSize(new java.awt.Dimension(80, 90));
        FecharrjButton1.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        FecharrjButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FecharrjButton1ActionPerformed(evt);
            }
        });
        BarradeTarefasjToolBar.add(FecharrjButton1);

        senhajPasswordField.setText("senha");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 625, Short.MAX_VALUE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addComponent(nomejTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 434, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(senhajPasswordField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(BarradeTarefasjToolBar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(171, 171, 171))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(nomejTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(BarradeTarefasjToolBar, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(senhajPasswordField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void nomejTextFieldKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nomejTextFieldKeyReleased
        carregarModelUsuario();
    }//GEN-LAST:event_nomejTextFieldKeyReleased

    private void FecharrjButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FecharrjButton1ActionPerformed
        this.dispose();
    }//GEN-LAST:event_FecharrjButton1ActionPerformed

    private void AdicionarjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AdicionarjButtonActionPerformed
        new FrmCadastrarUsuario(null, this, usuarioLogadoBean);
    }//GEN-LAST:event_AdicionarjButtonActionPerformed

    private void usuariojTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_usuariojTableMouseClicked
        
        int linha = usuariojTable.getSelectedRow();
        if (linha >= 0) {
            if (evt.getClickCount() == 1) {
                if (habilitar) {
                    EditarjButton.setEnabled(true);
                    resetjButton.setEnabled(true);
                }
            }
        }
    }//GEN-LAST:event_usuariojTableMouseClicked

    private void EditarjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EditarjButtonActionPerformed
        int linha = usuariojTable.getSelectedRow();
        if(linha>=0){
            new FrmCadastrarUsuario(listaUsuario.get(linha), this, usuarioLogadoBean);
        }
    }//GEN-LAST:event_EditarjButtonActionPerformed

    private void resetjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetjButtonActionPerformed
        int linha = usuariojTable.getSelectedRow();
        if(linha>=0){
            UsuarioController usuarioController = new UsuarioController();
            Usuario usuario = listaUsuario.get(linha);
            usuario.setSenha(Formatacao.criptografarSenha(senhajPasswordField.getPassword()));
            usuarioController.salvar(usuario);
            carregarModelUsuario();
            JOptionPane.showMessageDialog(rootPane, "Senha resetada nova senha = senha");
        }
    }//GEN-LAST:event_resetjButtonActionPerformed

    /**
     * @param args the command line arguments
     */
  
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AdicionarjButton;
    private javax.swing.JToolBar BarradeTarefasjToolBar;
    private javax.swing.JButton EditarjButton;
    private javax.swing.JButton FecharrjButton1;
    private javax.swing.JToolBar.Separator SeparadordeTarefasjSeparator;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField nomejTextField;
    private javax.swing.JButton resetjButton;
    private javax.swing.JPasswordField senhajPasswordField;
    private javax.swing.JTable usuariojTable;
    // End of variables declaration//GEN-END:variables

    public void carregarModelUsuario(){
        UsuarioController usuarioController = new UsuarioController();
        listaUsuario = usuarioController.listar(nomejTextField.getText());
                if(listaUsuario==null){
            listaUsuario = new ArrayList<Usuario>();
        }
        modelUsuario = new ConsultaUsuarioTableModel(listaUsuario);
        usuariojTable.setModel(modelUsuario);
        usuariojTable.getColumnModel().getColumn(0).setPreferredWidth(150);
        usuariojTable.getColumnModel().getColumn(1).setPreferredWidth(100);
        usuariojTable.getColumnModel().getColumn(2).setPreferredWidth(250);
        usuariojTable.getColumnModel().getColumn(3).setPreferredWidth(150);
        usuariojTable.repaint();
    }

    @Override
    public void carregarModel() {
        carregarModelUsuario();
    }

    @Override
    public void setCliente(Cliente cliente) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }


}
