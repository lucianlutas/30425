package javasmmr.zoowsome.models.animals;

import static javasmmr.zoowsome.repositories.AnimalRepository.createNode;

import javax.xml.stream.XMLEventWriter;
import javax.xml.stream.XMLStreamException;

import org.w3c.dom.Element;

import javasmmr.zoowsome.services.factories.Constants;

public class Ant extends Insect {
	public Ant(String Name, int nrOfLegs, boolean canFly, boolean isDangerous, double maintenanceCost, double dangerPerc ){
		super(maintenanceCost, dangerPerc);
		this.setName(Name);
		this.setNrOfLegs(nrOfLegs);
		this.setCanFly(canFly);
		this.setIsDangerous(isDangerous);
	}
	public Ant (){
		this("Ant", 6, false, false, 0.2, 0.010);
	}
	@Override
	public void decodeFromXml(Element element) {
		// TODO Auto-generated method stub
		
	}
	public void encodeToXml(XMLEventWriter eventWriter) throws XMLStreamException {
		super.encodeToXml(eventWriter);
		createNode(eventWriter, Constants.XML_TAGS.DISCRIMINANT, Constants.Animals.Insects.ANT);
		
	}

	
	
	
}