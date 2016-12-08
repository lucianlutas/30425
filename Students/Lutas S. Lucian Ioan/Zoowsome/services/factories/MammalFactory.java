package javasmmr.zoowsome.services.factories;
import javasmmr.zoowsome.models.animals.*;

public class MammalFactory extends SpeciesFactory {
	public Animal getAnimal( String type ) throws Exception{
		if( Constants.Animals.Mammals.COW.equals(type) ){
			return new Cow(); 
		}else if( Constants.Animals.Mammals.LION.equals(type) ){
			return new Lion();
		}else 
			throw new Exception("Invalid animal exception!");
	}
}