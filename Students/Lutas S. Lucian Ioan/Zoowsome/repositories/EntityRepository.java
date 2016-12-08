package javasmmr.zoowsome.repositories;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.stream.XMLEventFactory;
import javax.xml.stream.XMLEventWriter;
import javax.xml.stream.XMLOutputFactory;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.events.EndElement;
import javax.xml.stream.events.StartDocument;
import javax.xml.stream.events.StartElement;
import javax.xml.stream.events.XMLEvent;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import javasmmr.zoowsome.interfaces.XML_Parsable;
import javasmmr.zoowsome.models.animals.Animal;
import javasmmr.zoowsome.models.animals.Ant;
import javasmmr.zoowsome.models.animals.BumbleBee;
import javasmmr.zoowsome.models.animals.Cobra;
import javasmmr.zoowsome.models.animals.Cow;
import javasmmr.zoowsome.models.animals.DungBeatle;
import javasmmr.zoowsome.models.animals.Lion;
import javasmmr.zoowsome.models.animals.Lizard;
import javasmmr.zoowsome.models.animals.Parrot;
import javasmmr.zoowsome.models.animals.Penguin;
import javasmmr.zoowsome.models.animals.Salmon;
import javasmmr.zoowsome.models.animals.Shark;
import javasmmr.zoowsome.services.factories.Constants;

public abstract class EntityRepository <T extends XML_Parsable>{
	
	private final String xmlFilename;
	private final String entityTag;
	
	protected abstract T getEntityFromXmlElement(Element element);
	
	public EntityRepository(String xmlFilename, String entityTag){
		this.xmlFilename = xmlFilename;
		this.entityTag = entityTag;
	}
	public void save(ArrayList<T> entities) throws FileNotFoundException, XMLStreamException{
 		
 		XMLOutputFactory outputFactory = XMLOutputFactory.newInstance(); 
 		
 		// create XMLEventWriter
 		XMLEventWriter eventWriter = outputFactory.createXMLEventWriter(new FileOutputStream(xmlFilename));
 		
 		//create an EventFactory
 		XMLEventFactory eventFactory = XMLEventFactory.newInstance();
 		XMLEvent end = eventFactory.createDTD("\n");
 		
 		//create and write Start Tag
 		StartDocument startDocument = eventFactory.createStartDocument();
 		eventWriter.add(startDocument);
 		
 		//Create content Open Tag
 		StartElement configStartElement = eventFactory.createStartElement("", "", "content");
 		eventWriter.add(configStartElement);
 		eventWriter.add(end);
 		
 		for(XML_Parsable entity: entities){
 			StartElement sElement = eventFactory.createStartElement("", "", entityTag);
 			eventWriter.add(sElement);
 			eventWriter.add(end);
 			
 			entity.encodeToXml(eventWriter);
 			
 			EndElement eElement = eventFactory.createEndElement("", "" , entityTag);
 			eventWriter.add(eElement);
			eventWriter.add(end);
 		}
		
 		eventWriter.add(eventFactory.createEndElement("", "", "content"));
 		eventWriter.add(eventFactory.createEndDocument());
 		eventWriter.close();
 		
	}
	
public ArrayList<T> load() throws ParserConfigurationException, SAXException, IOException{
		ArrayList<T> entities = new ArrayList<T>();
		
		File fXmlFile = new File(xmlFilename);
		DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
		DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
		Document doc = dBuilder.parse(fXmlFile);
		doc.getDocumentElement().normalize();
		
		NodeList nodeList = doc.getElementsByTagName(entityTag);
		
		for(int i = 0; i < nodeList.getLength(); i++){
			Node node = nodeList.item(i);
			
			if(node.getNodeType() == Node.ELEMENT_NODE){
				Element element = (Element) node;
				entities.add(getEntityFromXmlElement(element));
//				String discriminant = element.getElementsByTagName(Constants.XML_TAGS.DISCRIMINANT).item(0).getTextContent();
//		
//				switch(discriminant){
//				case Constants.Animals.Insects.ANT: 
//					Animal ant = new Ant();
//					ant.decodeFromXml(element);
//					entities.add(ant);
//					break;
//				case Constants.Animals.Insects.BUMBLEBEE:
//					Animal bumbleBee = new BumbleBee();
//					bumbleBee.decodeFromXml(element);
//					animals.add(bumbleBee);
//					break;
//				case Constants.Animals.Insects.DUNGBEATLE:
//					Animal dungBeatle = new DungBeatle();
//					dungBeatle.decodeFromXml(element);
//					animals.add(dungBeatle);
//					break;
//				case Constants.Animals.Mammals.LION:
//					Animal lion= new Lion();
//					lion.decodeFromXml(element);
//					animals.add(lion);
//					break;
//				case Constants.Animals.Mammals.COW:
//					Animal cow = new Cow();
//					cow.decodeFromXml(element);
//					animals.add(cow);
//					break;
//				case Constants.Animals.Reptiles.COBRA:
//					Animal cobra = new Cobra();
//					cobra.decodeFromXml(element);
//					animals.add(cobra);
//					break;
//				case Constants.Animals.Reptiles.LIZARD:
//					Animal lizard = new Lizard();
//					lizard.decodeFromXml(element);
//					animals.add(lizard);
//					break;
//				case Constants.Animals.Birds.PENGUIN:
//					Animal penguin = new Penguin();
//					penguin.decodeFromXml(element);
//					animals.add(penguin);
//					break;
//				case Constants.Animals.Birds.PARROT:
//					Animal parrot = new Parrot();
//					parrot.decodeFromXml(element);
//					animals.add(parrot);
//					break;
//				case Constants.Animals.Aquatics.SHARK:
//					Animal shark = new Shark();
//					shark.decodeFromXml(element);
//					animals.add(shark);
//					break;
//				case Constants.Animals.Aquatics.SALMON:
//					Animal salmon = new Salmon();
//					salmon.decodeFromXml(element);
//					animals.add(salmon);
//					break;
//
//				default: 
//					break;
			}
		}

		return entities;
	}

}
