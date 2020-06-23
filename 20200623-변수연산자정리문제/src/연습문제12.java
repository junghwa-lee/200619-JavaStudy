import java.util.*;
public class 연습문제12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 변수선언 => 메모리 기억공간
		int a=0, b=0;
		Scanner scan=new Scanner(System.in);	
		System.out.print("두 개의 정수 입력:");
		a=scan.nextInt();
		b=scan.nextInt();
		System.out.println("뺄셈:"+(a-b));
		System.out.println("곱셈:"+(a*b));
	}

}
