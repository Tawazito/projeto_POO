/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package main;

/**
 *
 * @author Gabrielli
 */
public class Principal_tela extends javax.swing.JFrame {

    /**
     * Creates new form Menu
     */
    public Principal_tela() {
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

        jMenuItem2 = new javax.swing.JMenuItem();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        btn_fechar = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jMenuBar2 = new javax.swing.JMenuBar();
        cadastrar_usuario = new javax.swing.JMenu();
        cadastrar_livro = new javax.swing.JMenu();
        locacao = new javax.swing.JMenu();

        jMenuItem2.setText("jMenuItem2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(250, 240, 226));
        jPanel1.setForeground(new java.awt.Color(250, 240, 226));
        jPanel1.setPreferredSize(new java.awt.Dimension(800, 600));
        jPanel1.setLayout(null);

        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                emprestimolivro(evt);
            }
        });
        jPanel1.add(jLabel3);
        jLabel3.setBounds(280, 350, 260, 170);

        btn_fechar.setBackground(new java.awt.Color(89, 74, 71));
        btn_fechar.setForeground(new java.awt.Color(250, 240, 226));
        btn_fechar.setText("Fechar");
        btn_fechar.setBorder(null);
        btn_fechar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btn_fechar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_fecharMouseClicked(evt);
            }
        });
        btn_fechar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_fecharActionPerformed(evt);
            }
        });
        jPanel1.add(btn_fechar);
        btn_fechar.setBounds(460, 20, 87, 28);

        jPanel2.setBackground(new java.awt.Color(250, 240, 226));
        jPanel2.setForeground(new java.awt.Color(250, 240, 226));
        jPanel2.setPreferredSize(new java.awt.Dimension(800, 600));
        jPanel2.setLayout(null);

        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel4emprestimolivro(evt);
            }
        });
        jPanel2.add(jLabel4);
        jLabel4.setBounds(280, 350, 260, 170);

        cadastrar_usuario.setText("Cadastrar Usuário");
        cadastrar_usuario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cadastrar_usuarioMouseClicked(evt);
            }
        });
        jMenuBar2.add(cadastrar_usuario);

        cadastrar_livro.setText("Cadstrar Livro");
        cadastrar_livro.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cadastrar_livroMouseClicked(evt);
            }
        });
        jMenuBar2.add(cadastrar_livro);

        locacao.setText("Locação");
        locacao.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                locacaoMouseClicked(evt);
            }
        });
        jMenuBar2.add(locacao);

        setJMenuBar(jMenuBar2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 571, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(337, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(406, 406, 406))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 460, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap()))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void emprestimolivro(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_emprestimolivro
        // TODO add your handling code here:
    }//GEN-LAST:event_emprestimolivro

    private void jLabel4emprestimolivro(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4emprestimolivro
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel4emprestimolivro

    private void cadastrar_usuarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cadastrar_usuarioMouseClicked
        Cadastro1 cadastro = new Cadastro1();
        cadastro.setVisible(true);
        
    }//GEN-LAST:event_cadastrar_usuarioMouseClicked

    private void cadastrar_livroMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cadastrar_livroMouseClicked
        Cadastro_livro cadastro_livro = new Cadastro_livro();
        cadastro_livro.setVisible(true);
    }//GEN-LAST:event_cadastrar_livroMouseClicked

    private void btn_fecharActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_fecharActionPerformed
       
    }//GEN-LAST:event_btn_fecharActionPerformed

    private void btn_fecharMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_fecharMouseClicked
        this.setVisible(false);
    }//GEN-LAST:event_btn_fecharMouseClicked

    private void locacaoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_locacaoMouseClicked
        Locacao locacao = new Locacao();
        locacao.setVisible(true);
    }//GEN-LAST:event_locacaoMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
      
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Principal_tela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal_tela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal_tela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal_tela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Principal_tela().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_fechar;
    private javax.swing.JButton btn_login;
    private javax.swing.JButton btn_login1;
    private javax.swing.JButton btn_login2;
    private javax.swing.JButton btn_login3;
    private javax.swing.JMenu cadastrar_livro;
    private javax.swing.JMenu cadastrar_usuario;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JMenu locacao;
    // End of variables declaration//GEN-END:variables
}
