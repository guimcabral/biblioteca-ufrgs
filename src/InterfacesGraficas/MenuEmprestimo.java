/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package InterfacesGraficas;

import ClassesAtributo.Aluno;
import ClassesAtributo.Biblioteca;
import ClassesAtributo.Documento;
import ClassesAtributo.Livro;
import ClassesAtributo.Periodico;
import ClassesAtributo.Usuario;
import java.text.DateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

/**
 *
 * @author Guilherme Cabral
 */
public class MenuEmprestimo extends javax.swing.JFrame {

    /**
     * Creates new form MenuEmprestimo
     */
    
    private int testeConf;
            
    public MenuEmprestimo() {
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
        labIDUser = new javax.swing.JLabel();
        labIDDoc = new javax.swing.JLabel();
        butRetirar = new javax.swing.JButton();
        fieldIDUser = new javax.swing.JTextField();
        fieldIDDoc = new javax.swing.JTextField();

        setTitle("Empréstimo");
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setToolTipText("Menu Empréstimo");

        labIDUser.setText("ID Usuário:");

        labIDDoc.setText("ID Documento:");

        butRetirar.setText("Retirar");
        butRetirar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butRetirarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(70, 70, 70)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(labIDDoc)
                            .addComponent(labIDUser))
                        .addGap(30, 30, 30)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(fieldIDUser)
                            .addComponent(fieldIDDoc, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(169, 169, 169)
                        .addComponent(butRetirar)))
                .addGap(70, 70, 70))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labIDUser)
                    .addComponent(fieldIDUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labIDDoc)
                    .addComponent(fieldIDDoc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addComponent(butRetirar)
                .addGap(50, 50, 50))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void butRetirarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butRetirarActionPerformed
        if (ClassesAtributo.Biblioteca.testaIDUser(fieldIDUser.getText()))
        {
            if (ClassesAtributo.Biblioteca.testaIDDoc(fieldIDDoc.getText()))
            {
                MenuConfirmacaoEmprestimo menuConfEmp = new MenuConfirmacaoEmprestimo();

                switch (testeConf)
                {
                    case 1:
                    {
                        menuConfEmp.pack();
                        menuConfEmp.setLocationRelativeTo(null);
                    } break;
                    case 2:
                    {
                        menuConfEmp.pack();
                        menuConfEmp.setLocationRelativeTo(null);
                        menuConfEmp.setTitle("Confirmação Consulta");
                    } break;
                    case 3:
                    {
                        menuConfEmp.pack();
                        menuConfEmp.setLocationRelativeTo(null);
                        menuConfEmp.setTitle("Confirmação Devolução");
                    }
                }
                
                Biblioteca.setIDAuxiliar(fieldIDUser.getText());
                Biblioteca.setIDAuxiliar2(fieldIDDoc.getText());
                
                Usuario user = Biblioteca.user(fieldIDUser.getText());
                Documento doc = Biblioteca.doc(fieldIDDoc.getText());

                menuConfEmp.setLabNomeUser(user.getNome());
                menuConfEmp.setLabIDUser(user.getID());
                menuConfEmp.setLabNomeDoc(doc.getTitulo());
                if (menuConfEmp.getTitle() != "Confirmação Consulta")
                {
                    Calendar dtDevolucao = Calendar.getInstance();
                    DateFormat formatador = DateFormat.getDateInstance(DateFormat.SHORT, new Locale("pt", "BR"));
                   if (user instanceof Aluno)
                   {
                       dtDevolucao.add(Calendar.DAY_OF_YEAR, 7);
                       menuConfEmp.setLabDevolucao(formatador.format(dtDevolucao.getTime()));
                   }
                   else
                   {
                       dtDevolucao.add(Calendar.DAY_OF_YEAR, 15);
                       menuConfEmp.setLabDevolucao(formatador.format(dtDevolucao.getTime()));
                   }
                }
                else
                {
                    menuConfEmp.setLabDevolucao("Consulta Local");
                }
                menuConfEmp.pack();
                menuConfEmp.setLocationRelativeTo(null);
                menuConfEmp.setLabIDDoc(doc.getID());
                menuConfEmp.setVisible(true);
                dispose();                
                
            }
            else
            {
                TelaErro msgErro = new TelaErro();
                msgErro.setTextLabErro("A ID do Documento não existe.");
                msgErro.pack();
                msgErro.setLocationRelativeTo(null);
                msgErro.setVisible(true);
            }
        }
        else
        {
            TelaErro msgErro = new TelaErro();
            msgErro.setTextLabErro("A ID do Usuário não existe.");
            msgErro.pack();
            msgErro.setLocationRelativeTo(null);
            msgErro.setVisible(true);
        }
    }//GEN-LAST:event_butRetirarActionPerformed

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
            java.util.logging.Logger.getLogger(MenuEmprestimo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuEmprestimo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuEmprestimo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuEmprestimo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuEmprestimo().setVisible(true);
            }
        });
    }
    
    public void setTesteConf(int i)
    {
        testeConf = i;
    }
    
    public void setButDev()
    {
        butRetirar.setText("Repor");
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton butRetirar;
    private javax.swing.JTextField fieldIDDoc;
    private javax.swing.JTextField fieldIDUser;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel labIDDoc;
    private javax.swing.JLabel labIDUser;
    // End of variables declaration//GEN-END:variables
}