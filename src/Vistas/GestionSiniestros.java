package Vistas;

import AccesoADatos.BrigadaData;
import AccesoADatos.SiniestroData;
import Entidades.Brigada;
import Entidades.Especialidad;
import Entidades.Siniestro;
import java.sql.Date;
import java.time.Instant;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class GestionSiniestros extends javax.swing.JFrame {

    private DefaultTableModel modelo = new DefaultTableModel();

    public GestionSiniestros() {
        initComponents();
        cargarEspecialidad();
        armarCabecera();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        btnCerrar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtCoordY = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tab1 = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        textArea = new javax.swing.JTextArea();
        jLabel5 = new javax.swing.JLabel();
        btnCargar = new javax.swing.JButton();
        btnLimpiar = new javax.swing.JButton();
        txtCoordX = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        data = new com.toedter.calendar.JDateChooser();
        jLabel7 = new javax.swing.JLabel();
        txtHora = new javax.swing.JTextField();
        cmbTipos = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setText("Gestión de Siniestros");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 24, -1, -1));

        btnCerrar.setBackground(new java.awt.Color(0, 0, 0));
        btnCerrar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnCerrar.setForeground(new java.awt.Color(255, 255, 255));
        btnCerrar.setText("CERRAR");
        btnCerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCerrarActionPerformed(evt);
            }
        });
        getContentPane().add(btnCerrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 31, -1, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setText("TIPO DE SINIESTRO");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 60, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("Coordenas X:");
        jLabel3.setPreferredSize(new java.awt.Dimension(14, 24));
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 130, 109, 20));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("Coordenas Y:");
        jLabel4.setPreferredSize(new java.awt.Dimension(14, 24));
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 130, 96, 16));

        txtCoordY.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        txtCoordY.setPreferredSize(new java.awt.Dimension(30, 25));
        getContentPane().add(txtCoordY, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 160, 180, -1));

        tab1.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(tab1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(57, 390, 520, 187));

        textArea.setColumns(20);
        textArea.setRows(5);
        jScrollPane2.setViewportView(textArea);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 240, 510, 90));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel5.setText("DETALLES DEL SINIESTRO:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 200, -1, 34));

        btnCargar.setBackground(new java.awt.Color(0, 0, 0));
        btnCargar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnCargar.setForeground(new java.awt.Color(255, 255, 255));
        btnCargar.setText("CARGAR SINIESTRO");
        btnCargar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCargarActionPerformed(evt);
            }
        });
        getContentPane().add(btnCargar, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 250, -1, 60));

        btnLimpiar.setBackground(new java.awt.Color(0, 0, 0));
        btnLimpiar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnLimpiar.setForeground(new java.awt.Color(255, 255, 255));
        btnLimpiar.setText("LIMPIAR");
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });
        getContentPane().add(btnLimpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 540, 161, 30));

        txtCoordX.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        txtCoordX.setPreferredSize(new java.awt.Dimension(30, 25));
        getContentPane().add(txtCoordX, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 160, 180, -1));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel6.setText("FECHA SINIESTRO");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 60, -1, -1));
        getContentPane().add(data, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 100, 183, -1));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel7.setText("HORA SINIESTRO");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 60, -1, -1));

        txtHora.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        getContentPane().add(txtHora, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 100, 180, -1));

        cmbTipos.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        getContentPane().add(cmbTipos, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 100, 183, -1));

        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Formato 24HS (Ej. 14:45)");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 80, -1, -1));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/fondo rojo.jpeg"))); // NOI18N
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 810, 600));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCargarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCargarActionPerformed
        // Lista para almacenar mensajes de error
        List<String> mensajesError = new ArrayList<>();
        Siniestro siniestroNuevo = new Siniestro();

        // Declarar las variables fuera de los bloques try
        Double coorX = null;
        Double coorY = null;

        // Guardar tipo siniestro
        Especialidad especialidadSeleccionada = (Especialidad) cmbTipos.getSelectedItem();
        if (especialidadSeleccionada == Especialidad.SELECCIONAR_ESPECIALIDAD) {
            mensajesError.add("Seleccione un tipo de siniestro");
        }

        // Fecha del JDateChooser
        LocalDate fechaSiniestro = null;
        java.util.Date fechaSiniestroChooser = data.getDate();
        if (fechaSiniestroChooser == null || fechaSiniestroChooser.toInstant().isAfter(Instant.now())) {
            mensajesError.add("La fecha del siniestro no puede ser nula y debe ser anterior a la fecha actual.");
        } else {
            fechaSiniestro = fechaSiniestroChooser.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
        }

        // Hora ingresada
        String horaSiniestro = txtHora.getText().trim();
        try {
            if (horaSiniestro.isEmpty() || !horaSiniestro.matches("\\d{2}:\\d{2}")) {
                mensajesError.add("La hora del siniestro debe tener el formato HH:mm (ejemplo: 01:25).");
            }
        } catch (NumberFormatException e) {
            mensajesError.add("Error al procesar la hora del siniestro.");
        }

        // CoordenadaX
        try {
            coorX = Double.parseDouble(txtCoordX.getText().trim());
        } catch (NumberFormatException e) {
            mensajesError.add("La coordenada X debe ser un número double válido.");
        }

        // CoordenadaY
        try {
            coorY = Double.parseDouble(txtCoordY.getText().trim());
        } catch (NumberFormatException e) {
            mensajesError.add("La coordenada Y debe ser un número double válido.");
        }

        // Detalles del siniestro
        String detallesSiniestro = textArea.getText().trim();
        if (detallesSiniestro.isEmpty() || detallesSiniestro.length() < 20 || detallesSiniestro.length() > 199) {
            mensajesError.add("Los detalles del siniestro deben tener entre 20 y 199 caracteres.");
        }

        // Manejo de mensajes de error
        if (!mensajesError.isEmpty()) {
            // Mostrar mensajes de error
            String mensajeFinal = String.join("\n", mensajesError);
            JOptionPane.showMessageDialog(this, mensajeFinal, "Errores de validación", JOptionPane.ERROR_MESSAGE);

        } else {

            // Asignar valores al siniestroNuevo
            siniestroNuevo.setTipo(especialidadSeleccionada);
            siniestroNuevo.setFechaSinietro(fechaSiniestro);
            siniestroNuevo.setHora(horaSiniestro);
            siniestroNuevo.setCoord_X(coorX);
            siniestroNuevo.setCoord_Y(coorY);
            siniestroNuevo.setDetalles(detallesSiniestro);

            // Llamada a la función asignarBrigada
            asignarBrigada(coorX, coorY, especialidadSeleccionada, siniestroNuevo);
        }
    }//GEN-LAST:event_btnCargarActionPerformed

    //Funcion auxiliar para asignarBrigada mas cercana
    private double calcularDistancia(double x1, double y1, double x2, double y2) {
        // Aquí puedes usar la fórmula de distancia euclidiana u otras fórmulas según tus necesidades
        return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
    }

    private void asignarBrigada(double siniestroX, double siniestroY, Especialidad tipo, Siniestro siniestro) {

        // Lista para almacenar mensajes de error
        List<String> mensajesError = new ArrayList<>();

        SiniestroData siniestroData = new SiniestroData();
        BrigadaData brigadaData = new BrigadaData();
        ArrayList<Brigada> brigadas = brigadaData.ObtenerBrigadasDisponibles();

        if (!brigadas.isEmpty()) {
            Brigada brigadaIdeal = null;
            Brigada brigadaMasCerca = null;
            double distanciaMinima = Double.MAX_VALUE;

            for (Brigada brigada : brigadas) {
                if (brigada.getCuartel() != null) {
                    double distancia = calcularDistancia(siniestroX, siniestroY, brigada.getCuartel().getCoord_X(), brigada.getCuartel().getCoord_Y());

                    if (distancia < distanciaMinima) {
                        distanciaMinima = distancia;

                        // Si además de estar más cerca está disponible
                        if (brigada.getEspecialidad().equals(tipo)) {
                            brigadaIdeal = brigada;
                        } else {
                            brigadaMasCerca = brigada;
                        }
                    }
                } else {
                    mensajesError.add("La brigada tiene un cuartel nulo.");
                }
            }

            if (brigadaIdeal != null) {
                siniestro.setBrigada(brigadaIdeal);
                siniestroData.guardarSiniestro(siniestro);
            } else if (brigadaMasCerca != null) {
                siniestro.setBrigada(brigadaMasCerca);
                
                siniestroData.guardarSiniestro(siniestro);
            } else {
                mensajesError.add("No se pudo asignar una brigada.");
            }
        } else {
            mensajesError.add("No hay brigadas disponibles.");
        }

        // Manejo de mensajes de error
        if (!mensajesError.isEmpty()) {
            // Mostrar mensajes de error
            String mensajeFinal = String.join("\n", mensajesError);
            JOptionPane.showMessageDialog(this, mensajeFinal, "Errores en asignación de brigada", JOptionPane.ERROR_MESSAGE);
        }

    }


    private void btnCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerrarActionPerformed
        setVisible(false);
    }//GEN-LAST:event_btnCerrarActionPerformed

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        limpiarCampos();
    }//GEN-LAST:event_btnLimpiarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCargar;
    private javax.swing.JButton btnCerrar;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JComboBox<Especialidad> cmbTipos;
    private com.toedter.calendar.JDateChooser data;
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
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tab1;
    private javax.swing.JTextArea textArea;
    private javax.swing.JTextField txtCoordX;
    private javax.swing.JTextField txtCoordY;
    private javax.swing.JTextField txtHora;
    // End of variables declaration//GEN-END:variables

    private void cargarEspecialidad() {
        cmbTipos.setSelectedIndex(-1);
        Especialidad[] especialidades = Especialidad.values();
        for (Especialidad especialidad : especialidades) {
            cmbTipos.addItem(especialidad);
        }
    }

    private void limpiarCampos() {
        cmbTipos.setSelectedIndex(-1);
        data.setDate(null);
        txtCoordX.setText("");
        txtCoordY.setText("");
        textArea.setText("");
    }

    private boolean validarCoordenadas() {
        try {
            double X = Double.parseDouble(txtCoordX.getText());
            double Y = Double.parseDouble(txtCoordY.getText());
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Ingrese coordenadas válidas usando decimales.", "Error de Coordenadas", JOptionPane.ERROR_MESSAGE);
            return false;
        }
        return true;
    }

    //metodo para la tabla que muestra los productos
    private void armarCabecera() {
        modelo.addColumn("CODIGO");
        modelo.addColumn("NOMBRE");
        modelo.addColumn("CUARTEL");
        modelo.addColumn("DISTANCIA KMS");

        tab1.setModel(modelo);
    }

}
