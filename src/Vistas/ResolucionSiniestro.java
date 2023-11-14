
package Vistas;

import Entidades.Siniestro;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;
import java.util.List;
import javax.swing.JOptionPane;

public class ResolucionSiniestro extends javax.swing.JFrame {

    private SiniestroData sd = new SiniestroData();
    private Siniestro siniestro;
    private List<Siniestro> listarSiniestros = sd.ListarSiniestro();

    private Brigada brigada = new Brigada();
    private BrigadaData brigadaData = new BrigadaData();
    private List<Brigada> listarBrigada = brigadaData.ListarBrigada();
    
    public ResolucionSiniestro() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel9 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
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
        cmbSiniestro = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel9.setText("Resolución de Siniestro");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(17, 23, -1, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setText("Buscar Siniestro:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 85, 246, -1));
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

        getContentPane().add(cmbSiniestro, new org.netbeans.lib.awtextra.AbsoluteConstraints(266, 85, 280, -1));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/fondo rojo.jpeg"))); // NOI18N
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 600));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCerraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerraActionPerformed
        setVisible(false);
    }//GEN-LAST:event_btnCerraActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCerra;
    private javax.swing.JButton btnResolucion;
    private javax.swing.JComboBox<String> cmbSiniestro;
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
    private javax.swing.JTextField txtHoraResoluc;
    private javax.swing.JTextField txtHorainicio;
    private javax.swing.JTextField txtTipo;
    private javax.swing.JTextField txtX;
    private javax.swing.JTextField txtY;
    // End of variables declaration//GEN-END:variables

    private void llenarComboBoxSiniestro() {
       
        cmbSiniestro.removeAllItems();
        List<Siniestro> siniestros = sd.ListarSiniestro();

        for (Siniestro siniestro : siniestros) {
            if (siniestro != null && siniestro.getBrigada().getId_brigada() == 0 && !siniestro.isEstado()) {
                cmbSiniestro.addItem(siniestro);
            }
        }
    }
    
}
