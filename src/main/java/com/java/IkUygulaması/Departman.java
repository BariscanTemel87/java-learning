package com.java.IkUygulaması;

/*
 * IK uygulaması
 */
import java.util.ArrayList;
import java.util.List;

public class Departman {
    private String isim;
    private List<Personel> personeller;

    public Departman(String isim) {
        this.isim = isim;
        this.personeller = new ArrayList<>();
    }

    public void personelEkle(Personel personel) {
        this.personeller.add(personel);
    }

    public List<Personel> getPersoneller() {
        return personeller;
    }

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }
}

