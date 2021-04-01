/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import static java.lang.Double.isNaN;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Júlia
 */
public class TelaLogin extends javax.swing.JFrame {

    /**
     * Creates new form TelaLogin
     */
    public TelaLogin() {
        initComponents();
    }
    
     public boolean soContemNumeros(String texto) {  
        if(texto == null)  
            return false;  
        for (char letra : texto.toCharArray())  
            if(letra < '0' || letra > '9')  
                return false;  
        return true;  
          
    }  

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        loginField = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jButton5 = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        passwordField = new javax.swing.JPasswordField();
        jPanel5 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("MoView Login Interface");
        setIconImages(null);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Prepare a pipoca e desligue o celular!");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 90, 270, 33));

        loginField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginFieldActionPerformed(evt);
            }
        });
        getContentPane().add(loginField, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 170, 240, 30));

        jPanel2.setBackground(new java.awt.Color(33, 73, 113));
        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel2.setLayout(null);

        jLabel6.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("ID de usuário");
        jPanel2.add(jLabel6);
        jLabel6.setBounds(10, 0, 88, 17);

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 150, 110, 30));

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton1.setForeground(new java.awt.Color(51, 51, 51));
        jButton1.setText("Entrar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 270, 70, 30));

        jPanel3.setBackground(new java.awt.Color(33, 73, 113));
        jPanel3.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel3.setLayout(null);

        jLabel9.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("É totalmente grátis!");
        jPanel3.add(jLabel9);
        jLabel9.setBounds(20, 40, 179, 19);

        jLabel11.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("É novo por aqui? Cadastre-se. ");
        jPanel3.add(jLabel11);
        jLabel11.setBounds(20, 10, 209, 23);

        jButton5.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton5.setForeground(new java.awt.Color(51, 51, 51));
        jButton5.setText("Cadastrar-me agora");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton5);
        jButton5.setBounds(20, 70, 200, 34);

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 320, 240, 120));

        jPanel4.setBackground(new java.awt.Color(33, 73, 113));
        jPanel4.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel4.setLayout(null);

        jLabel12.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Aproveite o seu filme!");
        jPanel4.add(jLabel12);
        jLabel12.setBounds(10, 0, 170, 30);

        getContentPane().add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 270, 240, 30));

        passwordField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passwordFieldActionPerformed(evt);
            }
        });
        getContentPane().add(passwordField, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 230, 240, 30));

        jPanel5.setBackground(new java.awt.Color(33, 73, 113));
        jPanel5.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel5.setLayout(null);

        jLabel5.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Senha de acesso");
        jPanel5.add(jLabel5);
        jLabel5.setBounds(10, 0, 115, 19);

        getContentPane().add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 210, 130, 30));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagem/Moview-Logo.png"))); // NOI18N
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 10, 350, 80));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagem/BGLogin.gif"))); // NOI18N
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 340, 470));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        Arquivo arq = new Arquivo();
        boolean achou=false;
                
        if (this.loginField.getText().isEmpty()==false && this.passwordField.getText().isEmpty()==false) {
            
            if (!this.soContemNumeros(loginField.getText())) {   
                     ArrayList<Administrador> admins = arq.leArquivoAdmin();
                     boolean encontrou = false;
                     for (Administrador a:admins) {
                         if (a.getNickName().equals(loginField.getText())) {
                             if (a.getSenha().equals(passwordField.getText())) {
                                 JOptionPane.showMessageDialog(this, "Administrador logado com sucesso!");
                                 encontrou=true;
                                 break;
                             }
                         }
                     }

                     if (!encontrou) {
                         JOptionPane.showMessageDialog(this, "Login ou senha incorretos!");
                     } else {
                         TelaAdmin ta = new TelaAdmin();
                         this.hide(); 
                         ta.show();
                         Administrador ad = new Administrador(loginField.getText(), passwordField.getText());
                         ta.copiaUsuario(arq.leArquivoUsuario(), ad);
                     }

                 } else {  
                     ArrayList<Usuario> usuarios = arq.leArquivoUsuario();
                     Usuario u = new Usuario();
                     for (Usuario usuario:usuarios) {
                         if (usuario.getIdUsuario()==Integer.parseInt(loginField.getText())) {
                             if (usuario.getSenha().equals(passwordField.getText())) {
                                 JOptionPane.showMessageDialog(this, "Logado com sucesso!");
                                 u = usuario;
                                 achou=true;
                                 break;
                             }
                         }
                     }
                     if (achou==false) {
                         JOptionPane.showMessageDialog(this, "Login ou senha incorretos!");
                     } else {
                         this.dispose();
                         TelaPrincipal tp = new TelaPrincipal();
                         tp.setTelaLogin(this);
                         tp.setUsuario(u);
                         tp.labelidUsario(loginField.getText());
                         tp.constrirTabelaFilmesAssistidos(arq.exibeListaDeFilmesAssistida(new Usuario(Integer.parseInt(loginField.getText()))));
                         tp.show();
                     }
                }         
            
        } else {
            JOptionPane.showMessageDialog(rootPane, "Preencha todos os campos!");
        }
   
    }//GEN-LAST:event_jButton1ActionPerformed

    private void passwordFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passwordFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_passwordFieldActionPerformed

    private void loginFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_loginFieldActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        TelaCadastro tc = new TelaCadastro();
        this.hide();
        tc.setTelaLogin(this);
        tc.show();
    }//GEN-LAST:event_jButton5ActionPerformed

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
            java.util.logging.Logger.getLogger(TelaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaLogin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JTextField loginField;
    private javax.swing.JPasswordField passwordField;
    // End of variables declaration//GEN-END:variables
}
