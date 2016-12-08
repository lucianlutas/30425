package javasmmr.zoowsome.models.animals;

import static javasmmr.zoowsome.repositories.AnimalRepository.createNode;
public abstract class Aquatic extends Animal {
	
	public Aquatic(double maintenanceCost, double dangerPerc) {
		super(maintenanceCost, dangerPerc);
		// TODO Auto-generated constructor stub
	}

	private int avgSwimDepth;
	public enum Enum{
		SALTWATER, FRESHWATER
	}
	private Enum waterType;
	
	public int getAvgSwimDepth(){
		return avgSwimDepth;
	}
	
	public void setAvgSwimDepth(int avgSwimDepth){
		this.avgSwimDepth = avgSwimDepth;
	}
	
	public Enum getWaterType(){
		return waterType;
	}
	
	public void setWaterType(Enum waterType ){
		this.waterType = waterType;
	}
	
}