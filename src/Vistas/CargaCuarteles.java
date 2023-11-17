package Vistas;

import AccesoADatos.*;
import Entidades.*;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class CargaCuarteles extends javax.swing.JFrame {

    public CargaCuarteles() {
        initComponents();
        setVisible(true);
<<<<<<< Updated upstream
        checkAct.setSelected(true);
        btnNuevo.setEnabled(false);
        btnModificar.setEnabled(false);
=======
        btnModificar.setEnabled(false);
        btnNuevo.setEnabled(false);
        checkAct.setSelected(true);
>>>>>>> Stashed changes
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        txtBucarNom = new javax.swing.JTextField();
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
        btnNuevo = new javax.swing.JButton();
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
        jLabel2.setText("Buscar Por Nombre");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 110, -1, -1));

        txtBucarNom.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        getContentPane().add(txtBucarNom, new org.netbeans.lib.awtextra.AbsoluteConstraints(324, 111, 150, -1));

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
<<<<<<< Updated upstream
        txtTel.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtTelKeyTyped(evt);
=======
        txtTel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtTelMouseClicked(evt);
>>>>>>> Stashed changes
            }
        });
        getContentPane().add(txtTel, new org.netbeans.lib.awtextra.AbsoluteConstraints(164, 356, 209, -1));

        btnNuevo.setBackground(new java.awt.Color(0, 0, 0));
        btnNuevo.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnNuevo.setForeground(new java.awt.Color(255, 255, 255));
        btnNuevo.setText("NUEVO CUARTEL");
        btnNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoActionPerformed1(evt);
            }
        });
        getContentPane().add(btnNuevo, new org.netbeans.lib.awtextra.AbsoluteConstraints(164, 466, -1, -1));

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
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 620));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        setVisible(false);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed

    }//GEN-LAST:event_jButton3ActionPerformed


    private void btnNuevoActionPerformed1(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoActionPerformed1
        Cuartel cuartel = new Cuartel();

        List<String> errores = new ArrayList<>();

        // validacion y condiciones
        String nombreCuartel = txtNombre.getText().trim();
        if (nombreCuartel.length() < 6 || nombreCuartel.length() > 50 || !nombreCuartel.matches("[a-zA-Z0-9 -]+")) {
            errores.add("Nombre de cuartel: Debe tener entre 6 y 50 caracteres y solo puede contener letras, números, espacios y guiones.");
        } else {
            cuartel.setNombre_cuartel(nombreCuartel);
        }

        // validacion y condiciones
        String direccion = txtDirecc.getText().trim();
        if (direccion.length() < 6 || direccion.length() > 30 || !direccion.matches("[a-zA-Z0-9 -]+")) {
            errores.add("Dirección: Debe tener entre 6 y 30 caracteres y puede contener letras, espacios o guiones medios.");
        } else {
            cuartel.setDireccion(direccion);
        }

        // Validar coordenadas
        String coordenadaX = txtCoorX.getText().trim();
        String coordenadaY = txtCoorY.getText().trim();
        if (esNumeroDouble(coordenadaX) && esNumeroDouble(coordenadaY)) {
            cuartel.setCoord_X(Double.parseDouble(coordenadaX));
            cuartel.setCoord_Y(Double.parseDouble(coordenadaY));
        } else {
            errores.add("Las coordenadas deben ser números válidos.");
        }

        // Validar teléfono
        String telefono = txtTel.getText().trim();
        if (telefono.length() < 6 || telefono.length() > 20 || !esNumero(telefono)) {
            errores.add("Teléfono: Debe tener entre 6 y 20 caracteres y contener solo números.");
        } else {
            cuartel.setTelefono(telefono);
        }

        // Validar correo
        String correo = txtCorreo.getText().trim();
        if (correo.length() > 19 || !esCorreoValido(correo)) {
            errores.add("Correo electrónico: Debe tener un máximo de 20 caracteres y ser un correo válido.");
        } else {
            cuartel.setCorreo(correo);
        }

        cuartel.setEstado(checkAct.isSelected());

        // Existe el cuartel?
        CuartelData cuartelData = new CuartelData();
        Cuartel existeCuartel = cuartelData.BuscarCuartelPorNombre(nombreCuartel);

        if (existeCuartel != null) {
            errores.add("Ya existe un Cuartel con el nombre ingresado.");
        }

        // Mostrar errores si los hay
        if (!errores.isEmpty()) {
            String mensajeFinal = String.join("\n", errores);
            JOptionPane.showMessageDialog(this, mensajeFinal, "Errores de validación", JOptionPane.ERROR_MESSAGE);

            // Desactivar los botones en caso de errores
        } else {
            // Activar los botones si no hay errores

            // Si no hay errores, guardar el cuartel
            if (cuartelData.GuardarCuartel(cuartel)) {
                JOptionPane.showMessageDialog(this, "Cuartel Agregado Exitosamente. ");
            }
            limpiar();
        }
    }//GEN-LAST:event_btnNuevoActionPerformed1

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed

        btnModificar.setEnabled(true);
        try {
            // Validar nombre de búsqueda
            String nombreBusqueda = txtBucarNom.getText().trim();
            if (nombreBusqueda.isEmpty() || !nombreBusqueda.matches("[a-zA-Z ]{6,50}")) {
                JOptionPane.showMessageDialog(this, "Ingrese un nombre válido para la búsqueda. Debe tener entre 6 y 50 letras y/o espacios.");
                return;
            }

            CuartelData cuartelData = new CuartelData();
            Cuartel cuartel = cuartelData.BuscarCuartelPorNombre(nombreBusqueda);

            if (cuartel != null) {
                txtNombre.setText(cuartel.getNombre_cuartel());
                txtDirecc.setText(cuartel.getDireccion());
                txtCoorX.setText(String.valueOf(cuartel.getCoord_X()));
                txtCoorY.setText(String.valueOf(cuartel.getCoord_Y()));
                txtTel.setText(cuartel.getTelefono());
                txtCorreo.setText(cuartel.getCorreo());
                checkAct.setSelected(cuartel.getEstado());
                btnNuevo.setEnabled(true);
                btnModificar.setEnabled(true);
            } else {
                JOptionPane.showMessageDialog(this, "No se encontró un Cuartel con este nombre.");
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Error al buscar el Cuartel: " + e.getMessage());
        }

    }//GEN-LAST:event_btnBuscarActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        limpiar();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed
        try {
            List<String> errores = new ArrayList<>();

            // Validar nombre de cuartel
            String nombreCuartel = txtNombre.getText().trim();
            if (nombreCuartel.isEmpty() || nombreCuartel.length() < 6 || nombreCuartel.length() > 50 || !nombreCuartel.matches("[a-zA-Z ]+")) {
                errores.add("Nombre de cuartel: Debe tener entre 6 y 50 letras y solo puede contener letras y espacios.");
            } else {
                // Si el nombre cumple, buscar el cuartel para modificarlo
                CuartelData cuartelData = new CuartelData();
                Cuartel cuartel = cuartelData.BuscarCuartelPorNombre(nombreCuartel);

                if (cuartel != null) {
                    // Asignar nombre de cuartel validado anteriormente
                    cuartel.setNombre_cuartel(nombreCuartel);

                    // Validar dirección
                    String direccion = txtDirecc.getText().trim();
                    if (direccion.isEmpty() || direccion.length() < 6 || direccion.length() > 30 || !direccion.matches("[a-zA-Z -]+")) {
                        errores.add("Dirección: Debe tener entre 6 y 30 caracteres y puede contener letras, espacios o guiones medios.");
                    } else {
                        cuartel.setDireccion(direccion);
                    }

                    // Validar coordenadas
                    String coordenadaX = txtCoorX.getText().trim();
                    String coordenadaY = txtCoorY.getText().trim();
                    if (coordenadaX.isEmpty() || coordenadaY.isEmpty() || !esNumeroDouble(coordenadaX) || !esNumeroDouble(coordenadaY)) {
                        errores.add("Las coordenadas deben ser números válidos.");
                    } else {
                        cuartel.setCoord_X(Double.parseDouble(coordenadaX));
                        cuartel.setCoord_Y(Double.parseDouble(coordenadaY));
                    }

                    // Validar teléfono
                    String telefono = txtTel.getText().trim();
                    if (telefono.isEmpty() || telefono.length() < 6 || telefono.length() > 20 || !esNumero(telefono)) {
                        errores.add("Teléfono: Debe tener entre 6 y 20 caracteres y contener solo números.");
                    } else {
                        cuartel.setTelefono(telefono);
                    }

                    // Validar correo
                    String correo = txtCorreo.getText().trim();
                    if (correo.isEmpty() || correo.length() > 19 || !esCorreoValido(correo)) {
                        errores.add("Correo electrónico: Debe tener un máximo de 20 caracteres y ser un correo válido.");
                    } else {
                        cuartel.setCorreo(correo);
                    }

                    cuartel.setEstado(checkAct.isSelected());

                    // Mostrar errores si los hay
                    if (!errores.isEmpty()) {
                        // Desactivar los botones en caso de errores
                        btnNuevo.setEnabled(false);
                        btnModificar.setEnabled(false);
                        String mensajeFinal = String.join("\n", errores);
                        JOptionPane.showMessageDialog(this, mensajeFinal, "Errores de validación", JOptionPane.ERROR_MESSAGE);
                    } else {
                        // Método para modificar el cuartel
                        if (cuartelData.ModificarCuartel(cuartel)) {
                            // Desactivar los botones en caso de errores
                            btnNuevo.setEnabled(false);
                            btnModificar.setEnabled(true);
                            JOptionPane.showMessageDialog(this, "Cuartel modificado exitosamente.");
                            limpiar();
                        }
                    }

                } else {
                    errores.add("No se encontró un Cuartel con este nombre.");
                }
            }

        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Error: Ingrese un número válido para el ID: " + e.getMessage(), "Error de formato", JOptionPane.ERROR_MESSAGE);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Error inesperado: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }

    }//GEN-LAST:event_btnModificarActionPerformed

<<<<<<< Updated upstream
    private void txtTelKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTelKeyTyped
        btnNuevo.setEnabled(true);
    }//GEN-LAST:event_txtTelKeyTyped
=======
    private void txtTelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtTelMouseClicked
        btnNuevo.setEnabled(true);
    }//GEN-LAST:event_txtTelMouseClicked
>>>>>>> Stashed changes


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnModificar;
    private javax.swing.JButton btnNuevo;
    private javax.swing.JCheckBox checkAct;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
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
    private javax.swing.JTextField txtBucarNom;
    private javax.swing.JTextField txtCoorX;
    private javax.swing.JTextField txtCoorY;
    private javax.swing.JTextField txtCorreo;
    private javax.swing.JTextField txtDirecc;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtTel;
    // End of variables declaration//GEN-END:variables

    private void limpiar() {
        txtBucarNom.setText("");
        txtNombre.setText("");
        txtCoorX.setText("");
        txtCoorY.setText("");
        txtCorreo.setText("");
        txtDirecc.setText("");
        txtTel.setText("");
        checkAct.setSelected(true);
        btnModificar.setEnabled(false);
        btnNuevo.setEnabled(false);

    }

    private boolean esNumero(String texto) {
        // Permite números decimales con signo opcional y parte decimal opcional
        return texto.matches("\\d+");
    }

    private boolean esNumeroDouble(String texto) {
        // Permite números decimales con signo opcional y parte decimal opcional
        return texto.matches("-?\\d+(\\.\\d+)?");
    }

    private boolean esCorreoValido(String correo) {

        return correo.matches("^[A-Za-z0-9+_.-]+@(.+)$");
    }
}
