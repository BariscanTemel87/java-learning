package com.java.IkUygulaması2;

/*
 * İK Uygulaması2
 */
import java.util.ArrayList;
import java.util.List;

public class Departman {
 private String ad;
 private Personel takimLideri;
 private List<Personel> personelListesi;
 private List<String> gorevListesi;

 public Departman(String ad, Personel takimLideri) {
  this.ad = ad;
  this.takimLideri = takimLideri;
  this.personelListesi = new ArrayList<>();
  this.gorevListesi = new ArrayList<>();
 }

 public void takimLideriDegistir(Personel yeniTakimLideri) {
  this.takimLideri = yeniTakimLideri;
 }

 public void personelEkle(Personel personel) {
  this.personelListesi.add(personel);
 }

 public void personelCikar(Personel personel) {
  this.personelListesi.remove(personel);
 }

 public void personelDegistir(Personel eskiPersonel, Personel yeniPersonel) {
  int index = this.personelListesi.indexOf(eskiPersonel);
  if (index != -1) {
   this.personelListesi.set(index, yeniPersonel);
  }
 }

 public void gorevEkle(String gorev) {
  this.gorevListesi.add(gorev);
 }

 public void gorevTamamla(String gorev) {
  this.gorevListesi.remove(gorev);
 }

 // Getter ve Setter yöntemleri
 public String getAd() {
  return ad;
 }

 public void setAd(String ad) {
  this.ad = ad;
 }

 public Personel getTakimLideri() {
  return takimLideri;
 }

 public void setTakimLideri(Personel takimLideri) {
  this.takimLideri = takimLideri;
 }

 public List<Personel> getPersonelListesi() {
  return personelListesi;
 }

 public List<String> getGorevListesi() {
  return gorevListesi;
 }
}

