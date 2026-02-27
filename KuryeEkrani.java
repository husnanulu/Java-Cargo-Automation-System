package com.mycompany.kargootomasyonu;
import javax.swing.table.DefaultTableModel;
public class KuryeEkrani extends javax.swing.JFrame {
    KargoYonetici yonetici;
String aktifKuryeID;
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(KuryeEkrani.class.getName());
public KuryeEkrani(KargoYonetici gelenYonetici, String id) {
        initComponents();
        this.yonetici = gelenYonetici;
        this.aktifKuryeID = id;
        lblKuryeBilgi.setText("Hoş geldin, Kurye ID: " + id);
        kargolariListele();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        lblKuryeBilgi = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblKargolar = new javax.swing.JTable();
        cmbYeniDurum = new javax.swing.JComboBox<>();
        btnGuncelle = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI Semibold", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(60, 65, 67));
        jLabel1.setText("Kurye Ekranı");

        lblKuryeBilgi.setText("Hoşgeldin : ");

        tblKargolar.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "takip no", "alıcı", "durum"
            }
        ));
        jScrollPane1.setViewportView(tblKargolar);

        cmbYeniDurum.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "yolda", "teslim edildi", "adreste bulunamadı" }));
        cmbYeniDurum.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbYeniDurumActionPerformed(evt);
            }
        });

        btnGuncelle.setBackground(new java.awt.Color(160, 187, 196));
        btnGuncelle.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        btnGuncelle.setForeground(new java.awt.Color(255, 255, 255));
        btnGuncelle.setText("durumu güncelle");
        btnGuncelle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuncelleActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(cmbYeniDurum, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnGuncelle))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 333, Short.MAX_VALUE)
                    .addComponent(lblKuryeBilgi, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(24, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblKuryeBilgi)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmbYeniDurum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnGuncelle))
                .addGap(0, 54, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnGuncelleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuncelleActionPerformed

    int seciliSatir = tblKargolar.getSelectedRow();
    if (seciliSatir == -1) return;
    String takipNo = tblKargolar.getValueAt(seciliSatir, 0).toString();
    String yeniDurum = cmbYeniDurum.getSelectedItem().toString();
    for (int i = 0; i < yonetici.kargolar.size(); i++) {
        Kargo k = yonetici.kargolar.get(i);
        if (k.getTakipNo().equals(takipNo)) {
            if (yeniDurum.equalsIgnoreCase("teslim edildi")) {
                yonetici.kargolar.remove(i);
                javax.swing.JOptionPane.showMessageDialog(this, "Kargo teslim edildi ve sistemden kaldırıldı!");
            } else {
                k.setDurum(yeniDurum);
            }
            break;
        }
    }
    kargolariListele(); 
    }//GEN-LAST:event_btnGuncelleActionPerformed

    private void cmbYeniDurumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbYeniDurumActionPerformed
    
    }//GEN-LAST:event_cmbYeniDurumActionPerformed

    public void kargolariListele() {
    DefaultTableModel model = (DefaultTableModel) tblKargolar.getModel();
    model.setRowCount(0); 
    for (Kargo k : yonetici.kargolar) {
        if (k.getKuryeID() != null && k.getKuryeID().equals(aktifKuryeID)) {
            model.addRow(new Object[]{
                k.getTakipNo(), 
                k.getAlici(), 
                k.getDurum()
            });
        }
    }
}
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnGuncelle;
    private javax.swing.JComboBox<String> cmbYeniDurum;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblKuryeBilgi;
    private javax.swing.JTable tblKargolar;
    // End of variables declaration//GEN-END:variables
}
