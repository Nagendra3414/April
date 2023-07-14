package java_classes;

public class Class_CarRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Class_Car car = new Class_Car();
		
		car.carModel = "ABC";
		car.Speed = 120;
		car.colour = "Red";
		car.startCar();
		
		
		
		
		Class_CarBenz Benz = new Class_CarBenz();
		
		Benz.carModel = "Benz";
		Benz.Speed = 150;
		Benz.colour = "Yellow";
		Benz.startCar();
		Benz.CarCost();
		
	}

}
