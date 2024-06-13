package com.java.Gezegenler;

/*
    * Gezegenler
 */
public class GezegenTest {
 public static void main(String[] args) {
  for (Gezegen gezegen : Gezegen.values()) {
   System.out.println("Gezegen: " + gezegen.name());
   System.out.println("Sıra Numarası: " + gezegen.getSıraNumarası());
   System.out.println("Güneş'e Uzaklık: " + gezegen.getUzaklık() + " milyon km");
   System.out.println("Yarıçap: " + gezegen.getYarıçap() + " km");
   System.out.println("Dönme Süresi: " + gezegen.getDönmeSüresi() + " dünya günü");
   System.out.println("-----------------------------");
  }
 }
}
