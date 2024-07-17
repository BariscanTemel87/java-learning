package com.java.Database.JDBC;

import java.sql.*;

/*
 * JDBC ile Veritabanına Bağlantı
 */
public class ConnectionToDatabaseWithJDBC {

    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/bariscans_DB";
        String kullaniciAdi = "root";
        String sifre = "mypassword";

        try {
            Connection connection = DriverManager.getConnection(url, kullaniciAdi, sifre);
            if (connection != null) {
                System.out.println("MySQL veritabanına bağlantı başarılı!");
                connection.close();
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }
}
