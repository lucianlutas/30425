package javasmmr.zoowsome.models.animals;
import static javasmmr.zoowsome.repositories.AnimalRepository.createNode;
public abstract class Insect extends Animal {
	 public Insect(double maintenanceCost, double dangerPerc) {
		super(maintenanceCost, dangerPerc);
		// TODO Auto-generated constructor stub
	}

	private boolean isDangerous;
	 private boolean canFly;
	 
	 public boolean getIsDangerous(){
		 return isDangerous;
	 }
	 
	 public void setIsDangerous(boolean isDangerous){
		 this.isDangerous = isDangerous;
	 }
	 
	 public boolean getCanFly(){
		 return canFly;
	 }
	 
	 public void setCanFly(boolean canFly ){
		 this.canFly = canFly;
	 }
	 
}