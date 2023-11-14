package Vistas;

import AccesoADatos.BrigadaData;
import AccesoADatos.CuartelData;
import AccesoADatos.SiniestroData;
import Entidades.Brigada;
import Entidades.Cuartel;
import Entidades.Especialidad;
import Entidades.Siniestro;
import java.awt.Color;
import java.awt.event.KeyEvent;
import java.text.DecimalFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import javax.swing.BorderFactory;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.SwingConstants;
import javax.swing.border.TitledBorder;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;

/**
 *
 * @author Julian Rios
 */
public class GestionSiniestros extends javax.swing.JFrame {
    
    public GestionSiniestros() {
        initComponents();
        cargarEspecialidad();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        btnCerrar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        TF_CoordY = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tab1 = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        textArea = new javax.swing.JTextArea();
        jLabel5 = new javax.swing.JLabel();
        btnCargar = new javax.swing.JButton();
        btnBuscar = new javax.swing.JButton();
        btnLimpiar = new javax.swing.JButton();
        TF_CoordX = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        data = new com.toedter.calendar.JDateChooser();
        jLabel7 = new javax.swing.JLabel();
        txtHora = new javax.swing.JTextField();
        cmbTipos = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(800, 600));
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
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(163, 76, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("Coordenas X:");
        jLabel3.setPreferredSize(new java.awt.Dimension(14, 24));
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(403, 76, 109, 20));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("Coordenas Y:");
        jLabel4.setPreferredSize(new java.awt.Dimension(14, 24));
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(405, 133, 96, 16));

        TF_CoordY.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        TF_CoordY.setPreferredSize(new java.awt.Dimension(30, 25));
        TF_CoordY.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                TF_CoordYFocusLost(evt);
            }
        });
        TF_CoordY.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                TF_CoordYKeyReleased(evt);
            }
        });
        getContentPane().add(TF_CoordY, new org.netbeans.lib.awtextra.AbsoluteConstraints(405, 159, 163, -1));

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

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 372, 537, 187));

        textArea.setColumns(20);
        textArea.setRows(5);
        jScrollPane2.setViewportView(textArea);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(255, 294, 294, 54));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel5.setText("DETALLES DEL SINIESTRO:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 304, -1, 34));

        btnCargar.setBackground(new java.awt.Color(0, 0, 0));
        btnCargar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnCargar.setForeground(new java.awt.Color(255, 255, 255));
        btnCargar.setText("CARGAR SINIESTRO");
        btnCargar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCargarActionPerformed(evt);
            }
        });
        getContentPane().add(btnCargar, new org.netbeans.lib.awtextra.AbsoluteConstraints(616, 274, -1, -1));

        btnBuscar.setBackground(new java.awt.Color(0, 0, 0));
        btnBuscar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnBuscar.setForeground(new java.awt.Color(255, 255, 255));
        btnBuscar.setText("BUSCAR BRIGADA");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });
        getContentPane().add(btnBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(616, 340, 161, -1));

        btnLimpiar.setBackground(new java.awt.Color(0, 0, 0));
        btnLimpiar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnLimpiar.setForeground(new java.awt.Color(255, 255, 255));
        btnLimpiar.setText("LIMPIAR");
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });
        getContentPane().add(btnLimpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(616, 414, 161, -1));

        TF_CoordX.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        TF_CoordX.setPreferredSize(new java.awt.Dimension(30, 25));
        TF_CoordX.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                TF_CoordXFocusLost(evt);
            }
        });
        TF_CoordX.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                TF_CoordXKeyReleased(evt);
            }
        });
        getContentPane().add(TF_CoordX, new org.netbeans.lib.awtextra.AbsoluteConstraints(403, 102, 163, -1));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel6.setText("FECHA SINIESTRO");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 148, -1, -1));
        getContentPane().add(data, new org.netbeans.lib.awtextra.AbsoluteConstraints(139, 180, 183, -1));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel7.setText("HORA SINIESTRO");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 220, -1, -1));

        txtHora.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        getContentPane().add(txtHora, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 250, 100, -1));

        cmbTipos.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        getContentPane().add(cmbTipos, new org.netbeans.lib.awtextra.AbsoluteConstraints(139, 108, 183, -1));

        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Formato 24 hs (Ej. 14.45)");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 250, -1, 20));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/fondo rojo.jpeg"))); // NOI18N
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 810, 600));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void TF_CoordYFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_TF_CoordYFocusLost
        
        try {
            double aux = Double.parseDouble(TF_CoordX.getText());
        } catch (ClassCastException | NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Ingrese la COORDENADA usando decimales");
            return;
        }
    }//GEN-LAST:event_TF_CoordYFocusLost

    private void TF_CoordYKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TF_CoordYKeyReleased
        // Si la tecla ENTER es precionada se valida el campo
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            try {
                double aux = Double.parseDouble(TF_CoordX.getText());
            } catch (ClassCastException | NumberFormatException e) {
                JOptionPane.showMessageDialog(this, "Ingrese la COORDENADA usan decimales");
                return;
            }
        }
    }//GEN-LAST:event_TF_CoordYKeyReleased

    private void TF_CoordXFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_TF_CoordXFocusLost
        
        try {
            double aux = Double.parseDouble(TF_CoordX.getText());
        } catch (ClassCastException | NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Ingrese la COORDENADA usan decimales");
            return;
        }
    }//GEN-LAST:event_TF_CoordXFocusLost

    private void TF_CoordXKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TF_CoordXKeyReleased
        // Si la tecla ENTER es precionada se valida el campo
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            try {
                double aux = Double.parseDouble(TF_CoordX.getText());
            } catch (ClassCastException | NumberFormatException e) {
                JOptionPane.showMessageDialog(this, "Ingrese la COORDENADA usan decimales");
                return;
            }
        }
    }//GEN-LAST:event_TF_CoordXKeyReleased

    private void btnCargarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCargarActionPerformed
        Siniestro sin = new Siniestro();
        Especialidad especialidadSeleccionada = (Especialidad) cmbTipos.getSelectedItem();
        String especialidadComoString = especialidadSeleccionada.toString();
        sin.setTipo(String.valueOf(cmbTipos.getSelectedItem()));
        
        LocalDate fechaSin;
        LocalDateTime aux = LocalDateTime.now();
        
        try {
            fechaSin = data.getDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
        } catch (NullPointerException e) {
            JOptionPane.showMessageDialog(this, "Coloque una fecha válida", "FECHA", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        if (aux.toLocalDate().isAfter(fechaSin)) {
            int resp = JOptionPane.showConfirmDialog(this, "¿Está seguro/a de ingresar una fecha anterior a la actual?", null, JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE);
            if (resp == JOptionPane.YES_OPTION) {
                sin.setFecha_siniestro(fechaSin);
            } else {
                return;
            }
        } else {
            sin.setFecha_siniestro(fechaSin);
            
            txtHora.setText(sin.getHora_siniestro());
            
            if (validarCoordenadas()) {
                sin.setCoord_X(Double.parseDouble(TF_CoordX.getText()));
                sin.setCoord_Y(Double.parseDouble(TF_CoordY.getText()));
            } else {
                return;
            }
            
            if (textArea.getText().equals(" ") || textArea.getText().isEmpty()) {
                JOptionPane.showMessageDialog(this, "Debe describir el siniestro !!", "DESCRIPCION", 1);
                return;
            } else {
                sin.setDetalles(textArea.getText());
            }
            
            Brigada brig = new Brigada();
            int codB = 0, filas = tab1.getSelectedRow();
            try {
                codB = Integer.parseInt((String) tab1.getValueAt(filas, 0));
            } catch (ArrayIndexOutOfBoundsException | NumberFormatException e) {
                JOptionPane.showMessageDialog(this, "Debe seleccionar una brigada válida", "BRIGADA", JOptionPane.ERROR_MESSAGE);
                return;
            }
            brig.setId_brigada(codB);
            sin.setBrigada(brig);
            
            int a = JOptionPane.showConfirmDialog(this, "¿Está seguro de asignar la brigada " + codB + " al incidente?", null, JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE);
            if (a == JOptionPane.YES_OPTION) {
                SiniestroData sinD = new SiniestroData();
                Siniestro dd = new Siniestro();
                sinD.GuardarSiniestro(dd);
                int sinCod = dd.getId_siniestro();
                
                JOptionPane.showMessageDialog(this, "Se generó un reporte con el código: " + sinCod);
                
                BrigadaData xx = new BrigadaData();
                xx.AsignarBrigada(sin);
                
                limpiarCampos();
            }
            
        }
    }//GEN-LAST:event_btnCargarActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        if (cmbTipos.getSelectedItem() == null) {
            JOptionPane.showMessageDialog(this, "Debe seleccionar un tipo de Incidente", "TIPO DE EVENTO", 1);
            return;
        }
        
        if (!validarCoordenadas()) {
            return;
        }
        cargarTabla();

    }//GEN-LAST:event_btnBuscarActionPerformed

    private void btnCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerrarActionPerformed
        setVisible(false);
    }//GEN-LAST:event_btnCerrarActionPerformed

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        limpiarCampos();
    }//GEN-LAST:event_btnLimpiarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField TF_CoordX;
    private javax.swing.JTextField TF_CoordY;
    private javax.swing.JButton btnBuscar;
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
    private javax.swing.JTextField txtHora;
    // End of variables declaration//GEN-END:variables

    private void cargarEspecialidad() {
    cmbTipos.setSelectedIndex(-1);
    Especialidad[] especialidades = Especialidad.values();
    for (Especialidad especialidad : especialidades) {
        cmbTipos.addItem(especialidad);
    }
}
    
    private void iniciarTabla() {
        // Crear DefaultTableModel
        DefaultTableModel modeloTabla = new DefaultTableModel();
        modeloTabla.addColumn(" COD ");
        modeloTabla.addColumn("Nombre");
        modeloTabla.addColumn("Cuartel");
        modeloTabla.addColumn("Distancia (Kms)");

        // Crear JTable con el modelo
        JTable tab1 = new JTable(modeloTabla);

        // Configurar apariencia
        tab1.setBackground(Color.YELLOW);
        tab1.setForeground(Color.DARK_GRAY);
        tab1.setSelectionBackground(Color.ORANGE);
        tab1.setSelectionForeground(Color.BLACK);

        // Configurar borde y título
        tab1.setBorder(BorderFactory.createTitledBorder(BorderFactory.createEtchedBorder(),
                "BRIGADAS DISPONIBLES", TitledBorder.CENTER, TitledBorder.TOP));

        // Configurar ancho de columnas
        TableColumn column;
        for (int i = 0; i < 4; i++) {
            column = tab1.getColumnModel().getColumn(i);
            switch (i) {
                case 0:
                    column.setMinWidth(30);
                    column.setMaxWidth(50);
                    break;
                case 1:
                    column.setMinWidth(55);
                    column.setMaxWidth(70);
                    break;
                case 2:
                    column.setMinWidth(200);
                    column.setMaxWidth(300);
                    break;
                case 3:
                    column.setMinWidth(50);
                    break;
            }
        }

        // Configurar alineación de celdas
        DefaultTableCellRenderer alinear = new DefaultTableCellRenderer();
        alinear.setHorizontalAlignment(SwingConstants.CENTER);
        tab1.getColumnModel().getColumn(0).setCellRenderer(alinear);
        tab1.getColumnModel().getColumn(1).setCellRenderer(alinear);
        tab1.getColumnModel().getColumn(3).setCellRenderer(alinear);
    }
    
    private void borrarFilas() {
        int filas = tab1.getRowCount() - 1;
        for (; filas >= 0; filas--) {
            tab1.removeAll();
        }
    }
    
    private void limpiarCampos() {
        cmbTipos.setSelectedIndex(-1);
        data.setDate(null);
        TF_CoordX.setText("");
        TF_CoordY.setText("");
        textArea.setText("");
        borrarFilas();
    }
    
    private void cargarTabla() {
        String esp = (String) cmbTipos.getSelectedItem().toString();
        SiniestroData sinD = new SiniestroData();
        // buscar brigadas q coincidan con la especialidad y obtener el cuartel al q pertenecen
        ArrayList<double[]> cuartelDistancia = armarCuartelesporDistacia();
        ArrayList<String[]> CuartelesXEsp = sinD.listarCuarteslesXEsp(esp);
        //
        if (CuartelesXEsp == null || CuartelesXEsp.size() == 0) {
            JOptionPane.showMessageDialog(this, "No hay Brigadas Disponibles para la especialidad: " + esp);
            return;
        }
        //
        String codigo;
        int aux;
        DecimalFormat df = new DecimalFormat("###.##");
        for (double[] distancias : cuartelDistancia) {
            for (String[] cuarteles : CuartelesXEsp) {
                String temp = (int) distancias[0] + "";
                if (temp.equals(cuarteles[3])) {
                    aux = Integer.parseInt(cuarteles[0]);
                    codigo = String.format("%02d", aux);
                    DefaultTableModel modeloTabla = (DefaultTableModel) tab1.getModel();
                    modeloTabla.addRow(new Object[]{codigo, cuarteles[1], cuarteles[2], df.format(distancias[1])});
                    
                }
            }
        }
    }
    
    private double calcularDistancia(double coordX1, double coordY1) {
        double dist = 0, coordX2, coordY2;
        coordX2 = Double.parseDouble(TF_CoordX.getText());
        coordY2 = Double.parseDouble(TF_CoordY.getText());
        double radioTierra = 6371;//en kilmetros  
        double dLat = Math.toRadians(coordX2 - coordX1);
        double dLng = Math.toRadians(coordY2 - coordY1);
        double sindLat = Math.sin(dLat / 2);
        double sindLng = Math.sin(dLng / 2);
        double va1 = Math.pow(sindLat, 2) + Math.pow(sindLng, 2)
                * Math.cos(Math.toRadians(coordX1)) * Math.cos(Math.toRadians(coordX2));
        double va2 = 2 * Math.atan2(Math.sqrt(va1), Math.sqrt(1 - va1));
        dist = radioTierra * va2;
        
        return dist;
    }
    
    private ArrayList<double[]> armarCuartelesporDistacia() {
        ArrayList<double[]> cuartelDistancia = new ArrayList<double[]>();
        double[] dist_coord = new double[2];
        CuartelData cuartelD = new CuartelData();
        // Armar una Lista de vectores con el ID_Cuartel y distancia del cuartel al siniestro
        for (Cuartel cuartel : cuartelD.ListarCuarteles()) {
            dist_coord[1] = calcularDistancia(cuartel.getCoord_X(), cuartel.getCoord_Y());
            dist_coord[0] = cuartel.getId_cuartel();
            cuartelDistancia.add(dist_coord.clone());
        }
        // lista de menor distancia a mayor
        Collections.sort(cuartelDistancia, new Comparator<double[]>() {
            @Override
            public int compare(double[] o1, double[] o2) {
                return Double.compare(o1[1], o2[1]);
            }
        });
        // lista ordenada
        return cuartelDistancia;
    }
    
    private boolean validarCoordenadas() {
        double X, Y;
        try {
            X = Double.parseDouble(TF_CoordX.getText());
            Y = Double.parseDouble(TF_CoordY.getText());
        } catch (ClassCastException | NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Ingrese las COORDENADA usando decimales");
            return false;
        }
        return true;
    }
}
