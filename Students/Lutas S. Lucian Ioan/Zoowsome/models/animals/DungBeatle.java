package javasmmr.zoowsome.models.animals;
import static javasmmr.zoowsome.repositories.AnimalRepository.createNode;
public class DungBeatle extends Insect {
	public DungBeatle(String Name, int nrOfLegs, boolean canFly, boolean isDangerous, double maintenanceCost, double dangerPerc ){
		super(maintenanceCost,dangerPerc);
		this.setName(Name);
		this.setNrOfLegs(nrOfLegs);
		this.setCanFly(canFly);
		this.setIsDangerous(isDangerous);
	}
	public DungBeatle(){
		this("DungBeatle", 8, false, false, 0.4, 0.005);
	}
}