/*
데이터 입력
13 안녕하세요 45.6 엔터
홍길동, 김주원, 길라임
 * 
 */


/*
   필요한 사전 지식 (상속관계)
  class Parent{
 	//기능정의
  }
  class Child extends Parent{
  }
  
    자식은 is a 부모다 ==> 자식은 부모로 형변환이 가능하다
  Child c = new Child();
  Parent p = new Parent();
  
  Child c2 = p; //불가능.
  Parent p2= c; //가능하다.
   
   
 */


import java.util.Scanner;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
public class InputTest3 {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		
		
		//파일이 여러개 있으면 관리하기 불편하기 때문에  이렇게 String으로 처리도 가능합니다.
		
		String inputStr="13 안녕하세요 45.6\r\n" + 
				"나길동, 고주원, 차라임\r\n" + 
				"";
		
		// 둘다 가능		
		Scanner scan = new Scanner(inputStr);				
		//Scanner scan = new Scanner(new StrngReader(inputStr));
		
		int intNum = scan.nextInt(); //프로그램 입력시점
		String str = scan.next();
		double doubleNum = scan.nextDouble();
						
		System.out.println(intNum + " " + str + " " + doubleNum);		
		scan.nextLine();
		
		String str3 = scan.nextLine(); // str3 = "홍길동, 김주원, 길라임"
		System.out.println("str3= " + str3);
		
		//이제 ,를 기준으로 문자열을 나눠보겠습니다.
		//str.split("구분자");
		String[] arry = str3.split(",");
		
		for(String printStr : arry) {
			System.out.println(printStr);
		}
		/*
		출력
		홍길동
		 김주원
	 	 길라임
	 	 
		Q : 공백을 제거하고 싶은데 어떻게 해야 할까요?
		A : String 클래스의 trim 메소드 사용
		*/
		
		for(String printStr : arry) {
			System.out.println(printStr.trim());
		}
		
		
		
		scan.close(); // 입출력 객체 자원에 대한 반환 (main이 끝나면 자동으로 반환되기 때문에 생략해도 됨)
	}

}
