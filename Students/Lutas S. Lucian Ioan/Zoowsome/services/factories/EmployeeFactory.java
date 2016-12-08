package javasmmr.zoowsome.services.factories;
import javasmmr.zoowsome.models.employees.Employees;

public abstract class EmployeeFactory {
	public abstract Employees getEmployeeFactory(String type) throws Exception;

}