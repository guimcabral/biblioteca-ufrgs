/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package InterfacesGraficas;

import ClassesAtributo.Biblioteca;

/**
 *
 * @author Guilherme Cabral
 */
public class MenuDadosUser extends javax.swing.JFrame {

    /**
     * Creates new form MenuDadosUser
     */
    public MenuDadosUser() {
        initComponents();
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
        labNome = new javax.swing.JLabel();
        labID = new javax.swing.JLabel();
        labEmail = new javax.swing.JLabel();
        labCPF = new javax.swing.JLabel();
        labNascimento = new javax.swing.JLabel();
        labVinculo = new javax.swing.JLabel();
        labNome2 = new javax.swing.JLabel();
        labID2 = new javax.swing.JLabel();
        labEmail2 = new javax.swing.JLabel();
        labCPF2 = new javax.swing.JLabel();
        labNascimento2 = new javax.swing.JLabel();
        labVinculo2 = new javax.swing.JLabel();
        butDeletar = new javax.swing.JButton();
        butCancelar = new javax.swing.JButton();

        setTitle("Deletar");
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        labNome.setText("Nome:");

        labID.setText("ID:");

        labEmail.setText("E-mail:");

        labCPF.setText("CPF:");

        labNascimento.setText("Nascimento:");

        labVinculo.setText("Vínculo:");

        butDeletar.setText("Deletar");
        butDeletar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butDeletarActionPerformed(evt);
            }
        });

        butCancelar.setText("Cancelar");
        butCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butCancelarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(70, 70, 70)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(labID)
                    .addComponent(labNome)
                    .addComponent(labEmail)
                    .addComponent(labCPF)
                    .addComponent(labNascimento)
                    .addComponent(labVinculo))
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labNome2)
                    .addComponent(labEmail2)
                    .addComponent(labID2)
                    .addComponent(labCPF2)
                    .addComponent(labNascimento2)
                    .addComponent(labVinculo2))
                .addGap(70, 70, 70))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(butDeletar)
                .addGap(30, 30, 30)
                .addComponent(butCancelar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labNome)
                    .addComponent(labNome2, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labID2, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labID, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labEmail)
                    .addComponent(labEmail2, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(labCPF2, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(labNascimento2, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(labVinculo2, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(labCPF)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(labNascimento)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(labVinculo)))
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(butDeletar)
                    .addComponent(butCancelar))
                .addGap(50, 50, 50))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void butDeletarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butDeletarActionPerformed
        if (butDeletar.getText() == "Deletar")
        {System.out.println("del");
        Biblioteca.removeUser(labID2.getText());
        }
        dispose();
    }//GEN-LAST:event_butDeletarActionPerformed

    private void butCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butCancelarActionPerformed
        dispose();
    }//GEN-LAST:event_butCancelarActionPerformed

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
            java.util.logging.Logger.getLogger(MenuDadosUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuDadosUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuDadosUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuDadosUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuDadosUser().setVisible(true);
            }
        });
    }
    
    //Setter
    public void setTextLabNome(String s)
    {
        labNome2.setText(s);
    }
    public void setTextLabID(String s)
    {
        labID2.setText(s);
    }
    public void setTextLabEmail(String s)
    {
        labEmail2.setText(s);
    }
    public void setTextLabCPF(String s)
    {
        labCPF2.setText(s);
    }
    public void setTextLabNascimento(String s)
    {
        labNascimento2.setText(s);
    }
    public void setTextLabVinculo(String s)
    {
        labVinculo2.setText(s);
    }
    public void setTextButDeletar(String s)
    {
        butDeletar.setText(s);
    }
    
 
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton butCancelar;
    private javax.swing.JButton butDeletar;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel labCPF;
    private javax.swing.JLabel labCPF2;
    private javax.swing.JLabel labEmail;
    private javax.swing.JLabel labEmail2;
    private javax.swing.JLabel labID;
    private javax.swing.JLabel labID2;
    private javax.swing.JLabel labNascimento;
    private javax.swing.JLabel labNascimento2;
    private javax.swing.JLabel labNome;
    private javax.swing.JLabel labNome2;
    private javax.swing.JLabel labVinculo;
    private javax.swing.JLabel labVinculo2;
    // End of variables declaration//GEN-END:variables
}
