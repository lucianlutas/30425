package javasmmr.zoowsome.models.employees;

import java.util.Random;
import java.math.BigDecimal;

public abstract class Employees {
	private String name;
	private long id;
	private BigDecimal salary;
	private boolean isDead;
	
	public Employees(String name, BigDecimal salary, boolean isDead){
		setId();
		setName(name);
		setSalary(salary);
		setIsDead(isDead);
	}
	
	public String getName(){
		return name;
	}
	public void setName(String name){
		this.name = name;
	}

	public long getId(){
		return id;
	}
	public void setId(){
		Random random = new Random();
		this.id = random.nextLong();
	}
	
	public BigDecimal getSalary(){
		return salary;
	}
	public void setSalary(BigDecimal salary){
		this.salary = salary;
	}
	
	public boolean getIsDead(){
		return isDead;
	}
	public void setIsDead(boolean isDead){
		this.isDead = isDead;
	}
}
