/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package tela;

import controller.ClienteController;
import java.awt.Image;
import java.awt.Toolkit;
import java.net.URL;
import javax.swing.JOptionPane;
import model.Cliente;
import singleton.ConectionFactory;
import tela.Banco.FrmConsultaBanco;
import tela.Cliente.FrmConsultaCliente;
import tela.ContasPagar.FrmConsultarContasPagar;
import tela.ContasPagar.Relatorio.FrmRelatoriosContasVencer;
import tela.ContasPagar.Relatorio.FrmRelatoriosFluxoCaixa;
import tela.ContasPagar.Relatorio.FrmRelatoriosPagamentos01;
import tela.ContasReceber.FrmConsultarContasReceber;
import tela.ContasReceber.FrmRelatorioReceber;
import tela.OutrosLancamentos.FrmConsultaOutrosLancamentos;
import tela.OutrosLancamentos.Relatorio.FrmRelatoriosConciliacao01;
import tela.PlanoContas.FrmConsultaPlanoContas;
import tela.Produtos.FrmConsultaProduto;
import tela.Usuario.FrmConfiguracaoUsuario;
import tela.Usuario.FrmConsultarUsuario;
import tela.Vendas.FrmConsultarVendas;
import tela.Vendas.Relatorio.FrmRelatoriosVendas;
import tela.util.UsuarioLogadoBean;

/**
 *
 * @author Wolverine
 */
public class FrmPrincipal extends javax.swing.JFrame {
    
    private UsuarioLogadoBean usuarioLogadoBean;

    /**
     * Creates new form FrmPrincipal
     */
    public FrmPrincipal(UsuarioLogadoBean usuarioLogadoBean) {
        initComponents();
        URL url = this.getClass().getResource("/imagens/logoRelatorio/iconetela.png");
        Image imagemTitulo = Toolkit.getDefaultToolkit().getImage(url);
        this.setIconImage(imagemTitulo);
        this.usuarioLogadoBean = usuarioLogadoBean;
        usuariojLabel.setText("Usuário : " + this.usuarioLogadoBean.getUsuario().getNome());
        verificarCliente();
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

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel4 = new javax.swing.JPanel();
        adicionarPlanoContasjButton = new javax.swing.JButton();
        registrarTransferenciajButton = new javax.swing.JButton();
        imprimirjButton = new javax.swing.JButton();
        registrarTransferenciajButton2 = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        adicionarPlanoContasjButton2 = new javax.swing.JButton();
        consultaBancojButton = new javax.swing.JButton();
        excluirPlanoContasjButton2 = new javax.swing.JButton();
        imprimirjButton2 = new javax.swing.JButton();
        imprimirjButton3 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        adicionarPlanoContasjButton3 = new javax.swing.JButton();
        consultaBancojButton1 = new javax.swing.JButton();
        excluirPlanoContasjButton3 = new javax.swing.JButton();
        excluirPlanoContasjButton4 = new javax.swing.JButton();
        excluirPlanoContasjButton5 = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        adicionarPlanoContasjButton4 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        usuariojLabel = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        jTabbedPane1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jTabbedPane1.setForeground(new java.awt.Color(35, 135, 112));
        jTabbedPane1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTabbedPane1MouseClicked(evt);
            }
        });

        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        adicionarPlanoContasjButton.setForeground(new java.awt.Color(35, 135, 112));
        adicionarPlanoContasjButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/menus/finpagar.png"))); // NOI18N
        adicionarPlanoContasjButton.setText("Contas a Pagar");
        adicionarPlanoContasjButton.setToolTipText("Contas a Pagar");
        adicionarPlanoContasjButton.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        adicionarPlanoContasjButton.setMaximumSize(new java.awt.Dimension(80, 90));
        adicionarPlanoContasjButton.setMinimumSize(new java.awt.Dimension(80, 90));
        adicionarPlanoContasjButton.setName(""); // NOI18N
        adicionarPlanoContasjButton.setPreferredSize(new java.awt.Dimension(80, 90));
        adicionarPlanoContasjButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adicionarPlanoContasjButtonActionPerformed(evt);
            }
        });
        jPanel4.add(adicionarPlanoContasjButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 240, 60));

        registrarTransferenciajButton.setForeground(new java.awt.Color(35, 135, 112));
        registrarTransferenciajButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/menus/finreceber.png"))); // NOI18N
        registrarTransferenciajButton.setText("Contas a Receber");
        registrarTransferenciajButton.setToolTipText("Contas a Receber");
        registrarTransferenciajButton.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        registrarTransferenciajButton.setMaximumSize(new java.awt.Dimension(80, 90));
        registrarTransferenciajButton.setMinimumSize(new java.awt.Dimension(80, 90));
        registrarTransferenciajButton.setPreferredSize(new java.awt.Dimension(80, 90));
        registrarTransferenciajButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registrarTransferenciajButtonActionPerformed(evt);
            }
        });
        jPanel4.add(registrarTransferenciajButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 75, 240, 60));

        imprimirjButton.setForeground(new java.awt.Color(35, 135, 112));
        imprimirjButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/menus/finbanco.png"))); // NOI18N
        imprimirjButton.setText("Outros Lançamentos");
        imprimirjButton.setToolTipText("Movimento Bancário");
        imprimirjButton.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        imprimirjButton.setMaximumSize(new java.awt.Dimension(80, 90));
        imprimirjButton.setMinimumSize(new java.awt.Dimension(80, 90));
        imprimirjButton.setPreferredSize(new java.awt.Dimension(80, 90));
        imprimirjButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                imprimirjButtonActionPerformed(evt);
            }
        });
        jPanel4.add(imprimirjButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, 240, 60));

        registrarTransferenciajButton2.setForeground(new java.awt.Color(35, 135, 112));
        registrarTransferenciajButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/menus/cashier.png"))); // NOI18N
        registrarTransferenciajButton2.setText("   Vendas");
        registrarTransferenciajButton2.setToolTipText("Laçamento de Vendas");
        registrarTransferenciajButton2.setFocusable(false);
        registrarTransferenciajButton2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        registrarTransferenciajButton2.setMaximumSize(new java.awt.Dimension(80, 90));
        registrarTransferenciajButton2.setMinimumSize(new java.awt.Dimension(80, 90));
        registrarTransferenciajButton2.setPreferredSize(new java.awt.Dimension(80, 90));
        registrarTransferenciajButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registrarTransferenciajButton2ActionPerformed(evt);
            }
        });
        jPanel4.add(registrarTransferenciajButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 205, 240, 60));

        jTabbedPane1.addTab("Movimento", jPanel4);

        jPanel5.setLayout(null);

        adicionarPlanoContasjButton2.setForeground(new java.awt.Color(35, 135, 112));
        adicionarPlanoContasjButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/menus/cadvendedores.png"))); // NOI18N
        adicionarPlanoContasjButton2.setText("Cliente");
        adicionarPlanoContasjButton2.setToolTipText("Cadastro de Clientes");
        adicionarPlanoContasjButton2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        adicionarPlanoContasjButton2.setMaximumSize(new java.awt.Dimension(80, 90));
        adicionarPlanoContasjButton2.setMinimumSize(new java.awt.Dimension(80, 90));
        adicionarPlanoContasjButton2.setName(""); // NOI18N
        adicionarPlanoContasjButton2.setPreferredSize(new java.awt.Dimension(80, 90));
        adicionarPlanoContasjButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adicionarPlanoContasjButton2ActionPerformed(evt);
            }
        });
        jPanel5.add(adicionarPlanoContasjButton2);
        adicionarPlanoContasjButton2.setBounds(20, 10, 240, 60);

        consultaBancojButton.setForeground(new java.awt.Color(35, 135, 112));
        consultaBancojButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/menus/finbanco.png"))); // NOI18N
        consultaBancojButton.setText("Banco");
        consultaBancojButton.setToolTipText("Cadastro de Bancos");
        consultaBancojButton.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        consultaBancojButton.setMaximumSize(new java.awt.Dimension(80, 90));
        consultaBancojButton.setMinimumSize(new java.awt.Dimension(80, 90));
        consultaBancojButton.setPreferredSize(new java.awt.Dimension(80, 90));
        consultaBancojButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                consultaBancojButtonActionPerformed(evt);
            }
        });
        jPanel5.add(consultaBancojButton);
        consultaBancojButton.setBounds(20, 75, 240, 60);

        excluirPlanoContasjButton2.setForeground(new java.awt.Color(35, 135, 112));
        excluirPlanoContasjButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/menus/cadplanocontas.png"))); // NOI18N
        excluirPlanoContasjButton2.setText("Plano de Contas");
        excluirPlanoContasjButton2.setToolTipText("Cadastro de Contas");
        excluirPlanoContasjButton2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        excluirPlanoContasjButton2.setMaximumSize(new java.awt.Dimension(80, 90));
        excluirPlanoContasjButton2.setMinimumSize(new java.awt.Dimension(80, 90));
        excluirPlanoContasjButton2.setPreferredSize(new java.awt.Dimension(80, 90));
        excluirPlanoContasjButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                excluirPlanoContasjButton2ActionPerformed(evt);
            }
        });
        jPanel5.add(excluirPlanoContasjButton2);
        excluirPlanoContasjButton2.setBounds(20, 140, 240, 60);

        imprimirjButton2.setForeground(new java.awt.Color(35, 135, 112));
        imprimirjButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/menus/cadprodutos.png"))); // NOI18N
        imprimirjButton2.setText("Produto");
        imprimirjButton2.setToolTipText("Cadastro de Produto");
        imprimirjButton2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        imprimirjButton2.setMaximumSize(new java.awt.Dimension(80, 90));
        imprimirjButton2.setMinimumSize(new java.awt.Dimension(80, 90));
        imprimirjButton2.setPreferredSize(new java.awt.Dimension(80, 90));
        imprimirjButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                imprimirjButton2ActionPerformed(evt);
            }
        });
        jPanel5.add(imprimirjButton2);
        imprimirjButton2.setBounds(20, 270, 240, 60);

        imprimirjButton3.setForeground(new java.awt.Color(35, 135, 112));
        imprimirjButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/menus/cadclientes.png"))); // NOI18N
        imprimirjButton3.setText("Usuários");
        imprimirjButton3.setToolTipText("Cadastro de Usuários");
        imprimirjButton3.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        imprimirjButton3.setMaximumSize(new java.awt.Dimension(80, 90));
        imprimirjButton3.setMinimumSize(new java.awt.Dimension(80, 90));
        imprimirjButton3.setPreferredSize(new java.awt.Dimension(80, 90));
        imprimirjButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                imprimirjButton3ActionPerformed(evt);
            }
        });
        jPanel5.add(imprimirjButton3);
        imprimirjButton3.setBounds(20, 205, 240, 60);

        jTabbedPane1.addTab("Cadastro", jPanel5);

        jPanel3.setLayout(null);

        adicionarPlanoContasjButton3.setForeground(new java.awt.Color(35, 135, 112));
        adicionarPlanoContasjButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/menus/cadvendedores.png"))); // NOI18N
        adicionarPlanoContasjButton3.setText("Relatório de Vendas");
        adicionarPlanoContasjButton3.setToolTipText("Cadastro de Clientes");
        adicionarPlanoContasjButton3.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        adicionarPlanoContasjButton3.setMaximumSize(new java.awt.Dimension(80, 90));
        adicionarPlanoContasjButton3.setMinimumSize(new java.awt.Dimension(80, 90));
        adicionarPlanoContasjButton3.setName(""); // NOI18N
        adicionarPlanoContasjButton3.setPreferredSize(new java.awt.Dimension(80, 90));
        adicionarPlanoContasjButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adicionarPlanoContasjButton3ActionPerformed(evt);
            }
        });
        jPanel3.add(adicionarPlanoContasjButton3);
        adicionarPlanoContasjButton3.setBounds(20, 10, 240, 60);

        consultaBancojButton1.setForeground(new java.awt.Color(35, 135, 112));
        consultaBancojButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/menus/finbanco.png"))); // NOI18N
        consultaBancojButton1.setText("Relatório Pagamentos");
        consultaBancojButton1.setToolTipText("Cadastro de Bancos");
        consultaBancojButton1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        consultaBancojButton1.setMaximumSize(new java.awt.Dimension(80, 90));
        consultaBancojButton1.setMinimumSize(new java.awt.Dimension(80, 90));
        consultaBancojButton1.setPreferredSize(new java.awt.Dimension(80, 90));
        consultaBancojButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                consultaBancojButton1ActionPerformed(evt);
            }
        });
        jPanel3.add(consultaBancojButton1);
        consultaBancojButton1.setBounds(20, 75, 240, 60);

        excluirPlanoContasjButton3.setForeground(new java.awt.Color(35, 135, 112));
        excluirPlanoContasjButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/menus/cadplanocontas.png"))); // NOI18N
        excluirPlanoContasjButton3.setText("Contas a Pagar");
        excluirPlanoContasjButton3.setToolTipText("Relatório de Contas a Pagar");
        excluirPlanoContasjButton3.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        excluirPlanoContasjButton3.setMaximumSize(new java.awt.Dimension(80, 90));
        excluirPlanoContasjButton3.setMinimumSize(new java.awt.Dimension(80, 90));
        excluirPlanoContasjButton3.setPreferredSize(new java.awt.Dimension(80, 90));
        excluirPlanoContasjButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                excluirPlanoContasjButton3ActionPerformed(evt);
            }
        });
        jPanel3.add(excluirPlanoContasjButton3);
        excluirPlanoContasjButton3.setBounds(20, 260, 240, 60);

        excluirPlanoContasjButton4.setForeground(new java.awt.Color(35, 135, 112));
        excluirPlanoContasjButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/menus/cadplanocontas.png"))); // NOI18N
        excluirPlanoContasjButton4.setText("Conciliação Bancária");
        excluirPlanoContasjButton4.setToolTipText("Cadastro de Contas");
        excluirPlanoContasjButton4.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        excluirPlanoContasjButton4.setMaximumSize(new java.awt.Dimension(80, 90));
        excluirPlanoContasjButton4.setMinimumSize(new java.awt.Dimension(80, 90));
        excluirPlanoContasjButton4.setPreferredSize(new java.awt.Dimension(80, 90));
        excluirPlanoContasjButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                excluirPlanoContasjButton4ActionPerformed(evt);
            }
        });
        jPanel3.add(excluirPlanoContasjButton4);
        excluirPlanoContasjButton4.setBounds(20, 140, 240, 60);

        excluirPlanoContasjButton5.setForeground(new java.awt.Color(35, 135, 112));
        excluirPlanoContasjButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/menus/cadplanocontas.png"))); // NOI18N
        excluirPlanoContasjButton5.setText("Contas Receber");
        excluirPlanoContasjButton5.setToolTipText("Cadastro de Contas");
        excluirPlanoContasjButton5.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        excluirPlanoContasjButton5.setMaximumSize(new java.awt.Dimension(80, 90));
        excluirPlanoContasjButton5.setMinimumSize(new java.awt.Dimension(80, 90));
        excluirPlanoContasjButton5.setPreferredSize(new java.awt.Dimension(80, 90));
        excluirPlanoContasjButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                excluirPlanoContasjButton5ActionPerformed(evt);
            }
        });
        jPanel3.add(excluirPlanoContasjButton5);
        excluirPlanoContasjButton5.setBounds(20, 200, 240, 60);

        jTabbedPane1.addTab("Relatórios", jPanel3);

        adicionarPlanoContasjButton4.setForeground(new java.awt.Color(35, 135, 112));
        adicionarPlanoContasjButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/menus/cadvendedores.png"))); // NOI18N
        adicionarPlanoContasjButton4.setText("Fluxo de Caixa");
        adicionarPlanoContasjButton4.setToolTipText("Cadastro de Clientes");
        adicionarPlanoContasjButton4.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        adicionarPlanoContasjButton4.setMaximumSize(new java.awt.Dimension(80, 90));
        adicionarPlanoContasjButton4.setMinimumSize(new java.awt.Dimension(80, 90));
        adicionarPlanoContasjButton4.setName(""); // NOI18N
        adicionarPlanoContasjButton4.setPreferredSize(new java.awt.Dimension(80, 90));
        adicionarPlanoContasjButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adicionarPlanoContasjButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(adicionarPlanoContasjButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(31, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(adicionarPlanoContasjButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(265, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Relatórios", jPanel6);

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel1.setBackground(new java.awt.Color(35, 135, 112));
        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(35, 135, 112));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("SysFin");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(35, 135, 112));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Sistema de Gestão Financeira");

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/logoRelatorio/logotela.png"))); // NOI18N

        jLabel3.setForeground(new java.awt.Color(35, 135, 112));
        jLabel3.setText("Versão 1.30");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(93, 93, 93)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(22, 22, 22)))
                        .addContainerGap())))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        usuariojLabel.setForeground(new java.awt.Color(35, 135, 112));
        usuariojLabel.setText("Usuário : Julio Izidoro da Silva Junior");

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/botoespequenos/configuration.png"))); // NOI18N
        jButton1.setToolTipText("Configuração do Usuário");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(usuariojLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(usuariojLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jTabbedPane1)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 368, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void adicionarPlanoContasjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adicionarPlanoContasjButtonActionPerformed
        new FrmConsultarContasPagar(usuarioLogadoBean);
    }//GEN-LAST:event_adicionarPlanoContasjButtonActionPerformed

    private void registrarTransferenciajButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registrarTransferenciajButtonActionPerformed
        new FrmConsultarContasReceber(usuarioLogadoBean);
    }//GEN-LAST:event_registrarTransferenciajButtonActionPerformed

    private void imprimirjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_imprimirjButtonActionPerformed
        new FrmConsultaOutrosLancamentos(usuarioLogadoBean);
    }//GEN-LAST:event_imprimirjButtonActionPerformed

    private void registrarTransferenciajButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registrarTransferenciajButton2ActionPerformed
        new FrmConsultarVendas(usuarioLogadoBean);
    }//GEN-LAST:event_registrarTransferenciajButton2ActionPerformed

    private void adicionarPlanoContasjButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adicionarPlanoContasjButton2ActionPerformed
        if (usuarioLogadoBean.getUsuario().getCliente()==0){
            new FrmConsultaCliente(usuarioLogadoBean);
        }else JOptionPane.showMessageDialog(rootPane, "Acesso Negado");
    }//GEN-LAST:event_adicionarPlanoContasjButton2ActionPerformed

    private void consultaBancojButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_consultaBancojButtonActionPerformed
        if (usuarioLogadoBean.getUsuario().getCliente()==0){
            new FrmConsultaBanco(usuarioLogadoBean);
        }else JOptionPane.showMessageDialog(rootPane, "Acesso Negado");
    }//GEN-LAST:event_consultaBancojButtonActionPerformed

    private void excluirPlanoContasjButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_excluirPlanoContasjButton2ActionPerformed
        if (usuarioLogadoBean.getUsuario().getCliente()==0){
            new FrmConsultaPlanoContas();
        }else JOptionPane.showMessageDialog(rootPane, "Acesso Negado");
    }//GEN-LAST:event_excluirPlanoContasjButton2ActionPerformed

    private void imprimirjButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_imprimirjButton2ActionPerformed
        if (usuarioLogadoBean.getUsuario().getCliente()==0){
            new FrmConsultaProduto(usuarioLogadoBean);
        }else JOptionPane.showMessageDialog(rootPane, "Acesso Negado");
        
    }//GEN-LAST:event_imprimirjButton2ActionPerformed

    private void adicionarPlanoContasjButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adicionarPlanoContasjButton3ActionPerformed
        new FrmRelatoriosVendas(usuarioLogadoBean);
    }//GEN-LAST:event_adicionarPlanoContasjButton3ActionPerformed

    private void consultaBancojButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_consultaBancojButton1ActionPerformed
        new FrmRelatoriosPagamentos01(usuarioLogadoBean);
    }//GEN-LAST:event_consultaBancojButton1ActionPerformed

    private void excluirPlanoContasjButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_excluirPlanoContasjButton3ActionPerformed
        new FrmRelatoriosContasVencer(usuarioLogadoBean);
    }//GEN-LAST:event_excluirPlanoContasjButton3ActionPerformed

    private void imprimirjButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_imprimirjButton3ActionPerformed
        if (usuarioLogadoBean.getUsuario().getCliente()==0){
            new FrmConsultarUsuario(usuarioLogadoBean);
        }else JOptionPane.showMessageDialog(rootPane, "Acesso Negado");
    }//GEN-LAST:event_imprimirjButton3ActionPerformed

    private void excluirPlanoContasjButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_excluirPlanoContasjButton4ActionPerformed
        new FrmRelatoriosConciliacao01(usuarioLogadoBean);
    }//GEN-LAST:event_excluirPlanoContasjButton4ActionPerformed

    private void jTabbedPane1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTabbedPane1MouseClicked
       
    }//GEN-LAST:event_jTabbedPane1MouseClicked

    private void excluirPlanoContasjButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_excluirPlanoContasjButton5ActionPerformed
        new FrmRelatorioReceber(usuarioLogadoBean);
    }//GEN-LAST:event_excluirPlanoContasjButton5ActionPerformed

    private void adicionarPlanoContasjButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adicionarPlanoContasjButton4ActionPerformed
        new FrmRelatoriosFluxoCaixa(usuarioLogadoBean);
    }//GEN-LAST:event_adicionarPlanoContasjButton4ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        new FrmConfiguracaoUsuario(usuarioLogadoBean);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
       
    }//GEN-LAST:event_formWindowClosed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        ConectionFactory.desconectar();
    }//GEN-LAST:event_formWindowClosing

    /**
     * @param args the command line arguments
     */
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton adicionarPlanoContasjButton;
    private javax.swing.JButton adicionarPlanoContasjButton2;
    private javax.swing.JButton adicionarPlanoContasjButton3;
    private javax.swing.JButton adicionarPlanoContasjButton4;
    private javax.swing.JButton consultaBancojButton;
    private javax.swing.JButton consultaBancojButton1;
    private javax.swing.JButton excluirPlanoContasjButton2;
    private javax.swing.JButton excluirPlanoContasjButton3;
    private javax.swing.JButton excluirPlanoContasjButton4;
    private javax.swing.JButton excluirPlanoContasjButton5;
    private javax.swing.JButton imprimirjButton;
    private javax.swing.JButton imprimirjButton2;
    private javax.swing.JButton imprimirjButton3;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JButton registrarTransferenciajButton;
    private javax.swing.JButton registrarTransferenciajButton2;
    private javax.swing.JLabel usuariojLabel;
    // End of variables declaration//GEN-END:variables
    public void verificarCliente(){
        if (usuarioLogadoBean.getUsuario().getCliente()>0){
           // jTabbedPane1.setEnabled(false);
            ClienteController clienteController = new ClienteController();
            Cliente cliente = clienteController.consultar(usuarioLogadoBean.getUsuario().getCliente());
            if (cliente!=null){
                usuarioLogadoBean.setCliente(cliente);
            }
        }
    }

}
