package com.java.Database.JDBC;

import java.sql.*;

/*
 * JDBC ile Tablo Oluşturma, Veri Ekleme, Veri Silme ve Veri Listeleme
 */
public class ConnectionToDatabaseVerificationWithJDBC {

    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/bariscans_DB";
        String kullaniciAdi = "root";
        String sifre = "mypassword";

        Connection connection = null;
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;

        try {
            connection = DriverManager.getConnection(url, kullaniciAdi, sifre);
            String createSqlSorgusu = "CREATE TABLE IF NOT EXISTS ad_soyad (id INT PRIMARY KEY AUTO_INCREMENT, ad VARCHAR(50), soyad VARCHAR(50), yas INT, departman VARCHAR(50), maas DECIMAL(10,2))";
            preparedStatement = connection.prepareStatement(createSqlSorgusu);
            int result = preparedStatement.executeUpdate();
            if (result == 0) {
                System.out.println("Tablo oluşturuldu.");
            } else {
                System.out.println("Tablo oluşturulamadı.");
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                if (resultSet != null) resultSet.close();
                if (preparedStatement != null) preparedStatement.close();
                if (connection != null) connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

        try {
            connection = DriverManager.getConnection(url, kullaniciAdi, sifre);
            String insertSqlSorgusu1 = "INSERT INTO ad_soyad (ad, soyad, yas, departman, maas) VALUES ('Barışcan', 'TEMEL', 37, 'IT', 10000)";
            preparedStatement = connection.prepareStatement(insertSqlSorgusu1);
            int result1 = preparedStatement.executeUpdate();
            if (result1 > 0) {
                System.out.println("Veri bir eklendi.");
            } else {
                System.out.println("Veri iki eklenemedi.");
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                if (resultSet != null) resultSet.close();
                if (preparedStatement != null) preparedStatement.close();
                if (connection != null) connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

        try {
            connection = DriverManager.getConnection(url, kullaniciAdi, sifre);
            String insertSqlSorgusu2 = "INSERT INTO ad_soyad (ad, soyad, yas, departman, maas) VALUES ('Can', 'AĞAÇLI', 35, 'IT', 10000)";
            preparedStatement = connection.prepareStatement(insertSqlSorgusu2);
            int result2 = preparedStatement.executeUpdate();
            if (result2 > 0) {
                System.out.println("Veri iki eklendi.");
            } else {
                System.out.println("Veri iki eklenemedi.");
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                if (resultSet != null) resultSet.close();
                if (preparedStatement != null) preparedStatement.close();
                if (connection != null) connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

        try {
            connection = DriverManager.getConnection(url, kullaniciAdi, sifre);
            String insertSqlSorgusu3 = "INSERT INTO ad_soyad (ad, soyad, yas, departman, maas) VALUES ('Canan', 'Cam', 35, 'IK', 10000)";
            preparedStatement = connection.prepareStatement(insertSqlSorgusu3);
            //preparedStatement.executeUpdate();
            int result2 = preparedStatement.executeUpdate();
            if (result2 > 0) {
                System.out.println("Veri üç eklendi.");
            } else {
                System.out.println("Veri üç eklenemedi.");
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                if (resultSet != null) resultSet.close();
                if (preparedStatement != null) preparedStatement.close();
                if (connection != null) connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

        try {
            connection = DriverManager.getConnection(url, kullaniciAdi, sifre);
            String selectSqlSorgusu = "SELECT * FROM bariscans_DB.ad_soyad";
            preparedStatement = connection.prepareStatement(selectSqlSorgusu);
            resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                int id = resultSet.getInt("id");
                String ad = resultSet.getString("ad");
                String soyad = resultSet.getString("soyad");
                int yas = resultSet.getInt("yas");
                String departman = resultSet.getString("departman");
                double maas = resultSet.getDouble("maas");
                System.out.println("ID: " + id + ", Ad: " + ad + ", Soyad: " + soyad + ", Yaş: " + yas + ", Departman: " + departman + ", Maaş: " + maas);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                if (resultSet != null) resultSet.close();
                if (preparedStatement != null) preparedStatement.close();
                if (connection != null) connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

        try {
            connection = DriverManager.getConnection(url, kullaniciAdi, sifre);
            String deleteSqlSorgusu = "DELETE FROM bariscans_DB.ad_soyad WHERE id = 1";
            preparedStatement = connection.prepareStatement(deleteSqlSorgusu);
            int result = preparedStatement.executeUpdate();
            if (result > 0) {
                System.out.println("Veri silindi.");
            } else {
                System.out.println("Veri silinemedi.");
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                if (resultSet != null) resultSet.close();
                if (preparedStatement != null) preparedStatement.close();
                if (connection != null) connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}
