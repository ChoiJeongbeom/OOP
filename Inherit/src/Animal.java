
public class Animal {
	private double weight;
	String picture;
	
	void eat() {
		System.out.println(" eate()이 호출되었습니다.");
	}
	void sleep() {
		System.out.println(" sleep()이 호출되었습니다.");
	}
}
class Lion extends Animal{
	private int legs = 4;
	void roar() {
		System.out.println("roar()이 호출되었습니다.");
	}
	public static void main(String[] args) {
		Lion obj = new Lion();
	}
}
class Eagle extends Animal{
	private int wings = 2;
	void fly() {
		System.out.println("fly()이 호출되었습니다.");
	}
}