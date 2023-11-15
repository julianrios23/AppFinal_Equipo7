
package Vistas;

import AccesoADatos.BomberoData;
import AccesoADatos.CuartelData;
import Entidades.Bombero;
import Entidades.Cuartel;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.DefaultTableModel;

public class ListarCuarteles extends javax.swing.JFrame {

    public ListarCuarteles() {
        initComponents();
        cargarComboBox();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        btnCerra = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        cmbCuartel = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jtfNombre = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jtfDireccion = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jtfTelefono = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jtfCorreo = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jtfCoordenadaX = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jtfCoordenadaY = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jcbEstado = new javax.swing.JCheckBox();
        jLabel11 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setText("Listar Cuarteles");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(38, 28, -1, -1));

        btnCerra.setBackground(new java.awt.Color(0, 0, 0));
        btnCerra.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnCerra.setForeground(new java.awt.Color(255, 255, 255));
        btnCerra.setText("CERRAR");
        btnCerra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCerraActionPerformed(evt);
            }
        });
        getContentPane().add(btnCerra, new org.netbeans.lib.awtextra.AbsoluteConstraints(685, 35, -1, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        jLabel2.setText("Seleccione Cuartel:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 90, -1, -1));

        cmbCuartel.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        cmbCuartel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbCuartelActionPerformed(evt);
            }
        });
        getContentPane().add(cmbCuartel, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 90, 226, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N
        jLabel3.setText("SELECCIONE UNA OPCION PARA VER LOS DATOS");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 130, -1, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel4.setText("Nombre:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(209, 163, -1, -1));

        jtfNombre.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        getContentPane().add(jtfNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(304, 165, 324, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel5.setText("Dirección:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(209, 205, -1, -1));

        jtfDireccion.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        getContentPane().add(jtfDireccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(304, 207, 324, -1));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel6.setText("Teléfono:");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(209, 247, -1, -1));

        jtfTelefono.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        getContentPane().add(jtfTelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(304, 249, 324, -1));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel7.setText("Correo:");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(209, 289, -1, -1));

        jtfCorreo.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        getContentPane().add(jtfCorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(304, 291, 324, -1));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel8.setText("Coord X:");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(209, 331, -1, -1));

        jtfCoordenadaX.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        getContentPane().add(jtfCoordenadaX, new org.netbeans.lib.awtextra.AbsoluteConstraints(308, 333, 320, -1));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel9.setText("Coord Y:");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(209, 373, -1, -1));

        jtfCoordenadaY.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        getContentPane().add(jtfCoordenadaY, new org.netbeans.lib.awtextra.AbsoluteConstraints(304, 375, 324, -1));

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel10.setText("Estado:");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(304, 419, -1, -1));

        jcbEstado.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jcbEstado.setText("ACTIVO / NO ACTIVO");
        getContentPane().add(jcbEstado, new org.netbeans.lib.awtextra.AbsoluteConstraints(377, 417, -1, 30));

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/fondo rojo.jpeg"))); // NOI18N
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 600));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCerraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerraActionPerformed
        setVisible(false);
    }//GEN-LAST:event_btnCerraActionPerformed

    private void cmbCuartelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbCuartelActionPerformed

        CuartelData cd = new CuartelData();
        String cuartelNombre = (String) cmbCuartel.getSelectedItem();
        if (cuartelNombre != "Cuarteles") {
            Cuartel cuartel = new Cuartel();
            cuartel = cd.BuscarCuartelPorNombre(cuartelNombre);

            jtfNombre.setText(cuartel.getNombre_cuartel());
            jtfDireccion.setText(cuartel.getDireccion());
            jtfTelefono.setText(cuartel.getTelefono());
            jtfCorreo.setText(cuartel.getCorreo());

            //parseo double a string
            String coorXstring = Double.toString(cuartel.getCoord_X());
            String coorYstring = Double.toString(cuartel.getCoord_Y());

            jtfCoordenadaX.setText(coorXstring);
            jtfCoordenadaY.setText(coorYstring);
            if (cuartel.getEstado()== true) {
                jcbEstado.setSelected(true);
            } else {
                jcbEstado.setSelected(false);
            }
        }
    }//GEN-LAST:event_cmbCuartelActionPerformed

    //Cargar comboBox con cuarteles actuales 
    private void cargarComboBox() {
        cmbCuartel.removeAllItems();
        Cuartel cuartelVacio = new Cuartel();
        cuartelVacio.setNombre_cuartel("Cuarteles");
        cmbCuartel.addItem(cuartelVacio.getNombre_cuartel());
        CuartelData cd = new CuartelData();
        List<Cuartel> list = cd.ListarCuarteles();
        for (Cuartel elem : list) {
            cmbCuartel.addItem(elem.getNombre_cuartel());
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCerra;
    private javax.swing.JComboBox<String> cmbCuartel;
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
    private javax.swing.JCheckBox jcbEstado;
    private javax.swing.JTextField jtfCoordenadaX;
    private javax.swing.JTextField jtfCoordenadaY;
    private javax.swing.JTextField jtfCorreo;
    private javax.swing.JTextField jtfDireccion;
    private javax.swing.JTextField jtfNombre;
    private javax.swing.JTextField jtfTelefono;
    // End of variables declaration//GEN-END:variables

}
