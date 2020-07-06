package package2;

import java.util.ArrayList;


public class Kurslar {
	 private String numara = null;
     private String adi = null;
     private int maxOgrenci;
     private ArrayList<E�itmen> e�itmenler;
     public Kurslar(String numara,String adi, ArrayList<E�itmen> e�itmenler,int maxOgrenci)
     {
         this.numara = numara;
         this.adi = adi;
         this.e�itmenler = e�itmenler;
         this.maxOgrenci = maxOgrenci;
     }

     public String getNumara() { return numara;}
     public String getAdi() { return adi; }
     public ArrayList<E�itmen> getE�itmen() { return e�itmenler;}
     public int getMaxOgrenci() { return maxOgrenci;}
     public String toString() { return adi; }

}
