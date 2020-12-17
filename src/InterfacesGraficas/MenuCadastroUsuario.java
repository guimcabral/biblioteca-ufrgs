/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package InterfacesGraficas;

import ClassesAtributo.Aluno;
import ClassesAtributo.Professor;
import ClassesAtributo.Biblioteca;
import java.awt.event.KeyEvent;

/**
 *
 * @author Guilherme Cabral
 */
public class MenuCadastroUsuario extends javax.swing.JFrame {

    /**
     * Creates new form MenuCadastroUsuario
     */
    
           
    public MenuCadastroUsuario() {
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

        jFrame1 = new javax.swing.JFrame();
        jPanel1 = new javax.swing.JPanel();
        labNome = new javax.swing.JLabel();
        labID = new javax.swing.JLabel();
        labEmail = new javax.swing.JLabel();
        labCPF = new javax.swing.JLabel();
        labNascimento = new javax.swing.JLabel();
        labVinculo = new javax.swing.JLabel();
        fieldNome = new javax.swing.JTextField();
        fieldID = new javax.swing.JTextField();
        fieldEmail = new javax.swing.JTextField();
        fieldCPF = new javax.swing.JTextField();
        fieldNascimento = new javax.swing.JTextField();
        cBoxVinculo = new javax.swing.JComboBox();
        butConfirmar = new javax.swing.JButton();
        butCancelar = new javax.swing.JButton();

        javax.swing.GroupLayout jFrame1Layout = new javax.swing.GroupLayout(jFrame1.getContentPane());
        jFrame1.getContentPane().setLayout(jFrame1Layout);
        jFrame1Layout.setHorizontalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jFrame1Layout.setVerticalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        setTitle("Cadastro Usuário");
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        labNome.setText("Nome:");

        labID.setText("ID:");

        labEmail.setText("CPF:");

        labCPF.setText("E-mail:");

        labNascimento.setText("Nascimento");

        labVinculo.setText("Vínculo:");

        fieldID.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                fieldIDKeyTyped(evt);
            }
        });

        fieldCPF.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                fieldCPFKeyTyped(evt);
            }
        });

        fieldNascimento.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                fieldNascimentoKeyTyped(evt);
            }
        });

        cBoxVinculo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Aluno", "Professor" }));

        butConfirmar.setText("Cadastrar");
        butConfirmar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butConfirmarActionPerformed(evt);
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
                    .addComponent(labNome)
                    .addComponent(labID)
                    .addComponent(labNascimento)
                    .addComponent(labVinculo)
                    .addComponent(labEmail)
                    .addComponent(labCPF))
                .addGap(36, 36, 36)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(fieldNascimento)
                            .addComponent(fieldCPF)
                            .addComponent(fieldEmail)
                            .addComponent(fieldID, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cBoxVinculo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(70, 70, 70))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(fieldNome, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(butConfirmar)
                .addGap(50, 50, 50)
                .addComponent(butCancelar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {fieldID, fieldNome});

        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labNome)
                    .addComponent(fieldNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labID)
                    .addComponent(fieldID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(fieldEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labCPF))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(fieldCPF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labEmail))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labNascimento)
                    .addComponent(fieldNascimento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labVinculo)
                    .addComponent(cBoxVinculo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(butConfirmar)
                    .addComponent(butCancelar))
                .addContainerGap(50, Short.MAX_VALUE))
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
    
    // Fecha a janela ao clicar no botão "Cancelar".
    private void butCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butCancelarActionPerformed
        dispose();
    }//GEN-LAST:event_butCancelarActionPerformed

    private void butConfirmarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butConfirmarActionPerformed
        // TODO add your handling code here:
        if (butConfirmar.getText() == "Cadastrar")
        {
            testeErroECadastro();
        }
        else
        {
            Biblioteca.removeUser(Biblioteca.getIDAuxiliar());
            System.out.println(Biblioteca.getIDAuxiliar());
            System.out.println(fieldID.getText());
            testeErroECadastro();
        }
    }//GEN-LAST:event_butConfirmarActionPerformed

    private void fieldIDKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_fieldIDKeyTyped
        // TODO add your handling code here:
        char c = evt.getKeyChar();
        if (!(Character.isDigit(c) || c == KeyEvent.VK_BACK_SPACE || c == KeyEvent.VK_DELETE) || fieldID.getText().length() == 8)
        {
            evt.consume();
        }
    }//GEN-LAST:event_fieldIDKeyTyped

    
    // Impossibilita o usuário de entrar qualquer caractere que não seja número no campo CPF e arruma o formato do mesmo,
    // colocando pontos (.), três ao total, e traço (-), apenas um. (Ex: 666.666.666-66)
    // Também impossibilita que o usuário coloque mais números do que o necessário.
    private void fieldCPFKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_fieldCPFKeyTyped
        // Variável que recebe o último caractere digitado no campo CPF pelo usuário.
        char c = evt.getKeyChar();
        
        // Testa se o usuário entrou algum caractere que não seja um número e o apaga.
        // Também testa se o limite de caracteres já foi excedido e apaga o caractere excedido.
        if (!(Character.isDigit(c) || c == KeyEvent.VK_BACK_SPACE || c == KeyEvent.VK_DELETE) || fieldCPF.getText().length() == 14)
        {
            evt.consume();
        }
        
        // Testa se a última tecla digitada no campo CPF não foi um backspace. Esse teste serve para poder apagar o cpf inteiro somente pelo
        // backspace. Caso não houvesse esse teste, ele sempre imprimiria no campo CPF um ponto ou um traço em algum lugar quando o número 
        // de caracteres no campo fosse igual a 3, 7, ou 11. Por exemplo, se eu apagasse o 12º caractere, o programa colocaria um traço (-) e eu ficaria com
        // 12 caracteres novamente.
        if (c != KeyEvent.VK_BACK_SPACE)
        {
            // Testa a quantidade de caracteres já impressos no campo CPF e imprime um ponto (.) ou um traço (-) para arrumar
            // o formato do CPF.
            if (fieldCPF.getText().length() == 3 || fieldCPF.getText().length() == 7 || fieldCPF.getText().length() == 11)
            {
                if (fieldCPF.getText().length() == 11)
                {
                    fieldCPF.setText(fieldCPF.getText()+"-");
                }
                else
                {
                    fieldCPF.setText(fieldCPF.getText()+".");
                }
            }
        }
    }//GEN-LAST:event_fieldCPFKeyTyped

    // Funciona da mesma forma que a função fieldCPFKeyTyped.
    private void fieldNascimentoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_fieldNascimentoKeyTyped
        char c = evt.getKeyChar();
        
        if (!(Character.isDigit(c) || c == KeyEvent.VK_BACK_SPACE || c == KeyEvent.VK_DELETE) || fieldNascimento.getText().length() == 10)
        {
            evt.consume();
        }

        if (c != KeyEvent.VK_BACK_SPACE)
        {
            if (fieldNascimento.getText().length() == 2 || fieldNascimento.getText().length() == 5)
            {
                fieldNascimento.setText(fieldNascimento.getText()+"/");                
            }
        }
    }//GEN-LAST:event_fieldNascimentoKeyTyped

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
            java.util.logging.Logger.getLogger(MenuCadastroUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuCadastroUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuCadastroUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuCadastroUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuCadastroUsuario().setVisible(true);
            }
        });
    }
    
        
    //Setters para os campos de texto
    public void setTextButConfirmar(String s)
    {
        butConfirmar.setText(s);
    }
    public void setTextFieldNome(String s)
    {
        fieldNome.setText(s);
    }
    public void setTextFieldID(String s)
    {
        fieldID.setText(s);
    }
    public void setTextFieldEmail(String s)
    {
        fieldEmail.setText(s);
    }
    public void setTextFieldCPF(String s)
    {
        fieldCPF.setText(s);
    }
    public void setTextFieldNascimento(String s)
    {
        fieldNascimento.setText(s);
    }
    //Setter para a box
    public void setBox(String s) 
    {
        cBoxVinculo.setSelectedItem(s);
    }
    
    // Testa se toddos os campos estão preenchidos corretamente.
    // Cada if é auto-explicativo, basta ler o seu else.
    public void testeErroECadastro()
    {
        String erro = "";
        boolean error = false;
        
        if (!fieldNome.getText().equals(""))
        {
            if (fieldID.getText().length() == 8)
            {
                if (!fieldEmail.getText().equals(""))
                {
                    if (fieldCPF.getText().length() == 14)
                    {
                        if (fieldNascimento.getText().length() == 10)
                        {
                            error = ClassesAtributo.Biblioteca.testaIDUser(fieldID.getText());
                            
                            if (error == false)
                            {
                                cadastroUsuario();
                                dispose();
                            }
                            else
                            {
                                erro = "ID já cadastrada.";
                            }
                        }
                        else
                        {
                            erro = "Campo Nascimento precisa estar no formato dd/mm/aaaa";
                            error = true;
                        }
                    }
                    else
                    {
                        erro = "Campo CPF precisa contem 11 números.";
                        error = true;
                    }
                }
                else
                {
                    erro = "Campo Email está vazio.";
                    error = true;
                }
            }
            else
            {
                erro = "Campo ID precisa conter 8 números.";
                error = true;
            }
        }
        else
        {
            erro = "Campo Nome está vazio.";
            error = true;
        }
        
        if (error == true)
        {
            TelaErro msgErro = new TelaErro();
            msgErro.setTextLabErro(erro);
            msgErro.pack();
            msgErro.setLocationRelativeTo(null);
            msgErro.setVisible(true);
        }       
    }
       
    public void cadastroUsuario()
    {
        if (cBoxVinculo.getSelectedItem() == "Aluno")
        {
            ClassesAtributo.Aluno a = new Aluno(fieldNome.getText(), fieldEmail.getText(), fieldNascimento.getText(), fieldCPF.getText(), fieldID.getText());
            ClassesAtributo.Biblioteca.setUser(a);
            System.out.println("a");
        }
        else
        {
            Professor p = new Professor(fieldNome.getText(), fieldEmail.getText(), fieldNascimento.getText(), fieldCPF.getText(), fieldID.getText());
            ClassesAtributo.Biblioteca.setUser(p);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton butCancelar;
    private javax.swing.JButton butConfirmar;
    private javax.swing.JComboBox cBoxVinculo;
    private javax.swing.JTextField fieldCPF;
    private javax.swing.JTextField fieldEmail;
    private javax.swing.JTextField fieldID;
    private javax.swing.JTextField fieldNascimento;
    private javax.swing.JTextField fieldNome;
    private javax.swing.JFrame jFrame1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel labCPF;
    private javax.swing.JLabel labEmail;
    private javax.swing.JLabel labID;
    private javax.swing.JLabel labNascimento;
    private javax.swing.JLabel labNome;
    private javax.swing.JLabel labVinculo;
    // End of variables declaration//GEN-END:variables

}
