package com.java.MaasHesaplamaUygulaması;

import org.testng.Assert;
import org.testng.annotations.Test;

public class MaasHesaplamaTest {

    @Test
    public void testMaasHesapla() {
        Personel personel = new Personel("Baris", 26);
        MuhassebeDepartmani muhasebeDepartmani = new MuhassebeDepartmani();

        int expectedMaas = 21000; // 20000 + 1000 (26 - 25) * 1000
        int actualMaas = muhasebeDepartmani.maasHesapla(personel);

        Assert.assertEquals(actualMaas, expectedMaas, "Maaş hesaplaması hatalı!");
    }
}