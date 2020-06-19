import java.util.*; // Scanner ==> 이전에 만들어진 자바파일을 읽어온다
/*
 *   <import> 
 *   class Scanner{
 *   }
 */
public class 자바입출력메소드 {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 입력값 받기
		/*
		 *   print : 옆에 입력 / println : 밑에 입력
		 *  
		 *   System.out.println("정수입력:");
		 *   System.out.print("정수입력:\n");
		 *   ===> 같은 결과 (줄바꿈)
		 */
		Scanner scan=new Scanner(System.in);
		System.out.print("실수입력:"); // \n  or  \t 사용 가능
		double a=scan.nextDouble(); // 정수 => int a=scan.nextint(); 
		// double a=100 ==> double로 저장되므로 결과값은 a=100.0
		// char a=97    ==> char로 저장되므로 a='a'
		System.out.print("a="+a);
		
		
		
	}

}
