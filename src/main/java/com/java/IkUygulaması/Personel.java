package com.java.IkUygulaması;

/*
 * IK uygulaması
 */
public class Personel {
    private String isim;
    private String soyisim;
    private int yas;
    private String email;
    private String pozisyon;

    public Personel(String isim, String soyisim, int yas, String email, String pozisyon) {
        this.isim = isim;
        this.soyisim = soyisim;
        this.yas = yas;
        this.email = email;
        this.pozisyon = pozisyon;
    }

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public String getSoyisim() {
        return soyisim;
    }

    public void setSoyisim(String soyisim) {
        this.soyisim = soyisim;
    }

    public int getYas() {
        return yas;
    }

    public void setYas(int yas) {
        this.yas = yas;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPozisyon() {
        return pozisyon;
    }

    public void setPozisyon(String pozisyon) {
        this.pozisyon = pozisyon;
    }

    @Override
    public String toString() {
        return "Personel{" +
                "isim='" + isim + '\'' +
                ", soyisim='" + soyisim + '\'' +
                ", yas=" + yas +
                ", email='" + email + '\'' +
                ", pozisyon='" + pozisyon + '\'' +
                '}';
    }
}
