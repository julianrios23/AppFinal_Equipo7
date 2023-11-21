package Vistas;

import AccesoADatos.BrigadaData;
import AccesoADatos.Conexion;
import AccesoADatos.CuartelData;
import Entidades.Brigada;
import Entidades.Cuartel;
import Entidades.Especialidad;
import java.sql.Connection;
import java.util.ArrayList;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;

public class CargaBrigadas extends javax.swing.JFrame {

    private Connection con = null;

    public CargaBrigadas() {

        con = Conexion.getConexion();
        initComponents();
        cargarComboBox();
        cargarEspecialidad();

        checkAct.setSelected(true);
        checkDispon.setSelected(true);
        btnGuardar.setEnabled(false);
        btnModificar.setEnabled(false);

    }

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

    private void cargarEspecialidad() {
        cmbEspec.removeAllItems();
        Especialidad[] especialidades = Especialidad.values();
        for (Especialidad especialidad : especialidades) {
            cmbEspec.addItem(especialidad);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        txtnomBuscar = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        cmbEspec = new javax.swing.JComboBox<>();
        jInternalFrame1 = new javax.swing.JInternalFrame();
        jLabel5 = new javax.swing.JLabel();
        JBBuscar = new javax.swing.JButton();
        JTFNombreBrigada = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        JTFCodigo = new javax.swing.JTextField();
        JTFidCuartel = new javax.swing.JTextField();
        JTFEspecialidad = new javax.swing.JTextField();
        JRBEstado = new javax.swing.JRadioButton();
        JBModificar = new javax.swing.JButton();
        JBSalir = new javax.swing.JButton();
        JRBDisponibilidad = new javax.swing.JRadioButton();
        jLabel9 = new javax.swing.JLabel();
        JBBuscarPorIDCuartel = new javax.swing.JButton();
        JBNuevo = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        JCBCuarteles = new javax.swing.JComboBox<>();
        JBLimpiar = new javax.swing.JButton();
        JRBMostrarCuarteles = new javax.swing.JRadioButton();
        btnBuscar = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        checkAct = new javax.swing.JCheckBox();
        btnGuardar = new javax.swing.JButton();
        jLabel15 = new javax.swing.JLabel();
        cmbCuartel = new javax.swing.JComboBox<>();
        txtNombre = new javax.swing.JTextField();
        btnModificar = new javax.swing.JButton();
        btnLimpiar = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        checkDispon = new javax.swing.JCheckBox();
        jLabel11 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setText("Cargar Brigadas");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(51, 25, -1, -1));

        jButton1.setBackground(new java.awt.Color(0, 0, 0));
        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("CERRAR");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(663, 32, -1, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setText("Ingrese Nombre Brigada:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 90, 180, -1));

        txtnomBuscar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        getContentPane().add(txtnomBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 90, 170, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setText("Nombre de Brigada:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 190, -1, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setText("Especialidad:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 250, -1, -1));

        cmbEspec.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        getContentPane().add(cmbEspec, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 250, 273, -1));

        jInternalFrame1.setClosable(true);
        jInternalFrame1.setIconifiable(true);
        jInternalFrame1.setMaximizable(true);
        jInternalFrame1.setTitle("Busqueda Y Modificacion De Brigadas");

        jLabel5.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        jLabel5.setText("Codigo/ID Brigada");

        JBBuscar.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        JBBuscar.setText("Buscar");
        JBBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBBuscarActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        jLabel6.setText("Nombre Brigada");

        jLabel7.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        jLabel7.setText("Cuartel");

        jLabel8.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        jLabel8.setText("Especialidad");

        JRBEstado.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        JRBEstado.setText("Estado");

        JBModificar.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        JBModificar.setText("Guardar Modificaciones");
        JBModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBModificarActionPerformed(evt);
            }
        });

        JBSalir.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        JBSalir.setText("Salir");
        JBSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBSalirActionPerformed(evt);
            }
        });

        JRBDisponibilidad.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        JRBDisponibilidad.setText("Disponibilidad");

        jLabel9.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        jLabel9.setText("ID/ Codigo Cuartel");

        JBBuscarPorIDCuartel.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        JBBuscarPorIDCuartel.setText("Buscar");
        JBBuscarPorIDCuartel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBBuscarPorIDCuartelActionPerformed(evt);
            }
        });

        JBNuevo.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        JBNuevo.setText("Nuevo");
        JBNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBNuevoActionPerformed(evt);
            }
        });

        jLabel10.setText("*_En caso de crear nueva brigada primero Buscar un Cuartel por ID");

        JCBCuarteles.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                JCBCuartelesItemStateChanged(evt);
            }
        });

        JBLimpiar.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        JBLimpiar.setText("Limpiar Campos");
        JBLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBLimpiarActionPerformed(evt);
            }
        });

        JRBMostrarCuarteles.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        JRBMostrarCuarteles.setText("Mostrar Cuarteles");
        JRBMostrarCuarteles.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JRBMostrarCuartelesActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jInternalFrame1Layout = new javax.swing.GroupLayout(jInternalFrame1.getContentPane());
        jInternalFrame1.getContentPane().setLayout(jInternalFrame1Layout);
        jInternalFrame1Layout.setHorizontalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jInternalFrame1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jInternalFrame1Layout.createSequentialGroup()
                        .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jInternalFrame1Layout.createSequentialGroup()
                                .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jInternalFrame1Layout.createSequentialGroup()
                                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(JTFCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(JBBuscar))
                                    .addGroup(jInternalFrame1Layout.createSequentialGroup()
                                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(JTFNombreBrigada, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jInternalFrame1Layout.createSequentialGroup()
                                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(JTFEspecialidad, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(21, 21, 21))
                            .addGroup(jInternalFrame1Layout.createSequentialGroup()
                                .addComponent(JBNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(JBModificar)))
                        .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jInternalFrame1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jInternalFrame1Layout.createSequentialGroup()
                                                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(JTFidCuartel, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(JBBuscarPorIDCuartel))
                                            .addComponent(jLabel10))
                                        .addGroup(jInternalFrame1Layout.createSequentialGroup()
                                            .addComponent(JRBEstado)
                                            .addGap(74, 74, 74)
                                            .addComponent(JRBDisponibilidad)))
                                    .addGroup(jInternalFrame1Layout.createSequentialGroup()
                                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(JCBCuarteles, javax.swing.GroupLayout.PREFERRED_SIZE, 379, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(jInternalFrame1Layout.createSequentialGroup()
                                .addGap(78, 78, 78)
                                .addComponent(JBLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jInternalFrame1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(JRBMostrarCuarteles)
                            .addComponent(JBSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(33, 33, 33))
        );
        jInternalFrame1Layout.setVerticalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jInternalFrame1Layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(JTFCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JBBuscar)
                    .addComponent(jLabel9)
                    .addComponent(JTFidCuartel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JBBuscarPorIDCuartel))
                .addGap(12, 12, 12)
                .addComponent(jLabel10)
                .addGap(18, 18, 18)
                .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jLabel6)
                    .addComponent(JTFNombreBrigada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JCBCuarteles, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(50, 50, 50)
                .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(JTFEspecialidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JRBEstado)
                    .addComponent(JRBDisponibilidad)
                    .addComponent(JRBMostrarCuarteles))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JBModificar)
                    .addComponent(JBNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JBLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(JBSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
        );

        getContentPane().add(jInternalFrame1, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 300, 0, 0));

        btnBuscar.setBackground(new java.awt.Color(0, 0, 0));
        btnBuscar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnBuscar.setForeground(new java.awt.Color(255, 255, 255));
        btnBuscar.setText("BUSCAR");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });
        getContentPane().add(btnBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 90, -1, -1));

        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel12.setText("CREAR NUEVA BRIGADA");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 140, -1, -1));

        jLabel14.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel14.setText("Estado:");
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 360, -1, -1));

        checkAct.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        checkAct.setText("ACTIVA / NO ACTIVA");
        getContentPane().add(checkAct, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 360, -1, -1));

        btnGuardar.setBackground(new java.awt.Color(0, 0, 0));
        btnGuardar.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnGuardar.setForeground(new java.awt.Color(255, 255, 255));
        btnGuardar.setText("GUARDAR ");
        btnGuardar.setToolTipText("Nueva Brigada");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });
        getContentPane().add(btnGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 490, -1, -1));

        jLabel15.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel15.setText("Asignar a Cuartel:");
        getContentPane().add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(192, 409, -1, -1));

        cmbCuartel.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        getContentPane().add(cmbCuartel, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 410, 273, -1));

        txtNombre.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        getContentPane().add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 190, 270, -1));

        btnModificar.setBackground(new java.awt.Color(0, 0, 0));
        btnModificar.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnModificar.setForeground(new java.awt.Color(255, 255, 255));
        btnModificar.setText("MODIFICAR");
        btnModificar.setToolTipText("Modificar Brigada Existente");
        btnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarActionPerformed(evt);
            }
        });
        getContentPane().add(btnModificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 490, -1, -1));

        btnLimpiar.setBackground(new java.awt.Color(0, 0, 0));
        btnLimpiar.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnLimpiar.setForeground(new java.awt.Color(255, 255, 255));
        btnLimpiar.setText("LIMPIAR");
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });
        getContentPane().add(btnLimpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 490, -1, -1));

        jLabel13.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel13.setText("Disponibilidad:");
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 300, -1, -1));

        checkDispon.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        checkDispon.setText("DISPONIBLE / NO DISPONIBLE");
        getContentPane().add(checkDispon, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 300, -1, -1));

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/fondo rojo.jpeg"))); // NOI18N
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 810, 620));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        setVisible(false);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void JBBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBBuscarActionPerformed
        try {
            String nombre = txtNombre.getText();
            BrigadaData brigadaData = new BrigadaData();
            Brigada brig = brigadaData.BuscarBrigada(nombre);

            if (brig != null) {
                System.out.println("Brigada encontrada: " + brig.getNombre_brigada());
                txtNombre.setText(brig.getNombre_brigada());
                cmbEspec.setSelectedItem(brig.getEspecialidad());
                checkAct.setSelected(brig.isEstado());

                cargarComboBox();

                CuartelData cd = new CuartelData();
                List<Cuartel> cuarteles = cd.ListarCuarteles();

                cmbCuartel.removeAllItems();

                for (Cuartel cuartel : cuarteles) {
                    cmbCuartel.addItem(cuartel.getNombre_cuartel());
                }

                cmbCuartel.setSelectedItem(brig.getNombreCuartel());

            } else {
                System.out.println("No se encontró una Brigada con este nombre.");
                JOptionPane.showMessageDialog(this, "No se encontró una Brigada con este nombre.");
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Ingrese un nombre válido" + e.getMessage());
        }
    }//GEN-LAST:event_JBBuscarActionPerformed

    private void JBModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBModificarActionPerformed

    }//GEN-LAST:event_JBModificarActionPerformed

    private void JBSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBSalirActionPerformed

    }//GEN-LAST:event_JBSalirActionPerformed

    private void JBBuscarPorIDCuartelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBBuscarPorIDCuartelActionPerformed


    }//GEN-LAST:event_JBBuscarPorIDCuartelActionPerformed

    private void JBNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBNuevoActionPerformed


    }//GEN-LAST:event_JBNuevoActionPerformed

    private void JCBCuartelesItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_JCBCuartelesItemStateChanged

    }//GEN-LAST:event_JCBCuartelesItemStateChanged

    private void JBLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBLimpiarActionPerformed

    }//GEN-LAST:event_JBLimpiarActionPerformed

    private void JRBMostrarCuartelesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JRBMostrarCuartelesActionPerformed

    }//GEN-LAST:event_JRBMostrarCuartelesActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed

        BrigadaData brigadaData = new BrigadaData();
        Brigada nuevaBrigada = new Brigada();

        // Validaciones
        List<String> errores = new ArrayList<>();

        // Validar nombre
        String nombre = txtNombre.getText().trim();
        if (nombre.length() < 4 || nombre.length() > 20 || !nombre.matches("[a-zA-Z ]+")) {
            errores.add("Nombre: Debe tener entre 4 y 20 letras y solo puede contener letras y espacios.");
        }

        // Validar especialidad
        String especialidadSeleccionada = cmbEspec.getSelectedItem().toString();
        if ("SELECCIONAR_ESPECIALIDAD".equals(especialidadSeleccionada)) {
            errores.add("Debe seleccionar una especialidad diferente a 'SELECCIONAR_ESPECIALIDAD'.");
        }

        // Validar cuartel
        String cuartelSeleccionado = cmbCuartel.getSelectedItem().toString();
        if ("Cuarteles".equals(cuartelSeleccionado)) {
            errores.add("Debe seleccionar un cuartel diferente a 'Cuarteles'.");
        }

        // Mostrar errores si los hay
        if (!errores.isEmpty()) {
            StringBuilder mensaje = new StringBuilder("Errores:\n");
            for (String error : errores) {
                mensaje.append("- ").append(error).append("\n");
            }
            JOptionPane.showMessageDialog(this, mensaje.toString(), "Error de Validación", JOptionPane.ERROR_MESSAGE);
            return;
        } else {
            //si no hay errores, los campos son todos validos
            //Agregar brigada
            nuevaBrigada.setNombre_brigada(nombre);
            nuevaBrigada.setEspecialidad(especialidadSeleccionada);
            nuevaBrigada.setDisponibilidad(checkDispon.isSelected());
            nuevaBrigada.setEstado(checkAct.isSelected());

            asignarCuartelABrigada(nuevaBrigada);

            if (brigadaData.GuardarBrigada(nuevaBrigada)) {
                JOptionPane.showMessageDialog(this, "Brigada Agregada Exitosamente.");
                limpiar();
            }

        }


    }//GEN-LAST:event_btnGuardarActionPerformed

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        limpiar();
    }//GEN-LAST:event_btnLimpiarActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        try {
            // Validar nombre de búsqueda
            String nombreBusqueda = txtnomBuscar.getText().trim();
            if (nombreBusqueda.isEmpty() || !nombreBusqueda.matches("[a-zA-Z ]{4,20}")) {
                JOptionPane.showMessageDialog(this, "Ingrese un nombre válido para la búsqueda. Debe tener entre 4 y 20 letras y solo puede contener letras y espacios.");
                return;
            }

            BrigadaData brigadaData = new BrigadaData();
            Brigada brigada = brigadaData.BuscarBrigada(nombreBusqueda);

            if (brigada != null) {
                btnModificar.setEnabled(true);
                txtNombre.setText(brigada.getNombre_brigada());
                Especialidad[] especialidades = Especialidad.values();
                DefaultComboBoxModel<Especialidad> model = new DefaultComboBoxModel<>(especialidades);
                cmbEspec.setModel(model);
                checkAct.setSelected(brigada.isEstado());
                checkDispon.setSelected(brigada.getDisponibilidad());

                CuartelData cuartelData = new CuartelData();
                List<Cuartel> cuarteles = cuartelData.ListarCuarteles();
                cmbCuartel.removeAllItems();

                for (Cuartel cuartel : cuarteles) {
                    cmbCuartel.addItem(cuartel.getNombre_cuartel());
                }

                cmbCuartel.setSelectedItem(brigada.getNombre_cuartel());

            } else {
                JOptionPane.showMessageDialog(this, "No se encontró una Brigada con este nombre.");
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Error al buscar la Brigada: " + e.getMessage());
        }
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed

        try {
            // Obtener los datos actuales de la brigada
            String nombreBusqueda = txtnomBuscar.getText().trim();
            BrigadaData brigadaData = new BrigadaData();
            Brigada brigadaExistente = brigadaData.BuscarBrigada(nombreBusqueda);
            btnModificar.setEnabled(true);
            if (brigadaExistente != null) {
                // Actualizar los campos de la brigadaExistente
                brigadaExistente.setNombre_brigada(txtNombre.getText());

                // Obtener la especialidad seleccionada del JComboBox
                Especialidad especialidadSeleccionada = (Especialidad) cmbEspec.getSelectedItem();
                brigadaExistente.setEspecialidad(especialidadSeleccionada.name()); // Guardar el nombre del enum como String

                brigadaExistente.setEstado(checkAct.isSelected());
                brigadaExistente.setDisponibilidad(checkDispon.isSelected());

                // Obtener el nombre del cuartel seleccionado
                String nombreCuartelSeleccionado = (String) cmbCuartel.getSelectedItem();

                // Actualizar el nombre del cuartel en la brigada existente
                brigadaExistente.setNombre_cuartel(nombreCuartelSeleccionado);

                // Llamar al método para modificar la brigada
                BrigadaData bd = new BrigadaData();

                bd.ModificarBrigada(brigadaExistente);

                bd.ModificarBrigada(brigadaExistente);


                JOptionPane.showMessageDialog(this, "Modificado Exitosamente.");
                limpiar();
                cargarEspecialidades();
            } else {
                JOptionPane.showMessageDialog(this, "No se encontró una Brigada con este nombre.");
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Error al buscar o modificar la Brigada: " + e.getMessage());
        }


    }//GEN-LAST:event_btnModificarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JBBuscar;
    private javax.swing.JButton JBBuscarPorIDCuartel;
    private javax.swing.JButton JBLimpiar;
    private javax.swing.JButton JBModificar;
    private javax.swing.JButton JBNuevo;
    private javax.swing.JButton JBSalir;
    private javax.swing.JComboBox<Cuartel> JCBCuarteles;
    private javax.swing.JRadioButton JRBDisponibilidad;
    private javax.swing.JRadioButton JRBEstado;
    private javax.swing.JRadioButton JRBMostrarCuarteles;
    private javax.swing.JTextField JTFCodigo;
    private javax.swing.JTextField JTFEspecialidad;
    private javax.swing.JTextField JTFNombreBrigada;
    private javax.swing.JTextField JTFidCuartel;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JButton btnModificar;
    private javax.swing.JCheckBox checkAct;
    private javax.swing.JCheckBox checkDispon;
    private javax.swing.JComboBox<String> cmbCuartel;
    private javax.swing.JComboBox<Especialidad> cmbEspec;
    private javax.swing.JButton jButton1;
    private javax.swing.JInternalFrame jInternalFrame1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
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
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtnomBuscar;
    // End of variables declaration//GEN-END:variables

    private void limpiar() {
        txtnomBuscar.setText("");
        txtNombre.setText("");
        cmbCuartel.setSelectedIndex(0);
        cmbEspec.setSelectedIndex(-1);
        checkAct.setSelected(true);
        checkDispon.setSelected(true);
        btnBuscar.setEnabled(true);
        btnGuardar.setEnabled(false);
        btnModificar.setEnabled(false);

    }

    private Cuartel obtenerCuartelSeleccionado() {
        CuartelData cuartelData = new CuartelData();
        String nombreCuartelSeleccionado = (String) cmbCuartel.getSelectedItem();
        return cuartelData.BuscarCuartelPorNombre(nombreCuartelSeleccionado);
    }

    private void asignarCuartelABrigada(Brigada brigada) {
        Cuartel cuartelSeleccionado = obtenerCuartelSeleccionado();
        if (cuartelSeleccionado != null) {
            brigada.asignarCuartel(cuartelSeleccionado);
        } else {
            JOptionPane.showMessageDialog(this, "Seleccione un Cuartel válido.");
        }
    }
    
    private void cargarEspecialidades() {
    
    cmbEspec.removeAllItems();

    for (Especialidad especialidad : Especialidad.values()) {
        cmbEspec.addItem(especialidad);
    }
}

   

}
