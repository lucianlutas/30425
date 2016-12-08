package javasmmr.zoowsome.repositories;


import javax.xml.stream.events.*;
import org.w3c.dom.*;
import java.io.*;
import javax.xml.parsers.*;
import javax.xml.stream.*;
import java.util.ArrayList;
import org.xml.sax.SAXException;
import javasmmr.zoowsome.models.animals.*;
import javasmmr.zoowsome.interfaces.XML_Parsable;
import javasmmr.zoowsome.services.factories.Constants;

public class AnimalRepository extends EntityRepository<Animal> {
	private static final String XML_FILENAME = "Animals.xml";
	public AnimalRepository(){
		super(XML_FILENAME, Constants.XML_TAGS.ANIMAL);
		
	}
	
	
	
	
	
	public static void createNode(XMLEventWriter eventWriter, String name, String value) throws XMLStreamException{
 		XMLEventFactory eventFactory = XMLEventFactory.newInstance();
 		XMLEvent end = eventFactory.createDTD("\n");
 		XMLEvent tab = eventFactory.createDTD("\t");
 		
 		//create start node
 		StartElement sElement = eventFactory.createStartElement("", "", name);
 		
 		eventWriter.add(tab);
 		eventWriter.add(sElement);
 		
 		//create content
 		Characters characters = eventFactory.createCharacters(value);
 		
 		eventWriter.add(characters);
 		
 		//create end node
 		EndElement eElement = eventFactory.createEndElement("", "", name);
 		
 		eventWriter.add(eElement);
 		eventWriter.add(end);
	}





	@Override
	protected Animal getEntityFromXmlElement(Element element) {
		String discriminant = element.getElementsByTagName(Constants.XML_TAGS.DISCRIMINANT).item(0).getTextContent();
		
				switch(discriminant){
				case Constants.Animals.Insects.ANT: 
					Animal ant = new Ant();
					ant.decodeFromXml(element);;
					return ant;
				case Constants.Animals.Insects.BUMBLEBEE:
					Animal bumbleBee = new BumbleBee();
					bumbleBee.decodeFromXml(element);
					return bumbleBee;
				case Constants.Animals.Insects.DUNGBEATLE:
					Animal dungBeatle = new DungBeatle();
					dungBeatle.decodeFromXml(element);
					return dungBeatle;
				case Constants.Animals.Mammals.LION:
					Animal lion= new Lion();
					lion.decodeFromXml(element);
					return lion;
				case Constants.Animals.Mammals.COW:
					Animal cow = new Cow();
					cow.decodeFromXml(element);
					return cow;
				case Constants.Animals.Reptiles.COBRA:
					Animal cobra = new Cobra();
					cobra.decodeFromXml(element);
					return cobra;
				case Constants.Animals.Reptiles.LIZARD:
					Animal lizard = new Lizard();
					lizard.decodeFromXml(element);
					return lizard;
				case Constants.Animals.Birds.PENGUIN:
					Animal penguin = new Penguin();
					penguin.decodeFromXml(element);
					return penguin;
				case Constants.Animals.Birds.PARROT:
					Animal parrot = new Parrot();
					parrot.decodeFromXml(element);
					return parrot;
				case Constants.Animals.Aquatics.SHARK:
					Animal shark = new Shark();
					shark.decodeFromXml(element);
					return shark;
				case Constants.Animals.Aquatics.SALMON:
					Animal salmon = new Salmon();
					salmon.decodeFromXml(element);
					return salmon;

				default: 
					break;
				}
		return null;
	}
}
