package javasmmr.zoowsome.models.animals;
import static javasmmr.zoowsome.repositories.AnimalRepository.createNode;
public class Salmon extends Aquatic {
	public Salmon(String Name, int nrOfLegs, Enum waterType, int avgSwimDepth,double maintenanceCost, double dangerPerc){
		super(maintenanceCost, dangerPerc);
		this.setName(Name);
		this.setNrOfLegs(nrOfLegs);
		this.setWaterType(waterType);
		this.setAvgSwimDepth(avgSwimDepth);
	}
	public Salmon(){
		this("Salmon",0,Enum.FRESHWATER, 7, 1.5, 0.001);
	}	
}