package javasmmr.zoowsome.models.animals;
import static javasmmr.zoowsome.repositories.AnimalRepository.createNode;
public class Penguin extends Bird {
	public Penguin(String Name, int nrOfLegs, boolean migrates, int avgFlightAltitude,double maintenanceCost, double dangerPerc ){
		super(maintenanceCost, dangerPerc);
		this.setName(Name);
		this.setNrOfLegs(nrOfLegs);
		this.setMigrates(migrates);
		this.setAvgFlightAltitude(avgFlightAltitude);
	}
	public Penguin(){
		this("Penguin",2,true,0,5,0.010);
		this.setName("Penguin");
		this.setNrOfLegs(2);
		this.setMigrates(true);
		this.setAvgFlightAltitude(0);
	}	
}