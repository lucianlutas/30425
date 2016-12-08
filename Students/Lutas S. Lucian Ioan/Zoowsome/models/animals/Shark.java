package javasmmr.zoowsome.models.animals;
import static javasmmr.zoowsome.repositories.AnimalRepository.createNode;
public class Shark extends Aquatic {
	public Shark(String Name, int nrOfLegs, Enum waterType, int avgSwimDepth,double maintenanceCost, double dangerPerc){
		super(maintenanceCost,dangerPerc);
		this.setName(Name);
		this.setNrOfLegs(nrOfLegs);
		this.setWaterType(waterType);
		this.setAvgSwimDepth(avgSwimDepth);
	}
	public Shark(){
		this("Shark",0,Enum.SALTWATER,203,3,0.060);
	}	
}