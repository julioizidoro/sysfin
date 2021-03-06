/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tela.Cliente;

import controller.ClienteController;
import java.awt.Image;
import java.awt.Toolkit;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import model.Cliente;
import tela.Banco.IBanco;
import tela.ContasPagar.IContasPagar;
import tela.ContasReceber.IContasReceber;
import tela.OutrosLancamentos.ItelaMovimentoBanco;
import tela.Produtos.IProduto;
import tela.Usuario.IUsuario;
import tela.Vendas.IVendas;
import tela.util.UsuarioLogadoBean;

/**
 *
 * @author Wolverine
 */
public class FrmConsultaCliente extends javax.swing.JFrame implements ICliente{
    
    private List<Cliente> listaCliente;
    private ConsultaClienteTableModel modelCliente;
    private UsuarioLogadoBean usuarioLogadoBean;
    private IContasPagar telaContasPagar;
    private IContasReceber telaContasReceber;
    private IVendas telaVendas;
    private ItelaMovimentoBanco telaMovimento;
    private IBanco telaBanco;
    private IProduto telaProduto;
    private IUsuario telaUsuario;
    
    /**
     * Creates new form FrmConsultaCliente
     */
    public FrmConsultaCliente(UsuarioLogadoBean usuarioLogadoBean) {
        this.usuarioLogadoBean = usuarioLogadoBean;
        initComponents();
        URL url = this.getClass().getResource("/imagens/logoRelatorio/iconetela.png");
        Image imagemTitulo = Toolkit.getDefaultToolkit().getImage(url);
        this.setIconImage(imagemTitulo);
        this.setLocationRelativeTo(null);
        carregarModelCliente(nomejTextField.getText());
        this.setVisible(true);
    }
    
    public FrmConsultaCliente(UsuarioLogadoBean usuarioLogadoBean, IContasPagar telaContasPagar) {
        this.usuarioLogadoBean = usuarioLogadoBean;
        this.telaContasPagar = telaContasPagar;
        initComponents();
        this.setLocationRelativeTo(null);
        carregarModelCliente(nomejTextField.getText());
        this.setVisible(true);
    }
    
    public FrmConsultaCliente(UsuarioLogadoBean usuarioLogadoBean, IContasReceber telaContasReceber) {
        this.usuarioLogadoBean = usuarioLogadoBean;
        this.telaContasReceber = telaContasReceber;
        initComponents();
        this.setLocationRelativeTo(null);
        carregarModelCliente(nomejTextField.getText());
        this.setVisible(true);
    }
    
    public FrmConsultaCliente(UsuarioLogadoBean usuarioLogadoBean, IVendas telaVendas) {
        this.usuarioLogadoBean = usuarioLogadoBean;
        this.telaVendas = telaVendas;
        initComponents();
        this.setLocationRelativeTo(null);
        carregarModelCliente(nomejTextField.getText());
        this.setVisible(true);
    }

    public FrmConsultaCliente(UsuarioLogadoBean usuarioLogadoBean, IBanco telaBanco) {
        this.usuarioLogadoBean = usuarioLogadoBean;
        this.telaBanco = telaBanco;
        initComponents();
        this.setLocationRelativeTo(null);
        carregarModelCliente(nomejTextField.getText());
        this.setVisible(true);
    }
    
    public FrmConsultaCliente(UsuarioLogadoBean usuarioLogadoBean, IProduto telaProduto) {
        this.usuarioLogadoBean = usuarioLogadoBean;
        this.telaProduto = telaProduto;
        initComponents();
        this.setLocationRelativeTo(null);
        carregarModelCliente(nomejTextField.getText());
        this.setVisible(true);
    }
    
    public FrmConsultaCliente(UsuarioLogadoBean usuarioLogadoBean, ItelaMovimentoBanco telaMovimento) {
        this.usuarioLogadoBean = usuarioLogadoBean;
        this.telaMovimento = telaMovimento;
        initComponents();
        this.setLocationRelativeTo(null);
        carregarModelCliente(nomejTextField.getText());
        this.setVisible(true);
    }
    
    public FrmConsultaCliente(UsuarioLogadoBean usuarioLogadoBean, IUsuario telaUsuario) {
        this.usuarioLogadoBean = usuarioLogadoBean;
        this.telaUsuario = telaUsuario;
        initComponents();
        this.setLocationRelativeTo(null);
        carregarModelCliente(nomejTextField.getText());
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
        clientejTable = new javax.swing.JTable();
        BarradeTarefasjToolBar3 = new javax.swing.JToolBar();
        AdicionarjButton3 = new javax.swing.JButton();
        EditarjButton = new javax.swing.JButton();
        SeparadordeTarefasjSeparator = new javax.swing.JToolBar.Separator();
        MunicipaisjButton = new javax.swing.JButton();
        FecharrjButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Consulta de Cliente");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel1.setText("Pesquisar Nome do Cliente");

        nomejTextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                nomejTextFieldKeyReleased(evt);
            }
        });

        clientejTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Nome", "Fone Fixol", "E-mail"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        clientejTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                clientejTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(clientejTable);
        if (clientejTable.getColumnModel().getColumnCount() > 0) {
            clientejTable.getColumnModel().getColumn(0).setResizable(false);
            clientejTable.getColumnModel().getColumn(0).setPreferredWidth(300);
            clientejTable.getColumnModel().getColumn(1).setResizable(false);
            clientejTable.getColumnModel().getColumn(1).setPreferredWidth(30);
            clientejTable.getColumnModel().getColumn(2).setResizable(false);
            clientejTable.getColumnModel().getColumn(2).setPreferredWidth(100);
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
        BarradeTarefasjToolBar3.add(EditarjButton);
        BarradeTarefasjToolBar3.add(SeparadordeTarefasjSeparator);

        MunicipaisjButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/botoes/editar.png"))); // NOI18N
        MunicipaisjButton.setText("Municipais");
        MunicipaisjButton.setToolTipText("Dados Municipais");
        MunicipaisjButton.setEnabled(false);
        MunicipaisjButton.setFocusable(false);
        MunicipaisjButton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        MunicipaisjButton.setMaximumSize(new java.awt.Dimension(80, 90));
        MunicipaisjButton.setMinimumSize(new java.awt.Dimension(80, 90));
        MunicipaisjButton.setPreferredSize(new java.awt.Dimension(80, 90));
        MunicipaisjButton.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        MunicipaisjButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MunicipaisjButtonActionPerformed(evt);
            }
        });
        BarradeTarefasjToolBar3.add(MunicipaisjButton);

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
                            .addComponent(nomejTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 418, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(BarradeTarefasjToolBar3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(212, 212, 212))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(nomejTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 306, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(BarradeTarefasjToolBar3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 770, 490));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void nomejTextFieldKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nomejTextFieldKeyReleased
        carregarModelCliente(nomejTextField.getText());
    }//GEN-LAST:event_nomejTextFieldKeyReleased

    private void FecharrjButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FecharrjButton2ActionPerformed
        this.dispose();
    }//GEN-LAST:event_FecharrjButton2ActionPerformed

    private void AdicionarjButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AdicionarjButton3ActionPerformed
        new FrmCadastrarCliente(null, this);
    }//GEN-LAST:event_AdicionarjButton3ActionPerformed

    private void EditarjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EditarjButtonActionPerformed
        int linha = clientejTable.getSelectedRow();
        if (linha>=0){
            new FrmCadastrarCliente(listaCliente.get(linha), this);
        }
    }//GEN-LAST:event_EditarjButtonActionPerformed

    private void clientejTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_clientejTableMouseClicked
        if (evt.getClickCount()==1){
            EditarjButton.setEnabled(true);
            MunicipaisjButton.setEnabled(true);
        }else if (evt.getClickCount()>=2){
            int linha = clientejTable.getSelectedRow();
            if (linha>=0){
                if (telaContasPagar!=null){
                    telaContasPagar.setCliente(listaCliente.get(linha));
                }else if (telaContasReceber!=null) {
                    telaContasReceber.setCliente(listaCliente.get(linha));
                }else if (telaVendas!=null){
                    telaVendas.setCliente(listaCliente.get(linha));
                }else if (telaBanco!=null){
                    this.telaBanco.setCliente(listaCliente.get(linha));
                }else if (telaProduto!=null){
                    this.telaProduto.setCliente(listaCliente.get(linha));
                }else if (telaMovimento!=null){
                    this.telaMovimento.setCliente(listaCliente.get(linha));
                }else if (telaUsuario!=null){
                    this.telaUsuario.setCliente(listaCliente.get(linha));
                }
                this.dispose();
            }else JOptionPane.showMessageDialog(rootPane, "Selecione um Cliente");
        }
    }//GEN-LAST:event_clientejTableMouseClicked

    private void MunicipaisjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MunicipaisjButtonActionPerformed
        int linha = clientejTable.getSelectedRow();
        if (linha>=0){
            new FrmDadosMunicipais(listaCliente.get(linha));
        }
    }//GEN-LAST:event_MunicipaisjButtonActionPerformed

    /**
     * @param args the command line arguments
     */
   
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AdicionarjButton3;
    private javax.swing.JToolBar BarradeTarefasjToolBar3;
    private javax.swing.JButton EditarjButton;
    private javax.swing.JButton FecharrjButton2;
    private javax.swing.JButton MunicipaisjButton;
    private javax.swing.JToolBar.Separator SeparadordeTarefasjSeparator;
    private javax.swing.JTable clientejTable;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField nomejTextField;
    // End of variables declaration//GEN-END:variables

    public void carregarModelCliente(String nome){
        ClienteController clienteController = new ClienteController(); 
        listaCliente = clienteController.listar(nomejTextField.getText());
        if (listaCliente==null){
            listaCliente = new ArrayList<Cliente>();
        }
        modelCliente = new ConsultaClienteTableModel(listaCliente);
        clientejTable.setModel(modelCliente);
        clientejTable.getColumnModel().getColumn(0).setPreferredWidth(200);
        clientejTable.getColumnModel().getColumn(1).setPreferredWidth(50);
        clientejTable.getColumnModel().getColumn(2).setPreferredWidth(100);
        clientejTable.repaint();
    }

    @Override
    public void setModel() {
        carregarModelCliente(nomejTextField.getText());
    }

   
}
