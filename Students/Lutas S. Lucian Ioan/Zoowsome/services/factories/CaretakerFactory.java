package javasmmr.zoowsome.services.factories;
import javasmmr.zoowsome.models.employees.*;

public class CaretakerFactory extends EmployeeFactory{

	public Employees getEmployeeFactory(String type) throws Exception {
		if(Constants.Employees.CARETAKER.equals(type))
			return new Caretaker();
		else
			throw new Exception("Invalid animal exception!");
	}
}