package Vistas;

import AccesoADatos.BrigadaData;
import AccesoADatos.SiniestroData;
import Entidades.Brigada;
import Entidades.Siniestro;
import java.awt.event.KeyEvent;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import javax.swing.JOptionPane;

/**
 *
 * @author Julian Rios
 */
public class ResolucionSiniestro extends javax.swing.JFrame {

    

    public ResolucionSiniestro() {
        initComponents();
        btnGuardar.setEnabled(false);

        txtHoraResoluc.setEditable(false);
        txtPunt.setEditable(false);
        date.setEnabled(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        btnCerrar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        txtCodigo = new javax.swing.JTextField();
        btnBuscar = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        txtBrigada = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtSiniestro = new javax.swing.JTextField();
        checkSi = new javax.swing.JRadioButton();
        checkNo = new javax.swing.JRadioButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        date = new com.toedter.calendar.JDateChooser();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtHoraResoluc = new javax.swing.JTextField();
        txtPunt = new javax.swing.JTextField();
        btnGuardar = new javax.swing.JButton();
        btnLimpiar = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(800, 600));
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setText("Resolución de Siniestros");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(22, 33, -1, -1));

        btnCerrar.setBackground(new java.awt.Color(0, 0, 0));
        btnCerrar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnCerrar.setForeground(new java.awt.Color(255, 255, 255));
        btnCerrar.setText("CERRAR");
        btnCerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCerrarActionPerformed(evt);
            }
        });
        getContentPane().add(btnCerrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(669, 40, -1, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setText("Cod Siniestro:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(199, 105, 102, -1));

        txtCodigo.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtCodigo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtCodigoKeyReleased(evt);
            }
        });
        getContentPane().add(txtCodigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(317, 102, 138, -1));

        btnBuscar.setBackground(new java.awt.Color(0, 0, 0));
        btnBuscar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnBuscar.setForeground(new java.awt.Color(255, 255, 255));
        btnBuscar.setText("BUSCAR");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });
        getContentPane().add(btnBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(473, 102, -1, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setText("Brigada a Cargo:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(199, 150, -1, -1));

        txtBrigada.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        getContentPane().add(txtBrigada, new org.netbeans.lib.awtextra.AbsoluteConstraints(331, 147, 227, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setText("Tipo de Siniestro:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(199, 194, -1, -1));

        txtSiniestro.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        getContentPane().add(txtSiniestro, new org.netbeans.lib.awtextra.AbsoluteConstraints(346, 191, 212, -1));

        checkSi.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        checkSi.setText("SI");
        checkSi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkSiActionPerformed(evt);
            }
        });
        getContentPane().add(checkSi, new org.netbeans.lib.awtextra.AbsoluteConstraints(397, 235, -1, -1));

        checkNo.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        checkNo.setText("NO");
        checkNo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkNoActionPerformed(evt);
            }
        });
        getContentPane().add(checkNo, new org.netbeans.lib.awtextra.AbsoluteConstraints(485, 235, -1, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setText("Siniestro Resuelto?:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(199, 237, -1, -1));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel6.setText("Fecha Resolución:");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(199, 278, -1, -1));

        date.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        getContentPane().add(date, new org.netbeans.lib.awtextra.AbsoluteConstraints(335, 278, 223, -1));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel7.setText("Hora Resolución:");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(199, 324, -1, -1));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel8.setText("Puntuación:");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(199, 368, -1, -1));

        txtHoraResoluc.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        getContentPane().add(txtHoraResoluc, new org.netbeans.lib.awtextra.AbsoluteConstraints(331, 318, 104, -1));

        txtPunt.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtPunt.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtPuntFocusLost(evt);
            }
        });
        txtPunt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtPuntMouseClicked(evt);
            }
        });
        getContentPane().add(txtPunt, new org.netbeans.lib.awtextra.AbsoluteConstraints(331, 362, 104, -1));

        btnGuardar.setBackground(new java.awt.Color(0, 0, 0));
        btnGuardar.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnGuardar.setForeground(new java.awt.Color(255, 255, 255));
        btnGuardar.setText("GUARDAR");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });
        getContentPane().add(btnGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(199, 448, -1, -1));

        btnLimpiar.setBackground(new java.awt.Color(0, 0, 0));
        btnLimpiar.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnLimpiar.setForeground(new java.awt.Color(255, 255, 255));
        btnLimpiar.setText("LIMPIAR");
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });
        getContentPane().add(btnLimpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(454, 448, -1, -1));

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

    private void checkSiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkSiActionPerformed
        // Si se elegi opcion SI, la opcion NO se bloquea
        checkNo.setSelected(false);
        txtPunt.setEditable(true);
        date.setEnabled(true);
        txtHoraResoluc.setEditable(true);
        btnGuardar.setEnabled(true);
    }//GEN-LAST:event_checkSiActionPerformed

    private void checkNoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkNoActionPerformed
        // Si se elegi opcion NO, la opcion SI se bloqua
        checkSi.setSelected(false);
        txtPunt.setEnabled(false);
        txtHoraResoluc.setEditable(false);
    }//GEN-LAST:event_checkNoActionPerformed

    private void txtPuntFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtPuntFocusLost
        try {
            int a = Integer.parseInt(txtPunt.getText());
            if (a < 1 || a > 10) {

            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Debe ingresar un Nº entero entre 1 y 10");
        }
    }//GEN-LAST:event_txtPuntFocusLost

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        buscarSiniestro();
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void txtCodigoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCodigoKeyReleased
        // Si se presiona la tecla ENTER se ejecuta la busqueda
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            buscarSiniestro();
        }
    }//GEN-LAST:event_txtCodigoKeyReleased

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
        String horaRes = null;
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

        // Obtener la fecha actual
        LocalDate fecha = LocalDate.now();

        if (sin.getFechaSinietro().isBefore(fechaFin) || fechaFin.isAfter(fecha)) {
            sin.setFechaResoluc(fechaFin);

            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm");

            try {
                LocalTime horaResol = LocalTime.parse(txtHoraResoluc.getText(), formatter);
                sin.setHoraResoluc(horaResol.toString());
            } catch (DateTimeParseException e) {
                JOptionPane.showMessageDialog(this, "Formato de hora no válido. Ingrese la hora en formato HH:mm");
                return;
            }

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
            JOptionPane.showMessageDialog(this, "Reporte actualizado");
            liberarBrigada();
        } else {
            return;
        }

        limpiarCampos();
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void txtPuntMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtPuntMouseClicked
        btnGuardar.setEnabled(true);
    }//GEN-LAST:event_txtPuntMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnCerrar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JRadioButton checkNo;
    private javax.swing.JRadioButton checkSi;
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
    private javax.swing.JTextField txtBrigada;
    private javax.swing.JTextField txtCodigo;
    private javax.swing.JTextField txtHoraResoluc;
    private javax.swing.JTextField txtPunt;
    private javax.swing.JTextField txtSiniestro;
    // End of variables declaration//GEN-END:variables

    private void limpiarCampos() {
        date.setDate(null);
        txtCodigo.setText("");
        txtPunt.setText("");
        txtBrigada.setText("");
        txtSiniestro.setText("");
        checkNo.setSelected(false);
        checkSi.setSelected(false);
        txtHoraResoluc.setText("");
        btnGuardar.setEnabled(false);
    }

    private void nombreBrigada(int cod) {
        BrigadaData brigD = new BrigadaData();
        Brigada brig = brigD.BuscarBrigadaPorId(cod);
        txtBrigada.setText(brig.getId_brigada() + "  |  " + brig.getNombre_brigada());
    }

    private void buscarSiniestro() {

        int cod = 0;
        // validar codigo de siniestro
        try {
            cod = Integer.parseInt(txtCodigo.getText());
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(ResolucionSiniestro.this, "Ingrese un código de Reporte válido");
            return;
        }
        // Buscar SINIESTRO por CODIGO
        SiniestroData sinD = new SiniestroData();
        Siniestro sin = sinD.buscarSiniestro(cod);

        // campos requeridos
        limpiarCampos();
        if (sin != null) {
            txtCodigo.setText(sin.getCodSiniestro() + "");
            checkSi.setSelected(true);
            date.setEnabled(true);
            txtPunt.setEditable(true);
            txtHoraResoluc.setEditable(true);
            txtSiniestro.setText(sin.getTipo().name());
            nombreBrigada(sin.getBrigada().getId_brigada());

        } else {
            btnGuardar.setEnabled(true);
            checkSi.setSelected(true);
            checkNo.setSelected(false);
            txtPunt.setEditable(true);
            date.setEnabled(true);
        }

    }

    private void liberarBrigada() {
        BrigadaData brigD = new BrigadaData();
        String text = txtBrigada.getText();
        String[] separar = text.split(" ");
        int codigo = Integer.parseInt(separar[0]);
        brigD.liberarBrigada(codigo);
        JOptionPane.showMessageDialog(this, "Brigada " + text + " liberada");
    }

}
