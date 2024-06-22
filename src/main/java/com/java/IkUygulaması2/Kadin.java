package com.java.IkUygulaması2;

import java.time.LocalDate;
import java.time.Period;

/*
    * İK Uygulaması2
 */
public class Kadin extends Personel {

    public Kadin(String ad, String soyad, LocalDate dogumTarihi) {
        super(ad, soyad, dogumTarihi);
    }

    @Override
    public int emeklilikYasinaKalanYil() {
        int currentAge = yasHesapla();
        int retirementAge = 60;
        return retirementAge - currentAge;
    }
}
