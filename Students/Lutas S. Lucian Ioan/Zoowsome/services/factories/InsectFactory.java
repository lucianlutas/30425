package javasmmr.zoowsome.services.factories;
import javasmmr.zoowsome.models.animals.*;

public class InsectFactory extends SpeciesFactory{
	public Animal getAnimal( String type ) throws Exception {
		if( Constants.Animals.Insects.ANT.equals(type) ){
			return new Ant(); 
		}else if( Constants.Animals.Insects.BUMBLEBEE.equals(type) ){
			return new BumbleBee();
		}else if( Constants.Animals.Insects.DUNGBEATLE.equals(type) ){
			return new DungBeatle();
		}else{
			throw new Exception("Invalid animal exception!");
		}
	}

}