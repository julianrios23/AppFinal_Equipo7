package Vistas;

import AccesoADatos.CuartelData;
import Entidades.Cuartel;
import java.util.List;
import javax.swing.table.DefaultTableModel;

public class ListarBomberos extends javax.swing.JFrame {

    // generar un modelo para la tabla que muestra los productos
    //private DefaultTableModel modelo = new DefaultTableModel();
    
    public ListarBomberos() {
        initComponents();
//        cargarComboBox();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabBomb = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        cmbCuartel = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(800, 600));
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setText("Listar Bomberos");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 23, -1, -1));

        jButton1.setBackground(new java.awt.Color(0, 0, 0));
        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("CERRAR");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(696, 30, -1, -1));

        tabBomb.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Nombre", "Apellido", "DNI", "Fecha Nac.", "Grupo Sang", "Brigada", "Teléfono", "Estado", "Identificación"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class, java.lang.String.class, java.lang.Boolean.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tabBomb);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 190, 739, 331));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setText("Seleccione Cuartel:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(132, 106, -1, -1));

        cmbCuartel.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        cmbCuartel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbCuartelActionPerformed(evt);
            }
        });
        getContentPane().add(cmbCuartel, new org.netbeans.lib.awtextra.AbsoluteConstraints(277, 106, 356, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/fondo rojo.jpeg"))); // NOI18N
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 600));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        setVisible(false);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void cmbCuartelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbCuartelActionPerformed
    }//GEN-LAST:event_cmbCuartelActionPerformed

    //Cargar comboBox con cuarteles actuales 
//    private void cargarComboBox() {
//        cbCuartel.removeAllItems();
//        Cuartel cuartelVacio = new Cuartel();
//        cuartelVacio.setNombre_cuartel("Cuarteles");
//        cbCuartel.addItem(cuartelVacio.getNombre_cuartel());
//        CuartelData cd = new CuartelData();
//        List<Cuartel> list = cd.ListarCuarteles();
//        for (Cuartel elem : list) {
//            cbCuartel.addItem(elem.getNombre_cuartel());
//        }
//    }
//    private void cbCuartelActionPerformed(java.awt.event.ActionEvent evt) {                                          
//        BrigadaData bd = new BrigadaData();
//        CuartelData cd = new CuartelData();
//        Cuartel cuartel = new Cuartel();
//        String cuartelNombre = (String) cbCuartel.getSelectedItem();
//        List<Brigada> brigadas = new ArrayList<>();
//        brigadas = bd.ListarBrigadasPorNombreCuartel(cuartelNombre);
//
//        DefaultTableModel modelo = (DefaultTableModel) jtBrigadas.getModel();
//        modelo.setRowCount(0); // Limpia la tabla antes de agregar nuevas filas
//
//        for (Brigada elem : brigadas) {
//            modelo.addRow(new Object[]{elem.getId_brigada(), elem.getNombre_brigada(), elem.getEspecialidad(), elem.isEstado(), elem.getNombre_cuartel(), elem.isDisponibilidad()});
//        }
//
//
//    }                                         

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cmbCuartel;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabBomb;
    // End of variables declaration//GEN-END:variables

}
