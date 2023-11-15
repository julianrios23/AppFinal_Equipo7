package Vistas;

import AccesoADatos.BomberoData;
import AccesoADatos.BrigadaData;
import AccesoADatos.SiniestroData;
import Entidades.*;
import Entidades.Siniestro;
import java.awt.Color;
import java.awt.event.KeyEvent;
import java.sql.Date;
import java.time.LocalDate;
import java.time.ZoneId;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Julian Rios
 */
public class ResolucionSiniestros extends javax.swing.JFrame {

    private DefaultTableModel tabla = new DefaultTableModel() {
        public boolean isCellEditable(int f, int c) {
            return false;
        }
    };

    public ResolucionSiniestros() {
        initComponents();
        iniciarTabla();
        btnGuardar.setVisible(false);
        txtBrig.setEditable(false);
        txtBrig.setOpaque(false);
        txtTipoSin.setEditable(false);
        txtTipoSin.setOpaque(false);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        btnCerrar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        txtCodigo = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtBrig = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        date = new com.toedter.calendar.JDateChooser();
        jLabel5 = new javax.swing.JLabel();
        txtHora = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtTipoSin = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        btnBuscar = new javax.swing.JButton();
        butSi = new javax.swing.JRadioButton();
        butNo = new javax.swing.JRadioButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        T_Bomberos = new javax.swing.JTable();
        jLabel8 = new javax.swing.JLabel();
        txtPunt = new javax.swing.JTextField();
        btnGuardar = new javax.swing.JButton();
        btnLimpiar = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setText("Resolución de Siniestros");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 23, -1, -1));

        btnCerrar.setBackground(new java.awt.Color(0, 0, 0));
        btnCerrar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnCerrar.setForeground(new java.awt.Color(255, 255, 255));
        btnCerrar.setText("CERRAR");
        btnCerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCerrarActionPerformed(evt);
            }
        });
        getContentPane().add(btnCerrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(656, 30, -1, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setText("Codigo Siniestro:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(151, 114, -1, -1));

        txtCodigo.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        txtCodigo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtCodigoKeyReleased(evt);
            }
        });
        getContentPane().add(txtCodigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(284, 114, 111, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setText("Brigada a Cargo:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 156, -1, -1));

        txtBrig.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        getContentPane().add(txtBrig, new org.netbeans.lib.awtextra.AbsoluteConstraints(172, 156, 152, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setText("Fecha Resolución:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 241, -1, -1));

        date.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        getContentPane().add(date, new org.netbeans.lib.awtextra.AbsoluteConstraints(176, 239, 217, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setText("Hora Resolución:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 294, -1, -1));

        txtHora.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        getContentPane().add(txtHora, new org.netbeans.lib.awtextra.AbsoluteConstraints(172, 294, 74, -1));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel6.setText("Tipo de Siniestro:");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 198, -1, -1));

        txtTipoSin.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        getContentPane().add(txtTipoSin, new org.netbeans.lib.awtextra.AbsoluteConstraints(175, 198, 218, -1));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel7.setText("Siniestro Resuelto?");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(473, 156, -1, -1));

        btnBuscar.setBackground(new java.awt.Color(0, 0, 0));
        btnBuscar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnBuscar.setForeground(new java.awt.Color(255, 255, 255));
        btnBuscar.setText("BUSCAR");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });
        getContentPane().add(btnBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(413, 111, -1, -1));

        butSi.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        butSi.setText("SI");
        butSi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butSiActionPerformed(evt);
            }
        });
        getContentPane().add(butSi, new org.netbeans.lib.awtextra.AbsoluteConstraints(481, 196, -1, -1));

        butNo.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        butNo.setText("NO");
        butNo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butNoActionPerformed(evt);
            }
        });
        getContentPane().add(butNo, new org.netbeans.lib.awtextra.AbsoluteConstraints(534, 196, -1, -1));

        T_Bomberos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(T_Bomberos);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 359, 569, 184));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel8.setText("Puntuación:");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(449, 294, -1, -1));

        txtPunt.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        txtPunt.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtPuntFocusLost(evt);
            }
        });
        txtPunt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtPuntKeyReleased(evt);
            }
        });
        getContentPane().add(txtPunt, new org.netbeans.lib.awtextra.AbsoluteConstraints(545, 294, -1, -1));

        btnGuardar.setBackground(new java.awt.Color(0, 0, 0));
        btnGuardar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnGuardar.setForeground(new java.awt.Color(255, 255, 255));
        btnGuardar.setText("GUARDAR");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });
        getContentPane().add(btnGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 380, -1, -1));

        btnLimpiar.setBackground(new java.awt.Color(0, 0, 0));
        btnLimpiar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnLimpiar.setForeground(new java.awt.Color(255, 255, 255));
        btnLimpiar.setText("LIMPIAR");
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });
        getContentPane().add(btnLimpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 460, 98, -1));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/fondo rojo.jpeg"))); // NOI18N
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 600));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerrarActionPerformed
        setVisible(false);
    }//GEN-LAST:event_btnCerrarActionPerformed

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        limpiarCampos();
    }//GEN-LAST:event_btnLimpiarActionPerformed

    private void butSiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butSiActionPerformed
        // Si se elegi opcion SI, la opcion NO se bloquea
        butNo.setSelected(false);
        txtPunt.setEnabled(true);
        date.setEnabled(true);
    }//GEN-LAST:event_butSiActionPerformed

    private void butNoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butNoActionPerformed
        // Si se elegi opcion NO, la opcion SI se bloqua
        butSi.setSelected(false);
        txtPunt.setEnabled(false);
        date.setEnabled(false);
    }//GEN-LAST:event_butNoActionPerformed

    private void txtPuntFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtPuntFocusLost
        try {
            int a = Integer.parseInt(txtPunt.getText());
            if (a < 1 || a > 10) {
                a = Integer.parseInt(txtBrig.getText());
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Debe ingresar un Nº entero entre 1 y 10");
        }
    }//GEN-LAST:event_txtPuntFocusLost

    private void txtPuntKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPuntKeyReleased
        // Si la tecla ENTER es precionada se valida el campo
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            try {
                int a = Integer.parseInt(txtPunt.getText());
                if (a < 1 || a > 10) {
                    a = Integer.parseInt(txtBrig.getText());
                }
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(this, "Debe ingresar un Nº entero entre 1 y 10");
            }
        }
    }//GEN-LAST:event_txtPuntKeyReleased

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        borrarFilas();
        buscarSiniestro();
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        // Se actualiza el Siniestro en la DB

        LocalDate fechaFin;
        try {
            fechaFin = date.getDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
        } catch (NullPointerException e) {
            JOptionPane.showMessageDialog(this, "Debe indicar la fecha de resolución del incidente");
            return;
        }

        int puntaje = 0, codigo = 0;
        try {
            puntaje = Integer.parseInt(txtPunt.getText());
            codigo = Integer.parseInt(txtCodigo.getText());
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Debe ingresar un valor aceptable");
        }

        SiniestroData sinD = new SiniestroData();
        Siniestro sin = sinD.buscarSiniestro(codigo);

        // Obtener la fecha actual
        LocalDate fechaActual = LocalDate.now();

          // aca verifico la fecha no sea anterior 
        if (sin.getFechaSinietro().isBefore(fechaFin) || fechaFin.isAfter(fechaActual)) {
            sin.setFechaResoluc(fechaFin);
            sin.setPuntuacion(puntaje);
            sin.setCodSiniestro(codigo);
        } else {
            JOptionPane.showMessageDialog(this, "La Fecha de Resolución no puede ser anterior a la del Inicio del Reporte o estar en el futuro", "ERROR CRITICO", 0);
            return;
        }

        int resp = JOptionPane.showConfirmDialog(this, "Esta seguro de Finalizar "
                + "el Reporte " + codigo + " ??", "CONFIRMAR", 0, 3);
        if (resp == 0) {
            sinD.concluirSiniestro(sin);
            liberarBrigada();
        } else {
            return;
        }

        limpiarCampos();
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void txtCodigoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCodigoKeyReleased
        // Si se presiona la tecla ENTER se ejecuta la busqueda
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            buscarSiniestro();
        }
    }//GEN-LAST:event_txtCodigoKeyReleased


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable T_Bomberos;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnCerrar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JRadioButton butNo;
    private javax.swing.JRadioButton butSi;
    private com.toedter.calendar.JDateChooser date;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txtBrig;
    private javax.swing.JTextField txtCodigo;
    private javax.swing.JTextField txtHora;
    private javax.swing.JTextField txtPunt;
    private javax.swing.JTextField txtTipoSin;
    // End of variables declaration//GEN-END:variables

    private void limpiarCampos() {
        date.setDate(null);
        txtCodigo.setText("");
        txtPunt.setText("");
        txtBrig.setText("");
        txtTipoSin.setText("");
        butNo.setSelected(false);
        butSi.setSelected(false);
        borrarFilas();
        btnGuardar.setVisible(false);
    }

    private void iniciarTabla() {

        tabla.addColumn(" COD ");
        tabla.addColumn("Nombre y Apellido");
        tabla.setRowCount(0);

        T_Bomberos.setModel(tabla);

        T_Bomberos.setBackground(Color.yellow);
        T_Bomberos.setForeground(Color.darkGray);
        T_Bomberos.setSelectionBackground(Color.orange);
        T_Bomberos.setSelectionForeground(Color.black);

        DefaultTableCellRenderer Alinear = new DefaultTableCellRenderer();
        Alinear.setHorizontalAlignment(SwingConstants.CENTER);
        T_Bomberos.getColumnModel().getColumn(0).setCellRenderer(Alinear);
        T_Bomberos.getColumnModel().getColumn(1).setCellRenderer(Alinear);
    }

    private void borrarFilas() {
        int filas = T_Bomberos.getRowCount() - 1;
        for (; filas >= 0; filas--) {
            tabla.removeRow(filas);
        }
    }

    private void llenarTabla(int cod) {
        BomberoData bombD = new BomberoData();
        String aux;
        for (Bombero bomberos : bombD.ListarBomberosPorBrigada(cod)) {
            aux = String.format("%03d", bomberos.getChapa_iden());
            tabla.addRow(new Object[]{aux, bomberos.getApellido()});
            tabla.addRow(new Object[]{aux, bomberos.getNombre()});
        }
    }

    private void nombreBrigada(int cod) {
        BrigadaData brigD = new BrigadaData();
        Brigada brig = brigD.BuscarBrigadaPorId(cod);
        txtBrig.setText(brig.getId_brigada() + "  |  " + brig.getNombre_brigada());
    }

    private void buscarSiniestro() {

        int cod = 0;
        // validar codigo de siniestro
        try {
            cod = Integer.parseInt(txtCodigo.getText());
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Ingrese un código de Reporte válido");
            return;
        }
        // Buscar SINIESTRO por CODIGO
        SiniestroData sinD = new SiniestroData();
        Siniestro sin = sinD.buscarSiniestro(cod);

        // campos requeridos
        limpiarCampos();
        if (sin != null) {
            txtCodigo.setText(sin.getCodSiniestro() + "");
            butSi.setEnabled(true);
            date.setEnabled(true);
            txtPunt.setEnabled(true);
            txtTipoSin.setText(sin.getTipo().name());
            nombreBrigada(sin.getBrigada().getId_brigada());
            llenarTabla(sin.getBrigada().getId_brigada());
            if (sin.getFechaResoluc() != null) {
                btnGuardar.setVisible(false);
                butSi.setSelected(true);
                butNo.setEnabled(false);
                txtPunt.setText(sin.getPuntuacion() + "");
                txtPunt.setEditable(false);
                txtPunt.setOpaque(false);
                date.setDate(Date.valueOf(sin.getFechaResoluc()));
                date.setEnabled(false);
            } else {
                btnGuardar.setVisible(true);
                butSi.setEnabled(true);
                butNo.setSelected(false);
                txtPunt.setEditable(true);
                txtPunt.setOpaque(true);
                date.setEnabled(true);
            }
        }
    }

    private void liberarBrigada() {
        BrigadaData brigD = new BrigadaData();
        String text = txtBrig.getText();
        String[] separar = text.split(" ");
        int codigo = Integer.parseInt(separar[0]);
        brigD.liberarBrigada(codigo);
    }
    //
}
