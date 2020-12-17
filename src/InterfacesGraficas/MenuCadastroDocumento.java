/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package InterfacesGraficas;
import ClassesAtributo.Biblioteca;
import ClassesAtributo.Dissertacao;
import ClassesAtributo.Livro;
import ClassesAtributo.ObraRara;
import ClassesAtributo.Periodico;
import ClassesAtributo.Tese;
import java.awt.event.KeyEvent;
import static java.lang.Integer.parseInt;
/**
 *
 * @author Guilherme Cabral
 */
public class MenuCadastroDocumento extends javax.swing.JFrame {

    /**
     * Creates new form MenuCadastroDocumento
     */
    public MenuCadastroDocumento() {
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
        labTitulo = new javax.swing.JLabel();
        labID = new javax.swing.JLabel();
        labAutor = new javax.swing.JLabel();
        labAssunto = new javax.swing.JLabel();
        labAno = new javax.swing.JLabel();
        labPaginas = new javax.swing.JLabel();
        labQuantia = new javax.swing.JLabel();
        fieldTitulo = new javax.swing.JTextField();
        fieldID = new javax.swing.JTextField();
        fieldAutor = new javax.swing.JTextField();
        fieldAssunto = new javax.swing.JTextField();
        fieldAno = new javax.swing.JTextField();
        fieldPaginas = new javax.swing.JTextField();
        fieldQuantia = new javax.swing.JTextField();
        butCadastrar = new javax.swing.JButton();
        butCancelar = new javax.swing.JButton();
        cBoxTipo = new javax.swing.JComboBox();
        labTipo = new javax.swing.JLabel();

        setTitle("Cadastro Documento");
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        labTitulo.setText("Título:");

        labID.setText("ID:");

        labAutor.setText("Autor:");

        labAssunto.setText("Assunto:");

        labAno.setText("Ano:");

        labPaginas.setText("Páginas:");

        labQuantia.setText("Quantia:");

        fieldID.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                fieldIDKeyTyped(evt);
            }
        });

        fieldAno.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                fieldAnoKeyTyped(evt);
            }
        });

        fieldPaginas.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                fieldPaginasKeyTyped(evt);
            }
        });

        fieldQuantia.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                fieldQuantiaKeyTyped(evt);
            }
        });

        butCadastrar.setText("Cadastrar");
        butCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butCadastrarActionPerformed(evt);
            }
        });

        butCancelar.setText("Cancelar");
        butCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butCancelarActionPerformed(evt);
            }
        });

        cBoxTipo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Dissertação", "Livro", "Obra Rara", "Periódico", "Tese" }));

        labTipo.setText("Tipo:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(butCadastrar)
                .addGap(50, 50, 50)
                .addComponent(butCancelar)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(70, 70, 70)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(labTitulo)
                    .addComponent(labID)
                    .addComponent(labAutor)
                    .addComponent(labAssunto)
                    .addComponent(labAno)
                    .addComponent(labPaginas)
                    .addComponent(labQuantia)
                    .addComponent(labTipo))
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(fieldID)
                    .addComponent(fieldAutor)
                    .addComponent(fieldAssunto)
                    .addComponent(fieldAno)
                    .addComponent(fieldPaginas)
                    .addComponent(fieldQuantia)
                    .addComponent(fieldTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE)
                    .addComponent(cBoxTipo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(70, 70, 70))
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {fieldAno, fieldAssunto, fieldAutor, fieldID, fieldPaginas, fieldQuantia, fieldTitulo});

        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labTitulo)
                    .addComponent(fieldTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labID)
                    .addComponent(fieldID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labAutor)
                    .addComponent(fieldAutor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labAssunto)
                    .addComponent(fieldAssunto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labAno)
                    .addComponent(fieldAno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labPaginas)
                    .addComponent(fieldPaginas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labQuantia)
                    .addComponent(fieldQuantia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(4, 4, 4)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cBoxTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labTipo))
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(butCadastrar)
                    .addComponent(butCancelar))
                .addGap(50, 50, 50))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void butCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butCadastrarActionPerformed
        if (butCadastrar.getText() == "Cadastrar")
        {
            testeErroECadastro();
        }
        else
        {
            Biblioteca.removeDoc(Biblioteca.getIDAuxiliar());
            System.out.println(Biblioteca.getIDAuxiliar());
            System.out.println(fieldID.getText());
            testeErroECadastro();
        }
    }//GEN-LAST:event_butCadastrarActionPerformed

    private void butCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butCancelarActionPerformed
        dispose();
    }//GEN-LAST:event_butCancelarActionPerformed

    private void fieldIDKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_fieldIDKeyTyped
        char c = evt.getKeyChar();
        if (!(Character.isDigit(c) || c == KeyEvent.VK_BACK_SPACE || c == KeyEvent.VK_DELETE) || fieldID.getText().length() == 5)
        {
            evt.consume();
        }
    }//GEN-LAST:event_fieldIDKeyTyped

    private void fieldAnoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_fieldAnoKeyTyped
        char c = evt.getKeyChar();
        if (!(Character.isDigit(c) || c == KeyEvent.VK_BACK_SPACE || c == KeyEvent.VK_DELETE) || fieldAno.getText().length() == 4)
        {
            evt.consume();
        }
    }//GEN-LAST:event_fieldAnoKeyTyped

    private void fieldPaginasKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_fieldPaginasKeyTyped
        char c = evt.getKeyChar();
        if (!(Character.isDigit(c) || c == KeyEvent.VK_BACK_SPACE || c == KeyEvent.VK_DELETE))
        {
            evt.consume();
        }
    }//GEN-LAST:event_fieldPaginasKeyTyped

    private void fieldQuantiaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_fieldQuantiaKeyTyped
        char c = evt.getKeyChar();
        if (!(Character.isDigit(c) || c == KeyEvent.VK_BACK_SPACE || c == KeyEvent.VK_DELETE))
        {
            evt.consume();
        }
    }//GEN-LAST:event_fieldQuantiaKeyTyped

    public void testeErroECadastro()
    {
        String erro = "";
        boolean error = false;
        
        if (!fieldTitulo.getText().equals(""))
        {
            if (fieldID.getText().length() == 5)
            {
                if (!fieldAutor.getText().equals(""))
                {
                    if (!fieldAssunto.getText().equals(""))
                    {
                        if (fieldAno.getText().length() == 4)
                        {System.out.println("dentro if ano");
                            if (!fieldPaginas.getText().equals(""))
                            {
                                if (parseInt(fieldPaginas.getText()) > 0)
                                {System.out.println("dentro do if pag");
                                    if (!fieldQuantia.getText().equals(""))
                                    {
                                        if (parseInt(fieldQuantia.getText()) > 0)
                                        {System.out.println("dentro if quant");
                                            error = ClassesAtributo.Biblioteca.testaIDDoc(fieldID.getText());

                                            if (error == false)
                                            {
                                               cadastroDocumento();
                                                dispose();
                                            }
                                            else
                                            {
                                               erro = "ID já cadastrada.";
                                            }
                                        }
                                        else
                                        {
                                            erro = "A Quantia precisa ser maior que 0.";
                                            error = true;
                                        }
                                    }
                                    else
                                    {
                                        erro = "O campo Quantia está em branco.";
                                        error = true;
                                    }
                                }
                                else
                                {
                                    erro = "O número de Páginas precisa ser maior que 0.";
                                    error = true;
                                }
                            }
                            else
                            {
                                erro = "O campo Páginas está em branco.";
                                error = true;
                            }
                        }
                        else
                        {
                            erro = "Campo Ano precisa conter 4 números";
                            error = true;
                        }
                    }
                    else
                    {
                        erro = "Campo Assunto está vazio.";
                        error = true;
                    }
                }
                else
                {
                    erro = "Campo Autor está vazio.";
                    error = true;
                }
            }
            else
            {
                erro = "Campo ID precisa conter 5 números.";
                error = true;
            }
        }
        else
        {
            erro = "Campo Título está vazio.";
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
    
    public void cadastroDocumento()
    {
        String tipo;
        tipo = (String) cBoxTipo.getSelectedItem();
        
        switch (tipo)
        {
            case "Dissertação":
                ClassesAtributo.Dissertacao d = new Dissertacao(fieldTitulo.getText(), fieldID.getText(), fieldAutor.getText(), fieldAssunto.getText(), fieldAno.getText(), fieldPaginas.getText(), Integer.parseInt(fieldQuantia.getText()));
                ClassesAtributo.Biblioteca.setDoc(d);
                System.out.println("d");
                break;
                
            case "Livro":
                ClassesAtributo.Livro l = new Livro(fieldTitulo.getText(), fieldID.getText(), fieldAutor.getText(), fieldAssunto.getText(), fieldAno.getText(), fieldPaginas.getText(), Integer.parseInt(fieldQuantia.getText()));
                ClassesAtributo.Biblioteca.setDoc(l);
                System.out.println("l");
                break;
                
            case "Obra Rara":
                ClassesAtributo.ObraRara o = new ObraRara(fieldTitulo.getText(), fieldID.getText(), fieldAutor.getText(), fieldAssunto.getText(), fieldAno.getText(), fieldPaginas.getText(), Integer.parseInt(fieldQuantia.getText()));
                ClassesAtributo.Biblioteca.setDoc(o);
                System.out.println("o");
                break;
                
            case "Periódico":
                ClassesAtributo.Periodico p = new Periodico(fieldTitulo.getText(), fieldID.getText(), fieldAutor.getText(), fieldAssunto.getText(), fieldAno.getText(), fieldPaginas.getText(), Integer.parseInt(fieldQuantia.getText()));
                ClassesAtributo.Biblioteca.setDoc(p);
                System.out.println("p");
                break;
                
            case "Tese":
                ClassesAtributo.Tese t = new Tese(fieldTitulo.getText(), fieldID.getText(), fieldAutor.getText(), fieldAssunto.getText(), fieldAno.getText(), fieldPaginas.getText(), Integer.parseInt(fieldQuantia.getText()));
                ClassesAtributo.Biblioteca.setDoc(t);
                System.out.println("t");                
        }
    }
    
    public void setTextButCadastrar(String s) 
    {
        butCadastrar.setText(s);
    }
    //Setters para os campos de texto
    public void setTextFieldTitulo(String s)
    {
        fieldTitulo.setText(s);
    }
    public void setTextFieldID(String s)
    {
        fieldID.setText(s);
    }
    public void setTextFieldAutor(String s)
    {
        fieldAutor.setText(s);
    }
    public void setTextFieldAssunto(String s)
    {
        fieldAssunto.setText(s);
    }
    public void setTextFieldAno(String s)
    {
        fieldAno.setText(s);
    }
    public void setTextFieldPaginas(String s)
    {
        fieldPaginas.setText(s);
    }
        public void setTextFieldQuantia(String s)
    {
        fieldQuantia.setText(s);
    }
        
    //Setter para a box
    public void setBox(String s) 
    {
        cBoxTipo.setSelectedItem(s);
    }
        
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
            java.util.logging.Logger.getLogger(MenuCadastroDocumento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuCadastroDocumento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuCadastroDocumento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuCadastroDocumento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuCadastroDocumento().setVisible(true);
            }
        });
    }
    
   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton butCadastrar;
    private javax.swing.JButton butCancelar;
    private javax.swing.JComboBox cBoxTipo;
    private javax.swing.JTextField fieldAno;
    private javax.swing.JTextField fieldAssunto;
    private javax.swing.JTextField fieldAutor;
    private javax.swing.JTextField fieldID;
    private javax.swing.JTextField fieldPaginas;
    private javax.swing.JTextField fieldQuantia;
    private javax.swing.JTextField fieldTitulo;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel labAno;
    private javax.swing.JLabel labAssunto;
    private javax.swing.JLabel labAutor;
    private javax.swing.JLabel labID;
    private javax.swing.JLabel labPaginas;
    private javax.swing.JLabel labQuantia;
    private javax.swing.JLabel labTipo;
    private javax.swing.JLabel labTitulo;
    // End of variables declaration//GEN-END:variables

}