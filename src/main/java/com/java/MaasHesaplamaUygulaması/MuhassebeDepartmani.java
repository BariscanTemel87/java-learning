package com.java.MaasHesaplamaUygulaması;

/*
 * Maas Hesaplama Uygulaması
 */
public class MuhassebeDepartmani {

    private static final int MAAS = 20000;
    private static final int PRIM = 1000;

   public int maasHesapla(Personel personel) {
        int calismaGunu = personel.getCalismaGunu();
        int extraGun = calismaGunu > 25 ? calismaGunu - 25 : 0;
        return MAAS + (extraGun * PRIM);
    }
}
