package package1;

import java.util.ArrayList;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import package2.Class;

public class Driver {
	public static final int populasyonBoyu=30;
	public static final double mutasyonOran=0.9;
	public static final double crossoverOran=0.1;
	public static final int secimBoyutu=3;
	public static final int  programSayisi=1;
	private int  programNumara=0;
	private int classNumara=1;
	private Data data;
	
	public static String deger = "";
	public static String a = ""; 
	
	@FXML
    private TextArea txtArea_Dersler;

    @FXML
    private TextArea txtArea_Program;

    @FXML
    private Button btn_cikti;
    @FXML
    void btn_cikti(ActionEvent event) {

   
		Driver driver=new Driver();
		driver.data=new Data();
		int nesilNumara=0;
		driver.DataYazdýr();
		
		txtArea_Dersler.setText(a);
		
		System.out.println("> Nesil = "+nesilNumara);
		System.out.print("  Çizelge # |                                           ");
		System.out.print("			Sýnýflar [Bölüm,class,sýnýf,eðitmen,dersSaati]       ");
		System.out.println("                                    | Uygunluk | Çakýþma");
		System.out.print("---------------------------------------------------------------------");
		System.out.println("---------------------------------------------------------------------");
		GenetikAlgoritma genetikAlgoritma=new GenetikAlgoritma(driver.data);
		Populasyon populasyon=new Populasyon(Driver.populasyonBoyu,driver.data).sortByFitness();
		
		populasyon.getProgram().forEach(program-> System.out.println("         "+driver.programNumara++ +
			                                                          "    |    "+program+"  |  "+
		                                                       		String.format("%5f",program.getFitness()) +
			                                                       	" | "+program.getNumOfConflicts()));
		driver.programTablo(populasyon.getProgram().get(0),nesilNumara);
		
		driver.classNumara=1;
		while(populasyon.getProgram().get(0).getFitness()!=1.0) {
			System.out.println("> Nesil = "+ ++nesilNumara);
			System.out.println("  Program                                   ");
			System.out.println("Sýnýflar [Bölüm,class,sýnýf,eðitmen,dersSaati]      ");
			System.out.println("                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                              | Uygunluk  | Çakýþma");
			System.out.print("-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
			System.out.println("---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
			populasyon=genetikAlgoritma.gelisim(populasyon).sortByFitness();
			driver.programNumara=0;
			populasyon.getProgram().forEach(program-> System.out.println("         "+driver.programNumara++ +
                                                                          "    |    "+program+"  |  "+
             	                                                       	String.format("%5f",program.getFitness()) +
                                                                     	" | "+program.getNumOfConflicts()));
			driver.programTablo(populasyon.getProgram().get(0),nesilNumara);
			driver.classNumara=1;
			
		}
		
		txtArea_Program.setText(deger);
		}
		
		private void  programTablo(Program program,int nesil) {
		ArrayList<Class> classes=program.getClasses();
			System.out.print("\n                                                                                  ");
			System.out.println("Sýnýf # | Ders (number, max # of students) |Derslik (Kapasite)|Eðitmen (Id)   |Ders Saati(Id)");
			System.out.print("                          ");
			System.out.print("-----------------------------------------------------------------------");
			System.out.println("--------------------------------------------------------------------------------------");
			deger="";
			classes.forEach(x-> {
				int bolumIndex=data.getBolumler().indexOf(x.getBolum());
				int kursIndex=data.getKurslar().indexOf(x.getKurs());
				int sýnýfIndex=data.getSiniflar().indexOf(x.getSinif());
				int egitmenIndex=data.getEgitmenler().indexOf(x.getEðitmen());
				int dersSaatiIndex=data.getDersSaatleri().indexOf(x.getDersSaati());
				System.out.print("                          ");
				System.out.print(String.format("%1$10s",classNumara)+ "	|	");
				System.out.print(String.format("%1$10s",data.getBolumler().get(bolumIndex).getAdi())+ "	|	");
				System.out.print(String.format("%1$10s",data.getKurslar().get(kursIndex).getAdi()+ "("+data.getKurslar().get(kursIndex).getNumara()+", "+x.getKurs().getMaxOgrenci())+ ")	  |	");
				System.out.print(String.format("%1$10s",data.getSiniflar().get(sýnýfIndex).getNumara() + "("+x.getSinif().getSinifKapatasite())+ ")        |  ");
				System.out.print(String.format("%1$10s",data.getEgitmenler().get(egitmenIndex).getAdi()+" ("+data.getEgitmenler().get(egitmenIndex).getId()+")")+"	|  ");
				System.out.println(data.getDersSaatleri().get(dersSaatiIndex).getSaat()+" ("+data.getDersSaatleri().get(dersSaatiIndex).getId()+")");
				
			deger +=String.format("%1$10s",classNumara)+ "	|	";
			deger +=String.format("%1$10s",data.getBolumler().get(bolumIndex).getAdi())+ "	|	";
			deger +=String.format("%1$10s",data.getKurslar().get(kursIndex).getAdi()+ "("+data.getKurslar().get(kursIndex).getNumara()+", "+x.getKurs().getMaxOgrenci())+ ")	  |	";
			deger +=String.format("%1$10s",data.getSiniflar().get(sýnýfIndex).getNumara() + "("+x.getSinif().getSinifKapatasite())+ ")        |  ";
			deger +=String.format("%1$10s",data.getEgitmenler().get(egitmenIndex).getAdi()+" ("+data.getEgitmenler().get(egitmenIndex).getId()+")")+"	|  ";
			deger +=data.getDersSaatleri().get(dersSaatiIndex).getSaat()+" ("+data.getDersSaatleri().get(dersSaatiIndex).getId()+")";
			deger +="\n";
			
	
				
				classNumara++;
			});
				if(program.getFitness()==1)System.out.println("> Solution Found in "+ (nesil+1)+" nesil");
				System.out.print("----------------------------------------------------------------------------------------");
				System.out.println("----------------------------------------------------------------------------------------");
			
			
		}
	
	private void DataYazdýr() {
		System.out.println("Mevcut Bölümler==>".trim());
		data.getBolumler().forEach(x->System.out.println("adi:"+x.getAdi()+",kurslar:"+x.getKurslar()));
		System.out.println("\nMevcut Kurslar==>".trim());
		data.getKurslar().forEach(x->System.out.println("kurslar#:"+x.getNumara()+",adi:"+x.getAdi()+
				",max  # ögrenci sayisi:"+x.getMaxOgrenci()+",eðitmen:"+x.getEðitmen()));
		
		System.out.println("\nMevcut Sýnýflar== >".trim());
		data.getSiniflar().forEach(x->System.out.println("Sýnýf#:"+x.getNumara()+",max kapasite:"+x.getSinifKapatasite()));
		
		System.out.println("\n Mevcut Eðitmenler==>".trim());
		data.getEgitmenler().forEach(x->System.out.println("id:"+x.getId()+",adi"+x.getAdi()));
		
		System.out.println("\nMevcut Ders Saatleri==>".trim());
		data.getDersSaatleri().forEach(x->System.out.println("id:"+x.getId()+",Ders Saati:"+x.getSaat()));
		

		
		System.out.print("--------------------------------------------------------------------------------------------");
		System.out.println("--------------------------------------------------------------------------------------------");
		a+="Mevcut Bölümler==>";
		data.getBolumler().forEach(x->a+=("adi:"+x.getAdi()+",kurslar:"+x.getKurslar()+"\n"));
		
		a+="\nMevcut Kurslar==>";
		data.getKurslar().forEach(x->a+=("kurslar#:"+x.getNumara()+",adi:"+x.getAdi()+
				",max  # ögrenci sayisi:"+x.getMaxOgrenci()+",eðitmen:"+x.getEðitmen()+"\n"));
		
		a+="\nMevcut Sýnýflar== >";
		data.getSiniflar().forEach(x->a+=("Sýnýf#:"+x.getNumara()+",max kapasite:"+x.getSinifKapatasite()+"\n"));
		
		a+="\n Mevcut Eðitmenler==>";
		data.getEgitmenler().forEach(x->a+=("id:"+x.getId()+",adi"+x.getAdi()+"\n"));
		
		a+="\nMevcut Ders Saatleri==>";
		data.getDersSaatleri().forEach(x->a+=("id:"+x.getId()+",Ders Saati:"+x.getSaat()+"\n"));
		
	}
	

}
