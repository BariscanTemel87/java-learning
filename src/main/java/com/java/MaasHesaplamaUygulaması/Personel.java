package com.java.MaasHesaplamaUygulaması;

/*
 * Maas Hesaplama Uygulaması
 */
public class Personel {
    private String isim;
    private int calismaGunu;

    public Personel(String isim, int calismaGunu) {
        this.isim = isim;
        this.calismaGunu = calismaGunu;
    }

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public int getCalismaGunu() {
        return calismaGunu;
    }

    public void setCalismaGunu(int calismaGunu) {
        this.calismaGunu = calismaGunu;
    }
}
