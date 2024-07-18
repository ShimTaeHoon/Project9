package abstractex;

public class Quiz1 {

	public static void main(String[] args) {
		
		Sonata sonata = new Sonata();
		Avante avante = new Avante();

		sonata.start();
		sonata.drive();
		sonata.stop();
		sonata.turnOff();
		
		avante.start();
		avante.drive();
		avante.stop();
		avante.turnOff();
		
	}

}

abstract class Car {
	
	public  void start() {
		
	}
		
	public  void drive() {
		
	}
	
	public  void stop() {
		
	}
	
	public  void turnoff() {
		
	}
	
}

class Sonata extends Car{
	
	public void start() {
		System.out.println("Sonata 시동을 켭니다.");
	}
	
	public void drive() {
		System.out.println("Sonata 달립니다.");
	}
	
	public void stop() {
		System.out.println("Sonata 멈춥니다.");
	}
	
	public void turnOff() {
		System.out.println("Sonata 시동을 끕니다.");
	}
	
}

class Avante extends Car{
	
	public void start() {
		System.out.println("Avante 시동을 켭니다.");
	}
	
	public void drive() {
		System.out.println("Avante 달립니다.");
	}
	
	public void stop() {
		System.out.println("Avante 멈춥니다.");
	}
	
	public void turnOff() {
		System.out.println("Avante 시동을 끕니다.");
	}
	
}
