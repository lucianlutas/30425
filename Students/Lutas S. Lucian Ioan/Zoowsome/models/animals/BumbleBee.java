package javasmmr.zoowsome.models.animals;
import static javasmmr.zoowsome.repositories.AnimalRepository.createNode;
public class BumbleBee extends Insect{
	public BumbleBee(String Name, int nrOfLegs, boolean canFly, boolean isDangerous, double maintenanceCost, double dangerPerc){
		super(maintenanceCost, dangerPerc);
		this.setName(Name);
		this.setNrOfLegs(nrOfLegs);
		this.setCanFly(canFly);
		this.setIsDangerous(isDangerous);
	}
	public BumbleBee (){
		this("BumbleBee", 4, true, true, 4, 45);
	}
}