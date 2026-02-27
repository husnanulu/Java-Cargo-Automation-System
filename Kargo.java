package com.mycompany.kargootomasyonu;
public class Kargo {
    private String takipNo;
    private String alici;
    private String durum;
    private String kuryeID;
    public Kargo(String takipNo, String alici) {
        this.takipNo = takipNo;
        this.alici = alici;
    }
    public String getTakipNo() { return takipNo; }
    public String getAlici() { return alici; }
    public String getDurum() { return durum; }
    public void setDurum(String durum) { 
        this.durum = durum; 
    }//kargpnun durumunu değiştirmek için kullanırız
    public String getKuryeID() { return kuryeID; }
    public void setKuryeID(String id) { this.kuryeID = id; }
}