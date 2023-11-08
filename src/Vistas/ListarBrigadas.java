package Vistas;

import AccesoADatos.BrigadaData;
import AccesoADatos.CuartelData;
import Entidades.Brigada;
import Entidades.Cuartel;
import java.util.ArrayList;
import java.util.List;

public class ListarBrigadas extends javax.swing.JFrame {

    public ListarBrigadas() {
        initComponents();
        cargarComboBox();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtBrigadas = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        cbCuartel = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setText("Listar Brigadas");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(38, 21, -1, -1));

        jButton1.setBackground(new java.awt.Color(0, 0, 0));
        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("CERRAR");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(694, 28, -1, -1));

        jtBrigadas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Nombre", "Especialidad", "Estado", "Cuartel", "Disponibilidad"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.Boolean.class, java.lang.Object.class, java.lang.Boolean.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jtBrigadas);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(38, 198, 739, 320));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setText("Seleccione Cuartel:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(195, 113, -1, -1));

        cbCuartel.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        cbCuartel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbCuartelActionPerformed(evt);
            }
        });
        getContentPane().add(cbCuartel, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 113, 266, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/fondo rojo.jpeg"))); // NOI18N
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 600));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        setVisible(false);
    }//GEN-LAST:event_jButton1ActionPerformed

    //Cargar comboBox con cuarteles actuales 
    private void cargarComboBox() {
        cbCuartel.removeAllItems();
        Cuartel cuartelVacio = new Cuartel();
        cuartelVacio.setNombre_cuartel("Cuarteles");
        cbCuartel.addItem(cuartelVacio.getNombre_cuartel());
        CuartelData cd = new CuartelData();
        List<Cuartel> list = cd.ListarCuarteles();
        for (Cuartel elem : list) {
            cbCuartel.addItem(elem.getNombre_cuartel());
        }
    }


    private void cbCuartelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbCuartelActionPerformed
        //CuartelData contiene funcion BuscarCuartelPorNombre()
        CuartelData cd = new CuartelData();
        //Variable para guardar el cuartel encontrado
        Cuartel cuartel = new Cuartel();
        cuartel = cd.BuscarCuartelPorNombre((String) cbCuartel.getSelectedItem());
        int idCuartel = cuartel.getId_cuartel();
       //BrigadaData contiene listarBrigadasPorCuartel(idCuartel)
        BrigadaData bd =new  BrigadaData();
        //List<Brigada> brigadas = bd.ListarBrigadaPorCuartel();
        
        
//        //CARGAR DATOS filas
//        if (!prod.getCategoria().equals("-")) {
//            modelo.addRow(new Object[]{prod.getCategoria(), prod.getNombre(), prod.getPrecio()});
//        }
    }//GEN-LAST:event_cbCuartelActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cbCuartel;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jtBrigadas;
    // End of variables declaration//GEN-END:variables

}
