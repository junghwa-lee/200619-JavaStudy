import java.util.Scanner;

/*
 *   4. 두 개의 정수를 받아서 최대값, 최소값 출력
 *   
 *   int a, b
 *   int max, min
 */

import java.util.*;
public class 자바조건문문제4 {

	// 4. 정수 a,b 입력받아 max, min 출력
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		Scanner scan=new Scanner(System.in);
		System.out.println("두 개의 정수 입력:");
		int a=scan.nextInt();
		int b=scan.nextInt();
		int max,min;
		
		if (a>b)
		{
			max=a;
			min=b;
		}
		else
		{
			max=b;
			min=a;
		}
		
		System.out.println("max="+max);
		System.out.println("min="+min);
		*/
		
		
  // 5. 정수를 입력 받아 절대값을 출력하는 프로그램
  //	 1, -1 ==> 1
		
		Scanner scan=new Scanner(System.in);
		System.out.print("정수 입력:");
		int a=scan.nextInt();
		if(a<0)
		{
			System.out.println(-1*a);
		}
		else
		{
			System.out.println(a);
		}
		
		//System.out.println("절대값:"+Math.abs(a));
	}

}
