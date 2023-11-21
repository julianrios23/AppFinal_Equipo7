package Vistas;

import AccesoADatos.SiniestroData;
import Entidades.Brigada;
import Entidades.Siniestro;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Julian Rios
 */
public class HistoricoSiniestros extends javax.swing.JFrame {

    private SiniestroData SD = new SiniestroData();
    private DefaultTableModel modelo = new DefaultTableModel() {
        @Override
        public boolean isCellEditable(int f, int c) {
            return false;
        }
    };

    public HistoricoSiniestros() {
        initComponents();
        iniciarTabla();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        chechTodos = new javax.swing.JCheckBox();
        chck48 = new javax.swing.JCheckBox();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(800, 600));
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setText("Historico Siniestros");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(33, 27, -1, -1));

        jButton1.setBackground(new java.awt.Color(0, 0, 0));
        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("CERRAR");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(682, 34, -1, -1));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(jTable1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(33, 252, 732, 239));

        chechTodos.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        chechTodos.setText("TODOS LOS SINIESTROS");
        chechTodos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chechTodosActionPerformed(evt);
            }
        });
        getContentPane().add(chechTodos, new org.netbeans.lib.awtextra.AbsoluteConstraints(159, 162, -1, -1));

        chck48.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        chck48.setText("ULTIMAS 48 HS");
        chck48.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chck48ActionPerformed(evt);
            }
        });
        getContentPane().add(chck48, new org.netbeans.lib.awtextra.AbsoluteConstraints(522, 162, -1, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/fondo rojo.jpeg"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 600));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void chechTodosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chechTodosActionPerformed
        chck48.setSelected(false);
        borrarTabla();
        cargarTablaComplet();
    }//GEN-LAST:event_chechTodosActionPerformed

    private void chck48ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chck48ActionPerformed
        chechTodos.setSelected(false);
        borrarTabla();
        carga48hs();
    }//GEN-LAST:event_chck48ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        setVisible(false);
    }//GEN-LAST:event_jButton1ActionPerformed

    public void iniciarTabla() {
        modelo.addColumn("Codigo");
        modelo.addColumn("Tipo");
        modelo.addColumn("Fecha");
        modelo.addColumn("Hora");
        modelo.addColumn("Coord X");
        modelo.addColumn("Coord Y");
        modelo.addColumn("Fecha Resoluc");
        modelo.addColumn("Hora Resoluc");
        modelo.addColumn("Punt");
        modelo.addColumn("Brigada");

        jTable1.setModel(modelo);
    }

    public void cargarTablaComplet() {
        borrarTabla();
        
        for (Siniestro sini : SD.listarTodosLosSiniestros()) {
           
            modelo.addRow(new Object[]{
                sini.getCodSiniestro(),
                sini.getTipo(),
                sini.getFechaSinietro(),
                sini.getHora(),
                sini.getCoord_X(),
                sini.getCoord_Y(),
                sini.getFechaResoluc(),
                sini.getHoraResoluc(),
                sini.getPuntuacion(),
                sini.getBrigada().getNombre_brigada()});

        }
    }

    public void carga48hs() {
        for (Siniestro xx : SD.listarUltimas48Horas()) {
            modelo.addRow(new Object[]{
                xx.getCodSiniestro(),
                xx.getTipo(),
                xx.getFechaSinietro(),
                xx.getHora(),
                xx.getCoord_X(),
                xx.getCoord_Y(),
                xx.getFechaResoluc(),
                xx.getHoraResoluc(),
                xx.getPuntuacion(),
                xx.getBrigada().getNombre_brigada()});
        }
    }

    public void borrarTabla() {
        int x = jTable1.getRowCount() - 1;

        for (int i = x; i >= 0; i--) {
            modelo.removeRow(i);

        }
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox chck48;
    private javax.swing.JCheckBox chechTodos;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables

    

}
