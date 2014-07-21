

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * FrmConsultaPlanoContas.java
 *
 * Created on 23/09/2009, 12:29:02
 */
package tela.PlanoContas;

import controller.PlanoContasController;
import java.awt.Image;
import java.awt.Toolkit;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import model.Planocontas;

/**
 *
 * @author Wolverine
 */
public class FrmConsultaPlanoContas extends javax.swing.JFrame implements IPlanoContas{
    
    private List<Planocontas> listaContas;
    private ConsultaPlanoContasTableModel model;
    

    public FrmConsultaPlanoContas() {
        initComponents();
        URL url = this.getClass().getResource("/imagens/logoRelatorio/iconetela.png");
        Image imagemTitulo = Toolkit.getDefaultToolkit().getImage(url);
        this.setIconImage(imagemTitulo);
        setModel();
        this.setLocationRelativeTo(null);
        setVisible(true);
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PlanoContasjPanel = new javax.swing.JPanel();
        descricaoPlanoContasjTextField = new javax.swing.JTextField();
        descricaojLabel = new javax.swing.JLabel();
        BarradeTarefasjToolBar = new javax.swing.JToolBar();
        adicionarPlanoContasjButton = new javax.swing.JButton();
        editarPlanoContasjButton = new javax.swing.JButton();
        SeparadordeTarefasjSeparator = new javax.swing.JToolBar.Separator();
        VoltarjButton = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        consultaPlanoContasjTable = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Consulta Plano de Contas");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        PlanoContasjPanel.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        PlanoContasjPanel.setPreferredSize(new java.awt.Dimension(800, 600));
        PlanoContasjPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        descricaoPlanoContasjTextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                descricaoPlanoContasjTextFieldKeyPressed(evt);
            }
        });
        PlanoContasjPanel.add(descricaoPlanoContasjTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, 410, -1));

        descricaojLabel.setText("Descrição");
        PlanoContasjPanel.add(descricaojLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

        BarradeTarefasjToolBar.setFloatable(false);
        BarradeTarefasjToolBar.setRollover(true);

        adicionarPlanoContasjButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/botoes/adicionar.png"))); // NOI18N
        adicionarPlanoContasjButton.setText("Adicionar");
        adicionarPlanoContasjButton.setToolTipText("Adicionar Plano de Contas");
        adicionarPlanoContasjButton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        adicionarPlanoContasjButton.setMaximumSize(new java.awt.Dimension(80, 90));
        adicionarPlanoContasjButton.setMinimumSize(new java.awt.Dimension(80, 90));
        adicionarPlanoContasjButton.setName(""); // NOI18N
        adicionarPlanoContasjButton.setPreferredSize(new java.awt.Dimension(80, 90));
        adicionarPlanoContasjButton.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        adicionarPlanoContasjButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adicionarPlanoContasjButtonActionPerformed(evt);
            }
        });
        BarradeTarefasjToolBar.add(adicionarPlanoContasjButton);

        editarPlanoContasjButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/botoes/editar.png"))); // NOI18N
        editarPlanoContasjButton.setText("Editar");
        editarPlanoContasjButton.setToolTipText("Editar Plano de Contas");
        editarPlanoContasjButton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        editarPlanoContasjButton.setMaximumSize(new java.awt.Dimension(80, 90));
        editarPlanoContasjButton.setMinimumSize(new java.awt.Dimension(80, 90));
        editarPlanoContasjButton.setPreferredSize(new java.awt.Dimension(80, 90));
        editarPlanoContasjButton.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        editarPlanoContasjButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editarPlanoContasjButtonActionPerformed(evt);
            }
        });
        BarradeTarefasjToolBar.add(editarPlanoContasjButton);
        BarradeTarefasjToolBar.add(SeparadordeTarefasjSeparator);

        VoltarjButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/botoes/voltar.png"))); // NOI18N
        VoltarjButton.setText("Voltar");
        VoltarjButton.setToolTipText("Voltar");
        VoltarjButton.setFocusable(false);
        VoltarjButton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        VoltarjButton.setMaximumSize(new java.awt.Dimension(80, 90));
        VoltarjButton.setMinimumSize(new java.awt.Dimension(80, 90));
        VoltarjButton.setPreferredSize(new java.awt.Dimension(80, 90));
        VoltarjButton.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        VoltarjButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                voltarTelajButtonActionPerformed(evt);
            }
        });
        BarradeTarefasjToolBar.add(VoltarjButton);

        PlanoContasjPanel.add(BarradeTarefasjToolBar, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 330, 270, -1));

        consultaPlanoContasjTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Título 1", "Título 2"
            }
        ));
        consultaPlanoContasjTable.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        consultaPlanoContasjTable.getTableHeader().setReorderingAllowed(false);
        consultaPlanoContasjTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                consultaPlanoContasjTableMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(consultaPlanoContasjTable);

        PlanoContasjPanel.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, 570, 250));

        getContentPane().add(PlanoContasjPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 600, 430));

        pack();
    }// </editor-fold>//GEN-END:initComponents
    private void descricaoPlanoContasjTextFieldKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_descricaoPlanoContasjTextFieldKeyPressed
        setModel();
    }//GEN-LAST:event_descricaoPlanoContasjTextFieldKeyPressed
    private void adicionarPlanoContasjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adicionarPlanoContasjButtonActionPerformed
        new FrmCadastraPlanoContas(null, this);
}//GEN-LAST:event_adicionarPlanoContasjButtonActionPerformed
    private void editarPlanoContasjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editarPlanoContasjButtonActionPerformed
        int linha = consultaPlanoContasjTable.getSelectedRow();
        if (linha >= 0) {
            new FrmCadastraPlanoContas(listaContas.get(linha), this);
        }
}//GEN-LAST:event_editarPlanoContasjButtonActionPerformed
    private void voltarTelajButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_voltarTelajButtonActionPerformed
        this.dispose();
}//GEN-LAST:event_voltarTelajButtonActionPerformed
    private void consultaPlanoContasjTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_consultaPlanoContasjTableMouseClicked
        
    
}//GEN-LAST:event_consultaPlanoContasjTableMouseClicked
    /**
     * @param args the command line arguments
     */
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToolBar BarradeTarefasjToolBar;
    private javax.swing.JPanel PlanoContasjPanel;
    private javax.swing.JToolBar.Separator SeparadordeTarefasjSeparator;
    private javax.swing.JButton VoltarjButton;
    private javax.swing.JButton adicionarPlanoContasjButton;
    private javax.swing.JTable consultaPlanoContasjTable;
    private javax.swing.JTextField descricaoPlanoContasjTextField;
    private javax.swing.JLabel descricaojLabel;
    private javax.swing.JButton editarPlanoContasjButton;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables

    @Override
    public void setModel() {
        PlanoContasController planoContasController = new PlanoContasController();
        listaContas = planoContasController.listar(descricaoPlanoContasjTextField.getText());
        if (listaContas==null){
            listaContas = new ArrayList<Planocontas>();
        }
        model = new ConsultaPlanoContasTableModel(listaContas);
        consultaPlanoContasjTable.setModel(model);
        consultaPlanoContasjTable.getColumnModel().getColumn(0).setMaxWidth(50);
        consultaPlanoContasjTable.getColumnModel().getColumn(1).setMaxWidth(200);
        consultaPlanoContasjTable.repaint();
    }
}
