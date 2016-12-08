package javasmmr.zoowsome.models.animals;
import static javasmmr.zoowsome.repositories.AnimalRepository.createNode;
public class Lizard extends Reptile{
	public Lizard(String Name, int nrOfLegs, boolean laysEggs,double maintenanceCost, double dangerPerc){
		super(maintenanceCost,dangerPerc);
		this.setName(Name);
		this.setNrOfLegs(nrOfLegs);
		this.setLayEggs(laysEggs);
	}
	public Lizard(){
		this("Lizard",4,true,3,0.020);
	}
}