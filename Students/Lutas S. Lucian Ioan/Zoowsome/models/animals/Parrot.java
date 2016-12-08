package javasmmr.zoowsome.models.animals;
import static javasmmr.zoowsome.repositories.AnimalRepository.createNode;
public class Parrot extends Bird {
	public Parrot(String Name, int nrOfLegs, boolean migrates, int avgFlightAltitude, double maintenanceCost, double dangerPerc){
		super(maintenanceCost,dangerPerc);
		this.setName(Name);
		this.setNrOfLegs(nrOfLegs);
		this.setMigrates(migrates);
		this.setAvgFlightAltitude(avgFlightAltitude);
	}
	public Parrot(){
		this("Parrot", 2, true, 500, 2, 0.015);
	}	
}