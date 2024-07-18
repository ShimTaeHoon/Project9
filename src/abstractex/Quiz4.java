package abstractex;

import java.util.ArrayList;

public class Quiz4 {

	public static void main(String[] args) {

		ArrayList<Car2> list = new ArrayList<Car2>();
		
		list.add(new Bus());
		list.add(new AutoCar());
		
		for(Car2 car : list) {
			car.run();
			
			if(car instanceof Bus) {
				Bus bus = (Bus) car;
				bus.refuel();
				bus.takePassenger();
				System.out.println();
				
			} else if(car instanceof AutoCar) {
				AutoCar autoCar = (AutoCar) car;
				autoCar.refuel();
				autoCar.load();
			}
			
		}

	}

}
