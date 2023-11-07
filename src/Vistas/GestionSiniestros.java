
package Vistas;

import AccesoADatos.BrigadaData;
import AccesoADatos.SiniestroData;
import Entidades.Brigada;
import Entidades.Siniestro;
import java.time.Instant;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;
import javax.swing.JOptionPane;

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
        jLabel2 = new javax.swing.JLabel();
        txtCod = new javax.swing.JTextField();
        JBBuscar = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        txtX = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtY = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        dateInicio = new com.toedter.calendar.JDateChooser();
        jLabel6 = new javax.swing.JLabel();
        cmbTipoSin = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        textarea = new javax.swing.JTextArea();
        jLabel8 = new javax.swing.JLabel();
        cmbBrigaAsignada = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        cmbBrigServ = new javax.swing.JComboBox<>();
        jLabel10 = new javax.swing.JLabel();
        txtHorainicio = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        dateResolc = new com.toedter.calendar.JDateChooser();
        jLabel13 = new javax.swing.JLabel();
        txtHoraResoluc = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        btnCargar = new javax.swing.JButton();
        btnResolucion = new javax.swing.JButton();
        jLabel15 = new javax.swing.JLabel();
        txtCalif = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();

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

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setText("Buscar Por Codigo/ID de Siniestro:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 85, 246, -1));

        txtCod.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        getContentPane().add(txtCod, new org.netbeans.lib.awtextra.AbsoluteConstraints(372, 85, 140, -1));

        JBBuscar.setBackground(new java.awt.Color(0, 0, 0));
        JBBuscar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        JBBuscar.setForeground(new java.awt.Color(255, 255, 255));
        JBBuscar.setText("BUSCAR");
        JBBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBBuscarActionPerformed(evt);
            }
        });
        getContentPane().add(JBBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(552, 80, -1, 31));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setText("Coordenas X:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(68, 129, -1, -1));

        txtX.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        getContentPane().add(txtX, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 129, 165, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setText("Coordenadas Y:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(373, 129, -1, -1));

        txtY.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        getContentPane().add(txtY, new org.netbeans.lib.awtextra.AbsoluteConstraints(497, 129, 260, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setText("Fecha De Inicio:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(68, 171, -1, -1));

        dateInicio.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        getContentPane().add(dateInicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 169, 165, -1));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel6.setText("Tipo de Siniestro:");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(373, 169, -1, -1));

        cmbTipoSin.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        cmbTipoSin.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "01 - INCENDIO EN VIVIENDA", "02 - INCENDIO EN INDUSTRIA", "03 - SOCORRO EN DERRUMBE", "04 - SOCORRO EN AMBIRO DE MONTAÑA", "05 - SOCORRO ACCIDENTE DE TRANSITO", "06 - SOCORRO INUNDACIONES", "07 - SOCORRO EN ALTURA", "08 - PREVENCION", " " }));
        cmbTipoSin.setSelectedIndex(-1);
        getContentPane().add(cmbTipoSin, new org.netbeans.lib.awtextra.AbsoluteConstraints(502, 169, 260, -1));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel7.setText("DETALLES DEL SINIESTRO");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(46, 282, -1, -1));

        textarea.setColumns(20);
        textarea.setRows(5);
        jScrollPane1.setViewportView(textarea);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(284, 270, 480, 65));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel8.setText("Brigada Asignada:");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(46, 353, -1, -1));

        cmbBrigaAsignada.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        cmbBrigaAsignada.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        getContentPane().add(cmbBrigaAsignada, new org.netbeans.lib.awtextra.AbsoluteConstraints(187, 353, 309, -1));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel9.setText("Mostar Brigadas en Servicio:");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(46, 393, -1, -1));

        cmbBrigServ.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        cmbBrigServ.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        getContentPane().add(cmbBrigServ, new org.netbeans.lib.awtextra.AbsoluteConstraints(256, 393, 240, -1));

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel10.setText("Hora de Inicio:");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(68, 209, -1, -1));

        txtHorainicio.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        getContentPane().add(txtHorainicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 209, 165, -1));

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel11.setText("Usar formato 24 hs (Ej. 14:45)");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(373, 212, -1, -1));

        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel12.setText("Fecha Resolución Siniestro:");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(46, 433, -1, -1));

        dateResolc.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        getContentPane().add(dateResolc, new org.netbeans.lib.awtextra.AbsoluteConstraints(244, 431, 252, -1));

        jLabel13.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel13.setText("Hora Resolución Siniestro:");
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(46, 471, -1, -1));

        txtHoraResoluc.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        getContentPane().add(txtHoraResoluc, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 471, 354, -1));

        jLabel14.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel14.setText("Usar formato 24 hs (Ej. 14,45)");
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(612, 474, -1, -1));

        btnCargar.setBackground(new java.awt.Color(0, 0, 0));
        btnCargar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnCargar.setForeground(new java.awt.Color(255, 255, 255));
        btnCargar.setText("CARGAR NUEVO SINIESTRO");
        btnCargar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCargarActionPerformed(evt);
            }
        });
        getContentPane().add(btnCargar, new org.netbeans.lib.awtextra.AbsoluteConstraints(196, 549, -1, -1));

        btnResolucion.setBackground(new java.awt.Color(0, 0, 0));
        btnResolucion.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnResolucion.setForeground(new java.awt.Color(255, 255, 255));
        btnResolucion.setText("GUARDAR RESOLUCION SINIESTRO");
        getContentPane().add(btnResolucion, new org.netbeans.lib.awtextra.AbsoluteConstraints(435, 549, -1, -1));

        jLabel15.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel15.setText("Calificación Siniestro:");
        getContentPane().add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(79, 511, -1, -1));
        getContentPane().add(txtCalif, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 511, 313, -1));

        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/fondo rojo.jpeg"))); // NOI18N
        getContentPane().add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 600));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        setVisible(false);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void JBBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBBuscarActionPerformed
        try{
            int codigo = Integer.parseInt(txtCod.getText());
            System.out.println("Buscando siniestro con codigo:" + txtCod.getText());
            Siniestro siniestroEncontrado = sd.BuscarSiniestroPorID(codigo);
            
            // Una vez encontrado el siniestro debo mostrarlo:
            if(siniestroEncontrado != null){
                txtX.setText(siniestroEncontrado.getCoord_X() + "");
                txtY.setText(siniestroEncontrado.getCoord_Y() + "");
                LocalDate fechaEnFormatoLocal = siniestroEncontrado.getFecha_siniestro();
                Date fechaEnFormatoDate = Date.from(fechaEnFormatoLocal.atStartOfDay(ZoneId.systemDefault()).toInstant());
                dateInicio.setDate(fechaEnFormatoDate);
                cmbTipoSin.setSelectedIndex(siniestroEncontrado.getCalificacion());
                txtHorainicio.setText(siniestroEncontrado.getHora_siniestro());
                textarea.setText(siniestroEncontrado.getDetalles());
                
                // muestro la brigada que fue asignada al siniestro:
                Brigada brigadaEncontrada = siniestroEncontrado.getBrigada();
                if(brigadaEncontrada != null){ // el siniestro ya ha sido o esta siendo atendido
                    cmbBrigaAsignada.setSelectedItem((String)brigadaEncontrada.getNombre_brigada());
                    LocalDate fechaEnFormatoLocalR = siniestroEncontrado.getFecha_resolucion();
                    Date fechaEnFormatoDateR = Date.from(fechaEnFormatoLocalR.atStartOfDay(ZoneId.systemDefault()).toInstant());
                    dateResolc.setDate(fechaEnFormatoDateR);
                    txtHoraResoluc.setText(siniestroEncontrado.getHora_fin_siniestro());
                    txtCalif.setText(siniestroEncontrado.getCalificacion() + "");
                }
                
            }
        }catch(NumberFormatException e){
            JOptionPane.showMessageDialog(this, "El codigo debe ser un entero y no debe estar vacio");
        }catch(NullPointerException e){
            System.out.println("No se encontro ningun siniestro con el cod: " + txtCod.getText());
        }
        
     
    }//GEN-LAST:event_JBBuscarActionPerformed

    private void btnCargarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCargarActionPerformed
        System.out.println("Guardando Siniestro: ...");
        try{
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
        }catch(Exception e){
            System.out.println("Error al Guardar Siniestro");
        }
        
        
    }//GEN-LAST:event_btnCargarActionPerformed

    
   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JBBuscar;
    private javax.swing.JButton btnCargar;
    private javax.swing.JButton btnResolucion;
    private javax.swing.JComboBox<String> cmbBrigServ;
    private javax.swing.JComboBox<String> cmbBrigaAsignada;
    private javax.swing.JComboBox<String> cmbTipoSin;
    private com.toedter.calendar.JDateChooser dateInicio;
    private com.toedter.calendar.JDateChooser dateResolc;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
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
    private javax.swing.JTextField txtCalif;
    private javax.swing.JTextField txtCod;
    private javax.swing.JTextField txtHoraResoluc;
    private javax.swing.JTextField txtHorainicio;
    private javax.swing.JTextField txtX;
    private javax.swing.JTextField txtY;
    // End of variables declaration//GEN-END:variables

}
