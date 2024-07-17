package com.java.Database.JDBI;

import org.jdbi.v3.core.Handle;
import org.jdbi.v3.core.Jdbi;
import org.jdbi.v3.core.statement.StatementException;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Optional;

/*
 * JDBI ile Veritabanına Bağlantı
 */
public class ConnectionToDatabaseWithJDBI {

    public static void main(String[] args) {
        String url = "jdbc:mysql://sql7.freemysqlhosting.net:3306/sql7720226";
        String kullaniciAdi = "sql7720226";
        String sifre = "4pJ4B3LBpM";

        Jdbi jdbi = Jdbi.create(url, kullaniciAdi, sifre);
        try {
            jdbi.useHandle(handle -> {

                handle.execute("""
                    CREATE TABLE IF NOT EXISTS ad_soyad (
                        id INT PRIMARY KEY AUTO_INCREMENT,
                        ad VARCHAR(50),
                        soyad VARCHAR(50),
                        yas INT,
                        departman VARCHAR(50),
                        maas DECIMAL(10,2)
                    )
                """);
                System.out.println("ad_soyad tablosu başarıyla oluşturuldu.");

                handle.execute("INSERT INTO ad_soyad (ad, soyad, yas, departman, maas) VALUES (?, ?, ?, ?, ?)",
                        "Bariscan", "TEMEL", 37, "IT", 10000.00);
                System.out.println("Veri başarıyla eklendi.");

                handle.createQuery("SELECT * FROM sql7720226.ad_soyad")
                        .map((rs, ctx) -> String.format("ID: %d, Ad: %s, Soyad: %s, Yaş: %d, Departman: %s, Maas: %.2f",
                                rs.getInt("id"),
                                rs.getString("ad"),
                                rs.getString("soyad"),
                                rs.getInt("yas"),
                                rs.getString("departman"),
                                rs.getDouble("maas")))
                        .forEach(System.out::println);

                handle.execute("UPDATE sql7720226.ad_soyad SET maas = ? WHERE ad = ? AND soyad = ?",
                        12000.00, "Bariscan", "TEMEL");
                System.out.println("Veri başarıyla güncellendi.");

                handle.execute("DELETE FROM ad_soyad WHERE ad = ? AND soyad = ?",
                        "Bariscan", "TEMEL");
                System.out.println("Veri başarıyla silindi.");
            });
        } catch (Exception e) {
            throw new RuntimeException("Veritabanı bağlantısı sırasında bir hata oluştu.", e);
        }
    }

}
