package abstractex;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Quiz5 {

	public static void main(String[] args) {

		ArrayList<Animal2> list = new ArrayList<Animal2>();

		list.add(new Human());
		list.add(new Tiger());

		for (Animal2 animal : list) {
			animal.sleep();

			if (animal instanceof Human) {
				Human human = (Human) animal;
				human.move();
				human.readBook();
				System.out.println();
				
			} else if (animal instanceof Tiger) {
				Tiger tiger = (Tiger) animal;
				tiger.move();
				tiger.hunting();
			}
		}
	}
}
