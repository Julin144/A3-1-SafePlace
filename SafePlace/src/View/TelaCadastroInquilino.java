/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package View;

import Controllers.InquilinoController;
import Dto.Request.*;
import Models.InquilinoModel;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import Business.Validate;

/**
 *
 * @author Ingrid
 */
public class TelaCadastroInquilino extends javax.swing.JFrame {

    /**
     * Creates new form TelaCadastroInquilino
     */
    private static InquilinoController _inquilinoController = new InquilinoController();
    
    public TelaCadastroInquilino() 
    {
        super("Cadastro de Inquilino");
        initComponents();
        setLocationRelativeTo(null);
        
        this.atualizarLista();
    }
    
    public void atualizarLista() {
        try 
        {            
            cboxListaInquilinos.setModel(new DefaultComboBoxModel<>(_inquilinoController.montarListaInquilino()));
            txtCadastrarNomeInquilino.setText("");
            txtCadastrarCPFInquilino.setText("");
            txtCadastrarAPInquilino.setText("");
            
            _inquilinoController.setInquilino(null);
            this.habilitarDesabilitarBotoes(false);
        } catch (Exception ex) {
            Logger.getLogger(Home.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public boolean camposPreenchidos() {
        if(txtCadastrarNomeInquilino.getText().equals("") &&
           txtCadastrarCPFInquilino.getText().equals("")  &&
           txtCadastrarAPInquilino.getText().equals(""))
        {
            return false;
        }
        return true;
    }
    
    public void habilitarDesabilitarBotoes(boolean enabled) {
        if(enabled) {
            btnCadastrarVacinaInquilino.setEnabled(true);
            btnDeletarInquilino.setEnabled(true);
            btnEditarInquilino.setEnabled(true);
            lblAcessoBotoes.setText("");
        } else {
            btnCadastrarVacinaInquilino.setEnabled(false);
            btnDeletarInquilino.setEnabled(false);
            btnEditarInquilino.setEnabled(false);
            lblAcessoBotoes.setText("Selecione um Inquilino para Editar/Apagar");
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

        btnVoltarCadastroInquilino = new javax.swing.JButton();
        btnCadastrarInquilino = new javax.swing.JButton();
        btnEditarInquilino = new javax.swing.JButton();
        btnDeletarInquilino = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtCadastrarNomeInquilino = new javax.swing.JTextPane();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtCadastrarCPFInquilino = new javax.swing.JTextPane();
        jScrollPane3 = new javax.swing.JScrollPane();
        txtCadastrarAPInquilino = new javax.swing.JTextPane();
        btnCadastrarVacinaInquilino = new javax.swing.JButton();
        cboxListaInquilinos = new javax.swing.JComboBox<>();
        lblAcessoBotoes = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(500, 500));

        btnVoltarCadastroInquilino.setText("Voltar");
        btnVoltarCadastroInquilino.setPreferredSize(new java.awt.Dimension(118, 22));
        btnVoltarCadastroInquilino.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVoltarCadastroInquilinoActionPerformed(evt);
            }
        });

        btnCadastrarInquilino.setText("Cadastrar");
        btnCadastrarInquilino.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastrarInquilinoActionPerformed(evt);
            }
        });

        btnEditarInquilino.setText("Editar");
        btnEditarInquilino.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarInquilinoActionPerformed(evt);
            }
        });

        btnDeletarInquilino.setText("Apagar");
        btnDeletarInquilino.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeletarInquilinoActionPerformed(evt);
            }
        });

        txtCadastrarNomeInquilino.setBorder(javax.swing.BorderFactory.createTitledBorder("Nome do inquilino: "));
        jScrollPane1.setViewportView(txtCadastrarNomeInquilino);

        txtCadastrarCPFInquilino.setBorder(javax.swing.BorderFactory.createTitledBorder("CPF do inquilino: "));
        jScrollPane2.setViewportView(txtCadastrarCPFInquilino);

        txtCadastrarAPInquilino.setBorder(javax.swing.BorderFactory.createTitledBorder("Número do apartamento do inquilino: "));
        jScrollPane3.setViewportView(txtCadastrarAPInquilino);

        btnCadastrarVacinaInquilino.setText("Cadastrar Vacina");
        btnCadastrarVacinaInquilino.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastrarVacinaInquilinoActionPerformed(evt);
            }
        });

        cboxListaInquilinos.setBorder(javax.swing.BorderFactory.createTitledBorder("Inquilinos cadastrados:"));
        cboxListaInquilinos.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cboxListaInquilinosItemStateChanged(evt);
            }
        });
        cboxListaInquilinos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboxListaInquilinosActionPerformed(evt);
            }
        });

        lblAcessoBotoes.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblAcessoBotoes.setForeground(new java.awt.Color(0, 51, 255));
        lblAcessoBotoes.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(45, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblAcessoBotoes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 410, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 410, Short.MAX_VALUE)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 410, Short.MAX_VALUE)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(btnCadastrarInquilino)
                                    .addGap(28, 28, 28)
                                    .addComponent(btnEditarInquilino, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(btnVoltarCadastroInquilino, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnCadastrarVacinaInquilino, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnDeletarInquilino, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addComponent(cboxListaInquilinos, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(45, 45, 45))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btnCadastrarInquilino, btnCadastrarVacinaInquilino, btnDeletarInquilino, btnEditarInquilino});

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jScrollPane1, jScrollPane2, jScrollPane3});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(cboxListaInquilinos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCadastrarInquilino, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEditarInquilino)
                    .addComponent(btnDeletarInquilino))
                .addGap(30, 30, 30)
                .addComponent(btnCadastrarVacinaInquilino, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnVoltarCadastroInquilino, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(lblAcessoBotoes, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(18, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {btnCadastrarInquilino, btnDeletarInquilino, btnEditarInquilino, btnVoltarCadastroInquilino});

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {cboxListaInquilinos, jScrollPane1, jScrollPane2, jScrollPane3});

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCadastrarInquilinoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarInquilinoActionPerformed
        CadastroInquilinoRequestDto request = new CadastroInquilinoRequestDto();
       
        if(this.camposPreenchidos()) {
            String nomeInquilino = txtCadastrarNomeInquilino.getText();
            String cpfInquilino = txtCadastrarCPFInquilino.getText();
            String numeroApInquilino = txtCadastrarAPInquilino.getText();
        
            if (!nomeInquilino.matches("[a-zA-Z]+")) {
                JOptionPane.showMessageDialog(null, "O nome do inquilino deve conter apenas letras!");
                return;
            }
        
            if (!Validate.validateCPF(cpfInquilino)) {
                JOptionPane.showMessageDialog(null, "O CPF do inquilino é inválido!");
                return;
            }
        
            if (!numeroApInquilino.matches("\\d{1,4}[a-zA-Z]{0,1}")) {
                JOptionPane.showMessageDialog(null, "O número do apartamento do inquilino é inválido!");
                return;
            }
            
            request.setNomeInquilino(txtCadastrarNomeInquilino.getText());
            request.setCpfInquilino(txtCadastrarCPFInquilino.getText());
            request.setNumeroApInquilino(txtCadastrarAPInquilino.getText());

            JOptionPane.showMessageDialog(null, _inquilinoController.CadastrarInquilino(request));
            if(!_inquilinoController.erroReq)
                atualizarLista();
        }else {
            JOptionPane.showMessageDialog(null, "Favor, preencher os campos adequadamente!");
        }
    }//GEN-LAST:event_btnCadastrarInquilinoActionPerformed

    private void btnEditarInquilinoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarInquilinoActionPerformed
        InquilinoModel inquilino = (InquilinoModel)cboxListaInquilinos.getSelectedItem();
        
        if(this.camposPreenchidos()) {
            String nomeInquilino = txtCadastrarNomeInquilino.getText();
            String cpfInquilino = txtCadastrarCPFInquilino.getText();
            String numeroApInquilino = txtCadastrarAPInquilino.getText();
        
            if (!nomeInquilino.matches("[a-zA-Z]+")) {
                JOptionPane.showMessageDialog(null, "O nome do inquilino deve conter apenas letras!");
                return;
            }
        
            if (!Validate.validateCPF(cpfInquilino)) {
                JOptionPane.showMessageDialog(null, "O CPF do inquilino é inválido!");
                return;
            }
        
            if (!numeroApInquilino.matches("\\d{1,4}[a-zA-Z]{0,1}")) {
                JOptionPane.showMessageDialog(null, "O número do apartamento do inquilino é inválido!");
                return;
            }
            
            inquilino.setNome(txtCadastrarNomeInquilino.getText());
            inquilino.setCpf(txtCadastrarCPFInquilino.getText());
            inquilino.setAprtNumero(Integer.parseInt(txtCadastrarAPInquilino.getText()));

            _inquilinoController.setInquilino(inquilino);

            JOptionPane.showMessageDialog(null, _inquilinoController.atualizarInquilino());

            if(!_inquilinoController.erroReq)
                atualizarLista();
        }else {
            JOptionPane.showMessageDialog(null, "Favor, preencher os campos adequadamente!");
        }
    }//GEN-LAST:event_btnEditarInquilinoActionPerformed

    private void btnCadastrarVacinaInquilinoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarVacinaInquilinoActionPerformed
        if(_inquilinoController.inquilinoSelecionado != null) {
            TelaCadastroVacina tCadVacina = new TelaCadastroVacina();
            tCadVacina.setInquilino(_inquilinoController.inquilinoSelecionado);
            tCadVacina.setVisible(true);
            
            this.dispose();
        }
    }//GEN-LAST:event_btnCadastrarVacinaInquilinoActionPerformed

    private void btnVoltarCadastroInquilinoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltarCadastroInquilinoActionPerformed
        // TODO add your handling code here:
        this.dispose();
        
    }//GEN-LAST:event_btnVoltarCadastroInquilinoActionPerformed

    private void cboxListaInquilinosItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cboxListaInquilinosItemStateChanged
        InquilinoModel inquilino = (InquilinoModel)cboxListaInquilinos.getSelectedItem();
        
        txtCadastrarNomeInquilino.setText(inquilino.getNome());
        txtCadastrarCPFInquilino.setText(inquilino.getCpf());
        txtCadastrarAPInquilino.setText(String.valueOf(inquilino.getAprtNumero()));
        
        _inquilinoController.setInquilino(inquilino);
        this.habilitarDesabilitarBotoes(true);
    }//GEN-LAST:event_cboxListaInquilinosItemStateChanged

    private void cboxListaInquilinosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboxListaInquilinosActionPerformed
        InquilinoModel inquilino = (InquilinoModel)cboxListaInquilinos.getSelectedItem();
        
        txtCadastrarNomeInquilino.setText(inquilino.getNome());
        txtCadastrarCPFInquilino.setText(inquilino.getCpf());
        txtCadastrarAPInquilino.setText(String.valueOf(inquilino.getAprtNumero()));
        
        _inquilinoController.setInquilino(inquilino);
        this.habilitarDesabilitarBotoes(true);
    }//GEN-LAST:event_cboxListaInquilinosActionPerformed

    private void btnDeletarInquilinoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeletarInquilinoActionPerformed
        InquilinoModel inquilino = (InquilinoModel)cboxListaInquilinos.getSelectedItem();
        _inquilinoController.setInquilino(inquilino);
        
        JOptionPane.showMessageDialog(null, _inquilinoController.deletarInquilino());
        if(!_inquilinoController.erroReq)
            atualizarLista();
    }//GEN-LAST:event_btnDeletarInquilinoActionPerformed

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
            java.util.logging.Logger.getLogger(TelaCadastroInquilino.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaCadastroInquilino.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaCadastroInquilino.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaCadastroInquilino.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaCadastroInquilino().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCadastrarInquilino;
    private javax.swing.JButton btnCadastrarVacinaInquilino;
    private javax.swing.JButton btnDeletarInquilino;
    private javax.swing.JButton btnEditarInquilino;
    private javax.swing.JButton btnVoltarCadastroInquilino;
    private javax.swing.JComboBox<InquilinoModel> cboxListaInquilinos;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JLabel lblAcessoBotoes;
    private javax.swing.JTextPane txtCadastrarAPInquilino;
    private javax.swing.JTextPane txtCadastrarCPFInquilino;
    private javax.swing.JTextPane txtCadastrarNomeInquilino;
    // End of variables declaration//GEN-END:variables
}
