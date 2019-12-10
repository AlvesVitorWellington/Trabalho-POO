/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package univs.edu.telasUsuario;

import javax.swing.JOptionPane;
import univs.edu.usuario.Usuario;
import univs.edu.usuario.UsuarioDAO;

/**
 *
 * @author Lucas007
 */
public class EditarUsuario extends javax.swing.JFrame {

    Usuario usuario = new Usuario();
    UsuarioDAO dao = new UsuarioDAO();

    public EditarUsuario() {
        initComponents();

    }

    public void atualizarCampos() {
        usuario = Usuario.usuario;
        tfEditarEmail.setText(usuario.getEmail());
        tfEditarNome.setText(usuario.getNomeUsuario());
        tfEditarSenha.setText(usuario.getSenha());
        tfEditarCidade.setText(usuario.getCidadeUsuario());
        tfEditarRua.setText(usuario.getRuaUsuario());
        tfEditarNumero.setText(usuario.getNumeroUsuario());

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
        jLabel3 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        tfEditarNome = new javax.swing.JTextField();
        tfEditarCidade = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        tfEditarEmail = new javax.swing.JTextField();
        tfEditarRua = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        tfEditarSenha = new javax.swing.JPasswordField();
        jLabel6 = new javax.swing.JLabel();
        tfEditarNumero = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 51, 51));
        jLabel1.setText("Edite seus Dados");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 30, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("Nome.:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, -1, -1));

        jLabel7.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        jLabel7.setText("N°.:");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 250, -1, -1));
        getContentPane().add(tfEditarNome, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 80, 310, 30));
        getContentPane().add(tfEditarCidade, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 200, 140, 30));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("Senha.:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, -1, -1));

        jLabel8.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        jLabel8.setText("Rua.:");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 250, -1, -1));

        tfEditarEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfEditarEmailActionPerformed(evt);
            }
        });
        getContentPane().add(tfEditarEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 120, 310, 30));
        getContentPane().add(tfEditarRua, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 240, 140, 30));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setText("Email.:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 130, -1, -1));
        getContentPane().add(tfEditarSenha, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 160, 140, 30));

        jLabel6.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        jLabel6.setText("Cidade.:");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 210, -1, -1));
        getContentPane().add(tfEditarNumero, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 240, 120, 30));

        jButton1.setText("Voltar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 303, -1, 30));

        jButton2.setText("Salvar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 303, -1, 30));

        jLabel2.setIcon(new javax.swing.ImageIcon("C:\\Users\\GGrio\\OneDrive\\Imagens\\Saved Pictures\\planodefundoeditar.png")); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(-3, -3, 490, 360));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void tfEditarEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfEditarEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfEditarEmailActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed

        if (tfEditarNome.getText().isEmpty() || tfEditarSenha.getText().isEmpty() || tfEditarEmail.getText().isEmpty()
                || tfEditarCidade.getText().isEmpty() || tfEditarNumero.getText().isEmpty() || tfEditarRua.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Preencha todos os Campos !");
        } else {
            usuario.setNomeUsuario(tfEditarNome.getText());
            usuario.setEmail(tfEditarEmail.getText());
            usuario.setSenha(tfEditarSenha.getText());
            usuario.setCidadeUsuario(tfEditarCidade.getText());
            usuario.setRuaUsuario(tfEditarRua.getText());
            usuario.setNumeroUsuario(tfEditarNumero.getText());

            dao.salvar(Usuario.usuario);
            ConfigUsuario config = new ConfigUsuario();
            config.setVisible(true);
            dispose();

        }


    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        ConfigUsuario config = new ConfigUsuario();
        config.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(EditarUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EditarUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EditarUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EditarUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EditarUsuario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JTextField tfEditarCidade;
    private javax.swing.JTextField tfEditarEmail;
    private javax.swing.JTextField tfEditarNome;
    private javax.swing.JTextField tfEditarNumero;
    private javax.swing.JTextField tfEditarRua;
    private javax.swing.JPasswordField tfEditarSenha;
    // End of variables declaration//GEN-END:variables
}
