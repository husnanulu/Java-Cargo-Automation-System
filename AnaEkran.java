package com.mycompany.kargootomasyonu;
public class AnaEkran extends javax.swing.JFrame {
    KargoYonetici yonetici = new KargoYonetici();
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(AnaEkran.class.getName());
    public AnaEkran() {
        initComponents();//sınıfın yapıcısı.ekran bileşenlerini hazırlar
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btnSorgula = new javax.swing.JButton();
        txtTakipNo = new javax.swing.JTextField();
        lblSonuc = new javax.swing.JLabel();
        btnYetkiliGiris = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setSize(new java.awt.Dimension(300, 200));

        jPanel2.setMinimumSize(new java.awt.Dimension(400, 300));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(60, 64, 67));
        jLabel1.setText("Kargo Sorgula");

        btnSorgula.setBackground(new java.awt.Color(160, 187, 196));
        btnSorgula.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        btnSorgula.setForeground(new java.awt.Color(255, 255, 255));
        btnSorgula.setText("Sorgula");
        btnSorgula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSorgulaActionPerformed(evt);
            }
        });

        txtTakipNo.setBackground(new java.awt.Color(245, 245, 247));
        txtTakipNo.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtTakipNo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtTakipNo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTakipNoActionPerformed(evt);
            }
        });

        lblSonuc.setText("takip numarasını giriniz ...");

        btnYetkiliGiris.setBackground(new java.awt.Color(160, 187, 196));
        btnYetkiliGiris.setForeground(new java.awt.Color(80, 80, 80));
        btnYetkiliGiris.setText("yetkili giriş");
        btnYetkiliGiris.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnYetkiliGirisActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(218, 218, 218)
                        .addComponent(btnSorgula, javax.swing.GroupLayout.DEFAULT_SIZE, 116, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(74, 74, 74)
                        .addComponent(txtTakipNo, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(35, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(lblSonuc, javax.swing.GroupLayout.PREFERRED_SIZE, 295, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnYetkiliGiris)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(btnYetkiliGiris))
                .addGap(69, 69, 69)
                .addComponent(txtTakipNo, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnSorgula, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblSonuc)
                .addContainerGap(112, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtTakipNoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTakipNoActionPerformed
    
    }//GEN-LAST:event_txtTakipNoActionPerformed

    private void btnSorgulaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSorgulaActionPerformed

String no = txtTakipNo.getText();

Kargo bulunan = yonetici.kargoBul(no);
if (bulunan != null) {
    String kuryeAdi = yonetici.kuryeIsmiGetir(bulunan.getKuryeID());
    lblSonuc.setText("Kargo Durumu: " + bulunan.getDurum()+" | Kurye: " +kuryeAdi);
    lblSonuc.setForeground(new java.awt.Color(0, 153, 51));
} else {
    lblSonuc.setText("Hata: Kargo bulunamadı!");
    lblSonuc.setForeground(java.awt.Color.RED);
}
    }//GEN-LAST:event_btnSorgulaActionPerformed

    private void btnYetkiliGirisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnYetkiliGirisActionPerformed

    LoginEkran login = new LoginEkran(this, yonetici);
    login.setVisible(true);
    }//GEN-LAST:event_btnYetkiliGirisActionPerformed

    public static void main(String args[]) {
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ReflectiveOperationException | javax.swing.UnsupportedLookAndFeelException ex) {
            logger.log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        java.awt.EventQueue.invokeLater(() -> new AnaEkran().setVisible(true));
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSorgula;
    private javax.swing.JButton btnYetkiliGiris;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lblSonuc;
    private javax.swing.JTextField txtTakipNo;
    // End of variables declaration//GEN-END:variables
}
