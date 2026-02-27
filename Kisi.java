package com.mycompany.kargootomasyonu;
public abstract class Kisi {
    protected String ad;// bu sınıf ve bu sınıftan türeyen sınıflar erişebilir
    public Kisi(String ad) {
        this.ad = ad;
    }
    public String getAd() { //dışarıdan isme ulaşılması sağlanır
        return this.ad; 
    }
}