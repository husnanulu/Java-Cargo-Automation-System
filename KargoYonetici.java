package com.mycompany.kargootomasyonu;
import java.util.ArrayList;
public class KargoYonetici {
    public ArrayList<Kargo> kargolar = new ArrayList<>();
    public ArrayList<Kurye> kuryeListesi = new ArrayList<>();
    public KargoYonetici() {
        kuryeListesi.add(new Kurye("Ahmet", "101", "Motor"));
        kuryeListesi.add(new Kurye("Mehmet", "102", "Kamyonet"));
        kuryeListesi.add(new Kurye("Ayşe", "103", "Motor"));
        kuryeListesi.add(new Kurye("Can", "104", "Tır"));
    } 
    public Kargo kargoBul(String no) {
        for (Kargo k : kargolar) {
            if (k.getTakipNo().equals(no)) {
                return k;
            }
        }
        return null;
    }
    public String kuryeIsmiGetir(String id) {
        for (Kurye k : kuryeListesi) {
            if (k.getKuryeID().equals(id)) {
                return k.getAd(); //eşleşen kuryenin adını döndürür
            }
        }
    return "Henüz Atanmadı"; //eğer kurye atanmamışsa
    }
}