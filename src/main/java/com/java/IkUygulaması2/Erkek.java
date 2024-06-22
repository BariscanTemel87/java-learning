package com.java.IkUygulaması2;

/*
 * İK Uygulaması2
 */

import java.time.LocalDate;

public class Erkek extends Personel {

 public Erkek(String ad, String soyad, LocalDate dogumTarihi) {
  super(ad, soyad, dogumTarihi);
 }

 @Override
 public int emeklilikYasinaKalanYil() {
  int currentAge = yasHesapla();
  int retirementAge = 65;
  return retirementAge - currentAge;
 }
}


