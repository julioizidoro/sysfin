/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package tela.Vendas;

import IntegracaoSysTM.Viewvendasintegracao;
import controller.ClienteController;
import controller.ContasReceberController;
import controller.FormaPagamentoController;
import controller.VendasController;
import java.awt.Image;
import java.awt.Toolkit;
import java.io.File;
import java.net.URL;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.ListSelectionModel;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.JTableHeader;
import javax.swing.table.TableColumnModel;
import model.Cliente;
import model.Formapagamento;
import model.Vendas;
import modelView.Viewcontasreceber;
import modelView.Viewvendas;
import tela.ContasPagar.JTableRenderer;
import tela.util.Formatacao;
import tela.util.UsuarioLogadoBean;
import tela.util.clickColunas;

/**
 *
 * @author Wolverine
 */
public class FrmConsultarVendas extends javax.swing.JFrame implements IVendas{
    
    private List<Viewvendas> listaVendas;
    ConsultaVendasTableModel modelVendas;
    
    private UsuarioLogadoBean usuarioLogadoBean;
    private Cliente cliente;
    private String sql;
    private int numero;
    private String order;
    
    /**
     * Creates new form FrmConsultarVendas
     */
    public FrmConsultarVendas(UsuarioLogadoBean usuarioLogadoBean) {
        this.usuarioLogadoBean = usuarioLogadoBean;
        initComponents();
        URL url = this.getClass().getResource("/imagens/logoRelatorio/iconetela.png");
        Image imagemTitulo = Toolkit.getDefaultToolkit().getImage(url);
        this.setIconImage(imagemTitulo);
        this.setLocationRelativeTo(null);
        inicializarCliente();
        tabelaVendasrjTable.setSelectionMode(ListSelectionModel.SINGLE_SELECTION); 
        criarConsultaContasPagarInicial();
        this.setVisible(true);
        JTableHeader header = tabelaVendasrjTable.getTableHeader();
        header.addMouseListener(new clickColunas(this));
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
        tabelaVendasrjTable = new javax.swing.JTable();
        BarradeTarefasjToolBar = new javax.swing.JToolBar();
        adicionarjButton = new javax.swing.JButton();
        editarjButton = new javax.swing.JButton();
        excluirAPagarjButton = new javax.swing.JButton();
        SeparadordeTarefasjSeparator = new javax.swing.JToolBar.Separator();
        gerarParcelasjButton2 = new javax.swing.JButton();
        gerarParcelasjButton = new javax.swing.JButton();
        gerarParcelasjButton1 = new javax.swing.JButton();
        formaPagamentojButton = new javax.swing.JButton();
        voltarTelajButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Consulta Vendas");

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);

        tabelaVendasrjTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Nº  Venda", "Situação", "Data Venda", "Unidade", "Cliente", "Valor Total", "Produto"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tabelaVendasrjTable);
        if (tabelaVendasrjTable.getColumnModel().getColumnCount() > 0) {
            tabelaVendasrjTable.getColumnModel().getColumn(0).setResizable(false);
            tabelaVendasrjTable.getColumnModel().getColumn(0).setPreferredWidth(30);
            tabelaVendasrjTable.getColumnModel().getColumn(1).setResizable(false);
            tabelaVendasrjTable.getColumnModel().getColumn(1).setPreferredWidth(30);
            tabelaVendasrjTable.getColumnModel().getColumn(2).setResizable(false);
            tabelaVendasrjTable.getColumnModel().getColumn(2).setPreferredWidth(30);
            tabelaVendasrjTable.getColumnModel().getColumn(3).setResizable(false);
            tabelaVendasrjTable.getColumnModel().getColumn(3).setPreferredWidth(150);
            tabelaVendasrjTable.getColumnModel().getColumn(4).setResizable(false);
            tabelaVendasrjTable.getColumnModel().getColumn(4).setPreferredWidth(150);
            tabelaVendasrjTable.getColumnModel().getColumn(5).setResizable(false);
            tabelaVendasrjTable.getColumnModel().getColumn(5).setPreferredWidth(50);
            tabelaVendasrjTable.getColumnModel().getColumn(6).setResizable(false);
            tabelaVendasrjTable.getColumnModel().getColumn(6).setPreferredWidth(200);
        }

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 714, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 453, Short.MAX_VALUE)
                .addContainerGap())
        );

        BarradeTarefasjToolBar.setFloatable(false);
        BarradeTarefasjToolBar.setRollover(true);

        adicionarjButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/botoes/adicionar.png"))); // NOI18N
        adicionarjButton.setText("Adicionar");
        adicionarjButton.setToolTipText("Adicionar Venda");
        adicionarjButton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        adicionarjButton.setMaximumSize(new java.awt.Dimension(80, 90));
        adicionarjButton.setMinimumSize(new java.awt.Dimension(80, 90));
        adicionarjButton.setName(""); // NOI18N
        adicionarjButton.setPreferredSize(new java.awt.Dimension(80, 90));
        adicionarjButton.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        adicionarjButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adicionarjButtonActionPerformed(evt);
            }
        });
        BarradeTarefasjToolBar.add(adicionarjButton);

        editarjButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/botoes/editar.png"))); // NOI18N
        editarjButton.setText("Editar");
        editarjButton.setToolTipText("Editar Venda");
        editarjButton.setFocusable(false);
        editarjButton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        editarjButton.setMaximumSize(new java.awt.Dimension(80, 90));
        editarjButton.setMinimumSize(new java.awt.Dimension(80, 90));
        editarjButton.setPreferredSize(new java.awt.Dimension(80, 90));
        editarjButton.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        editarjButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editarjButtonActionPerformed(evt);
            }
        });
        BarradeTarefasjToolBar.add(editarjButton);

        excluirAPagarjButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/botoes/excluir.png"))); // NOI18N
        excluirAPagarjButton.setText("Excluir");
        excluirAPagarjButton.setToolTipText("Excluir Venda");
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

        gerarParcelasjButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/botoes/liberar.png"))); // NOI18N
        gerarParcelasjButton.setText("Parcelas");
        gerarParcelasjButton.setToolTipText("Lançar Parcelas");
        gerarParcelasjButton.setFocusable(false);
        gerarParcelasjButton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        gerarParcelasjButton.setMaximumSize(new java.awt.Dimension(80, 90));
        gerarParcelasjButton.setMinimumSize(new java.awt.Dimension(80, 90));
        gerarParcelasjButton.setPreferredSize(new java.awt.Dimension(80, 90));
        gerarParcelasjButton.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        gerarParcelasjButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gerarParcelasjButtonActionPerformed(evt);
            }
        });
        BarradeTarefasjToolBar.add(gerarParcelasjButton);

        gerarParcelasjButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/botoes/liberar.png"))); // NOI18N
        gerarParcelasjButton1.setText("Contas");
        gerarParcelasjButton1.setToolTipText("Lançar Parcelas");
        gerarParcelasjButton1.setFocusable(false);
        gerarParcelasjButton1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        gerarParcelasjButton1.setMaximumSize(new java.awt.Dimension(80, 90));
        gerarParcelasjButton1.setMinimumSize(new java.awt.Dimension(80, 90));
        gerarParcelasjButton1.setPreferredSize(new java.awt.Dimension(80, 90));
        gerarParcelasjButton1.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        gerarParcelasjButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gerarParcelasjButton1ActionPerformed(evt);
            }
        });
        BarradeTarefasjToolBar.add(gerarParcelasjButton1);

        formaPagamentojButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/botoes/liberar.png"))); // NOI18N
        formaPagamentojButton.setText("Forma");
        formaPagamentojButton.setToolTipText("Consultar Formas de Pagamento");
        formaPagamentojButton.setFocusable(false);
        formaPagamentojButton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        formaPagamentojButton.setMaximumSize(new java.awt.Dimension(80, 90));
        formaPagamentojButton.setMinimumSize(new java.awt.Dimension(80, 90));
        formaPagamentojButton.setPreferredSize(new java.awt.Dimension(80, 90));
        formaPagamentojButton.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        formaPagamentojButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                formaPagamentojButtonActionPerformed(evt);
            }
        });
        BarradeTarefasjToolBar.add(formaPagamentojButton);

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
            .addGap(0, 758, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(55, 55, 55)
                    .addComponent(BarradeTarefasjToolBar, javax.swing.GroupLayout.PREFERRED_SIZE, 639, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(64, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 600, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(110, Short.MAX_VALUE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addContainerGap(498, Short.MAX_VALUE)
                    .addComponent(BarradeTarefasjToolBar, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(22, 22, 22)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
 
    private void adicionarjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adicionarjButtonActionPerformed
        new FrmLancarVenda(usuarioLogadoBean, this, 0);
    }//GEN-LAST:event_adicionarjButtonActionPerformed

    private void excluirAPagarjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_excluirAPagarjButtonActionPerformed
        int linha = tabelaVendasrjTable.getSelectedRow();
        if (linha >= 0) {
            boolean resultado = JOptionPane.showConfirmDialog(null, "Confirma exclusão?", "Excluir", JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE) == 0;
            if (resultado) {
                String sql = "Select v from Viewcontasreceber v where v.venda=" + listaVendas.get(linha).getIdvendas();
                ContasReceberController contasReceberController = new ContasReceberController();
                List<Viewcontasreceber> listaContas = contasReceberController.listar(sql);
                if ((listaContas != null) && (listaContas.size() > 0)) {
                    JOptionPane.showMessageDialog(rootPane, "Venda possui conta lançada");
                } else {
                    FormaPagamentoController formaPagamentoController = new FormaPagamentoController();
                    List<Formapagamento> listaFormapagamentos = formaPagamentoController.listar(listaVendas.get(linha).getIdvendas());
                    if (listaFormapagamentos!=null){
                        for(int i=0;i<listaFormapagamentos.size();i++){
                            formaPagamentoController.Excluir(listaFormapagamentos.get(i).getIdformaPagamento());
                        }
                    }
                    VendasController vendasController = new VendasController();
                    vendasController.Excluir(listaVendas.get(linha).getIdvendas());
                    JOptionPane.showMessageDialog(rootPane, "Venda exluída com sucesso");
                }
                setModel();
            }
        }
    }//GEN-LAST:event_excluirAPagarjButtonActionPerformed

    private void gerarParcelasjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gerarParcelasjButtonActionPerformed
        int linha = tabelaVendasrjTable.getSelectedRow();
        if (linha>=0){
            ClienteController clienteController = new ClienteController();
            cliente = clienteController.consultar(listaVendas.get(linha).getClienteIdcliente());
            if (cliente.getContaRecebimento()==0){
                JOptionPane.showMessageDialog(rootPane, "Cliente não possui conta de recebimento");
                cliente = null;
            }else {
                cliente= null;
                new FrmLancarContasReceber(usuarioLogadoBean, listaVendas.get(linha), this);
            }
        }
    }//GEN-LAST:event_gerarParcelasjButtonActionPerformed

    private void voltarTelajButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_voltarTelajButtonActionPerformed
        this.dispose();
    }//GEN-LAST:event_voltarTelajButtonActionPerformed

    private void editarjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editarjButtonActionPerformed
        int linha = tabelaVendasrjTable.getSelectedRow();
        if (linha>=0){
            int idVenda = listaVendas.get(linha).getIdvendas();
            new FrmLancarVenda(usuarioLogadoBean, this, idVenda);
        }
    }//GEN-LAST:event_editarjButtonActionPerformed

    private void formaPagamentojButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_formaPagamentojButtonActionPerformed
        int linha = tabelaVendasrjTable.getSelectedRow();
        if (linha>=0){
            int idVenda = listaVendas.get(linha).getIdvendas();
            new FrmConsultarFormaPagamento(idVenda);
        }
        
    }//GEN-LAST:event_formaPagamentojButtonActionPerformed

    private void gerarParcelasjButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gerarParcelasjButton1ActionPerformed
        int linha = tabelaVendasrjTable.getSelectedRow();
        if (linha >= 0) {
            VendasController vendasController = new VendasController();
            Vendas venda = vendasController.consultar(listaVendas.get(linha).getIdvendas());
            new FrmLancarContas(usuarioLogadoBean, venda);
        }
    }//GEN-LAST:event_gerarParcelasjButton1ActionPerformed

    private void gerarParcelasjButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gerarParcelasjButton2ActionPerformed
        new FrmPesquisarVendas(usuarioLogadoBean, cliente, this);
    }//GEN-LAST:event_gerarParcelasjButton2ActionPerformed

    /**
     * @param args the command line arguments
     */
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToolBar BarradeTarefasjToolBar;
    private javax.swing.JToolBar.Separator SeparadordeTarefasjSeparator;
    private javax.swing.JButton adicionarjButton;
    private javax.swing.JButton editarjButton;
    private javax.swing.JButton excluirAPagarjButton;
    private javax.swing.JButton formaPagamentojButton;
    private javax.swing.JButton gerarParcelasjButton;
    private javax.swing.JButton gerarParcelasjButton1;
    private javax.swing.JButton gerarParcelasjButton2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabelaVendasrjTable;
    private javax.swing.JButton voltarTelajButton;
    // End of variables declaration//GEN-END:variables

    public void carregarModel(String sql, String order){
        sql = sql + order;
        VendasController vendasController = new VendasController();
        listaVendas = vendasController.listar(sql);
        if (listaVendas==null){
            listaVendas = new ArrayList<Viewvendas>();
        }
        modelVendas = new ConsultaVendasTableModel(listaVendas);
        tabelaVendasrjTable.setModel(modelVendas);
        TableColumnModel ColumnModel = tabelaVendasrjTable.getColumnModel();  
        JTableRenderer renderer = new JTableRenderer();  
        ColumnModel.getColumn(1).setCellRenderer(renderer);
        DefaultTableCellRenderer rendererValor = new DefaultTableCellRenderer();
        rendererValor.setHorizontalAlignment(SwingConstants.RIGHT);
        tabelaVendasrjTable.getColumnModel().getColumn(0).setPreferredWidth(80);
        tabelaVendasrjTable.getColumnModel().getColumn(1).setPreferredWidth(80);
        tabelaVendasrjTable.getColumnModel().getColumn(2).setPreferredWidth(80);
        tabelaVendasrjTable.getColumnModel().getColumn(3).setPreferredWidth(150);
        tabelaVendasrjTable.getColumnModel().getColumn(4).setPreferredWidth(250);
        tabelaVendasrjTable.getColumnModel().getColumn(5).setCellRenderer(rendererValor);
        tabelaVendasrjTable.getColumnModel().getColumn(5).setPreferredWidth(80);
        tabelaVendasrjTable.getColumnModel().getColumn(6).setPreferredWidth(300);
        tabelaVendasrjTable.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);  
        tabelaVendasrjTable.repaint();
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
        sql =null;
        if (usuarioLogadoBean.getUsuario().getCliente()>0){
            sql = " Select v from Viewvendas v where v.dataVenda>='" + dataInicial + 
                "' and v.dataVenda<='" + dataFinal + "' and situacao<>'verde' and clienteIdcliente=" + 
                    usuarioLogadoBean.getUsuario().getCliente();
            order = " order by v.dataVenda";
        }else {
            sql = " Select v from Viewvendas v where v.visualizacao='Operacional' and "
                    + "v.dataVenda>='" + dataInicial + 
                "' and v.dataVenda<='" + dataFinal + "' and situacao<>'verde'";
            order = " order by v.dataVenda";
        }
        carregarModel(sql, order);
    }

    @Override
    public void setModel() {
        carregarModel(sql, order);
    }

    @Override
    public void setCliente(Cliente cliente) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setArquivo(File arquivo) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setFormaPagamento(Formapagamento formaPagamento) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void exportarExcel(String caminho, String nomeArquivo) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public void inicializarCliente(){
        this.cliente = Formatacao.consultarCliente(usuarioLogadoBean);
    }
    
    @Override
    public void pesquisar(String sql, String order) {
        this.sql = sql;
        this.order = order;
        carregarModel(this.sql, this.order);
    }

    @Override
    public void setNumeroColuna(int numero) {
         this.numero = numero;
        String order = "";
        if (numero==0){
            order = " order by Idvendas";
        }else if (numero==1){
            order =" order by situacao";
        }else if (numero==2){
            order = " order by DataVenda";
        }else if (numero==3){
            order = " order by NomeFantasia";
        }else if (numero==4){
            order = " order by NomeCliente";
        }else if (numero==5){
            order = " order by valorBruto";
        }else if (numero==6){
            order = " order by Descricao";
        }
        
        carregarModel(sql, order);
    }

    @Override
    public void importarVendasSysTM(Viewvendasintegracao vendaImportada) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
