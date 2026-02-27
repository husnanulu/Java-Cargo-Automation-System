package com.mycompany.kargootomasyonu;
public class Kurye extends Kisi {
    private String kuryeID;
    private String aracTipi;

    public Kurye(String ad, String kuryeID, String aracTipi) {
        super(ad); // yapıcı metodu çağırır
        this.kuryeID = kuryeID;
        this.aracTipi = aracTipi;
    }
    public String getKuryeID() { return kuryeID; }
    public String getAracTipi() { return aracTipi; }
}