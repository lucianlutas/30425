package javasmmr.zoowsome.models.animals;
import static javasmmr.zoowsome.repositories.AnimalRepository.createNode;
public abstract class Reptile extends Animal {
	 public Reptile(double maintenanceCost, double dangerPerc) {
		super(maintenanceCost, dangerPerc);
		// TODO Auto-generated constructor stub
	}

	private boolean laysEggs;
	 
	 public boolean getLaysEggs(){
		 return laysEggs;
	 }
	 
	 public void setLayEggs(boolean laysEggs){
		 this.laysEggs = laysEggs;
	 }
	 
}