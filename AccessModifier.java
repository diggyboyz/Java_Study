public class Parent {
	public 		void m1() {}	//누구나 접근 가능
	protected 	void m2() {}	//같은 패키지에서 접근 가능 , 다른 패키지에서 자식은 접근 가능!
				void m3() {}	//같은 패키지에서 접근 가능
	private 	void m4() {}	//같은 클래스에서 접근 가능
}
