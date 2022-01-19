import java.util.Scanner;
import java.lang.*;
public class InputTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//프로그램 실행도중 입력 : Scanner/BufferedReader
		
		//스캐너는 기본생성자를 지원하지 않기 때문에 항상 인자를 가져야함.
//		Scanner scan = new Scanner(InputStream source);
		// Stream : 시내, 연속된 바이트의 흐름
//		System.out(표준 출력/모니터 콘솔) : static PrintStream
//		System.in (표준 입력/키보드) : static InputSTream
		
		Scanner scan = new Scanner(System.in);
		
		//next() 메소드들은 데이터를 얻어옴을 의미합니다.
		// scan.nextInt(); 정수	scan.nextDouble(); 실수	scan.next(); 문자열
		// WhiteSpace : 프로그램과 웹에서 사용되는 용어로 한개 이상의 공백 또는 탭 또는 엔터의 조합
		
		//데이터 입력 ==> 13 안녕하세요 45.6
		//데이터 입력 ==> 13 안녕하세요
//		45.6
		//데이터 입력 => 13 안녕하세요                                      45.6
		//공백 모두 하나의 whiteSpace로 인식하여 잘 출력됨
		int intNum = scan.nextInt(); //프로그램 입력시점
		String str = scan.next();
		double doubleNum = scan.nextDouble();
						
		System.out.println(intNum + " " + str + " " + doubleNum);
		
		//데이터 입력이 ,와 들어온다면 ==> 홍길동,김주원,길라임
		//String str2 = scan.next(); ==> str2 ="홍길동,김주원,길라임"
		
		//하지만 데이터 입력이 공백과 함께 들어온다면 ==> 홍길동, 김주원, 길라임
		//str2 = "홍길동,"이 되어버립니다. 따라서 nextLine()을 사용해야 합니다.
		
		//scan.nextLine(); 문자열을 받아옴
		//공백과 상관없이 라인단위(엔터를 구분자)로 입력되는 메서드!!
		// next(), nextInt(), nextLine() 세 개의 메서드와 혼용해서 사용하지 않도록 하는 것을 권장
		
		//이전 키보드에 존재하는 엔터키에 대한 처리를 해야합니다.
		scan.nextLine();
		
		String str3 = scan.nextLine(); // str3 = "홍길동, 김주원, 길라임"
		System.out.println("str3= " + str3);
		
		//매번 이렇게 입력받는것이 번거롭기 때문에 파일로 입력을 받는다!
		
		
		
		scan.close(); // 입출력 객체 자원에 대한 반환 (main이 끝나면 자동으로 반환되기 때문에 생략해도 됨)
	}

}
