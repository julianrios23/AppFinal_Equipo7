
package Vistas;

/**
 *
 * @author Julian Rios
 */
public class CargaCuarteles extends javax.swing.JFrame {

    
    public CargaCuarteles() {
        initComponents();
        setVisible(true);
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        txtID = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtDirecc = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtCoorX = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtCoorY = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtCorreo = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jCheckBox1 = new javax.swing.JCheckBox();
        jCheckBox2 = new javax.swing.JCheckBox();
        jLabel9 = new javax.swing.JLabel();
        txtTel = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setText("Carga Cuarteles");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(35, 25, -1, -1));

        jButton1.setBackground(new java.awt.Color(0, 0, 0));
        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("CERRAR");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 32, -1, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setText("Cod / ID");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(251, 111, -1, -1));
        getContentPane().add(txtID, new org.netbeans.lib.awtextra.AbsoluteConstraints(324, 111, 150, -1));

        jButton2.setBackground(new java.awt.Color(0, 0, 0));
        jButton2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("BUSCAR");
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(492, 108, -1, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setText("Nombre:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(83, 175, -1, -1));
        getContentPane().add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(161, 175, 212, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setText("Dirección:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(391, 175, -1, -1));
        getContentPane().add(txtDirecc, new org.netbeans.lib.awtextra.AbsoluteConstraints(476, 175, 230, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setText("Coordenada X:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(83, 239, -1, -1));

        txtCoorX.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        getContentPane().add(txtCoorX, new org.netbeans.lib.awtextra.AbsoluteConstraints(201, 239, 172, -1));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel6.setText("Coordenada Y:");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(391, 239, -1, -1));
        getContentPane().add(txtCoorY, new org.netbeans.lib.awtextra.AbsoluteConstraints(509, 239, 197, -1));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel7.setText("Correo:");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(83, 301, -1, -1));
        getContentPane().add(txtCorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(152, 299, 221, -1));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel8.setText("Estado:");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(391, 299, -1, -1));

        jCheckBox1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jCheckBox1.setText("ACTIVO");
        getContentPane().add(jCheckBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(487, 297, -1, -1));

        jCheckBox2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jCheckBox2.setText("NO ACTIVO");
        getContentPane().add(jCheckBox2, new org.netbeans.lib.awtextra.AbsoluteConstraints(606, 297, -1, -1));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel9.setText("Teléfono:");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(83, 356, -1, -1));
        getContentPane().add(txtTel, new org.netbeans.lib.awtextra.AbsoluteConstraints(164, 356, 209, -1));

        jButton3.setBackground(new java.awt.Color(0, 0, 0));
        jButton3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("AGREGAR CUARTEL");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(164, 466, -1, -1));

        jButton4.setBackground(new java.awt.Color(0, 0, 0));
        jButton4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButton4.setForeground(new java.awt.Color(255, 255, 255));
        jButton4.setText("MODIFICAR");
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(522, 466, -1, -1));

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/fondo rojo.jpeg"))); // NOI18N
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 600));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        setVisible(false);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed

    }//GEN-LAST:event_jButton3ActionPerformed

    
   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JCheckBox jCheckBox2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField txtCoorX;
    private javax.swing.JTextField txtCoorY;
    private javax.swing.JTextField txtCorreo;
    private javax.swing.JTextField txtDirecc;
    private javax.swing.JTextField txtID;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtTel;
    // End of variables declaration//GEN-END:variables

}
