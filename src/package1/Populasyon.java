package package1;

import java.util.ArrayList;
import java.util.stream.IntStream;

public class Populasyon {
	private ArrayList<Program> program;
	public Populasyon(int size,Data data) {
		program=new ArrayList<Program>(size);
		IntStream.range(0,size).forEach(x-> program.add(new Program(data).initialize()));
	}
	
	
	
	public ArrayList<Program> getProgram(){return this.program;}
	public Populasyon sortByFitness() {
		program.sort((program1,program2)->{
			int returnDeger=0;
			if(program1.getFitness()>program2.getFitness()) returnDeger=-1;
			else if(program1.getFitness()<program2.getFitness()) returnDeger=1;
			return returnDeger;
		});
		return this;
	}

}
