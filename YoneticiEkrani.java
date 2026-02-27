package com.mycompany.kargootomasyonu;
public class YoneticiEkrani extends javax.swing.JFrame {
KargoYonetici yonetici;
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(YoneticiEkrani.class.getName());
    public YoneticiEkrani(KargoYonetici gelenYonetici) {
    initComponents();
    this.yonetici = gelenYonetici;
    
}
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtAlici = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtGonderici = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        cmbAracTipi = new javax.swing.JComboBox<>();
        btnOtomatikAta = new javax.swing.JButton();
        lblYoneticiMesaj = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtYeniKuryeAd = new javax.swing.JTextField();
        txtYeniKuryeID = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        cmbYeniKuryeArac = new javax.swing.JComboBox<>();
        btnKuryeEkle = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(60, 64, 67));
        jLabel1.setText("Yönetici Ekranı");

        jLabel2.setText("Alıcı Adı:");

        jLabel3.setText("Gönderen Adı:");

        txtGonderici.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtGondericiActionPerformed(evt);
            }
        });

        jLabel4.setText("Araç Gereksinimi:");

        cmbAracTipi.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Kamyonet", "Tır", "Motor", " " }));
        cmbAracTipi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbAracTipiActionPerformed(evt);
            }
        });

        btnOtomatikAta.setBackground(new java.awt.Color(160, 187, 196));
        btnOtomatikAta.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        btnOtomatikAta.setForeground(new java.awt.Color(255, 255, 255));
        btnOtomatikAta.setText("Kuryeyi Default Ata ve Kaydet");
        btnOtomatikAta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOtomatikAtaActionPerformed(evt);
            }
        });

        lblYoneticiMesaj.setForeground(new java.awt.Color(60, 65, 67));
        lblYoneticiMesaj.setText("İşlem Durumu ...");

        jPanel1.setBackground(new java.awt.Color(232, 232, 232));

        jLabel5.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(60, 65, 67));
        jLabel5.setText("Yeni Kurye Kaydetme");

        jLabel6.setText("Adı:");

        jLabel7.setText("ID'si:");

        txtYeniKuryeID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtYeniKuryeIDActionPerformed(evt);
            }
        });

        jLabel8.setText("Araç Tipi:");

        cmbYeniKuryeArac.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Kamyonet", "Tır", "Motor" }));
        cmbYeniKuryeArac.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbYeniKuryeAracActionPerformed(evt);
            }
        });

        btnKuryeEkle.setBackground(new java.awt.Color(160, 187, 196));
        btnKuryeEkle.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        btnKuryeEkle.setForeground(new java.awt.Color(255, 255, 255));
        btnKuryeEkle.setText("Kaydet");
        btnKuryeEkle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKuryeEkleActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(80, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel8)
                    .addComponent(jLabel7)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cmbYeniKuryeArac, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(txtYeniKuryeAd, javax.swing.GroupLayout.DEFAULT_SIZE, 154, Short.MAX_VALUE)
                        .addComponent(jLabel5)
                        .addComponent(txtYeniKuryeID))
                    .addComponent(btnKuryeEkle, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(110, 110, 110))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(jLabel5)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtYeniKuryeAd, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtYeniKuryeID, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmbYeniKuryeArac, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnKuryeEkle)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lblYoneticiMesaj, javax.swing.GroupLayout.DEFAULT_SIZE, 184, Short.MAX_VALUE)
                            .addComponent(btnOtomatikAta, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addComponent(txtAlici)
                            .addComponent(txtGonderici)
                            .addComponent(cmbAracTipi, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 93, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtAlici, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtGonderici, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(cmbAracTipi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addComponent(btnOtomatikAta, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblYoneticiMesaj)
                .addContainerGap(48, Short.MAX_VALUE))
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtGondericiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtGondericiActionPerformed
   
    }//GEN-LAST:event_txtGondericiActionPerformed

    private void cmbAracTipiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbAracTipiActionPerformed
    
    }//GEN-LAST:event_cmbAracTipiActionPerformed

    private void btnOtomatikAtaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOtomatikAtaActionPerformed

    String alici = txtAlici.getText().trim();
    String gonderici = txtGonderici.getText().trim();
    if (alici.isEmpty() || gonderici.isEmpty()) {
        javax.swing.JOptionPane.showMessageDialog(this, "Hata: Alıcı veya Gönderici alanı boş olamaz!");
        return; 
    }
    String gerekenArac = cmbAracTipi.getSelectedItem().toString();
    java.util.ArrayList<Kurye> uygunKuryeler = new java.util.ArrayList<>();
    for (Kurye k : yonetici.kuryeListesi) {
        if (k.getAracTipi().equalsIgnoreCase(gerekenArac)) {
            uygunKuryeler.add(k);
        }
    }
    if (!uygunKuryeler.isEmpty()) {
        int rastgeleIndeks = (int)(Math.random() * uygunKuryeler.size());
        Kurye bulunanKurye = uygunKuryeler.get(rastgeleIndeks);
        String takipNo = "TR-" + (int)(Math.random() * 9000 + 1000); 
        Kargo yeniKargo = new Kargo(takipNo, alici);
        yeniKargo.setKuryeID(bulunanKurye.getKuryeID()); 
        yeniKargo.setDurum("Kabul Edildi");
        yonetici.kargolar.add(yeniKargo); 
        lblYoneticiMesaj.setText("KOD: " + takipNo + " | Kurye: " + bulunanKurye.getAd());
        lblYoneticiMesaj.setForeground(new java.awt.Color(0, 153, 51)); 
        txtAlici.setText("");
        txtGonderici.setText("");
    } else {
        javax.swing.JOptionPane.showMessageDialog(this, "Üzgünüz, " + gerekenArac + " tipinde uygun kurye yok!");
    }
    }//GEN-LAST:event_btnOtomatikAtaActionPerformed

    private void cmbYeniKuryeAracActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbYeniKuryeAracActionPerformed
 
    }//GEN-LAST:event_cmbYeniKuryeAracActionPerformed

    private void txtYeniKuryeIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtYeniKuryeIDActionPerformed
    
    }//GEN-LAST:event_txtYeniKuryeIDActionPerformed

    private void btnKuryeEkleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKuryeEkleActionPerformed

    String ad = txtYeniKuryeAd.getText().trim();
    String id = txtYeniKuryeID.getText().trim();
    String arac = cmbYeniKuryeArac.getSelectedItem().toString();
    if (ad.isEmpty() || id.isEmpty()) {
        javax.swing.JOptionPane.showMessageDialog(this, "Alanları doldurun!");
        return;
    }
    if (yonetici == null) {
        javax.swing.JOptionPane.showMessageDialog(this, "HATA: Yönetici nesnesi NULL!");
        return;
    }
    if (yonetici.kuryeListesi == null) {
        javax.swing.JOptionPane.showMessageDialog(this, "HATA: Kurye listesi NULL!");
        return;
    }
    for (int i = 0; i < yonetici.kuryeListesi.size(); i++) {
        Kurye k = yonetici.kuryeListesi.get(i);
        if (k.getKuryeID().equals(id)) {
            javax.swing.JOptionPane.showMessageDialog(this, 
                "HATA: " + id + " ID'si ZATEN KAYITLI!\n\n" +
                "Bu ID'ye sahip kurye: " + k.getAd() + "\n" +
                "Araç Tipi: " + k.getAracTipi() + "\n\n" +
                "Farklı bir ID giriniz!",
                "Kayıtlı ID",
                javax.swing.JOptionPane.ERROR_MESSAGE);
            txtYeniKuryeID.setText("");
            txtYeniKuryeID.requestFocus();
            return;
        }
    }
    Kurye yeniKurye = new Kurye(ad, id, arac);
    yonetici.kuryeListesi.add(yeniKurye);
    
    javax.swing.JOptionPane.showMessageDialog(this, 
        "Kurye eklendi: " + ad + "\n" +
        "ID: " + id + "\n" +
        "Toplam kurye: " + yonetici.kuryeListesi.size());

    txtYeniKuryeAd.setText("");
    txtYeniKuryeID.setText("");
    }//GEN-LAST:event_btnKuryeEkleActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnKuryeEkle;
    private javax.swing.JButton btnOtomatikAta;
    private javax.swing.JComboBox<String> cmbAracTipi;
    private javax.swing.JComboBox<String> cmbYeniKuryeArac;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblYoneticiMesaj;
    private javax.swing.JTextField txtAlici;
    private javax.swing.JTextField txtGonderici;
    private javax.swing.JTextField txtYeniKuryeAd;
    private javax.swing.JTextField txtYeniKuryeID;
    // End of variables declaration//GEN-END:variables
}
