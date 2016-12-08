package javasmmr.zoowsome.services.factories;
import javasmmr.zoowsome.models.animals.*;

public class ReptileFactory extends SpeciesFactory{
	public Animal getAnimal( String type ) throws Exception {
		if( Constants.Animals.Reptiles.COBRA.equals(type) ){
			return new Cobra(); 
		}else if( Constants.Animals.Reptiles.LIZARD.equals(type) ){
			return new Lizard();
		}else{
			throw new Exception("Invalid animal exception!");
		}
	}

}