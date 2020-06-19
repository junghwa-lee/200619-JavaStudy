import java.util.Scanner;
// import java.util.*; => util 내 모든 클래스 가져오기

public class 자바출력메소드2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 
		/*
		 * System.out.printf("%d*%d=%d\t",2,2,4); 
		 * System.out.printf("%d*%d=%d\n",3,2,6);
		 */
		// \n은 newLine => 새로운 줄에 출력
		// \t는 tab => 일정 간격을 띄움  
		
		
		Scanner scan=new Scanner(System.in);
		/*
		 *  Scanner : 데이터형
		 *  scan : 변수
		 *  new : 메모리에 저장 (클래스저장에 사용)
		 *  Scanner(System.in) : 초기화
		 *  
		 *  Scanner => 도스에서만 사용
		 */
		
		System.out.print("1' 정수 입력:");
		 int a=scan.nextInt(); // 입력된 정수를 읽어와서 a라는 메모리에 저장
		 //System.out.print("2' 정수 입력:");
		 int b=scan.nextInt();		 
		// 출력
		 System.out.println("a="+a);
		 System.out.println("b="+b);
		// ==> 한번에 출력 10 20 
		 
		
			/*
			 * System.out.print("1' 정수 입력:"); 
			 * int a=scan.nextInt();
			 * System.out.print("2' 정수 입력:"); -> 이부분을살릴경우
			 * int b=scan.nextInt(); // 출력
			 * System.out.println("a="+a); 
			 * System.out.println("b="+b); 
			 * // ==> 나눠서 출력 10넣은 후 20
			 */	}

}
