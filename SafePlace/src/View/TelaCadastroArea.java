/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package View;

import Controllers.AreaController;
import Dto.Request.CadastroAreaRequestDto;
import Models.AreaModel;
import Models.CondominioModel;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;

/**
 *
 * @author Ingrid
 */
public class TelaCadastroArea extends javax.swing.JFrame {

    /**
     * Creates new form TelaCadastroArea
     */
    private static AreaController _areaController = new AreaController();

    public TelaCadastroArea() {
        super("Cadastro de Área");
        initComponents();
        setLocationRelativeTo(null);
        
        try {
            _areaController.montarListaCondominioArea();
            cboxCondominios.setModel(new DefaultComboBoxModel<>(_areaController.condominios));
        } catch (Exception ex) {
            Logger.getLogger(TelaCadastroArea.class.getName()).log(Level.SEVERE, null, ex);
        }
        this.atualizarLista();
        
    }
    
    public void atualizarLista() {
        try 
        {            
            
            _areaController.montarListaAreas();
            cboxAreas.setModel(new DefaultComboBoxModel<>(_areaController.areas));
            txtNomeArea.setText("");
            spnDosesRequisitas.setValue(0);
            
            _areaController.definirAreaSelecionada(null);
            this.habilitarDesabilitarBotoes(false);
            
        } catch (Exception ex) {
            Logger.getLogger(Home.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public boolean camposPreenchidos() {
        if(txtNomeArea.getText().equals("") &&
           spnDosesRequisitas.getValue().equals(""))
        {
            return false;
        }
        return true;
    }
    
    public void habilitarDesabilitarBotoes(boolean enabled) {
        if(enabled) {
            btnEditarArea.setEnabled(true);
            btnApagarArea.setEnabled(true);
            lblAcessoBotoes.setText("");
        } else {
            btnEditarArea.setEnabled(false);
            btnApagarArea.setEnabled(false);
            lblAcessoBotoes.setText("Selecione uma Área para Editar/Apagar");
        }
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        txtNomeArea = new javax.swing.JTextField();
        spnDosesRequisitas = new javax.swing.JSpinner();
        btnCadastrarAreaCondominio = new javax.swing.JButton();
        btnApagarArea = new javax.swing.JButton();
        cboxAreas = new javax.swing.JComboBox<>();
        btnVoltarCadastroArea = new javax.swing.JButton();
        btnEditarArea = new javax.swing.JButton();
        cboxCondominios = new javax.swing.JComboBox<>();
        lblAcessoBotoes = new javax.swing.JLabel();

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(500, 500));
        setPreferredSize(new java.awt.Dimension(600, 600));

        txtNomeArea.setBorder(javax.swing.BorderFactory.createTitledBorder("Nome da Área:"));

        spnDosesRequisitas.setBorder(javax.swing.BorderFactory.createTitledBorder("Número de doses requisitadas para acessar:"));

        btnCadastrarAreaCondominio.setText("Cadastrar");
        btnCadastrarAreaCondominio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastrarAreaCondominioActionPerformed(evt);
            }
        });

        btnApagarArea.setText("Apagar");
        btnApagarArea.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnApagarAreaActionPerformed(evt);
            }
        });

        cboxAreas.setBorder(javax.swing.BorderFactory.createTitledBorder("Áreas cadastradas:"));
        cboxAreas.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cboxAreasItemStateChanged(evt);
            }
        });
        cboxAreas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboxAreasActionPerformed(evt);
            }
        });

        btnVoltarCadastroArea.setText("Voltar");
        btnVoltarCadastroArea.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVoltarCadastroAreaActionPerformed(evt);
            }
        });

        btnEditarArea.setText("Editar");
        btnEditarArea.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarAreaActionPerformed(evt);
            }
        });

        cboxCondominios.setBorder(javax.swing.BorderFactory.createTitledBorder("Condominios cadastrados:"));
        cboxCondominios.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cboxCondominiosItemStateChanged(evt);
            }
        });
        cboxCondominios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboxCondominiosActionPerformed(evt);
            }
        });

        lblAcessoBotoes.setForeground(new java.awt.Color(0, 51, 255));
        lblAcessoBotoes.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(100, 100, 100)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(txtNomeArea)
                    .addComponent(spnDosesRequisitas)
                    .addComponent(cboxAreas, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnVoltarCadastroArea, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEditarArea, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cboxCondominios, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btnCadastrarAreaCondominio, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 111, Short.MAX_VALUE)
                        .addComponent(btnApagarArea, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(lblAcessoBotoes, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(99, 99, 99))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(cboxCondominios, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(cboxAreas, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(txtNomeArea, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                .addComponent(spnDosesRequisitas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCadastrarAreaCondominio, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnApagarArea, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEditarArea, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btnVoltarCadastroArea, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblAcessoBotoes, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnVoltarCadastroAreaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltarCadastroAreaActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_btnVoltarCadastroAreaActionPerformed

    private void btnCadastrarAreaCondominioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarAreaCondominioActionPerformed
        CadastroAreaRequestDto request = new CadastroAreaRequestDto();

        if(this.camposPreenchidos()) {
            String nomeArea = txtNomeArea.getText();
            String dosesReq = spnDosesRequisitas.getValue().toString();
            
            if (!nomeArea.matches("[a-zA-Z ]{4,}")) {
                JOptionPane.showMessageDialog(null, "O nome da área deve conter apenas letras e espaços e ter mais de 3 caracteres!");
                return;
            }
            
            if (!dosesReq.matches("[0-4]")) {
                JOptionPane.showMessageDialog(null, "O número de doses deve ser entre 0 e 4!");
                return;
            }
            
            request.setDescricao(txtNomeArea.getText());
            request.setDosesRequisitadas((int) spnDosesRequisitas.getValue());
            JOptionPane.showMessageDialog(null, _areaController.cadastrarArea(request));
            if(!_areaController.erroReq)
                atualizarLista();
        }else {
            JOptionPane.showMessageDialog(null, "Favor, preencher os campos adequadamente!");
        }
    }//GEN-LAST:event_btnCadastrarAreaCondominioActionPerformed

    private void cboxCondominiosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboxCondominiosActionPerformed
        CondominioModel con = (CondominioModel) cboxCondominios.getSelectedItem();

        if (con.getIdCondominio() != this._areaController.condominioSelecionado.getIdCondominio()) {
            _areaController.definirCondominioSelecionado(con);

            try {
                _areaController.montarListaAreas();
                cboxAreas.setModel(new DefaultComboBoxModel<>(_areaController.areas));
            } catch (Exception ex) {
                Logger.getLogger(Home.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_cboxCondominiosActionPerformed

    private void cboxCondominiosItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cboxCondominiosItemStateChanged
        CondominioModel con = (CondominioModel) cboxCondominios.getSelectedItem();

        if (con.getIdCondominio() != this._areaController.condominioSelecionado.getIdCondominio()) {
            _areaController.definirCondominioSelecionado(con);

            try {
                _areaController.montarListaAreas();
                cboxAreas.setModel(new DefaultComboBoxModel<>(_areaController.areas));
            } catch (Exception ex) {
                Logger.getLogger(Home.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_cboxCondominiosItemStateChanged

    private void cboxAreasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboxAreasActionPerformed
        AreaModel a = (AreaModel) cboxAreas.getSelectedItem();

        txtNomeArea.setText(a.getDescricao());
        spnDosesRequisitas.setValue(a.getDosesRequisitadas());

        _areaController.definirAreaSelecionada(a);
        this.habilitarDesabilitarBotoes(true);
    }//GEN-LAST:event_cboxAreasActionPerformed

    private void cboxAreasItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cboxAreasItemStateChanged
        AreaModel a = (AreaModel) cboxAreas.getSelectedItem();

        txtNomeArea.setText(a.getDescricao());
        spnDosesRequisitas.setValue(a.getDosesRequisitadas());

        _areaController.definirAreaSelecionada(a);
        this.habilitarDesabilitarBotoes(true);
    }//GEN-LAST:event_cboxAreasItemStateChanged

    private void btnEditarAreaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarAreaActionPerformed
        AreaModel area = (AreaModel)cboxAreas.getSelectedItem();

        if(this.camposPreenchidos()) {
            String nomeArea = txtNomeArea.getText();
            String dosesReq = spnDosesRequisitas.getValue().toString();
            
            if (!nomeArea.matches("[a-zA-Z ]{4,}")) {
                JOptionPane.showMessageDialog(null, "O nome da área deve conter apenas letras e espaços e ter mais de 3 caracteres!");
                return;
            }
            
            if (!dosesReq.matches("[0-4]")) {
                JOptionPane.showMessageDialog(null, "O número de doses deve ser entre 0 e 4!");
                return;
            }
            
            area.setDescricao(txtNomeArea.getText());
            area.setDosesRequisitadas((int) spnDosesRequisitas.getValue());
            
             _areaController.definirAreaSelecionada(area);
            
            JOptionPane.showMessageDialog(null, _areaController.atualizarArea());
            if(!_areaController.erroReq)
                atualizarLista();
        }else {
            JOptionPane.showMessageDialog(null, "Favor, preencher os campos adequadamente!");
        }
    }//GEN-LAST:event_btnEditarAreaActionPerformed

    private void btnApagarAreaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnApagarAreaActionPerformed
        AreaModel area = (AreaModel)cboxAreas.getSelectedItem();
        _areaController.definirAreaSelecionada(area);
        
        JOptionPane.showMessageDialog(null, _areaController.deletarArea());
        if(!_areaController.erroReq)
            atualizarLista();
    }//GEN-LAST:event_btnApagarAreaActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TelaCadastroArea.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaCadastroArea.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaCadastroArea.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaCadastroArea.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaCadastroArea().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnApagarArea;
    private javax.swing.JButton btnCadastrarAreaCondominio;
    private javax.swing.JButton btnEditarArea;
    private javax.swing.JButton btnVoltarCadastroArea;
    private javax.swing.JComboBox<AreaModel> cboxAreas;
    private javax.swing.JComboBox<CondominioModel> cboxCondominios;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JLabel lblAcessoBotoes;
    private javax.swing.JSpinner spnDosesRequisitas;
    private javax.swing.JTextField txtNomeArea;
    // End of variables declaration//GEN-END:variables
}
