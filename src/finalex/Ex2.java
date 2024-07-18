package finalex;

class Parents {
	
	// final 메소드는 재정의 할 수 없음
	// 내가 만든 메소드를 원형 그대로 써라, 변형X
	final void method1() {
		
	}
	
	void method2() {
		
	}
	
}

class Child extends Parents {

	@Override
	void method2() {
		super.method2();
	}
	
}