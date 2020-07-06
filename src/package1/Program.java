package package1;

import java.util.ArrayList;
import package2.Class;
import package2.Bölüm;
public class Program {
	
	private ArrayList<Class> classes;
	private boolean isFitnessDegisim=true;
	private double fitness=-1;
    private int sinifNumarasi = 0;
    private int numbOfConflicts=0;
    private Data data;
    public Data getData() { return data;}
    
    public Program(Data data)
    {
        this.data = data;
        classes = new ArrayList<Class>(data.getSinifNumarasi());
    }
    
    
    public Program initialize()
    {
        new ArrayList<Bölüm>(data.getBolumler()).forEach(bolum->{
            bolum.getKurslar().forEach(kurs->{
            	Class newClass=new Class(sinifNumarasi++,bolum,kurs);
            	newClass.setDersSaati(data.getDersSaatleri().get((int) (data.getDersSaatleri().size()*Math.random())));
               newClass.setSýnýf(data.getSiniflar().get((int)(data.getSiniflar().size()*Math.random())));
            	newClass.setEðitmen(kurs.getEðitmen().get((int)(kurs.getEðitmen().size()*Math.random())));
            	classes.add(newClass);
            
        });
        });
        return this;
        
    }
    public int getNumOfConflicts() {return numbOfConflicts; }
    
    
    public ArrayList<Class> getClasses(){
    	isFitnessDegisim=true;
    	return classes;
    }
    
    public double getFitness() {
    	if(isFitnessDegisim==true) {
    		fitness=hesaplaFitness();
    		isFitnessDegisim=false;
    	}
    	return fitness;
    }
    
    
    private double hesaplaFitness() {
    	numbOfConflicts=0;
    	classes.forEach(x->{
    		if(x.getSinif().getSinifKapatasite() < x.getKurs().getMaxOgrenci()) numbOfConflicts++;
    		classes.stream().filter(y-> classes.indexOf(y)>=classes.indexOf(x)).forEach(y->{
    			if(x.getDersSaati()==y.getDersSaati()&&x.getId()!=y.getId()) {
    				if(x.getBolum()==y.getBolum()) numbOfConflicts++;
    				if(x.getSinif()==y.getSinif()) numbOfConflicts++;
    				if(x.getEðitmen()==y.getEðitmen()) numbOfConflicts++;
    			}
    		});
    	});
    	return 1/(double)(numbOfConflicts + 1);
    }
    
    
    public String toString() {
    	String returnDeger=new String();
    	for(int x=0; x < classes.size()-1; x++) returnDeger +=classes.get(x)+",";
    	returnDeger+=classes.get(classes.size()-1);
    	return returnDeger;
    			
    }
}
