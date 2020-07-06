package package1;

import java.util.ArrayList;
import java.util.stream.IntStream;

public class GenetikAlgoritma {
	private Data data;
	public GenetikAlgoritma(Data data) {this.data=data;}
	public Populasyon gelisim(Populasyon populasyon) {return mutasyonPopulasyon(crossoverPopulasyon(populasyon));}
	
	Populasyon crossoverPopulasyon(Populasyon populasyon) {
		Populasyon crossoverPopulasyon=new Populasyon(populasyon.getProgram().size(),data);
		IntStream.range(0,Driver.programSayisi).forEach(x-> crossoverPopulasyon.getProgram().set(x, populasyon.getProgram().get(x)));
		
		IntStream.range(Driver.programSayisi,populasyon.getProgram().size()).forEach(x->{
			if(Driver.crossoverOran>Math.random()) {
				Program program1 =secPopulasyon(populasyon).sortByFitness().getProgram().get(0);
				Program program2 =secPopulasyon(populasyon).sortByFitness().getProgram().get(0);
				crossoverPopulasyon.getProgram().set(x, populasyon.getProgram().get(x));	
			}
			else crossoverPopulasyon.getProgram().set(x,populasyon.getProgram().get(x));
			
		});
		
		return crossoverPopulasyon;
	}
	
	
	Program crossoverProgram(Program program1,Program program2) {
		Program crossoverProgram=new Program(data).initialize();
		IntStream.range(0, crossoverProgram.getClasses().size()).forEach(x->{
			if(Math.random()>0.5)crossoverProgram.getClasses().set(x, program1.getClasses().get(x));
			else crossoverProgram.getClasses().set(x, program2.getClasses().get(x));
		});
		return crossoverProgram;
	}
	
	
	Populasyon mutasyonPopulasyon(Populasyon populasyon) {
		Populasyon mutasyonPopulasyon=new Populasyon(populasyon.getProgram().size(),data);
		ArrayList<Program> program=mutasyonPopulasyon.getProgram();
		IntStream.range(0,Driver.programSayisi).forEach(x-> program.set(x, populasyon.getProgram().get(x)));
		IntStream.range(Driver.programSayisi,populasyon.getProgram().size()).forEach(x->{
			program.set(x, mutasyonProgram(populasyon.getProgram().get(x)));
		});
		return mutasyonPopulasyon;
	}
	
	
	Program mutasyonProgram(Program mutasyonProgram) {
		Program program =new Program(data).initialize();
		IntStream.range(0, mutasyonProgram.getClasses().size()).forEach(x->{
			if(Driver.mutasyonOran>Math.random()) mutasyonProgram.getClasses().set(x, program.getClasses().get(x));
		});
		return mutasyonProgram;
	}
	
	
	Populasyon secPopulasyon(Populasyon populasyon) {
		Populasyon secPopulasyon=new Populasyon(Driver.secimBoyutu,data);
		IntStream.range(0, Driver.secimBoyutu).forEach(x->{
			secPopulasyon.getProgram().set(x,populasyon.getProgram().get((int)(Math.random()*populasyon.getProgram().size())));
		});
		return secPopulasyon;
	}

}
