package Vistas;

import AccesoADatos.BrigadaData;
import AccesoADatos.CuartelData;
import AccesoADatos.SiniestroData;
import Entidades.Brigada;
import Entidades.Cuartel;
import Entidades.Siniestro;
import java.time.Instant;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;
import java.util.List;
import java.util.Objects;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;

/**
 *
 * @author Julian Rios
 */
public class GestionSiniestros extends javax.swing.JFrame {

    SiniestroData sd = new SiniestroData();
    BrigadaData bd = new BrigadaData();
    private Iterable<Brigada> listarBrigadas;
    Siniestro siniestro = new Siniestro();

    public GestionSiniestros() {
        initComponents();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        txtX = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtY = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        cmbTipoSin = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        textarea = new javax.swing.JTextArea();
        jLabel8 = new javax.swing.JLabel();
        cmbBrigadas = new javax.swing.JComboBox<>();
        jLabel10 = new javax.swing.JLabel();
        txtHorainicio = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        btnCargar = new javax.swing.JButton();
        dateInicio = new com.toedter.calendar.JDateChooser();
        jLabel16 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txtCuarteCercano = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setText("Gestión de Siniestros");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(23, 19, -1, -1));

        jButton1.setBackground(new java.awt.Color(0, 0, 0));
        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("CERRAR");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(692, 35, -1, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setText("Coordenas X:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 170, -1, -1));

        txtX.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        getContentPane().add(txtX, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 170, 165, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setText("Coordenadas Y:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 170, -1, -1));

        txtY.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        getContentPane().add(txtY, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 170, 260, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setText("Fecha De Inicio:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 220, -1, -1));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel6.setText("Tipo de Siniestro:");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 220, -1, -1));

        cmbTipoSin.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        cmbTipoSin.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "INCENDIO EN VIVIENDA", "INCENDIO EN INDUSTRIA", "SOCORRO EN DERRUMBE", "SOCORRO EN AMBIRO DE MONTAÑA", "SOCORRO ACCIDENTE DE TRANSITO", "SOCORRO INUNDACIONES", "SOCORRO EN ALTURA", "PREVENCION", " " }));
        cmbTipoSin.setSelectedIndex(-1);
        getContentPane().add(cmbTipoSin, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 220, 260, -1));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel7.setText("DETALLES DEL SINIESTRO:");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 330, -1, -1));

        textarea.setColumns(20);
        textarea.setRows(5);
        jScrollPane1.setViewportView(textarea);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 310, 370, 65));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel8.setText("Asignar Brigada:");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 410, -1, 20));

        cmbBrigadas.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        getContentPane().add(cmbBrigadas, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 410, 170, -1));

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel10.setText("Hora de Inicio:");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 260, -1, -1));

        txtHorainicio.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        getContentPane().add(txtHorainicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 260, 165, -1));

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N
        jLabel11.setText("Usar formato 24 hs (Ej. 14:45)");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 260, -1, 20));

        btnCargar.setBackground(new java.awt.Color(0, 0, 0));
        btnCargar.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnCargar.setForeground(new java.awt.Color(255, 255, 255));
        btnCargar.setText("CARGAR NUEVO SINIESTRO");
        btnCargar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCargarActionPerformed(evt);
            }
        });
        getContentPane().add(btnCargar, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 480, -1, -1));
        getContentPane().add(dateInicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 220, 165, -1));

        jLabel16.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel16.setText("Nuevo Siniestro");
        getContentPane().add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(328, 82, -1, 40));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel9.setText("Cuertel mas Cercano:");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 400, -1, 50));

        txtCuarteCercano.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        getContentPane().add(txtCuarteCercano, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 410, 161, 30));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/fondo rojo.jpeg"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 600));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        setVisible(false);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btnCargarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCargarActionPerformed
        try {
            validarCampos();
            Siniestro nuevoSiniestro = new Siniestro();
            cargarDatosSiniestro(nuevoSiniestro);
            SiniestroData siniestroData = new SiniestroData();
            siniestroData.GuardarSiniestro(nuevoSiniestro);
            JOptionPane.showMessageDialog(this, "Siniestro Cargado exitosamente.");
            limpiar();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Hubo un problema al cargar el siniestro. " + e.getMessage());
            e.printStackTrace();
            limpiar();
        }

    }//GEN-LAST:event_btnCargarActionPerformed

    public void designarCuartel(Siniestro siniestro) {
        try {
            validarCampos();

            Siniestro nuevoSiniestro = new Siniestro();
            cargarDatosSiniestro(nuevoSiniestro);

            SiniestroData siniestroData = new SiniestroData();
            siniestroData.GuardarSiniestro(nuevoSiniestro);

            JOptionPane.showMessageDialog(this, "Siniestro Cargado exitosamente.");

            limpiar();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Hubo un problema al cargar el siniestro. " + e.getMessage());
            e.printStackTrace();
            limpiar();
        }
    }

    private void validarCampos() {
        if (txtX.getText().isEmpty() || txtY.getText().isEmpty() || dateInicio.getDate() == null
                || cmbTipoSin.getSelectedItem() == null || txtHorainicio.getText().isEmpty()
                || cmbBrigadas.getSelectedItem() == null) {
            throw new IllegalArgumentException("Complete todos los campos.");
        }
    }

    private void cargarDatosSiniestro(Siniestro nuevoSiniestro) {
        nuevoSiniestro.setCoord_X(Double.parseDouble(txtX.getText()));
        nuevoSiniestro.setCoord_Y(Double.parseDouble(txtY.getText()));
        Cuartel cuartelMasCercano = calcularCuartelMasCercano(nuevoSiniestro);
        txtCuarteCercano.setText(cuartelMasCercano.getNombre_cuartel() + " " + cuartelMasCercano.getDireccion() + " " + cuartelMasCercano.getTelefono());
        cargarBrigadasDisponibles(cuartelMasCercano, cmbBrigadas);
        nuevoSiniestro.setFecha_siniestro(dateInicio.getDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate());
        nuevoSiniestro.setTipo((String) cmbTipoSin.getSelectedItem());
        nuevoSiniestro.setHora_siniestro(txtHorainicio.getText());
        nuevoSiniestro.setDetalles(textarea.getText());
        nuevoSiniestro.setTipo(cuartelMasCercano.getNombre_cuartel());
        //Cuartel cuartelMasCercano = calcularCuartelMasCercano(nuevoSiniestro);
        //txtCuarteCercano.setText(cuartelMasCercano.getNombre_cuartel() + " " + cuartelMasCercano.getDireccion() + " " + cuartelMasCercano.getTelefono());
        //cargarBrigadasDisponibles(cuartelMasCercano, cmbBrigadas);
    }

    private Cuartel calcularCuartelMasCercano(Siniestro siniestro) {
        Cuartel cuartelMasCercano = null;
        Double distanciaMinima = null;

        for (Cuartel cuartel : listarCuarteles) {
            if (cuartel.isEstado()) {
                Double distancia = calcularDistancia(cuartel, siniestro);
                if (distanciaMinima == null || distancia < distanciaMinima) {
                    distanciaMinima = distancia;
                    cuartelMasCercano = cuartel;
                }
            }
        }
        return cuartelMasCercano;
    }

    private void cargarBrigadasDisponibles(Cuartel cuartel, JComboBox<Brigada> comboBrigadas) {
        comboBrigadas.removeAllItems();

        if (listarBrigadas != null && cuartel != null && comboBrigadas != null) {
            for (Brigada brigada : listarBrigadas) {
                try {
                    Cuartel cuartelBrigada = brigada.getCuartel();
                    if (cuartelBrigada != null && cuartelBrigada.getId_cuartel() == cuartel.getId_cuartel() && brigada.isDisponibilidad()) {
                        comboBrigadas.addItem(brigada);
                    }
                } catch (Exception e) {
                  e.printStackTrace();
                }
            }
        } else {
            System.err.println("Al menos una de las variables es null. Verifica la inicialización de las variables.");
        }
    }

    private Double calcularDistancia(Cuartel cuartel, Siniestro siniestro) {
        return Math.sqrt(Math.pow(cuartel.getCoord_X() - siniestro.getCoord_X(), 2) + Math.pow(cuartel.getCoord_Y() - siniestro.getCoord_Y(), 2));
    }

    private Cuartel cuartelMasCercano = new Cuartel();
    private CuartelData cd = new CuartelData();
    private Cuartel cuartel;
    private List<Cuartel> listarCuarteles = cd.ListarCuarteles();
    SiniestroData xx = new SiniestroData();
    private Siniestro s1;
    private List<Siniestro> listarSiniestros = sd.ListarSiniestro();
    private Brigada brigada = new Brigada();
    private BrigadaData brigadaData = new BrigadaData();
    private List<Brigada> listarBrigada = brigadaData.ListarBrigada();


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCargar;
    private javax.swing.JComboBox<Brigada> cmbBrigadas;
    private javax.swing.JComboBox<String> cmbTipoSin;
    private com.toedter.calendar.JDateChooser dateInicio;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea textarea;
    private javax.swing.JTextField txtCuarteCercano;
    private javax.swing.JTextField txtHorainicio;
    private javax.swing.JTextField txtX;
    private javax.swing.JTextField txtY;
    // End of variables declaration//GEN-END:variables

    public void limpiar() {
        txtCuarteCercano.setText("");
        txtHorainicio.setText("");
        txtX.setText("");
        txtY.setText("");
        btnCargar.setSelected(false);
        cmbBrigadas.setSelectedIndex(-1);
        textarea.setText("");
        dateInicio.setDate(null);
        cmbTipoSin.setSelectedIndex(-1);

    }
}
