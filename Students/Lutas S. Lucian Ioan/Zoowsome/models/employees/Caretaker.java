package javasmmr.zoowsome.models.employees;

import java.math.BigDecimal;

import javasmmr.zoowsome.models.animals.Animal;
import javasmmr.zoowsome.services.factories.Constants;

public class Caretaker extends Employees{
	private double workingHours;
	
	public Caretaker(String name, BigDecimal salary, double workingHours, boolean isDead){
		super(name, salary, isDead);
		setWorkingHours(workingHours);
	}
	
	public Caretaker(){
		this("Caretaker", BigDecimal.ZERO, 8, false);
	}

	public double getWorkingHours() {
		return workingHours;
	}

	public void setWorkingHours(double workingHours) {
		this.workingHours = workingHours;
	}
	
	public String takeCareOf(Animal a){
		if(a.kill())
			return Constants.Employees.Caretakers.TCO_KILLED;
		if(this.workingHours < a.getMaintenanceCost())
			return Constants.Employees.Caretakers.TCO_NO_TIME;
		a.setTakenCareOf(true);
		this.workingHours = this.workingHours - a.getMaintenanceCost();
		return Constants.Employees.Caretakers.TCO_SUCCESS;
		
	}
}
