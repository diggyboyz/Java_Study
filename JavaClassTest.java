package com.ssafy.day3;


//class A{} // Java Class
//class A{ mina(){}} // Java Application (독립적인 실행이 가능한 클래스)

class ClassTest{
	int memberNum = 1000; //클래스가 직접 포함하는 변수 ==> 멤버변수/필드
	static int staticNum = 5000; //static 변수/ 정적변수 / 클래스 변수 => static이 붙은 메서드나 변수는 클래스 로딩시 메모리에 할당함 
	void localTest (int inputNum) {	//()안에 선언된 변수 ==> 지역변수/매개변수
		int localNum = 2000; //메서드가 포함하는 변수 ==> 지역변수
		System.out.println("call..hello()==> inputNum : " + inputNum + " localNum : " + localNum);
	}
	
	static void staticTest() {
//		System.out.println(memberNum); //에러발생!! static 메서드에 non-static 멤버변수를 사용할 수 없음 ==> 이유는 간단함 메모리에 할당해야 하는데 멤버변수는 main에서 생성하기전에 존재하지 않음.
		System.out.println(staticNum);
	}
	
	
}

public class JavaClassTest {
	void nonStaticMethod1() {
		nonStaticMethod2();
	}
	
	void nonStaticMethod2() {}
	
	static void staticMethod() {
		
	}
	
	public static void main(String[] args) {
//		print(); //에러발생!!  static 메서드에 non-static 메서드를 사용할 수 없음
		JavaClassTest jct = new JavaClassTest();
		jct.nonStaticMethod1();
		staticMethod();
		int su = 13;
		System.out.println("SU = " + su);
		
		ClassTest ct = new ClassTest();
		System.out.println("SU2 = " + ct.memberNum);
//		System.out.println("SU4 = " + ct.localNum); //지역변수 사용(access)는 절대 불가능
		ct.localTest(7);
		ct.localTest(su);
		
		//만약에 ct의 메서드는 한번만 호출하고 싶다면
		new ClassTest().localTest(0);
		
		
		
	}
}
