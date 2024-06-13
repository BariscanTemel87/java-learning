package com.java.Gezegenler;

/*
    * Gezegenler
 */
public enum Gezegen {
    MERKÜR(1, 57.91, 2439.7, 58.6),
    VENÜS(2, 108.2, 6051.8, 243),
    DÜNYA(3, 149.6, 6371, 1),
    MARS(4, 227.9, 3389.5, 1.03),
    JÜPİTER(5, 778.5, 69911, 0.41),
    SATÜRN(6, 1434, 58232, 0.45),
    URANÜS(7, 2871, 25362, 0.72),
    NEPTÜN(8, 4495, 24622, 0.67);

    private final int sıraNumarası;
    private final double uzaklık; // Milyon kilometre cinsinden
    private final double yarıçap; // Kilometre cinsinden
    private final double dönmeSüresi; // Dünya günleri cinsinden

    Gezegen(int sıraNumarası, double uzaklık, double yarıçap, double dönmeSüresi) {
        this.sıraNumarası = sıraNumarası;
        this.uzaklık = uzaklık;
        this.yarıçap = yarıçap;
        this.dönmeSüresi = dönmeSüresi;
    }

    public int getSıraNumarası() {
        return sıraNumarası;
    }

    public double getUzaklık() {
        return uzaklık;
    }

    public double getYarıçap() {
        return yarıçap;
    }

    public double getDönmeSüresi() {
        return dönmeSüresi;
    }
}
