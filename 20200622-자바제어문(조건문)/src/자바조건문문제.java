/*
 *     1. 정수를 입력받아서 짝수/홀수 확인  
 *         => 10은 짝수다, 11은 홀수다 ==> if~else
 *     
 *     
 *     
 */
import java.util.*;

public class 자바조건문문제 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan=new Scanner(System.in);
		System.out.println("정수입력:");
		int a=scan.nextInt();
			
		if(a%2==0)
		{
			System.out.println(a+"는(은) 짝수");
		}
		else
		{
			System.out.println(a+"는(은) 홀수");
		}
		
		
	}
	
		

}
