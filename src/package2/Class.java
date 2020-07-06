package package2;



public class Class {
	 private int id;
     private B�l�m bolum;
     private Kurslar kurs;
     private E�itmen e�itmen;
     private DersSaati dersSaati;
     private S�n�f sinif;
     
     public Class(int id, B�l�m bolum,Kurslar kurs)
     {
         this.id = id;
         this.kurs = kurs;
         this.bolum = bolum;
     }
     
     public void setE�itmen(E�itmen e�itmen) { this.e�itmen = e�itmen;}
     public void setDersSaati(DersSaati dersSaati) { this.dersSaati = dersSaati;}
     public void setS�n�f(S�n�f sinif) { this.sinif = sinif;}
     
     public int getId() { return id;}
     public B�l�m getBolum() { return bolum;}
     public Kurslar getKurs() { return kurs;}
     public E�itmen getE�itmen() { return e�itmen;}
     public DersSaati getDersSaati() { return dersSaati;}
     public S�n�f getSinif() { return sinif;}
     public String toString()
     {
         return "[" + bolum.getAdi() + "," + kurs.getNumara() + "," + sinif.getNumara() + "," + e�itmen.getId() + "," + dersSaati.getId() + "]";
     }

}
