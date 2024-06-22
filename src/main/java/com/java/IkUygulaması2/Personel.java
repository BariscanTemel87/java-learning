package com.java.IkUygulaması2;

import java.time.LocalDate;
import java.time.Period;

/*
 * İK Uygulaması2
 */
import java.time.LocalDate;
import java.time.Period;

public abstract class Personel {
    private String ad;
    private String soyad;
    private LocalDate dogumTarihi;

    public Personel(String ad, String soyad, LocalDate dogumTarihi) {
        this.ad = ad;
        this.soyad = soyad;
        this.dogumTarihi = dogumTarihi;
    }

    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public String getSoyad() {
        return soyad;
    }

    public void setSoyad(String soyad) {
        this.soyad = soyad;
    }

    public LocalDate getDogumTarihi() {
        return dogumTarihi;
    }

    public void setDogumTarihi(LocalDate dogumTarihi) {
        this.dogumTarihi = dogumTarihi;
    }

    public int yasHesapla() {
        return Period.between(dogumTarihi, LocalDate.now()).getYears();
    }

    public abstract int emeklilikYasinaKalanYil();
}

