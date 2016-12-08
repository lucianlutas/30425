package javasmmr.zoowsome.models.animals;
import static javasmmr.zoowsome.repositories.AnimalRepository.createNode;
public abstract class Bird extends Animal {
	 public Bird(double maintenanceCost, double dangerPerc) {
		super(maintenanceCost, dangerPerc);
		// TODO Auto-generated constructor stub
	}

	private boolean migrates;
	 private int avgFlightAltitude;
	 
	 public boolean getMigrates(){
		 return migrates;
	 }
	 
	 public void setMigrates(boolean migrates){
		 this.migrates = migrates;
	 }
	 
	 public int getAvgFlightAltitude(){
		 return avgFlightAltitude;
	 }
	 
	 public void setAvgFlightAltitude(int avgFlightAltitude ){
		 this.avgFlightAltitude = avgFlightAltitude;
	 }
	 
}