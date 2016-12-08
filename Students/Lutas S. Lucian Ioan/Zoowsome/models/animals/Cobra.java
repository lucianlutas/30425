package javasmmr.zoowsome.models.animals;
import static javasmmr.zoowsome.repositories.AnimalRepository.createNode;
public class Cobra extends Reptile {
	public Cobra(String Name, int nrOfLegs, boolean laysEggs,double maintenanceCost, double dangerPerc){
		super(maintenanceCost,dangerPerc);
		this.setName(Name);
		this.setNrOfLegs(nrOfLegs);
		this.setLayEggs(laysEggs);
	}
	public Cobra(){
		this("Cobra", 0, true, 6, 0.085);
	}
}