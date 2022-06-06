/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package View;

import Controllers.CondominioController;
import Models.CondominioModel;
import Dto.Request.CadastroCondominioRequestDto;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;

/**
 *
 * @author Ingrid
 */
public class TelaCadastroCondominio extends javax.swing.JFrame {

    /**
     * Creates new form TelaCadastroCondominio
     */
    private static CondominioController _condominioController = new CondominioController();
    
    public TelaCadastroCondominio() 
    {
        super("SafePlace");
        initComponents();
        setLocationRelativeTo(null);
        
        this.atualizarLista();
         
    }
    
    public void atualizarLista(){
        try{
            
            cboxCondominiosCadastrados.setModel(new DefaultComboBoxModel<>(_condominioController.mostrarListaCondominio()));
            txtNomeCondominio.setText("");
            txtEnderecoCondominio.setText("");

            _condominioController.setCondominio(null);
            //this.habilitarDesabilitarBotoes(false);

        }catch (Exception ex){
            Logger.getLogger(Home.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public boolean camposPreenchidos() {
        if(txtNomeCondominio.getText().equals("") &&
           txtEnderecoCondominio.getText().equals(""))
        {
            return false;
        }
        return true;
    }
        public void habilitarDesabilitarBotoes(boolean enabled) {
        if(enabled) {
            btnCadastrarCondominio.setEnabled(true);
            btnApagarCondominio.setEnabled(true);
            btnEditarCondominio.setEnabled(true);
            //lblAcessoBotoes.setText("");
        } else {
            btnCadastrarCondominio.setEnabled(false);
            btnApagarCondominio.setEnabled(false);
            btnEditarCondominio.setEnabled(false);
            //lblAcessoBotoes.setText("Selecione um Inquilino!");
        }
    }
    
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtNomeCondominio = new javax.swing.JTextField();
        txtEnderecoCondominio = new javax.swing.JTextField();
        btnCadastrarCondominio = new javax.swing.JButton();
        cboxCondominiosCadastrados = new javax.swing.JComboBox<>();
        btnApagarCondominio = new javax.swing.JButton();
        btnVoltarCadastroCondominio = new javax.swing.JButton();
        btnEditarCondominio = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(500, 500));

        txtNomeCondominio.setBorder(javax.swing.BorderFactory.createTitledBorder("Nome do Condomínio:"));
        txtNomeCondominio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNomeCondominioActionPerformed(evt);
            }
        });

        txtEnderecoCondominio.setBorder(javax.swing.BorderFactory.createTitledBorder("Endereço:"));
        txtEnderecoCondominio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEnderecoCondominioActionPerformed(evt);
            }
        });

        btnCadastrarCondominio.setText("Cadastrar");
        btnCadastrarCondominio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastrarCondominioActionPerformed(evt);
            }
        });

        cboxCondominiosCadastrados.setBorder(javax.swing.BorderFactory.createTitledBorder("Condomínios cadastrados:"));
        cboxCondominiosCadastrados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboxCondominiosCadastradosActionPerformed(evt);
            }
        });

        btnApagarCondominio.setText("Apagar");
        btnApagarCondominio.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnApagarCondominio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnApagarCondominioActionPerformed(evt);
            }
        });

        btnVoltarCadastroCondominio.setText("Voltar");
        btnVoltarCadastroCondominio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVoltarCadastroCondominioActionPerformed(evt);
            }
        });

        btnEditarCondominio.setText("Editar");
        btnEditarCondominio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarCondominioActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(113, 113, 113)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(txtNomeCondominio, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtEnderecoCondominio, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cboxCondominiosCadastrados, javax.swing.GroupLayout.PREFERRED_SIZE, 274, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnVoltarCadastroCondominio, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnCadastrarCondominio)
                        .addGap(15, 15, 15)
                        .addComponent(btnEditarCondominio)
                        .addGap(15, 15, 15)
                        .addComponent(btnApagarCondominio)))
                .addContainerGap(113, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {cboxCondominiosCadastrados, txtEnderecoCondominio, txtNomeCondominio});

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btnApagarCondominio, btnCadastrarCondominio, btnEditarCondominio});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(79, 79, 79)
                .addComponent(cboxCondominiosCadastrados, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addComponent(txtNomeCondominio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addComponent(txtEnderecoCondominio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnApagarCondominio)
                    .addComponent(btnEditarCondominio)
                    .addComponent(btnCadastrarCondominio))
                .addGap(40, 40, 40)
                .addComponent(btnVoltarCadastroCondominio)
                .addContainerGap(78, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {cboxCondominiosCadastrados, txtEnderecoCondominio, txtNomeCondominio});

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {btnApagarCondominio, btnCadastrarCondominio, btnEditarCondominio});

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtNomeCondominioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNomeCondominioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNomeCondominioActionPerformed

    private void txtEnderecoCondominioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEnderecoCondominioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEnderecoCondominioActionPerformed

    private void btnCadastrarCondominioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarCondominioActionPerformed
        // TODO add your handling code here:
        CadastroCondominioRequestDto request = new CadastroCondominioRequestDto();
        
        request.setNome(txtNomeCondominio.getText());
        request.setEndereco(txtEnderecoCondominio.getText());
        
        
        JOptionPane.showMessageDialog(null, _condominioController.CadastrarCondominio(request));
    }//GEN-LAST:event_btnCadastrarCondominioActionPerformed

    private void btnEditarCondominioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarCondominioActionPerformed
        CondominioModel condominio = (CondominioModel)cboxCondominiosCadastrados.getSelectedItem();
        
        if(this.camposPreenchidos()) {
            condominio.setNome(txtNomeCondominio.getText());
            condominio.setEndereco(txtEnderecoCondominio.getText());

            _condominioController.setCondominio(condominio);

            JOptionPane.showMessageDialog(null, _condominioController.atualizarCondominio());

            if(!_condominioController.erroReq)
                atualizarLista();
        }else {
            JOptionPane.showMessageDialog(null, "Favor, preencher os campos adequadamente!");
        }
                       
    }//GEN-LAST:event_btnEditarCondominioActionPerformed

    private void btnVoltarCadastroCondominioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltarCadastroCondominioActionPerformed
        
        this.dispose();
    }//GEN-LAST:event_btnVoltarCadastroCondominioActionPerformed

    private void btnApagarCondominioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnApagarCondominioActionPerformed
        CondominioModel condominio = (CondominioModel)cboxCondominiosCadastrados.getSelectedItem();
        _condominioController.setCondominio(condominio);
        
        JOptionPane.showMessageDialog(null, _condominioController.deletarInquilino());
        if(!_condominioController.erroReq)
            atualizarLista();
    }//GEN-LAST:event_btnApagarCondominioActionPerformed

    private void cboxCondominiosCadastradosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboxCondominiosCadastradosActionPerformed
        CondominioModel condominio = (CondominioModel)cboxCondominiosCadastrados.getSelectedItem();
        
        txtNomeCondominio.setText(condominio.getNome());
        txtEnderecoCondominio.setText(condominio.getEndereco());
        
        
        _condominioController.setCondominio(condominio);
        this.habilitarDesabilitarBotoes(true);
    }//GEN-LAST:event_cboxCondominiosCadastradosActionPerformed

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
            java.util.logging.Logger.getLogger(TelaCadastroCondominio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaCadastroCondominio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaCadastroCondominio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaCadastroCondominio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaCadastroCondominio().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnApagarCondominio;
    private javax.swing.JButton btnCadastrarCondominio;
    private javax.swing.JButton btnEditarCondominio;
    private javax.swing.JButton btnVoltarCadastroCondominio;
    private javax.swing.JComboBox<CondominioModel> cboxCondominiosCadastrados;
    private javax.swing.JTextField txtEnderecoCondominio;
    private javax.swing.JTextField txtNomeCondominio;
    // End of variables declaration//GEN-END:variables
}
