package com.java.MaasHesaplamaUygulaması;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class MaasHesaplamaDataProviderTest {

    @DataProvider(name = "maasVerileri")
    public Object[][] createMaasVerileri() {
        return new Object[][]{
                {"Baris", 26, 21000},
                {"Ahmet", 25, 20000},
                {"Ayşe", 30, 25000},
                {"Elif", 20, 20000}
        };
    }

    @Test(dataProvider = "maasVerileri")
    public void testMaasHesapla(String isim, int calismaGunu, int expectedMaas) {
        Personel personel = new Personel(isim, calismaGunu);
        MuhassebeDepartmani muhasebeDepartmani = new MuhassebeDepartmani();

        int actualMaas = muhasebeDepartmani.maasHesapla(personel);

        Assert.assertEquals(actualMaas, expectedMaas, "Maaş hesaplaması hatalı!");
    }
}
