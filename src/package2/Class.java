package package2;



public class Class {
	 private int id;
     private Bölüm bolum;
     private Kurslar kurs;
     private Eðitmen eðitmen;
     private DersSaati dersSaati;
     private Sýnýf sinif;
     
     public Class(int id, Bölüm bolum,Kurslar kurs)
     {
         this.id = id;
         this.kurs = kurs;
         this.bolum = bolum;
     }
     
     public void setEðitmen(Eðitmen eðitmen) { this.eðitmen = eðitmen;}
     public void setDersSaati(DersSaati dersSaati) { this.dersSaati = dersSaati;}
     public void setSýnýf(Sýnýf sinif) { this.sinif = sinif;}
     
     public int getId() { return id;}
     public Bölüm getBolum() { return bolum;}
     public Kurslar getKurs() { return kurs;}
     public Eðitmen getEðitmen() { return eðitmen;}
     public DersSaati getDersSaati() { return dersSaati;}
     public Sýnýf getSinif() { return sinif;}
     public String toString()
     {
         return "[" + bolum.getAdi() + "," + kurs.getNumara() + "," + sinif.getNumara() + "," + eðitmen.getId() + "," + dersSaati.getId() + "]";
     }

}
