package Vistas;

import AccesoADatos.BomberoData;
import AccesoADatos.BrigadaData;
import Entidades.Bombero;
import Entidades.Brigada;
import Entidades.Cuartel;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.List;
import javax.swing.JOptionPane;

public class CargaBombero extends javax.swing.JFrame {

    private String chapa_iden;

    public CargaBombero() {
        initComponents();
        setVisible(true);
        cargarComboBrigadas();
    }

    private void cargarComboBrigadas() {
        cmbBrigadas.removeAllItems();
        Brigada brigadaVacia = new Brigada();
        brigadaVacia.setNombre_cuartel("Brigadas");
        cmbBrigadas.addItem(brigadaVacia.getNombre_cuartel());

        BrigadaData bd = new BrigadaData();
        List<Brigada> brigadas = bd.ListarBrigada();

        for (Brigada elem : brigadas) {
            cmbBrigadas.addItem(elem.getNombre_brigada());
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtApellido = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtDni = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        cmbGrupSan = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        cmbBrigadas = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        txtIdentif = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        checkAct = new javax.swing.JCheckBox();
        jLabel10 = new javax.swing.JLabel();
        txtTelefono = new javax.swing.JTextField();
        btnGuardar = new javax.swing.JButton();
        btnCerrar = new javax.swing.JButton();
        dateNac = new com.toedter.calendar.JDateChooser();
        jLabel11 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setText("Carga Datos Personal");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, -1, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setText("Nombre:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(18, 166, -1, -1));

        txtNombre.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        getContentPane().add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(96, 166, 251, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setText("Apellido:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(399, 166, -1, -1));

        txtApellido.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        getContentPane().add(txtApellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(478, 166, 291, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setText("DNI N°:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(18, 225, -1, -1));
        getContentPane().add(txtDni, new org.netbeans.lib.awtextra.AbsoluteConstraints(96, 225, 251, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setText("Fecha Nacimiento:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(399, 225, -1, -1));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel6.setText("Grupo Sanguineo:");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(18, 281, -1, -1));

        cmbGrupSan.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        cmbGrupSan.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "A+", "O+", "B+", "AB+", "A-", "O-", "B-", "AB-" }));
        cmbGrupSan.setSelectedIndex(-1);
        getContentPane().add(cmbGrupSan, new org.netbeans.lib.awtextra.AbsoluteConstraints(184, 281, 168, -1));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel7.setText("Brigada Asisgnada:");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(399, 281, -1, -1));

        cmbBrigadas.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        getContentPane().add(cmbBrigadas, new org.netbeans.lib.awtextra.AbsoluteConstraints(546, 281, 223, -1));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel8.setText("Chapa Identificación:");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(18, 330, -1, -1));
        getContentPane().add(txtIdentif, new org.netbeans.lib.awtextra.AbsoluteConstraints(184, 330, 168, -1));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel9.setText("Estado:");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 330, -1, -1));

        checkAct.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        checkAct.setText("ACTIVO / NO ACTIVO");
        getContentPane().add(checkAct, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 330, -1, -1));

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel10.setText("Teléfono:");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(18, 378, -1, -1));

        txtTelefono.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        getContentPane().add(txtTelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(99, 378, 253, -1));

        btnGuardar.setBackground(new java.awt.Color(0, 0, 0));
        btnGuardar.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnGuardar.setForeground(new java.awt.Color(255, 255, 255));
        btnGuardar.setText("GUARDAR");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });
        getContentPane().add(btnGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(341, 473, -1, -1));

        btnCerrar.setBackground(new java.awt.Color(0, 0, 0));
        btnCerrar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnCerrar.setForeground(new java.awt.Color(255, 255, 255));
        btnCerrar.setText("CERRAR");
        btnCerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCerrarActionPerformed(evt);
            }
        });
        getContentPane().add(btnCerrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 30, -1, -1));

        dateNac.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        getContentPane().add(dateNac, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 223, 229, -1));

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/fondo rojo.jpeg"))); // NOI18N
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 600));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerrarActionPerformed
        setVisible(false);
    }//GEN-LAST:event_btnCerrarActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed

        try {
            String nombre = txtNombre.getText();
            String apellido = txtApellido.getText();
            int dni = Integer.parseInt(txtDni.getText());
            java.util.Date fechaNacimientoUtil = dateNac.getDate();
            LocalDate fechaNacimiento = fechaNacimientoUtil.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
            String grupoSanguineo = (String) cmbGrupSan.getSelectedItem();
            String celular = txtTelefono.getText();
            boolean estado = checkAct.isSelected();
            String chapaiden = txtIdentif.getText();

            String nombreBrigada = (String) cmbBrigadas.getSelectedItem();
            BrigadaData brigadaData = new BrigadaData();
            Brigada brigada = brigadaData.BuscarBrigada(nombreBrigada);
           

            if (brigada != null && brigada.getId_brigada() != 0) {
                Bombero nuevoBombero = new Bombero(nombre, apellido, dni, fechaNacimiento, grupoSanguineo, brigada, celular, estado, chapa_iden);

                BomberoData bomberoData = new BomberoData();
                bomberoData.GuardarBombero(nuevoBombero);

                JOptionPane.showMessageDialog(null, "Bombero agregado exitosamente");
            } else {
                // Manejo de error o mensaje indicando que la Brigada no es válida
                JOptionPane.showMessageDialog(null, "La Brigada seleccionada no es válida.");
            }

            limpiar();

            JOptionPane.showMessageDialog(this, "Bombero agregado exitosamente.");
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Ingrese un DNI válido" + e.getMessage());
        }
    }//GEN-LAST:event_btnGuardarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCerrar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JCheckBox checkAct;
    private javax.swing.JComboBox<String> cmbBrigadas;
    private javax.swing.JComboBox<String> cmbGrupSan;
    private com.toedter.calendar.JDateChooser dateNac;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField txtApellido;
    private javax.swing.JTextField txtDni;
    private javax.swing.JTextField txtIdentif;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtTelefono;
    // End of variables declaration//GEN-END:variables

    private void limpiar() {

        txtNombre.setText("");
        txtApellido.setText("");
        txtDni.setText("");
        txtIdentif.setText("");
        txtTelefono.setText("");
        checkAct.setSelected(false);
        cmbBrigadas.setSelectedIndex(0);
        cmbGrupSan.setSelectedIndex(-1);
    }
}
