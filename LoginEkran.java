package com.mycompany.kargootomasyonu;

public class LoginEkran extends javax.swing.JFrame {
    KargoYonetici yonetici;//ana ekrandan gelen verileri tutmak için referans

public LoginEkran(java.awt.Frame parent, KargoYonetici gelenYonetici) {
    initComponents();
    this.yonetici = gelenYonetici; //anaEkran'dan gelen yönetici nesnesini burada tutuyoruz
}
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtYetkiliID = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        btnGiris = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        txtSifre = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(60, 64, 67));
        jLabel1.setText("Yetkili Girişi");
        jLabel1.setMaximumSize(new java.awt.Dimension(122, 25));
        jLabel1.setMinimumSize(new java.awt.Dimension(122, 25));

        jLabel2.setText("Yetkili ID:");

        txtYetkiliID.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtYetkiliID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtYetkiliIDActionPerformed(evt);
            }
        });

        jLabel3.setText("Şifre:");

        btnGiris.setBackground(new java.awt.Color(160, 187, 196));
        btnGiris.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        btnGiris.setForeground(new java.awt.Color(255, 255, 255));
        btnGiris.setText("Giriş Yap");
        btnGiris.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGirisActionPerformed(evt);
            }
        });

        jLabel5.setText("< Müşteri Ekranına Geri Dön");
        jLabel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel5MouseClicked(evt);
            }
        });

        txtSifre.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtSifre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSifreActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtYetkiliID)
                    .addComponent(btnGiris)
                    .addComponent(txtSifre, javax.swing.GroupLayout.DEFAULT_SIZE, 140, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(227, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(68, 68, 68)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtYetkiliID, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtSifre, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addComponent(btnGiris)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 74, Short.MAX_VALUE)
                .addComponent(jLabel5)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtYetkiliIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtYetkiliIDActionPerformed
    
    }//GEN-LAST:event_txtYetkiliIDActionPerformed

    private void btnGirisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGirisActionPerformed
                       
    String id = txtYetkiliID.getText().trim();
    String sifre = new String(txtSifre.getPassword());
    if (id.isEmpty() || sifre.isEmpty()) {
        javax.swing.JOptionPane.showMessageDialog(this, "Alanları boş bırakma!");
        return;
    }
    if (id.equals("ADM00990")) {
        if (sifre.equals("admin123")) {
            new YoneticiEkrani(yonetici).setVisible(true);
            this.dispose();
        } else {
            javax.swing.JOptionPane.showMessageDialog(this, "Yönetici şifresi yanlış!");
        }
    }
    else {
        if (sifre.equals("kurye123")) {
            boolean kuryeVarMi = false;
            for (Kurye k : yonetici.kuryeListesi) {
                if (k.getKuryeID().equals(id)) {
                    kuryeVarMi = true;
                    break;
                }
            }
            if (kuryeVarMi) {
                new KuryeEkrani(yonetici, id).setVisible(true);
                this.dispose();
            } else {
                javax.swing.JOptionPane.showMessageDialog(this, "Hata: '" + id + "' ID'li bir kurye sistemde tanımlı değil!");
            }
        } else {
            javax.swing.JOptionPane.showMessageDialog(this, "Kurye şifresi yanlış!");
        }
    }
    }//GEN-LAST:event_btnGirisActionPerformed

    private void jLabel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseClicked
        this.dispose();
    }//GEN-LAST:event_jLabel5MouseClicked

    private void txtSifreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSifreActionPerformed

    }//GEN-LAST:event_txtSifreActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnGiris;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPasswordField txtSifre;
    private javax.swing.JTextField txtYetkiliID;
    // End of variables declaration//GEN-END:variables
}
