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
import java.util.List;

/**
 *
 * @author Julian Rios
 */
public class GestionSiniestros extends javax.swing.JFrame {

    SiniestroData sd = new SiniestroData();
    BrigadaData bd = new BrigadaData();

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
        cmbBrigaAsignada = new javax.swing.JComboBox<>();
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
        jLabel7.setText("DETALLES DEL SINIESTRO");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 330, -1, -1));

        textarea.setColumns(20);
        textarea.setRows(5);
        jScrollPane1.setViewportView(textarea);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 310, 440, 65));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel8.setText("Asignar Brigada:");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 410, -1, -1));

        cmbBrigaAsignada.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        getContentPane().add(cmbBrigaAsignada, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 410, 170, -1));

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel10.setText("Hora de Inicio:");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 260, -1, -1));

        txtHorainicio.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        getContentPane().add(txtHorainicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 260, 165, -1));

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N
        jLabel11.setText("Usar formato 24 hs (Ej. 14:45)");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 260, -1, -1));

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
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 400, -1, 40));

        txtCuarteCercano.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        getContentPane().add(txtCuarteCercano, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 410, 161, 20));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/fondo rojo.jpeg"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 600));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        setVisible(false);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btnCargarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCargarActionPerformed
        System.out.println("Guardando Siniestro: ...");
        try {
            Siniestro siniestroAGuardar = new Siniestro();
            Double posX = Double.parseDouble(txtX.getText());
            Double posY = Double.parseDouble(txtY.getText());
            siniestroAGuardar.setCoord_X(posX);
            siniestroAGuardar.setCoord_Y(posY);
            Instant instant = dateInicio.getDate().toInstant();
            siniestroAGuardar.setFecha_siniestro(LocalDate.ofInstant(instant, ZoneId.systemDefault()));
            siniestroAGuardar.setTipo(cmbTipoSin.getSelectedItem().toString());

            // Aqui queda por mejorar que chequee el formato de hora introducido
            siniestroAGuardar.setHora_siniestro(txtHorainicio.getText());

            //Una vez tengo el siniestro armado, lo mando a persistir, acá tmb debería de asegurarme q el siniestro va bien armado.
            sd.GuardarSiniestro(siniestroAGuardar);
        } catch (Exception e) {
            System.out.println("Error al Guardar Siniestro");
        }


    }//GEN-LAST:event_btnCargarActionPerformed

    public void designarCuartel() {
        //para que funcione. El cuartel debe estar en estado 1.La brigada debe estar disponible 
        //o sea en 1 . La especialidad de la brigada debe ser igual al tipo de siniestro. id_brigada
        //de siniestro debe estar en null 
        Double distancia1 = null;
        Brigada brigadaAAsignar = new Brigada();

        for (Cuartel listarCuartel : ListarCuarteles) {
            if (listarCuartel.isEstado()) {
                for (Brigada brigadas : ListarBrigada) {
                    if (brigadas.getCuartel().getId_cuartel() == listarCuartel.getId_cuartel() && brigadas.isDisponibilidad() && brigadas.getEspecialidad().equalsIgnoreCase(s1.getTipo())) {
                        distancia1 = Math.sqrt(Math.pow(listarCuartel.getCoord_X() - s1.getCoord_X(), 2) + Math.pow(listarCuartel.getCoord_Y() - s1.getCoord_Y(), 2));
                        break;
                    }
                }
            }
        }
        for (Cuartel listarCuartel : listarCuarteles) {
            if (listarCuartel.isEstado()) {
                for (Brigada brigadas : listarBrigada) {
                    if (brigadas.getCuartel().getId_cuartel() == listarCuartel.getId_cuartel() && brigadas.isDisponibilidad() && brigadas.getEspecialidad().equalsIgnoreCase(s1.getTipo())) {

                        Double distCalculada = Math.sqrt(Math.pow(listarCuartel.getCoord_X() - s1.getCoord_X(), 2) + Math.pow(listarCuartel.getCoord_Y() - s1.getCoord_Y(), 2));
                        if (distCalculada <= distancia1) {
                            cuartelMasCercano = listarCuartel;
                            distancia1 = distCalculada;
                            brigadaAAsignar = brigadas;
                        }
                    }
                }
            }
        }
        txtCuarteCercano.setText(cuartelMasCercano.getNombre_cuartel() + " " + cuartelMasCercano.getDireccion() + " " + cuartelMasCercano.getTelefono());
        cmbBrigaAsignada.setText(brigadaAAsignar.getNombre_brigada() + " " + brigadaAAsignar.getEspecialidad());
        s1.setBrigada(brigadaAAsignar);

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
    private javax.swing.JComboBox<String> cmbBrigaAsignada;
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

}
