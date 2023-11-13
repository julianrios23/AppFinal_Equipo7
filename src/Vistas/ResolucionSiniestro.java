/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Vistas;

import Entidades.Siniestro;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;
import javax.swing.JOptionPane;

public class ResolucionSiniestro extends javax.swing.JFrame {

    public ResolucionSiniestro() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel9 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtCod = new javax.swing.JTextField();
        JBBuscar = new javax.swing.JButton();
        dateResol = new com.toedter.calendar.JDateChooser();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        txtHoraResoluc = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        txtCalif = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        btnResolucion = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        txtX = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtY = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        dateInicio = new com.toedter.calendar.JDateChooser();
        jLabel5 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txtHorainicio = new javax.swing.JTextField();
        txtTipo = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        txtBrigada = new javax.swing.JTextField();
        btnCerra = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel9.setText("Resolución de Siniestro");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(17, 23, -1, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setText("Buscar Por Codigo/ID de Siniestro:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 85, 246, -1));

        txtCod.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        getContentPane().add(txtCod, new org.netbeans.lib.awtextra.AbsoluteConstraints(372, 85, 140, -1));

        JBBuscar.setBackground(new java.awt.Color(0, 0, 0));
        JBBuscar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        JBBuscar.setForeground(new java.awt.Color(255, 255, 255));
        JBBuscar.setText("BUSCAR");
        JBBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBBuscarActionPerformed(evt);
            }
        });
        getContentPane().add(JBBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(552, 80, -1, 31));
        getContentPane().add(dateResol, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 350, 240, -1));

        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel12.setText("Fecha Resolución Siniestro:");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 350, -1, -1));

        jLabel13.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel13.setText("Hora Resolución Siniestro:");
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 390, -1, -1));

        txtHoraResoluc.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        getContentPane().add(txtHoraResoluc, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 390, 130, -1));

        jLabel15.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel15.setText("Calificación Siniestro:");
        getContentPane().add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 430, -1, -1));
        getContentPane().add(txtCalif, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 430, 130, -1));

        jLabel14.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N
        jLabel14.setText("Usar formato 24 hs (Ej. 14:45)");
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 390, -1, 20));

        btnResolucion.setBackground(new java.awt.Color(0, 0, 0));
        btnResolucion.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnResolucion.setForeground(new java.awt.Color(255, 255, 255));
        btnResolucion.setText("GUARDAR RESOLUCION SINIESTRO");
        getContentPane().add(btnResolucion, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 490, -1, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setText("Coordenas X:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 170, -1, -1));

        txtX.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        getContentPane().add(txtX, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 170, 165, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setText("Coordenadas Y:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 170, 110, -1));

        txtY.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        getContentPane().add(txtY, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 170, 190, -1));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel6.setText("Tipo de Siniestro:");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 260, -1, -1));
        getContentPane().add(dateInicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 220, 165, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setText("Fecha De Inicio:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 220, -1, -1));

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel10.setText("Hora de Inicio:");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 260, -1, -1));

        txtHorainicio.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        getContentPane().add(txtHorainicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 260, 165, -1));

        txtTipo.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        getContentPane().add(txtTipo, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 260, 184, -1));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setText("Brigada:");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 220, -1, -1));
        getContentPane().add(txtBrigada, new org.netbeans.lib.awtextra.AbsoluteConstraints(524, 220, 190, -1));

        btnCerra.setBackground(new java.awt.Color(0, 0, 0));
        btnCerra.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnCerra.setForeground(new java.awt.Color(255, 255, 255));
        btnCerra.setText("CERRAR");
        btnCerra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCerraActionPerformed(evt);
            }
        });
        getContentPane().add(btnCerra, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 30, -1, -1));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/fondo rojo.jpeg"))); // NOI18N
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 600));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void JBBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBBuscarActionPerformed
        try {
            int codigo = Integer.parseInt(txtCod.getText());
            System.out.println("Buscando siniestro con codigo:" + txtCod.getText());
            Siniestro siniestroEncontrado = sd.BuscarSiniestroPorID(codigo);

            // Una vez encontrado el siniestro debo mostrarlo:
            if (siniestroEncontrado != null) {
                txtX.setText(siniestroEncontrado.getCoord_X() + "");
                txtY.setText(siniestroEncontrado.getCoord_Y() + "");
                LocalDate fechaEnFormatoLocal = siniestroEncontrado.getFecha_siniestro();
                Date fechaEnFormatoDate = Date.from(fechaEnFormatoLocal.atStartOfDay(ZoneId.systemDefault()).toInstant());
                dateInicio.setDate(fechaEnFormatoDate);
                txtTipo.setText(siniestroEncontrado.getTipo());
                txtHorainicio.setText(siniestroEncontrado.getHora_siniestro());

                cmbBrigaAsignada.setSelectedItem((String) brigadaEncontrada.getNombre_brigada());
                LocalDate fechaEnFormatoLocalR = siniestroEncontrado.getFecha_resolucion();
                Date fechaEnFormatoDateR = Date.from(fechaEnFormatoLocalR.atStartOfDay(ZoneId.systemDefault()).toInstant());
                dateResol.setDate(fechaEnFormatoDateR);
                txtHoraResoluc.setText(siniestroEncontrado.getHora_fin_siniestro());
                txtCalif.setText(siniestroEncontrado.getCalificacion() + "");

            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "El codigo debe ser un entero y no debe estar vacio");
        } catch (NullPointerException e) {
            System.out.println("No se encontro ningun siniestro con el cod: " + txtCod.getText());
        }

    }//GEN-LAST:event_JBBuscarActionPerformed

    private void btnCerraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerraActionPerformed
        setVisible(false);
    }//GEN-LAST:event_btnCerraActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JBBuscar;
    private javax.swing.JButton btnCerra;
    private javax.swing.JButton btnResolucion;
    private com.toedter.calendar.JDateChooser dateInicio;
    private com.toedter.calendar.JDateChooser dateResol;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField txtBrigada;
    private javax.swing.JTextField txtCalif;
    private javax.swing.JTextField txtCod;
    private javax.swing.JTextField txtHoraResoluc;
    private javax.swing.JTextField txtHorainicio;
    private javax.swing.JTextField txtTipo;
    private javax.swing.JTextField txtX;
    private javax.swing.JTextField txtY;
    // End of variables declaration//GEN-END:variables

}
