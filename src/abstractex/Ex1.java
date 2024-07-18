package abstractex;

public class Ex1 {

	public static void main(String[] args) {
		
		// 추상클래스(Computer가 abstract라)는 인스턴스를 생성할 수 없음!
		// why? 추상클래스의 목적은 상속..
		// Computer클래스의 display와 typing은 완성이 안된 메소드이기 때문에..(미완성 클래스)
//		Computer computer = new Computer();
		
		DeskTop deskTop = new DeskTop(); // 완전한 Class
		deskTop.display();
		deskTop.typing();
		deskTop.turnOn(); // 부모(Computer)한테 물려 받은 일반 메소드
		deskTop.turnOff(); // DeskTop과 NoteBook이 동일하게 출력
		
		NoteBook noteBook = new NoteBook(); // 완전한 Class
		// 같은 기능을 가지고 있으나 동작 방식이 다름 display / typing
		// 각자 설계할 필요 없이 부모에서 설계를 먼저하고 설계 된 부분을 물려받으면 됨
		noteBook.display(); // 컴퓨터의 종류에 따라 동작을 하는 부분은
		noteBook.typing(); // 추상메소드로 선언을하고 자식에서 구현해주면 됨
		noteBook.turnOff();
		noteBook.turnOff();

	}

}

// 컴퓨터 클래스
abstract class Computer {
	// 자식들이 공통으로 사용하는 기능은 일반메소드로 선언
	public void turnOn() {
		System.out.println("전원을 켭니다.");
	}
	
	public void turnOff() {
		System.out.println("전원을 끕니다.");
	}
	
	// 자식들마다 다르게 사용하는 기능은 추상메소드로 선언
	public abstract void display();
	
	public abstract void typing();
	
}

// 데스크톱 클래스
class DeskTop extends Computer {

	@Override
	public void display() {
		System.out.println("DeskTop Display()");
		
	}

	@Override
	public void typing() {
		System.out.println("DeskTop Typing()");
		
	}
	
}

class NoteBook extends Computer {

	@Override
	public void display() {
		System.out.println("NoteBook Display()");
		
	}

	@Override
	public void typing() {
		System.out.println("NoteBook Typing()");
		
	}
	
}

