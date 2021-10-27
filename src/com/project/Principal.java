/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.project;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.Window;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;

/**
 *
 * @author MARIO
 */
public class Principal extends javax.swing.JFrame {  
    //Variables para determinar la posicion del mouse y que la ventana se arrastre
    int xMouse, yMouse;
    /**
     * Creates new form Principal
     */
    public Principal() {
        initComponents();
        centreWindow(this);
    }
    //Metodo para centrar la ventana
    public static void centreWindow(Window frame) {
        Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
        int x = (int) ((dimension.getWidth() - frame.getWidth()) / 2);
        int y = (int) ((dimension.getHeight() - frame.getHeight()) / 2);
        frame.setLocation(x, y);
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bg = new javax.swing.JPanel();
        header = new javax.swing.JPanel();
        btnMinimize = new javax.swing.JLabel();
        btnClose = new javax.swing.JLabel();
        title = new javax.swing.JLabel();
        container = new javax.swing.JPanel();
        btnManualUsuario = new javax.swing.JButton();
        btnMenuIntegrales = new javax.swing.JButton();
        btnGraficadora = new javax.swing.JButton();
        btnDevelopers = new javax.swing.JButton();
        btnFormulario = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(50, 50));
        setName("framePrincipal"); // NOI18N
        setUndecorated(true);
        setResizable(false);
        setSize(new java.awt.Dimension(850, 850));

        bg.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        header.setBackground(new java.awt.Color(239, 75, 76));
        header.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                headerMouseDragged(evt);
            }
        });
        header.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                headerMousePressed(evt);
            }
        });

        btnMinimize.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/UI/btnMini.png"))); // NOI18N
        btnMinimize.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnMinimize.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnMinimizeMouseClicked(evt);
            }
        });

        btnClose.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/UI/btnClose.png"))); // NOI18N
        btnClose.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnClose.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCloseMouseClicked(evt);
            }
        });

        title.setBackground(new java.awt.Color(239, 75, 76));
        title.setFont(new java.awt.Font("Segoe UI", 1, 96)); // NOI18N
        title.setForeground(new java.awt.Color(255, 255, 255));
        title.setText("CÁLCULO II");

        javax.swing.GroupLayout headerLayout = new javax.swing.GroupLayout(header);
        header.setLayout(headerLayout);
        headerLayout.setHorizontalGroup(
            headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, headerLayout.createSequentialGroup()
                .addContainerGap(170, Short.MAX_VALUE)
                .addComponent(title, javax.swing.GroupLayout.PREFERRED_SIZE, 537, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(91, 91, 91)
                .addComponent(btnMinimize)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnClose)
                .addGap(16, 16, 16))
        );
        headerLayout.setVerticalGroup(
            headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(headerLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnMinimize, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnClose, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, headerLayout.createSequentialGroup()
                .addComponent(title)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        bg.add(header, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 880, 120));

        container.setBackground(new java.awt.Color(255, 255, 255));
        container.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnManualUsuario.setBackground(new java.awt.Color(52, 177, 208));
        btnManualUsuario.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        btnManualUsuario.setForeground(new java.awt.Color(255, 255, 255));
        btnManualUsuario.setText("Manual de Usuario");
        btnManualUsuario.setBorder(null);
        btnManualUsuario.setBorderPainted(false);
        btnManualUsuario.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnManualUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnManualUsuarioActionPerformed(evt);
            }
        });
        container.add(btnManualUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 410, 500, 80));

        btnMenuIntegrales.setBackground(new java.awt.Color(52, 177, 208));
        btnMenuIntegrales.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        btnMenuIntegrales.setForeground(new java.awt.Color(255, 255, 255));
        btnMenuIntegrales.setText("Resolución de Integrales");
        btnMenuIntegrales.setBorder(null);
        btnMenuIntegrales.setBorderPainted(false);
        btnMenuIntegrales.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnMenuIntegrales.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnMenuIntegralesMouseClicked(evt);
            }
        });
        btnMenuIntegrales.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMenuIntegralesActionPerformed(evt);
            }
        });
        container.add(btnMenuIntegrales, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 140, 500, 80));

        btnGraficadora.setBackground(new java.awt.Color(52, 177, 208));
        btnGraficadora.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        btnGraficadora.setForeground(new java.awt.Color(255, 255, 255));
        btnGraficadora.setText("Graficadora");
        btnGraficadora.setBorder(null);
        btnGraficadora.setBorderPainted(false);
        btnGraficadora.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnGraficadora.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGraficadoraActionPerformed(evt);
            }
        });
        container.add(btnGraficadora, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 230, 500, 80));

        btnDevelopers.setBackground(new java.awt.Color(52, 177, 208));
        btnDevelopers.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        btnDevelopers.setForeground(new java.awt.Color(255, 255, 255));
        btnDevelopers.setText("Desarrolladores");
        btnDevelopers.setBorder(null);
        btnDevelopers.setBorderPainted(false);
        btnDevelopers.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnDevelopers.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnDevelopersMouseClicked(evt);
            }
        });
        btnDevelopers.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDevelopersActionPerformed(evt);
            }
        });
        container.add(btnDevelopers, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 320, 500, 80));

        btnFormulario.setBackground(new java.awt.Color(52, 177, 208));
        btnFormulario.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        btnFormulario.setForeground(new java.awt.Color(255, 255, 255));
        btnFormulario.setText("Formulario");
        btnFormulario.setBorder(null);
        btnFormulario.setBorderPainted(false);
        btnFormulario.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnFormulario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnFormularioMouseClicked(evt);
            }
        });
        btnFormulario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFormularioActionPerformed(evt);
            }
        });
        container.add(btnFormulario, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 50, 500, 80));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/imagenes/bg-calculo.jpg"))); // NOI18N
        container.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 880, 520));

        bg.add(container, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 120, 880, 520));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnManualUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnManualUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnManualUsuarioActionPerformed

    private void btnMenuIntegralesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMenuIntegralesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnMenuIntegralesActionPerformed

    private void btnGraficadoraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGraficadoraActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnGraficadoraActionPerformed

    private void btnDevelopersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDevelopersActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnDevelopersActionPerformed
    //Evento para cerrar la ventana
    private void btnCloseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCloseMouseClicked
        System.exit(0);
    }//GEN-LAST:event_btnCloseMouseClicked
    //Evento que registrara la posicion del mouse cuando se quiera arrastrar la ventana
    private void headerMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_headerMousePressed
        xMouse = evt.getX();
        yMouse = evt.getY();
    }//GEN-LAST:event_headerMousePressed
    //Evento que hará posible mover la ventana segun a donde la lleve el puntero
    private void headerMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_headerMouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x - xMouse, y - yMouse);
    }//GEN-LAST:event_headerMouseDragged
    //Evento para minimizar la ventana
    private void btnMinimizeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMinimizeMouseClicked
        this.setExtendedState(ICONIFIED);
    }//GEN-LAST:event_btnMinimizeMouseClicked

    private void btnMenuIntegralesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMenuIntegralesMouseClicked
        MenuIntegrales integrales = new MenuIntegrales();
        integrales.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnMenuIntegralesMouseClicked

    private void btnFormularioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFormularioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnFormularioActionPerformed

    private void btnFormularioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnFormularioMouseClicked
        Formulario formIntegrales = new Formulario();
        formIntegrales.setVisible(true);   
        this.setVisible(false);
    }//GEN-LAST:event_btnFormularioMouseClicked

    private void btnDevelopersMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDevelopersMouseClicked
        Developers devs = new Developers();
        devs.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnDevelopersMouseClicked

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
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
            
           
        });
    }  
    
    
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel bg;
    private javax.swing.JLabel btnClose;
    private javax.swing.JButton btnDevelopers;
    private javax.swing.JButton btnFormulario;
    private javax.swing.JButton btnGraficadora;
    private javax.swing.JButton btnManualUsuario;
    private javax.swing.JButton btnMenuIntegrales;
    private javax.swing.JLabel btnMinimize;
    private javax.swing.JPanel container;
    private javax.swing.JPanel header;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel title;
    // End of variables declaration//GEN-END:variables
}
