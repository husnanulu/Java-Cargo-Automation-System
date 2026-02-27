package com.mycompany.kargootomasyonu;
public class KargoOtomasyonu {
    public static void main(String[] args) {
        java.awt.EventQueue.invokeLater(new Runnable() {//güvenle çalışıp arayüzün donmasını engeller
            public void run() {//arayüzün çalıştıralacağı kod bloğunu başlatır
                new AnaEkran().setVisible(true);
                // AnaEkran formunda yeni bir nesne oluşturur. (true) ile görünür kılar onu
            }
         });
    }   
}
