package javasmmr.zoowsome.models.animals;
import static javasmmr.zoowsome.repositories.AnimalRepository.createNode;
public class Lion extends Mammal{
		public Lion(String Name, int nrOfLegs, float normalBodyTemp, float percBodyHair, double maintenanceCost, double dangerPerc){
			super(maintenanceCost,dangerPerc);
			this.setName(Name);
			this.setNrOfLegs(nrOfLegs);
			this.setNormalBodyTemp(normalBodyTemp);
			this.setPercBodyHair(percBodyHair);
		}
		public Lion(){
			this("Lion",4,(float)37.1, (float) 80.2, 4, 0.080);
		}	
}