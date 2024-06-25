package com.java.Bolunebilme;

import java.util.Scanner;

/*
 * Sıfıra Bölme
 */
public class Main {
 public static void main(String[] args) {
  Scanner scanner = new Scanner(System.in);
  Matematik matematik = new Matematik();

  try {
   System.out.print("Bölünecek sayıyı girin: ");
   double bolunen = scanner.nextDouble();

   System.out.print("Bölen sayıyı girin: ");
   double bolen = scanner.nextDouble();

   double sonuc = matematik.bolme(bolunen, bolen);
   System.out.println("Sonuç: " + sonuc);
  } catch (SifiraBolmeException e) {
   System.out.println("Hata: " + e.getMessage());
  } catch (Exception e) {
   System.out.println("Bilinmeyen hata: " + e.getMessage());
  } finally {
   scanner.close();
  }
 }
}
