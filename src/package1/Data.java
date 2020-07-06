package package1;

import java.util.ArrayList;
import java.util.Arrays;

import package2.Bölüm;
import package2.DersSaati;
import package2.Eðitmen;
import package2.Kurslar;
import package2.Sýnýf;



public class Data {
	private ArrayList<Sýnýf> siniflar;
    private ArrayList<Eðitmen> eðitmenler;
    private ArrayList<Kurslar> kurslar;
    private ArrayList<Bölüm> bolumler;
    private ArrayList<DersSaati> dersSaatleri;
    private int sinifNumarasi = 0;
    public Data() { initialize(); }

    private Data initialize()
    {
        Sýnýf sinif1 = new Sýnýf("D-101", 50);
        Sýnýf sinif2 = new Sýnýf("D-102", 50);
        Sýnýf sinif3 = new Sýnýf("D-103", 50);
        Sýnýf sinif4 = new Sýnýf("D-104", 50);
        Sýnýf sinif5 = new Sýnýf("D-105", 50);
        Sýnýf sinif6 = new Sýnýf("Lab-1", 65);
        Sýnýf sinif7 = new Sýnýf("Lab-2", 55);
        Sýnýf sinif8 = new Sýnýf("Lab-3", 60);

        siniflar = new ArrayList<Sýnýf>(Arrays.asList(sinif1, sinif2, sinif3,sinif4,sinif5,sinif6,sinif7,sinif8));


        DersSaati dersSaati1 =  new DersSaati("Pazartesi ", " 08:30-09:30");
        DersSaati dersSaati2 =  new DersSaati("Pazartesi ", " 09:40-10:40");
        DersSaati dersSaati3 =  new DersSaati("Pazartesi ", " 10:50-11:50");
        DersSaati dersSaati4 =  new DersSaati("Pazartesi ", " 12:00-13:00");
        DersSaati dersSaati5 =  new DersSaati("Pazartesi ", " 14:30-15:30");
        DersSaati dersSaati6 =  new DersSaati("Pazartesi ", " 15:40-17:00");
       
        
        DersSaati dersSaati7 =  new DersSaati("Salý      ", " 08:30-09:30");
        DersSaati dersSaati8 =  new DersSaati("Salý      ", " 09:40-10:40");
        DersSaati dersSaati9 =  new DersSaati("Salý      ", " 10:50-11:50");
        DersSaati dersSaati10 = new DersSaati("Salý      ", " 12:00-13:00");
        DersSaati dersSaati11 = new DersSaati("Salý      ", " 14:30-15:30");
        DersSaati dersSaati12 = new DersSaati("Salý      ", " 15:40-17:00");
        
        
        DersSaati dersSaati13 = new DersSaati("Çarþamba  ", " 08:30-09:30");
        DersSaati dersSaati14 = new DersSaati("Çarþamba  ", " 09:40-10:40");
        DersSaati dersSaati15 = new DersSaati("Çarþamba  ", " 10:50-11:50");
        DersSaati dersSaati16 = new DersSaati("Çarþamba  ", " 12:00-13:00");
        DersSaati dersSaati17 = new DersSaati("Çarþamba  ", " 14:30-15:30");
        DersSaati dersSaati18 = new DersSaati("Çarþamba  ", " 15:40-17:00");
        
        
        DersSaati dersSaati19 = new DersSaati("Perþembe  ", " 08:30-09:30");
        DersSaati dersSaati20 = new DersSaati("Perþembe  ", " 09:40-10:40");
        DersSaati dersSaati21 = new DersSaati("Perþembe  ", " 10:50-11:50");
        DersSaati dersSaati22 = new DersSaati("Perþembe  ", " 12:00-13:00");
        DersSaati dersSaati23 = new DersSaati("Perþembe  ", " 14:30-15:30");
        DersSaati dersSaati24 = new DersSaati("Perþembe  ", " 15:40-17:00");
      
        
        DersSaati dersSaati25 = new DersSaati("Cuma      ", " 08:30-09:30");
        DersSaati dersSaati26 = new DersSaati("Cuma      ", " 09:40-10:40");
        DersSaati dersSaati27 = new DersSaati("Cuma      ", " 10:50-11:50");
        DersSaati dersSaati28 = new DersSaati("Cuma      ", " 12:00-13:00");
        DersSaati dersSaati29 = new DersSaati("Cuma      ", " 14:30-15:30");
        DersSaati dersSaati30 = new DersSaati("Cuma      ", " 15:40-17:00");
      
       
     
        dersSaatleri = new ArrayList<DersSaati>(Arrays.asList(dersSaati1, dersSaati2, dersSaati3, dersSaati4,dersSaati5,dersSaati6,dersSaati7,dersSaati8
        		,dersSaati9,dersSaati10,dersSaati11,dersSaati12,dersSaati13,dersSaati14,dersSaati15,dersSaati16,dersSaati17,dersSaati18,dersSaati19,dersSaati20
        		,dersSaati21,dersSaati22,dersSaati23,dersSaati24,dersSaati25,dersSaati26,dersSaati27,dersSaati28,dersSaati29,dersSaati30));
       
        Eðitmen eðitmen1 = new Eðitmen( "I1 ", "Yakup  Kutlu     " );
        Eðitmen eðitmen2 = new Eðitmen( "I2 ", "Ýpek A.keleþ     " );
        Eðitmen eðitmen3 = new Eðitmen( "I3 ", "Ahmet Gökçen     " );
        Eðitmen eðitmen4 = new Eðitmen( "I4 ", "Gökhan Altan     " );
        Eðitmen eðitmen5 = new Eðitmen( "I5 ", "Kübra Yakýncý    " );
        Eðitmen eðitmen6 = new Eðitmen( "I6 ", "Bedriye Musaoglu " );
        Eðitmen eðitmen7 = new Eðitmen( "I7 ", "Samet Ayan       " );
        Eðitmen eðitmen8 = new Eðitmen( "I8 ", "Uður Duran       " );
        Eðitmen eðitmen9 = new Eðitmen( "I9 ", "Yahya  Yýlmaz    " );
        Eðitmen eðitmen10 = new Eðitmen("I10", "Sertan Alkan     " );
        Eðitmen eðitmen11 = new Eðitmen("I11", "Eyyuphan Yakýncý " );
        Eðitmen eðitmen12 = new Eðitmen("I12", "Murat Uçar       " );
        Eðitmen eðitmen13 = new Eðitmen("I13", "Abdullah Çalýþkan" );
        Eðitmen eðitmen14 = new Eðitmen("I14", "Ersin Bahçeci    " );
        Eðitmen eðitmen15 = new Eðitmen("I15", "Çaðlar Oflazoglu " );
        Eðitmen eðitmen16 = new Eðitmen("I16", "Ömer Saltuk B.   " );
        Eðitmen eðitmen17 = new Eðitmen("I17", "Tolga Depci      " );
        
       
        eðitmenler = new ArrayList<Eðitmen>(Arrays.asList(eðitmen1, eðitmen2, eðitmen3, eðitmen4
        		,eðitmen5,eðitmen6,eðitmen7,eðitmen8,eðitmen9,eðitmen9,eðitmen10,eðitmen11,eðitmen12
        		,eðitmen13,eðitmen14,eðitmen15,eðitmen16,eðitmen17));

        Kurslar kurs1 = new Kurslar( "A1 ", "Bil.Muh Giris           ", new ArrayList<Eðitmen>(Arrays.asList(eðitmen1)), 40);
        Kurslar kurs2 = new Kurslar( "A2 ", "Algoritma ve Programlama", new ArrayList<Eðitmen>(Arrays.asList( eðitmen4)), 55);
        Kurslar kurs3 = new Kurslar( "A3 ", "Fizik-1                 ", new ArrayList<Eðitmen>(Arrays.asList(eðitmen11)), 50);
        Kurslar kurs4 = new Kurslar( "A4 ", "Ýngilizce               ", new ArrayList<Eðitmen>(Arrays.asList(eðitmen6)), 45);
        Kurslar kurs5 = new Kurslar( "A5 ", "Edebiyat                ", new ArrayList<Eðitmen>(Arrays.asList(eðitmen7)), 45);
        Kurslar kurs6 = new Kurslar( "A6 ", "Matematik               ", new ArrayList<Eðitmen>(Arrays.asList(eðitmen8)), 55);
        Kurslar kurs7 = new Kurslar( "A7 ", "Inkýlap                 ", new ArrayList<Eðitmen>(Arrays.asList(eðitmen9)), 45);
        Kurslar kurs8 = new Kurslar( "A8 ", "Teknoloji Okuryazarlýðý ", new ArrayList<Eðitmen>(Arrays.asList(eðitmen15)), 45);
        
        Kurslar kurs9 = new Kurslar( "A9 ", "Diferansiyel            ", new ArrayList<Eðitmen>(Arrays.asList(eðitmen10)), 50);
        Kurslar kurs10 = new Kurslar("A10", "Sayýsal Tasarým         ", new ArrayList<Eðitmen>(Arrays.asList(eðitmen3)), 50);
        Kurslar kurs11 = new Kurslar("A11", "Veri Yapýlarý           ", new ArrayList<Eðitmen>(Arrays.asList(eðitmen1)), 50);
        Kurslar kurs12 = new Kurslar("A12", "Görsel Programlama      ", new ArrayList<Eðitmen>(Arrays.asList(eðitmen10)), 55);
        Kurslar kurs13 = new Kurslar("A13", "Teknik Ýngilizce        ", new ArrayList<Eðitmen>(Arrays.asList(eðitmen11)), 45);
        Kurslar kurs14 = new Kurslar("A14", "Kesikli Matematik       ", new ArrayList<Eðitmen>(Arrays.asList( eðitmen8)), 45);
        Kurslar kurs15 = new Kurslar("A15", "Anayurt Güvenliði       ", new ArrayList<Eðitmen>(Arrays.asList(eðitmen17)), 45);
        
        
        Kurslar kurs16 = new Kurslar("A16", "Mimari                  ", new ArrayList<Eðitmen>(Arrays.asList(eðitmen2)), 50);
        Kurslar kurs17 = new Kurslar("A17", "Aðlar                   ", new ArrayList<Eðitmen>(Arrays.asList(eðitmen2)), 50);
        Kurslar kurs18 = new Kurslar("A18", "Otomatlar               ", new ArrayList<Eðitmen>(Arrays.asList(eðitmen4)), 45);
        Kurslar kurs19 = new Kurslar("A19", "Nesne tabanlý prog.     ", new ArrayList<Eðitmen>(Arrays.asList(eðitmen4)), 55);
        Kurslar kurs20 = new Kurslar("A20", "VeriTabaný              ", new ArrayList<Eðitmen>(Arrays.asList(eðitmen10)), 55);
        Kurslar kurs21 = new Kurslar("A21", "Etik                    ", new ArrayList<Eðitmen>(Arrays.asList(eðitmen16)), 45);
        
        Kurslar kurs22 = new Kurslar("A22", "Bitirme Projesi         ", new ArrayList<Eðitmen>(Arrays.asList(eðitmen1, eðitmen2,eðitmen3,eðitmen4,eðitmen10)), 50);
        Kurslar kurs23 = new Kurslar("A23", "Sosyal Sorumluluk       ", new ArrayList<Eðitmen>(Arrays.asList(eðitmen1)), 45);
        Kurslar kurs24 = new Kurslar("A24", "Müh. Bil. Uygulama      ", new ArrayList<Eðitmen>(Arrays.asList(eðitmen1)), 55);
        Kurslar kurs25 = new Kurslar("A25", "Makine Öðrenmesi        ", new ArrayList<Eðitmen>(Arrays.asList(eðitmen13)), 45);
        Kurslar kurs26 = new Kurslar("A26", "Gömülü Sistemler        ", new ArrayList<Eðitmen>(Arrays.asList(eðitmen3)), 45);
        Kurslar kurs27 = new Kurslar("A27", "Tasarým Animasyon       ", new ArrayList<Eðitmen>(Arrays.asList(eðitmen14)), 55);
        Kurslar kurs28 = new Kurslar("A28", "Mobil Geliþtirme        ", new ArrayList<Eðitmen>(Arrays.asList(eðitmen12)), 55);
        Kurslar kurs29 = new Kurslar("A29", "Bilgi ve Að güvenliði   ", new ArrayList<Eðitmen>(Arrays.asList(eðitmen2)), 55);
        
     
        
        
        kurslar = new ArrayList<Kurslar>(Arrays.asList(kurs1, kurs2, kurs3, kurs4, kurs5, kurs6, kurs7
        		, kurs8, kurs9, kurs10, kurs11, kurs12, kurs13, kurs14, kurs15, kurs16, kurs17, kurs18, kurs19, 
        		kurs20, kurs21, kurs22, kurs23,kurs24,kurs25,kurs26,kurs27,kurs28,kurs29));

        Bölüm bolum1 = new Bölüm("1.Sýnýf", new ArrayList<Kurslar>(Arrays.asList(kurs1, kurs2,kurs3,kurs4,kurs5,kurs6,kurs7,kurs8)));
        Bölüm bolum2 = new Bölüm("2.Sýnýf", new ArrayList<Kurslar>(Arrays.asList( kurs9,kurs10,kurs11,kurs12,kurs13,kurs14,kurs15)));
        Bölüm bolum3 = new Bölüm("3.Sýnýf", new ArrayList<Kurslar>(Arrays.asList(kurs16,kurs17,kurs18,kurs19,kurs20,kurs21)));
        Bölüm bolum4 = new Bölüm("4.Sýnýf", new ArrayList<Kurslar>(Arrays.asList(kurs22, kurs23, kurs24,kurs25,kurs26,kurs27,kurs28,kurs29)));
        bolumler = new ArrayList<Bölüm>(Arrays.asList(bolum1, bolum2, bolum3,bolum4));

        bolumler.forEach(x->sinifNumarasi += x.getKurslar().size());
        return this;
        
    }

    public ArrayList<Sýnýf> getSiniflar() { return siniflar;}
    public ArrayList<Eðitmen> getEgitmenler() { return eðitmenler;}
    public ArrayList<Kurslar> getKurslar() { return kurslar;}
    public ArrayList<Bölüm> getBolumler() { return bolumler;}
    public ArrayList<DersSaati> getDersSaatleri() { return dersSaatleri;}
    public int getSinifNumarasi() { return this.sinifNumarasi;}
	

}
