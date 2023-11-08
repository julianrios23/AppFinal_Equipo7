package Vistas;

import AccesoADatos.*;
import Entidades.*;
import javax.swing.JOptionPane;


public class CargaCuarteles extends javax.swing.JFrame {

    public CargaCuarteles() {
        initComponents();
        setVisible(true);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        txtID = new javax.swing.JTextField();
        btnBuscar = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtDirecc = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtCoorX = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtCoorY = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtCorreo = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        checkAct = new javax.swing.JCheckBox();
        jLabel9 = new javax.swing.JLabel();
        txtTel = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        btnModificar = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setText("Carga Cuarteles");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(35, 25, -1, -1));

        jButton1.setBackground(new java.awt.Color(0, 0, 0));
        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("CERRAR");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 32, -1, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setText("Cod / ID");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(251, 111, -1, -1));

        txtID.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        getContentPane().add(txtID, new org.netbeans.lib.awtextra.AbsoluteConstraints(324, 111, 150, -1));

        btnBuscar.setBackground(new java.awt.Color(0, 0, 0));
        btnBuscar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnBuscar.setForeground(new java.awt.Color(255, 255, 255));
        btnBuscar.setText("BUSCAR");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });
        getContentPane().add(btnBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(492, 108, -1, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setText("Nombre:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(83, 175, -1, -1));

        txtNombre.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        getContentPane().add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(161, 175, 212, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setText("Dirección:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(391, 175, -1, -1));

        txtDirecc.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        getContentPane().add(txtDirecc, new org.netbeans.lib.awtextra.AbsoluteConstraints(476, 175, 230, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setText("Coordenada X:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(83, 239, -1, -1));

        txtCoorX.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        getContentPane().add(txtCoorX, new org.netbeans.lib.awtextra.AbsoluteConstraints(201, 239, 172, -1));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel6.setText("Coordenada Y:");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(391, 239, -1, -1));

        txtCoorY.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        getContentPane().add(txtCoorY, new org.netbeans.lib.awtextra.AbsoluteConstraints(509, 239, 197, -1));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel7.setText("Correo:");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(83, 301, -1, -1));

        txtCorreo.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        getContentPane().add(txtCorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(152, 299, 221, -1));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel8.setText("Estado:");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(391, 299, -1, -1));

        checkAct.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        checkAct.setText("ACTIVO / NO ACTIVO");
        getContentPane().add(checkAct, new org.netbeans.lib.awtextra.AbsoluteConstraints(487, 297, -1, -1));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel9.setText("Teléfono:");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(83, 356, -1, -1));

        txtTel.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        getContentPane().add(txtTel, new org.netbeans.lib.awtextra.AbsoluteConstraints(164, 356, 209, -1));

        jButton3.setBackground(new java.awt.Color(0, 0, 0));
        jButton3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("NUEVO CUARTEL");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed1(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(164, 466, -1, -1));

        btnModificar.setBackground(new java.awt.Color(0, 0, 0));
        btnModificar.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnModificar.setForeground(new java.awt.Color(255, 255, 255));
        btnModificar.setText("MODIFICAR");
        btnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarActionPerformed(evt);
            }
        });
        getContentPane().add(btnModificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 470, -1, 30));

        jButton2.setBackground(new java.awt.Color(0, 0, 0));
        jButton2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("LIMPIAR");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(562, 466, -1, -1));

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/fondo rojo.jpeg"))); // NOI18N
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 600));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        setVisible(false);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed

    }//GEN-LAST:event_jButton3ActionPerformed
   
    private void jButton3ActionPerformed1(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed1

        Cuartel cuartel = new Cuartel();
        cuartel.setNombre_cuartel(txtNombre.getText());
        cuartel.setDireccion(txtDirecc.getText());

        // valido coordenadas
        String coordenadaX = txtCoorX.getText();
        String coordenadaY = txtCoorY.getText();
        if (esNumero(coordenadaX) && esNumero(coordenadaY)) {
            cuartel.setCoord_X(Double.parseDouble(coordenadaX));
            cuartel.setCoord_Y(Double.parseDouble(coordenadaY));
        } else {
            JOptionPane.showMessageDialog(this, "Las coordenadas deben ser números válidos.");
            return; // No continúa si las coordenadas no son validas
        }

        // valido tel
        String telefono = txtTel.getText();
        if (esNumero(telefono)) {
            cuartel.setTelefono(telefono);
        } else {
            JOptionPane.showMessageDialog(this, "El teléfono debe contener solo números.");
            return;
        }

        // valido correo 
        String correo = txtCorreo.getText();
        if (esCorreoValido(correo)) {
            cuartel.setCorreo(correo);
        } else {
            JOptionPane.showMessageDialog(this, "El correo electrónico no es válido.");
            return;
        }

        cuartel.setEstado(checkAct.isSelected());

        // existe el cuartel?
        CuartelData cuartelData = new CuartelData();
        Cuartel existingCuartel = cuartelData.BuscarCuartelPorId(cuartel.getId_cuartel());

        if (existingCuartel != null) {
            JOptionPane.showMessageDialog(this, "Ya existe un Cuartel con este ID.");
        } else {
            // si no existe se puede guardar
            cuartelData.GuardarCuartel(cuartel);
            JOptionPane.showMessageDialog(this, "Cuartel Agregado Exitosamente. ");
            limpiar();
        }
    }//GEN-LAST:event_jButton3ActionPerformed1

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed

        try {
            int id = Integer.parseInt(txtID.getText());

            CuartelData cuartelData = new CuartelData();
            Cuartel cuartel = cuartelData.BuscarCuartelPorId(id);

            if (cuartel != null) {
                txtNombre.setText(cuartel.getNombre_cuartel());
                txtDirecc.setText(cuartel.getDireccion());
                txtCoorX.setText(String.valueOf(cuartel.getCoord_X()));
                txtCoorY.setText(String.valueOf(cuartel.getCoord_Y()));
                txtTel.setText(cuartel.getTelefono());
                txtCorreo.setText(cuartel.getCorreo());
                checkAct.setSelected(cuartel.isEstado());
            } else {
                JOptionPane.showMessageDialog(this, "No se encontró un Cuartel con este ID.");
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Ingrese un número válido para el ID: " + e.getMessage());
        }
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        limpiar();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed
        try {
            int id = Integer.parseInt(txtID.getText());

            CuartelData cuartelData = new CuartelData();
            Cuartel cuartel = cuartelData.BuscarCuartelPorId(id);

            if (cuartel != null) {
                cuartel.setNombre_cuartel(txtNombre.getText());
                cuartel.setDireccion(txtDirecc.getText());

                // valido coord
                String coordenadaX = txtCoorX.getText();
                String coordenadaY = txtCoorY.getText();
                if (esNumero(coordenadaX) && esNumero(coordenadaY)) {
                    cuartel.setCoord_X(Double.parseDouble(coordenadaX));
                    cuartel.setCoord_Y(Double.parseDouble(coordenadaY));
                } else {
                    JOptionPane.showMessageDialog(this, "Las coordenadas deben ser números válidos.");
                    return; 
                }

                // valido telefono
                String telefono = txtTel.getText();
                if (esNumero(telefono)) {
                    cuartel.setTelefono(telefono);
                } else {
                    JOptionPane.showMessageDialog(this, "El teléfono debe contener solo números.");
                    return; 
                }

                // valido correo
                String correo = txtCorreo.getText();
                if (esCorreoValido(correo)) {
                    cuartel.setCorreo(correo);
                } else {
                    JOptionPane.showMessageDialog(this, "El correo no es válido.");
                    return; 
                }

                cuartel.setEstado(checkAct.isSelected());

                // metodo modificar cuartel
                cuartelData.ModificarCuartel(cuartel);
                JOptionPane.showMessageDialog(this, "Cuartel modificado exitosamente.");
            } else {
                JOptionPane.showMessageDialog(this, "No se encontró un Cuartel con este ID.");
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Ingrese un número válido para el ID: " + e.getMessage());
        }
    }//GEN-LAST:event_btnModificarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnModificar;
    private javax.swing.JCheckBox checkAct;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField txtCoorX;
    private javax.swing.JTextField txtCoorY;
    private javax.swing.JTextField txtCorreo;
    private javax.swing.JTextField txtDirecc;
    private javax.swing.JTextField txtID;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtTel;
    // End of variables declaration//GEN-END:variables

    private void limpiar() {
        txtID.setText("");
        txtNombre.setText("");
        txtCoorX.setText("");
        txtCoorY.setText("");
        txtCorreo.setText("");
        txtDirecc.setText("");
        txtTel.setText("");
        checkAct.setSelected(false);

    }

    private boolean esNumero(String texto) {
        return texto.matches("\\d+");
    }

    private boolean esCorreoValido(String correo) {

        return correo.matches("^[A-Za-z0-9+_.-]+@(.+)$");
    }
}
