package com.java.IkUygulaması;

/*
 * IK uygulaması
 */
public class Main {
    public static void main(String[] args) {

        Departman itDepartmani = new Departman("IT");


        Personel personel1 = new Personel("Bariscan", "Temel", 37, "bariscan.temel@example.com", "QA Engineer");
        Personel personel2 = new Personel("Berker", "Cakici", 38, "berker.cakici@example.com", "Backend Developer");
        Personel personel3 = new Personel("Cihan", "Durgun", 28, "cihan.durgun@example.com", "Frontend Developer");
        Personel personel4 = new Personel("Derin", "Uysal", 24, "derin.durgun@example.com", "Android Developer");
        Personel personel5 = new Personel("Ece", "Cikrik", 27, "ece.cikrik@example.com", "iOS Developer");


        itDepartmani.personelEkle(personel1);
        itDepartmani.personelEkle(personel2);
        itDepartmani.personelEkle(personel3);
        itDepartmani.personelEkle(personel4);
        itDepartmani.personelEkle(personel5);


        System.out.println("Departman: " + itDepartmani.getIsim());
        for (Personel personel : itDepartmani.getPersoneller()) {
            System.out.println(personel);
        }
    }
}

