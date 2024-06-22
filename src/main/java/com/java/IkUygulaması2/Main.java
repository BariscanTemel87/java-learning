package com.java.IkUygulaması2;

/*
 * İK Uygulaması2
 */
import java.time.LocalDate;

public class Main {
 public static void main(String[] args) {
  // Takım lideri oluşturma
  Personel takimLideri = new Erkek("Bariscan", "Temel", LocalDate.of(1980, 5, 15));

  // Departman oluşturma
  Departman yazilimDepartmani = new Departman("Yazılım Departmanı", takimLideri);

  // Personel ekleme
  Personel personel1 = new Kadin("Merve", "Karaoğlu", LocalDate.of(1990, 3, 10));
  Personel personel2 = new Erkek("Demir", "Demirkan", LocalDate.of(1985, 7, 20));
  yazilimDepartmani.personelEkle(personel1);
  yazilimDepartmani.personelEkle(personel2);

  // Görev ekleme
  yazilimDepartmani.gorevEkle("Proje planlama");
  yazilimDepartmani.gorevEkle("Kod yazma");

  // Görev tamamlama
  yazilimDepartmani.gorevTamamla("Proje planlama");

  // Takım lideri değiştirme
  Personel yeniTakimLideri = new Kadin("Burak", "Çelik", LocalDate.of(1982, 12, 25));
  yazilimDepartmani.takimLideriDegistir(yeniTakimLideri);

  // Personel çıkarma
  yazilimDepartmani.personelCikar(personel2);

  // Emeklilik yaşına kalan yıl hesaplama
  System.out.println(personel1.getAd() + " emekliliğe " + personel1.emeklilikYasinaKalanYil() + " yıl kaldı.");
  System.out.println(personel2.getAd() + " emekliliğe " + personel2.emeklilikYasinaKalanYil() + " yıl kaldı.");
  System.out.println(yeniTakimLideri.getAd() + " emekliliğe " + yeniTakimLideri.emeklilikYasinaKalanYil() + " yıl kaldı.");
  System.out.println(takimLideri.getAd() + " emekliliğe " + takimLideri.emeklilikYasinaKalanYil() + " yıl kaldı.");
 }
}

