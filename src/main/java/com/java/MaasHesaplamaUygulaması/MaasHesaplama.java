package com.java.MaasHesaplamaUygulaması;

/*
 * Maas Hesaplama Uygulaması
 */
public class MaasHesaplama {
    public static void main(String[] args) {
        Personel personel = new Personel("Baris", 26);
        MuhassebeDepartmani muhasebeDepartmani = new MuhassebeDepartmani();

        int maas = muhasebeDepartmani.maasHesapla(personel);
        System.out.println("Personel: " + personel.getIsim() + " Maaş: " + maas);
    }
}