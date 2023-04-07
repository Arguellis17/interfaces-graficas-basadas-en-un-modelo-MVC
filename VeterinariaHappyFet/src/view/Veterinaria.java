/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

/**
 *
 * @author argue
 */
public class Veterinaria extends javax.swing.JFrame {

    /**
     * Creates new form Veterinaria
     */
    public Veterinaria() {
        initComponents();
        setVisible(true);
        setTitle("Veterinaria Happy Fet");
        setResizable(false); // Evitar que el usuario modifique la ventana
        setLocationRelativeTo(null); // Mostrar la ventana en el centro
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Registro = new javax.swing.JPanel();
        lblCodigo = new javax.swing.JLabel();
        lblNombre = new javax.swing.JLabel();
        lblRaza = new javax.swing.JLabel();
        lblTamaño = new javax.swing.JLabel();
        servicio = new javax.swing.JPanel();
        chkBañoCompleto = new javax.swing.JCheckBox();
        chkVacuna = new javax.swing.JCheckBox();
        chkCortePelo = new javax.swing.JCheckBox();
        chkCorteUñas = new javax.swing.JCheckBox();
        btnCalcularServicio = new javax.swing.JButton();
        btnGuardar = new javax.swing.JButton();
        btnMostrarDatos = new javax.swing.JButton();
        txtCodigo = new javax.swing.JTextField();
        txtNombre = new javax.swing.JTextField();
        txtRaza = new javax.swing.JTextField();
        txtTamaño = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        areaResultados = new javax.swing.JTextArea();
        Bienvenida = new javax.swing.JPanel();
        btnLimpiar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Registro.setBackground(new java.awt.Color(255, 204, 204));
        Registro.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Registro Mascota", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Century Gothic", 1, 18))); // NOI18N

        lblCodigo.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        lblCodigo.setText("Codigo:");

        lblNombre.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        lblNombre.setText("Nombre:");

        lblRaza.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        lblRaza.setText("Raza:");

        lblTamaño.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        lblTamaño.setText("Tamaño:");

        servicio.setBackground(new java.awt.Color(255, 153, 153));
        servicio.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Servicio", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Century Gothic", 1, 14))); // NOI18N

        chkBañoCompleto.setBackground(new java.awt.Color(255, 153, 153));
        chkBañoCompleto.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        chkBañoCompleto.setText("Baño Completo");
        chkBañoCompleto.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        chkBañoCompleto.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        chkBañoCompleto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkBañoCompletoActionPerformed(evt);
            }
        });

        chkVacuna.setBackground(new java.awt.Color(255, 153, 153));
        chkVacuna.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        chkVacuna.setText("Vacunas");
        chkVacuna.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        chkVacuna.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        chkCortePelo.setBackground(new java.awt.Color(255, 153, 153));
        chkCortePelo.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        chkCortePelo.setText("Corte Pelo");
        chkCortePelo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        chkCortePelo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        chkCortePelo.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);

        chkCorteUñas.setBackground(new java.awt.Color(255, 153, 153));
        chkCorteUñas.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        chkCorteUñas.setText("Corte Uñas");
        chkCorteUñas.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout servicioLayout = new javax.swing.GroupLayout(servicio);
        servicio.setLayout(servicioLayout);
        servicioLayout.setHorizontalGroup(
            servicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(servicioLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(servicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(chkBañoCompleto)
                    .addComponent(chkVacuna))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(servicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(chkCortePelo)
                    .addComponent(chkCorteUñas))
                .addGap(51, 51, 51))
        );
        servicioLayout.setVerticalGroup(
            servicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(servicioLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(servicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(chkBañoCompleto)
                    .addComponent(chkCortePelo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                .addGroup(servicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(chkVacuna)
                    .addComponent(chkCorteUñas))
                .addGap(25, 25, 25))
        );

        btnCalcularServicio.setBackground(new java.awt.Color(255, 51, 51));
        btnCalcularServicio.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        btnCalcularServicio.setForeground(new java.awt.Color(255, 255, 255));
        btnCalcularServicio.setText("Calcular Servicio");
        btnCalcularServicio.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        btnGuardar.setBackground(new java.awt.Color(51, 153, 0));
        btnGuardar.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        btnGuardar.setForeground(new java.awt.Color(255, 255, 255));
        btnGuardar.setText("Guardar");
        btnGuardar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        btnMostrarDatos.setBackground(new java.awt.Color(255, 51, 51));
        btnMostrarDatos.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        btnMostrarDatos.setForeground(new java.awt.Color(255, 255, 255));
        btnMostrarDatos.setText("Mostrar Datos");
        btnMostrarDatos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        txtCodigo.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N

        txtNombre.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N

        txtRaza.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N

        txtTamaño.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N

        areaResultados.setEditable(false);
        areaResultados.setBackground(new java.awt.Color(255, 153, 153));
        areaResultados.setColumns(20);
        areaResultados.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        areaResultados.setRows(5);
        areaResultados.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Resultados", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Century Gothic", 1, 14))); // NOI18N
        jScrollPane2.setViewportView(areaResultados);

        Bienvenida.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "¡Bienvenido!", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Century Gothic", 1, 14))); // NOI18N

        javax.swing.GroupLayout BienvenidaLayout = new javax.swing.GroupLayout(Bienvenida);
        Bienvenida.setLayout(BienvenidaLayout);
        BienvenidaLayout.setHorizontalGroup(
            BienvenidaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        BienvenidaLayout.setVerticalGroup(
            BienvenidaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        btnLimpiar.setBackground(new java.awt.Color(255, 51, 51));
        btnLimpiar.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        btnLimpiar.setForeground(new java.awt.Color(255, 255, 255));
        btnLimpiar.setText("Limpiar");
        btnLimpiar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout RegistroLayout = new javax.swing.GroupLayout(Registro);
        Registro.setLayout(RegistroLayout);
        RegistroLayout.setHorizontalGroup(
            RegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(RegistroLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(RegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(RegistroLayout.createSequentialGroup()
                        .addComponent(btnCalcularServicio)
                        .addGap(34, 34, 34)
                        .addComponent(btnMostrarDatos)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnLimpiar))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, RegistroLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(RegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(RegistroLayout.createSequentialGroup()
                                .addComponent(lblCodigo)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(RegistroLayout.createSequentialGroup()
                                .addGroup(RegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblNombre)
                                    .addComponent(lblRaza))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(RegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtRaza, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(RegistroLayout.createSequentialGroup()
                                        .addComponent(txtNombre)
                                        .addGap(2, 2, 2))))
                            .addGroup(RegistroLayout.createSequentialGroup()
                                .addComponent(lblTamaño)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtTamaño, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(37, 37, 37)
                        .addComponent(Bienvenida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(servicio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(40, 40, 40))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, RegistroLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnGuardar)
                .addGap(51, 51, 51))
        );
        RegistroLayout.setVerticalGroup(
            RegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(RegistroLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(RegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(RegistroLayout.createSequentialGroup()
                        .addGroup(RegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblCodigo)
                            .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(RegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblNombre)
                            .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(RegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblRaza)
                            .addComponent(txtRaza, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(RegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblTamaño)
                            .addComponent(txtTamaño, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(Bienvenida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(servicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(RegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCalcularServicio)
                    .addComponent(btnMostrarDatos)
                    .addComponent(btnLimpiar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnGuardar)
                .addContainerGap(46, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Registro, javax.swing.GroupLayout.PREFERRED_SIZE, 440, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(Registro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void chkBañoCompletoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkBañoCompletoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chkBañoCompletoActionPerformed

    /**
     * @param args the command line arguments
     */
//    public static void main(String args[]) {
//        /* Set the Nimbus look and feel */
//        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
//        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
//         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
//         */
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(Veterinaria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(Veterinaria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(Veterinaria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(Veterinaria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new Veterinaria().setVisible(true);
//            }
//        });
//}


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JPanel Bienvenida;
    public javax.swing.JPanel Registro;
    public javax.swing.JTextArea areaResultados;
    public javax.swing.JButton btnCalcularServicio;
    public javax.swing.JButton btnGuardar;
    public javax.swing.JButton btnLimpiar;
    public javax.swing.JButton btnMostrarDatos;
    public javax.swing.JCheckBox chkBañoCompleto;
    public javax.swing.JCheckBox chkCortePelo;
    public javax.swing.JCheckBox chkCorteUñas;
    public javax.swing.JCheckBox chkVacuna;
    private javax.swing.JScrollPane jScrollPane2;
    public javax.swing.JLabel lblCodigo;
    public javax.swing.JLabel lblNombre;
    public javax.swing.JLabel lblRaza;
    public javax.swing.JLabel lblTamaño;
    public javax.swing.JPanel servicio;
    public javax.swing.JTextField txtCodigo;
    public javax.swing.JTextField txtNombre;
    public javax.swing.JTextField txtRaza;
    public javax.swing.JTextField txtTamaño;
    // End of variables declaration//GEN-END:variables
}