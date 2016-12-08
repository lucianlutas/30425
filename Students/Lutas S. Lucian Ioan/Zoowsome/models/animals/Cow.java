package javasmmr.zoowsome.models.animals;
import static javasmmr.zoowsome.repositories.AnimalRepository.createNode;
public class Cow extends Mammal{
		public Cow(String Name, int nrOfLegs, float normalBodyTemp, float percBodyHair, double maintenanceCost, double dangerPerc){
			super(maintenanceCost, dangerPerc);
			this.setName(Name);
			this.setNrOfLegs(nrOfLegs);
			this.setNormalBodyTemp(normalBodyTemp);
			this.setPercBodyHair(percBodyHair);
		}
		public Cow(){
			this("Cow", 4, (float)35.2, (float)70.1, 1.2, 0.010);
		}	
}