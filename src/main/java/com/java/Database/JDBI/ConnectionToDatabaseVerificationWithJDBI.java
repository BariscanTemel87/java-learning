package com.java.Database.JDBI;

import org.jdbi.v3.core.Jdbi;

/*
 * JDBI ile Veritabanına Bağlantı ve CRUD İşlemleri
 */
public class ConnectionToDatabaseVerificationWithJDBI {

    public static void main(String[] args) {
        String url = "jdbc:mysql://sql7.freemysqlhosting.net:3306/sql7720226";
        String kullaniciAdi = "sql7720226";
        String sifre = "4pJ4B3LBpM";

        Jdbi jdbi = Jdbi.create(url, kullaniciAdi, sifre);
    }
}