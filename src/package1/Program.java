package package1;

import java.util.ArrayList;
import package2.Class;
import package2.B�l�m;
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
        new ArrayList<B�l�m>(data.getBolumler()).forEach(bolum->{
            bolum.getKurslar().forEach(kurs->{
            	Class newClass=new Class(sinifNumarasi++,bolum,kurs);
            	newClass.setDersSaati(data.getDersSaatleri().get((int) (data.getDersSaatleri().size()*Math.random())));
               newClass.setS�n�f(data.getSiniflar().get((int)(data.getSiniflar().size()*Math.random())));
            	newClass.setE�itmen(kurs.getE�itmen().get((int)(kurs.getE�itmen().size()*Math.random())));
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
    				if(x.getE�itmen()==y.getE�itmen()) numbOfConflicts++;
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
