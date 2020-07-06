package package1;

import java.util.ArrayList;
import java.util.Arrays;

import package2.B�l�m;
import package2.DersSaati;
import package2.E�itmen;
import package2.Kurslar;
import package2.S�n�f;



public class Data {
	private ArrayList<S�n�f> siniflar;
    private ArrayList<E�itmen> e�itmenler;
    private ArrayList<Kurslar> kurslar;
    private ArrayList<B�l�m> bolumler;
    private ArrayList<DersSaati> dersSaatleri;
    private int sinifNumarasi = 0;
    public Data() { initialize(); }

    private Data initialize()
    {
        S�n�f sinif1 = new S�n�f("D-101", 50);
        S�n�f sinif2 = new S�n�f("D-102", 50);
        S�n�f sinif3 = new S�n�f("D-103", 50);
        S�n�f sinif4 = new S�n�f("D-104", 50);
        S�n�f sinif5 = new S�n�f("D-105", 50);
        S�n�f sinif6 = new S�n�f("Lab-1", 65);
        S�n�f sinif7 = new S�n�f("Lab-2", 55);
        S�n�f sinif8 = new S�n�f("Lab-3", 60);

        siniflar = new ArrayList<S�n�f>(Arrays.asList(sinif1, sinif2, sinif3,sinif4,sinif5,sinif6,sinif7,sinif8));


        DersSaati dersSaati1 =  new DersSaati("Pazartesi ", " 08:30-09:30");
        DersSaati dersSaati2 =  new DersSaati("Pazartesi ", " 09:40-10:40");
        DersSaati dersSaati3 =  new DersSaati("Pazartesi ", " 10:50-11:50");
        DersSaati dersSaati4 =  new DersSaati("Pazartesi ", " 12:00-13:00");
        DersSaati dersSaati5 =  new DersSaati("Pazartesi ", " 14:30-15:30");
        DersSaati dersSaati6 =  new DersSaati("Pazartesi ", " 15:40-17:00");
       
        
        DersSaati dersSaati7 =  new DersSaati("Sal�      ", " 08:30-09:30");
        DersSaati dersSaati8 =  new DersSaati("Sal�      ", " 09:40-10:40");
        DersSaati dersSaati9 =  new DersSaati("Sal�      ", " 10:50-11:50");
        DersSaati dersSaati10 = new DersSaati("Sal�      ", " 12:00-13:00");
        DersSaati dersSaati11 = new DersSaati("Sal�      ", " 14:30-15:30");
        DersSaati dersSaati12 = new DersSaati("Sal�      ", " 15:40-17:00");
        
        
        DersSaati dersSaati13 = new DersSaati("�ar�amba  ", " 08:30-09:30");
        DersSaati dersSaati14 = new DersSaati("�ar�amba  ", " 09:40-10:40");
        DersSaati dersSaati15 = new DersSaati("�ar�amba  ", " 10:50-11:50");
        DersSaati dersSaati16 = new DersSaati("�ar�amba  ", " 12:00-13:00");
        DersSaati dersSaati17 = new DersSaati("�ar�amba  ", " 14:30-15:30");
        DersSaati dersSaati18 = new DersSaati("�ar�amba  ", " 15:40-17:00");
        
        
        DersSaati dersSaati19 = new DersSaati("Per�embe  ", " 08:30-09:30");
        DersSaati dersSaati20 = new DersSaati("Per�embe  ", " 09:40-10:40");
        DersSaati dersSaati21 = new DersSaati("Per�embe  ", " 10:50-11:50");
        DersSaati dersSaati22 = new DersSaati("Per�embe  ", " 12:00-13:00");
        DersSaati dersSaati23 = new DersSaati("Per�embe  ", " 14:30-15:30");
        DersSaati dersSaati24 = new DersSaati("Per�embe  ", " 15:40-17:00");
      
        
        DersSaati dersSaati25 = new DersSaati("Cuma      ", " 08:30-09:30");
        DersSaati dersSaati26 = new DersSaati("Cuma      ", " 09:40-10:40");
        DersSaati dersSaati27 = new DersSaati("Cuma      ", " 10:50-11:50");
        DersSaati dersSaati28 = new DersSaati("Cuma      ", " 12:00-13:00");
        DersSaati dersSaati29 = new DersSaati("Cuma      ", " 14:30-15:30");
        DersSaati dersSaati30 = new DersSaati("Cuma      ", " 15:40-17:00");
      
       
     
        dersSaatleri = new ArrayList<DersSaati>(Arrays.asList(dersSaati1, dersSaati2, dersSaati3, dersSaati4,dersSaati5,dersSaati6,dersSaati7,dersSaati8
        		,dersSaati9,dersSaati10,dersSaati11,dersSaati12,dersSaati13,dersSaati14,dersSaati15,dersSaati16,dersSaati17,dersSaati18,dersSaati19,dersSaati20
        		,dersSaati21,dersSaati22,dersSaati23,dersSaati24,dersSaati25,dersSaati26,dersSaati27,dersSaati28,dersSaati29,dersSaati30));
       
        E�itmen e�itmen1 = new E�itmen( "I1 ", "Yakup  Kutlu     " );
        E�itmen e�itmen2 = new E�itmen( "I2 ", "�pek A.kele�     " );
        E�itmen e�itmen3 = new E�itmen( "I3 ", "Ahmet G�k�en     " );
        E�itmen e�itmen4 = new E�itmen( "I4 ", "G�khan Altan     " );
        E�itmen e�itmen5 = new E�itmen( "I5 ", "K�bra Yak�nc�    " );
        E�itmen e�itmen6 = new E�itmen( "I6 ", "Bedriye Musaoglu " );
        E�itmen e�itmen7 = new E�itmen( "I7 ", "Samet Ayan       " );
        E�itmen e�itmen8 = new E�itmen( "I8 ", "U�ur Duran       " );
        E�itmen e�itmen9 = new E�itmen( "I9 ", "Yahya  Y�lmaz    " );
        E�itmen e�itmen10 = new E�itmen("I10", "Sertan Alkan     " );
        E�itmen e�itmen11 = new E�itmen("I11", "Eyyuphan Yak�nc� " );
        E�itmen e�itmen12 = new E�itmen("I12", "Murat U�ar       " );
        E�itmen e�itmen13 = new E�itmen("I13", "Abdullah �al��kan" );
        E�itmen e�itmen14 = new E�itmen("I14", "Ersin Bah�eci    " );
        E�itmen e�itmen15 = new E�itmen("I15", "�a�lar Oflazoglu " );
        E�itmen e�itmen16 = new E�itmen("I16", "�mer Saltuk B.   " );
        E�itmen e�itmen17 = new E�itmen("I17", "Tolga Depci      " );
        
       
        e�itmenler = new ArrayList<E�itmen>(Arrays.asList(e�itmen1, e�itmen2, e�itmen3, e�itmen4
        		,e�itmen5,e�itmen6,e�itmen7,e�itmen8,e�itmen9,e�itmen9,e�itmen10,e�itmen11,e�itmen12
        		,e�itmen13,e�itmen14,e�itmen15,e�itmen16,e�itmen17));

        Kurslar kurs1 = new Kurslar( "A1 ", "Bil.Muh Giris           ", new ArrayList<E�itmen>(Arrays.asList(e�itmen1)), 40);
        Kurslar kurs2 = new Kurslar( "A2 ", "Algoritma ve Programlama", new ArrayList<E�itmen>(Arrays.asList( e�itmen4)), 55);
        Kurslar kurs3 = new Kurslar( "A3 ", "Fizik-1                 ", new ArrayList<E�itmen>(Arrays.asList(e�itmen11)), 50);
        Kurslar kurs4 = new Kurslar( "A4 ", "�ngilizce               ", new ArrayList<E�itmen>(Arrays.asList(e�itmen6)), 45);
        Kurslar kurs5 = new Kurslar( "A5 ", "Edebiyat                ", new ArrayList<E�itmen>(Arrays.asList(e�itmen7)), 45);
        Kurslar kurs6 = new Kurslar( "A6 ", "Matematik               ", new ArrayList<E�itmen>(Arrays.asList(e�itmen8)), 55);
        Kurslar kurs7 = new Kurslar( "A7 ", "Ink�lap                 ", new ArrayList<E�itmen>(Arrays.asList(e�itmen9)), 45);
        Kurslar kurs8 = new Kurslar( "A8 ", "Teknoloji Okuryazarl��� ", new ArrayList<E�itmen>(Arrays.asList(e�itmen15)), 45);
        
        Kurslar kurs9 = new Kurslar( "A9 ", "Diferansiyel            ", new ArrayList<E�itmen>(Arrays.asList(e�itmen10)), 50);
        Kurslar kurs10 = new Kurslar("A10", "Say�sal Tasar�m         ", new ArrayList<E�itmen>(Arrays.asList(e�itmen3)), 50);
        Kurslar kurs11 = new Kurslar("A11", "Veri Yap�lar�           ", new ArrayList<E�itmen>(Arrays.asList(e�itmen1)), 50);
        Kurslar kurs12 = new Kurslar("A12", "G�rsel Programlama      ", new ArrayList<E�itmen>(Arrays.asList(e�itmen10)), 55);
        Kurslar kurs13 = new Kurslar("A13", "Teknik �ngilizce        ", new ArrayList<E�itmen>(Arrays.asList(e�itmen11)), 45);
        Kurslar kurs14 = new Kurslar("A14", "Kesikli Matematik       ", new ArrayList<E�itmen>(Arrays.asList( e�itmen8)), 45);
        Kurslar kurs15 = new Kurslar("A15", "Anayurt G�venli�i       ", new ArrayList<E�itmen>(Arrays.asList(e�itmen17)), 45);
        
        
        Kurslar kurs16 = new Kurslar("A16", "Mimari                  ", new ArrayList<E�itmen>(Arrays.asList(e�itmen2)), 50);
        Kurslar kurs17 = new Kurslar("A17", "A�lar                   ", new ArrayList<E�itmen>(Arrays.asList(e�itmen2)), 50);
        Kurslar kurs18 = new Kurslar("A18", "Otomatlar               ", new ArrayList<E�itmen>(Arrays.asList(e�itmen4)), 45);
        Kurslar kurs19 = new Kurslar("A19", "Nesne tabanl� prog.     ", new ArrayList<E�itmen>(Arrays.asList(e�itmen4)), 55);
        Kurslar kurs20 = new Kurslar("A20", "VeriTaban�              ", new ArrayList<E�itmen>(Arrays.asList(e�itmen10)), 55);
        Kurslar kurs21 = new Kurslar("A21", "Etik                    ", new ArrayList<E�itmen>(Arrays.asList(e�itmen16)), 45);
        
        Kurslar kurs22 = new Kurslar("A22", "Bitirme Projesi         ", new ArrayList<E�itmen>(Arrays.asList(e�itmen1, e�itmen2,e�itmen3,e�itmen4,e�itmen10)), 50);
        Kurslar kurs23 = new Kurslar("A23", "Sosyal Sorumluluk       ", new ArrayList<E�itmen>(Arrays.asList(e�itmen1)), 45);
        Kurslar kurs24 = new Kurslar("A24", "M�h. Bil. Uygulama      ", new ArrayList<E�itmen>(Arrays.asList(e�itmen1)), 55);
        Kurslar kurs25 = new Kurslar("A25", "Makine ��renmesi        ", new ArrayList<E�itmen>(Arrays.asList(e�itmen13)), 45);
        Kurslar kurs26 = new Kurslar("A26", "G�m�l� Sistemler        ", new ArrayList<E�itmen>(Arrays.asList(e�itmen3)), 45);
        Kurslar kurs27 = new Kurslar("A27", "Tasar�m Animasyon       ", new ArrayList<E�itmen>(Arrays.asList(e�itmen14)), 55);
        Kurslar kurs28 = new Kurslar("A28", "Mobil Geli�tirme        ", new ArrayList<E�itmen>(Arrays.asList(e�itmen12)), 55);
        Kurslar kurs29 = new Kurslar("A29", "Bilgi ve A� g�venli�i   ", new ArrayList<E�itmen>(Arrays.asList(e�itmen2)), 55);
        
     
        
        
        kurslar = new ArrayList<Kurslar>(Arrays.asList(kurs1, kurs2, kurs3, kurs4, kurs5, kurs6, kurs7
        		, kurs8, kurs9, kurs10, kurs11, kurs12, kurs13, kurs14, kurs15, kurs16, kurs17, kurs18, kurs19, 
        		kurs20, kurs21, kurs22, kurs23,kurs24,kurs25,kurs26,kurs27,kurs28,kurs29));

        B�l�m bolum1 = new B�l�m("1.S�n�f", new ArrayList<Kurslar>(Arrays.asList(kurs1, kurs2,kurs3,kurs4,kurs5,kurs6,kurs7,kurs8)));
        B�l�m bolum2 = new B�l�m("2.S�n�f", new ArrayList<Kurslar>(Arrays.asList( kurs9,kurs10,kurs11,kurs12,kurs13,kurs14,kurs15)));
        B�l�m bolum3 = new B�l�m("3.S�n�f", new ArrayList<Kurslar>(Arrays.asList(kurs16,kurs17,kurs18,kurs19,kurs20,kurs21)));
        B�l�m bolum4 = new B�l�m("4.S�n�f", new ArrayList<Kurslar>(Arrays.asList(kurs22, kurs23, kurs24,kurs25,kurs26,kurs27,kurs28,kurs29)));
        bolumler = new ArrayList<B�l�m>(Arrays.asList(bolum1, bolum2, bolum3,bolum4));

        bolumler.forEach(x->sinifNumarasi += x.getKurslar().size());
        return this;
        
    }

    public ArrayList<S�n�f> getSiniflar() { return siniflar;}
    public ArrayList<E�itmen> getEgitmenler() { return e�itmenler;}
    public ArrayList<Kurslar> getKurslar() { return kurslar;}
    public ArrayList<B�l�m> getBolumler() { return bolumler;}
    public ArrayList<DersSaati> getDersSaatleri() { return dersSaatleri;}
    public int getSinifNumarasi() { return this.sinifNumarasi;}
	

}
