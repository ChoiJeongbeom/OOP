
public class CarTest {
	public static void main(String[] args) {
		Car myCar = new Car();
		Car yourCar = new Car();
		
		myCar.color="Red";
		myCar.setGear(1);
		myCar.speedUp();
		System.out.println(myCar);
		
		myCar.color="blue";
		yourCar.setGear(2);
		yourCar.speedUp(); yourCar.speedUp();
		System.out.println(yourCar);
	}

}
