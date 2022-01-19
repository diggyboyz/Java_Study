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
public class InputTest2 {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		
		//프로그램 실행도중 입력 : Scanner/BufferedReader
		
		//입력방향을 변경하는 것이 가능 : 콘솔입력 ---> 파일입력
		//파일을 byte단위  = InputStream 또는 char 단위 = Reader로 읽어딜일 수 있음.
		// File을 읽으므로 byte단위로 읽고 싶으면 FileInputStream char단위로 읽고싶음녀 FileReader
		
		//InputStream부모		FileInputStream 자식		
		//System.setIn(InputStream in)		
		//자식은 부모이기 때문에 형변환이 가능하다.
		//FileInputStream은 InputSTream이기 때문에 형변환이 가능하다.
		
		//FileInputStream(String name) => FileInputStream("파일 경로")		
		//파일 입출력 경로표현 기본 : 전체경로(절대 경로)를 전부 명시해야 함
		//경로는 2가지로 표현 가능 \\ 또는 /
		//C:\\SSAFY\\workspace\\java\\JavaTraining\\src\\com\\ssafy\\day3\input.txt
		//C:/SSAFY/workspace/java/JavaTraining/src/com/ssafy/day3/input.txt
		
		//예외) 이클립스에서 프로젝트종류가 'Java Project'인 경우에는 프로젝트인 경우에는 프로젝트까지의 경로를 생략하는 것이 가능 
		//프로젝트명 JavaTraining
		//경로 : src/com/ssafy/day3/input.txt
		
		
		System.setIn(new FileInputStream("src/com/ssafy/day3/input.txt"));
		Scanner scan = new Scanner(System.in);				
		
		
		int intNum = scan.nextInt(); //프로그램 입력시점
		String str = scan.next();
		double doubleNum = scan.nextDouble();
						
		System.out.println(intNum + " " + str + " " + doubleNum);		
		scan.nextLine();
		
		String str3 = scan.nextLine(); // str3 = "홍길동, 김주원, 길라임"
		System.out.println("str3= " + str3);
		
		//매번 이렇게 입력받는것이 번거롭기 때문에 파일로 입력을 받는다!
		
		
		
		scan.close(); // 입출력 객체 자원에 대한 반환 (main이 끝나면 자동으로 반환되기 때문에 생략해도 됨)
	}

}
