package package2;

import java.util.ArrayList;


public class Kurslar {
	 private String numara = null;
     private String adi = null;
     private int maxOgrenci;
     private ArrayList<Eðitmen> eðitmenler;
     public Kurslar(String numara,String adi, ArrayList<Eðitmen> eðitmenler,int maxOgrenci)
     {
         this.numara = numara;
         this.adi = adi;
         this.eðitmenler = eðitmenler;
         this.maxOgrenci = maxOgrenci;
     }

     public String getNumara() { return numara;}
     public String getAdi() { return adi; }
     public ArrayList<Eðitmen> getEðitmen() { return eðitmenler;}
     public int getMaxOgrenci() { return maxOgrenci;}
     public String toString() { return adi; }

}
