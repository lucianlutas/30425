package javasmmr.zoowsome.controllers;
import javasmmr.zoowsome.services.factories.*;
import javasmmr.zoowsome.models.animals.*;
import javasmmr.zoowsome.models.employees.*;
import javasmmr.zoowsome.repositories.AnimalRepository;

import java.util.*;

import javasmmr.zoowsome.services.factories.Constants;
import javasmmr.zoowsome.views.MainMenuFrame;

public class Main {
	public static void main(String[] args) throws Exception {
		
		new MainMenuController(new MainMenuFrame("Main Menu"), false);
	}
//		AnimalFactory abstractFactory = new AnimalFactory();
//		
//		SpeciesFactory speciesFactoryMammals = abstractFactory.getSpeciesFactory(Constants.Species.MAMMALS);
//		SpeciesFactory speciesFactoryInsects= abstractFactory.getSpeciesFactory(Constants.Species.INSECTS);
//		SpeciesFactory speciesFactoryBirds = abstractFactory.getSpeciesFactory(Constants.Species.BIRDS);
//		SpeciesFactory speciesFactoryAquatics = abstractFactory.getSpeciesFactory(Constants.Species.AQUATICS);
//		SpeciesFactory speciesFactoryReptiles = abstractFactory.getSpeciesFactory(Constants.Species.REPTILES);
//		
//		
//		// Creating the animals - BEGIN
//		Random random = new Random();
//        Animal[] newAnimal = new Animal[15];
//        int randomIntAnimal;
//        for(int i = 0; i < 15; i++){
//            randomIntAnimal = random.nextInt(10);
//            switch (randomIntAnimal){
//            case 0:
//            	newAnimal[i] = speciesFactoryMammals.getAnimal(Constants.Animals.Mammals.COW);
//				System.out.println("NEW : "+newAnimal[i].getName());
//				System.out.println(newAnimal[i].getName()+": "+newAnimal[i].getNrOfLegs()+" legs"+ "; body temperature : " +((Mammal)newAnimal[i]).getNormalBodyTemp()+ "; "+  ((Mammal)newAnimal[i] ).getPercBodyHair() + " % hair");
//				System.out.println("------------");
//                break;
//       		case 1:
//            	newAnimal[i] = speciesFactoryMammals.getAnimal(Constants.Animals.Mammals.LION);
//                System.out.println("NEW : "+newAnimal[i].getName());
//                System.out.println(newAnimal[i].getName()+": "+newAnimal[i].getNrOfLegs()+" legs"+ "; body temperature : " +( (Mammal)newAnimal[i] ).getNormalBodyTemp()+ "; "+  ((Mammal)newAnimal[i] ).getPercBodyHair() + " % hair");
//    			System.out.println("------------");
//                break;
//           	case 3:
//                newAnimal[i] = speciesFactoryBirds.getAnimal(Constants.Animals.Birds.PENGUIN);
//                System.out.println("NEW : "+newAnimal[i].getName());
//                System.out.println(newAnimal[i].getName()+": "+newAnimal[i].getNrOfLegs()+" legs"+ "; Migrates : " +( (Bird)newAnimal[i] ).getMigrates()+ "; "+  ((Bird)newAnimal[i] ).getAvgFlightAltitude() +" altitude");
//        		System.out.println("------------");
//                break;
//           	case 4:
//                newAnimal[i] = speciesFactoryBirds.getAnimal(Constants.Animals.Birds.PARROT);
//                System.out.println("NEW : "+newAnimal[i].getName());
//                System.out.println(newAnimal[i].getName()+": "+newAnimal[i].getNrOfLegs()+" legs"+ "; Migrates : " +( (Bird)newAnimal[i] ).getMigrates()+ "; "+  ((Bird)newAnimal[i] ).getAvgFlightAltitude() +" altitude");
//        		System.out.println("------------");
//                break;
//           	case 5:
//                newAnimal[i] = speciesFactoryInsects.getAnimal(Constants.Animals.Insects.BUMBLEBEE);
//                System.out.println("NEW: : "+newAnimal[i].getName());
//                System.out.println(newAnimal[i].getName()+": "+newAnimal[i].getNrOfLegs()+" legs"+ "; Flies : " +( (Insect)newAnimal[i] ).getCanFly()+ "; Is dangerous: "+  ((Insect)newAnimal[i] ).getIsDangerous());
//        		System.out.println("------------");
//                break;
//           	case 6:
//                newAnimal[i] = speciesFactoryInsects.getAnimal(Constants.Animals.Insects.DUNGBEATLE);
//                System.out.println("NEW : "+newAnimal[i].getName());
//                System.out.println(newAnimal[i].getName()+": "+newAnimal[i].getNrOfLegs()+" legs"+ "; Flies : " +( (Insect)newAnimal[i] ).getCanFly()+ "; Is dangerous: "+  ((Insect)newAnimal[i] ).getIsDangerous());
//        		System.out.println("------------");
//                break;
//           	case 7:
//                newAnimal[i] = speciesFactoryReptiles.getAnimal(Constants.Animals.Reptiles.LIZARD);
//                System.out.println("NEW : "+newAnimal[i].getName());
//                System.out.println(newAnimal[i].getName()+": "+newAnimal[i].getNrOfLegs()+" legs"+ "; Lays eggs : " +( (Reptile)newAnimal[i] ).getLaysEggs());
//        		System.out.println("------------");
//                break;
//           	case 8:
//                newAnimal[i] = speciesFactoryReptiles.getAnimal(Constants.Animals.Reptiles.COBRA);
//                System.out.println("NEW : "+newAnimal[i].getName());
//                System.out.println(newAnimal[i].getName()+": "+newAnimal[i].getNrOfLegs()+" legs"+ "; Lays eggs : " +( (Reptile)newAnimal[i] ).getLaysEggs());
//        		System.out.println("------------");
//                break;
//           	case 9:
//                newAnimal[i] = speciesFactoryAquatics.getAnimal(Constants.Animals.Aquatics.SHARK);
//                System.out.println("NEW : "+newAnimal[i].getName());
//                System.out.println(newAnimal[i].getName()+": "+newAnimal[i].getNrOfLegs()+" legs"+ "; Water type : " +( (Aquatic)newAnimal[i] ).getWaterType()+ "; Swim Depth : " +( (Aquatic)newAnimal[i] ).getAvgSwimDepth());
//        		System.out.println("------------");
//                break;
//           	case 10:
//                newAnimal[i] = speciesFactoryAquatics.getAnimal(Constants.Animals.Aquatics.SALMON);
//                System.out.println("NEW : "+newAnimal[i].getName());
//                System.out.println(newAnimal[i].getName()+": "+newAnimal[i].getNrOfLegs()+" legs"+ "; Water type : " +( (Aquatic)newAnimal[i] ).getWaterType()+ "; Swim Depth : " +( (Aquatic)newAnimal[i] ).getAvgSwimDepth());
//        		System.out.println("------------");
//                break;
//            }
//        } // Creating the animals - END
//        
//        
//        // Creating the care takers - BEGIN
//        CaretakerFactory CaretakerFactory = new CaretakerFactory();
//		Employees[] caretakerEmployee = new Employees[10];
//		for(int i = 0; i < 10; i++){
//			caretakerEmployee[i] = CaretakerFactory.getEmployeeFactory(Constants.Employees.CARETAKER);
//		}
//		
//		for(Employees c: caretakerEmployee){
//			for(Animal a: newAnimal){
//				if( !(((Caretaker) c).getIsDead()) && !(((Animal)a).getTakenCareOf())){
//					String result = ((Caretaker) c).takeCareOf(a);
//					if(result.equals(Constants.Employees.Caretakers.TCO_KILLED)){
//						c.setIsDead(true);
//					} else if(result.equals(Constants.Employees.Caretakers.TCO_NO_TIME)){
//						continue;
//					} else
//						a.setTakenCareOf(true);					
//				}
//			}
//		} // Creating the care takers - END
//		
//		// Checking - BEGIN
//		int  j=0;
//	    for(Animal a: newAnimal){
//	    	System.out.println(a.getName() + " maintenance " + a.getMaintenanceCost() + "; taken care of = " + a.getTakenCareOf());
//			}
//	    for(Employees c: caretakerEmployee){
//	    	System.out.println(c.getName() + j++ + " id: " + c.getId() + " " + ((Caretaker)c).getWorkingHours() + " hours; iz dead = " + c.getIsDead());
//	    }// Checking - END
//	    
//	    
//	    // XML saving - BEING
//	    AnimalRepository repositoryObject = new AnimalRepository();
//		ArrayList <Animal> animalsArray1 = new ArrayList<Animal>();
//		
//		for(int i = 0; i < 15; i++){
//			animalsArray1.add(newAnimal[i]);
//		}
//		
//			repositoryObject.save(animalsArray1);
//		}//XML Saving - END

	}
	
	
