package package2;

import java.util.ArrayList;



public class Bölüm {
	 private String adi;
     private ArrayList<Kurslar> kurslar;
     public Bölüm(String adi ,ArrayList<Kurslar> kurslar)
     {
         this.adi = adi;
         this.kurslar = kurslar;
     }

     public String getAdi() { return adi;}
     public ArrayList<Kurslar> getKurslar() { return kurslar; }

}
