/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

/**
 *
 * @author Jeimy
 */
public class FrmMenu extends javax.swing.JFrame {

    /**
     * Creates new form FrmMenu
     */
    public FrmMenu() {
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
        jlFuerte = new javax.swing.JLabel();
        jlBebida = new javax.swing.JLabel();
        jlEntrada = new javax.swing.JLabel();
        jlPostre = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        btnBebidas = new javax.swing.JButton();
        btnEntrada = new javax.swing.JButton();
        btnFuerte = new javax.swing.JButton();
        btnPostre = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jmenuBarRestaurante = new javax.swing.JMenuBar();
        jMAyuda = new javax.swing.JMenu();
        miPreguntas = new javax.swing.JMenuItem();
        miSalir = new javax.swing.JMenuItem();
        jMSobre = new javax.swing.JMenu();
        miVersion = new javax.swing.JMenuItem();
        jMenu1 = new javax.swing.JMenu();
        JMPerfil = new javax.swing.JMenu();
        perfil = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jlFuerte.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iimagenes/Segundo.png"))); // NOI18N

        jlBebida.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iimagenes/Bebidas.png"))); // NOI18N

        jlEntrada.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iimagenes/Entrada.png"))); // NOI18N

        jlPostre.setBackground(new java.awt.Color(102, 102, 102));
        jlPostre.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iimagenes/Postre.png"))); // NOI18N

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iimagenes/Decorar.png"))); // NOI18N

        btnBebidas.setBackground(new java.awt.Color(255, 204, 204));
        btnBebidas.setFont(new java.awt.Font("Cooper Black", 1, 18)); // NOI18N
        btnBebidas.setText("Bebidas");
        btnBebidas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBebidasActionPerformed(evt);
            }
        });

        btnEntrada.setBackground(new java.awt.Color(255, 204, 204));
        btnEntrada.setFont(new java.awt.Font("Cooper Black", 1, 18)); // NOI18N
        btnEntrada.setText("Entrada");
        btnEntrada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEntradaActionPerformed(evt);
            }
        });

        btnFuerte.setBackground(new java.awt.Color(255, 204, 204));
        btnFuerte.setFont(new java.awt.Font("Cooper Black", 1, 18)); // NOI18N
        btnFuerte.setText("Fuerte");
        btnFuerte.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFuerteActionPerformed(evt);
            }
        });

        btnPostre.setBackground(new java.awt.Color(255, 204, 204));
        btnPostre.setFont(new java.awt.Font("Cooper Black", 1, 18)); // NOI18N
        btnPostre.setText("Postre");

        jLabel5.setFont(new java.awt.Font("Cooper Black", 1, 48)); // NOI18N
        jLabel5.setText("Escoge  ");

        jLabel7.setFont(new java.awt.Font("Cooper Black", 1, 48)); // NOI18N
        jLabel7.setText("tu sabor");

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iimagenes/logo.jpg"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnBebidas)
                        .addGap(68, 68, 68)
                        .addComponent(btnEntrada))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jlBebida, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jlEntrada, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jlFuerte, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jlPostre, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(34, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(btnFuerte)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnPostre)
                        .addGap(57, 57, 57))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel5)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel6)
                .addGap(28, 28, 28))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap(41, Short.MAX_VALUE)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(58, 58, 58))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(21, 21, 21)
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(4, 4, 4)
                            .addComponent(jlBebida, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jlEntrada, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jlFuerte, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlPostre, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnBebidas)
                    .addComponent(btnEntrada)
                    .addComponent(btnFuerte)
                    .addComponent(btnPostre))
                .addContainerGap(56, Short.MAX_VALUE))
        );

        jMAyuda.setBackground(new java.awt.Color(255, 204, 204));
        jMAyuda.setText("Ayuda");

        miPreguntas.setBackground(new java.awt.Color(255, 204, 204));
        miPreguntas.setText("Preguntas");
        miPreguntas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miPreguntasActionPerformed(evt);
            }
        });
        jMAyuda.add(miPreguntas);

        miSalir.setText("Salir");
        jMAyuda.add(miSalir);

        jmenuBarRestaurante.add(jMAyuda);

        jMSobre.setBackground(new java.awt.Color(255, 204, 204));
        jMSobre.setText("Sobre el Sistema");

        miVersion.setBackground(new java.awt.Color(255, 204, 204));
        miVersion.setText("Version");
        jMSobre.add(miVersion);

        jmenuBarRestaurante.add(jMSobre);

        jMenu1.setBackground(new java.awt.Color(255, 204, 204));
        jMenu1.setText("Historial");
        jmenuBarRestaurante.add(jMenu1);

        JMPerfil.setText("Perfil");

        perfil.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_P, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        perfil.setText("Información");
        perfil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                perfilActionPerformed(evt);
            }
        });
        JMPerfil.add(perfil);

        jmenuBarRestaurante.add(JMPerfil);

        setJMenuBar(jmenuBarRestaurante);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnEntradaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEntradaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnEntradaActionPerformed

    private void btnFuerteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFuerteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnFuerteActionPerformed

    private void miPreguntasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miPreguntasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_miPreguntasActionPerformed

    private void perfilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_perfilActionPerformed
        FrmPerfil perfil = new FrmPerfil();
        this.setVisible(false);
        perfil.setVisible(true);
        
    }//GEN-LAST:event_perfilActionPerformed

    private void btnBebidasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBebidasActionPerformed
        FrmBebidas bebidas = new FrmBebidas();
        this.setVisible(false);
        bebidas.setVisible(true);  
    }//GEN-LAST:event_btnBebidasActionPerformed

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
            java.util.logging.Logger.getLogger(FrmMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmMenu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu JMPerfil;
    private javax.swing.JButton btnBebidas;
    private javax.swing.JButton btnEntrada;
    private javax.swing.JButton btnFuerte;
    private javax.swing.JButton btnPostre;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JMenu jMAyuda;
    private javax.swing.JMenu jMSobre;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel jlBebida;
    private javax.swing.JLabel jlEntrada;
    private javax.swing.JLabel jlFuerte;
    private javax.swing.JLabel jlPostre;
    private javax.swing.JMenuBar jmenuBarRestaurante;
    private javax.swing.JMenuItem miPreguntas;
    private javax.swing.JMenuItem miSalir;
    private javax.swing.JMenuItem miVersion;
    private javax.swing.JMenuItem perfil;
    // End of variables declaration//GEN-END:variables
}
