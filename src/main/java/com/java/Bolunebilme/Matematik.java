package com.java.Bolunebilme;

/*
 * Sıfıra Bölme
 */
public class Matematik {
    public double bolme(double a, double b) throws SifiraBolmeException {
        if (b == 0) {
            throw new SifiraBolmeException("Sıfıra bölme işlemi hatası");
        }
        return a / b;
    }
}
