/*
 * 	3. 가위바위보
 *    사용자 입력 ==> 0 or 1 or 2
 *    
 *    => 0이면 => 가위
 *    => 1이면 => 바위
 *    => 2이면 => 보
 *    
 *    
 *    == 정수, 실수, 문자일 경우 사용
 *    "" 문자열은 ==으로 비교 불가능 => equals()
 *    
 */
import java.util.*;

public class 자바조건문문제3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.print("가위(0),바위(1),보(2) 입력:");
		
		//사용자
		int user=scan.nextInt();
		if(user==0)
	     { 
			System.out.println("가위");
	     }
		if(user==1)
		{
			System.out.println("바위");
		}
		if(user==2)
		{
			System.out.println("보");
		}
			
	    //컴퓨터
		int com=(int)(Math.random()*3);
		//        	  -------------
		//				0.0~0.99 	==> *3 ==> 0.0~2.9... ===> 0~2 (int변환)
		if(com==0)
		{
			System.out.println("컴퓨터:가위");
		}
		if(com==1)
		{	
			System.out.println("컴퓨터:바위");
		}
		if(com==2)
		{
			System.out.println("컴퓨터:보");
		}
		
		// 결과비교 
		
		// 총 9가지 경우의 수
		/*  com-user
		*    com 		user
		 *     0		 0  
		 *     			 1
		 *     			 2
		 *     1		 0
		 *     			 1
		 *     			 2
		 *     2		 0
		 *     			 1
		 *     			 2
		 */
		
		// 중복 조건문
		// 컴퓨터 : 가위
		/*
		if(com==0)
		{
			if(user==0)
			{
				System.out.println("비겼다!!");
			}
			if(user==1)
			{
				System.out.println("Player Win!!");
			}
			if(user==2)
			{
				System.out.println("Computer Win!!");
			}
		}
		// 컴퓨터 : 바위
		if(com==1)
		{
			if(user==0)
			{
				System.out.println("Computer Win!!");
			}
			if(user==1)
			{
				System.out.println("비겼다!!");
			}
			if(user==2)
			{
				System.out.println("Player Win!!");
			}
		}
		// 컴퓨터 : 보
		if(com==2)
		{
			if(user==0)
			{
				System.out.println("Player Win!!");
			}
			if(user==1)
			{
				System.out.println("Computer Win!!");
			}
			if(user==2)
			{
				System.out.println("비겼다!!");
			}
			*/
		
		
		if(com-user==2 || com-user==-1)
		{
			System.out.println("Player Win!");
		}
		if(com-user==1 || com-user==-2)
		{
			System.out.println("Computer Win!");
		}
		if(com-user==0)
		{
			System.out.println("비겼다!");
		}
		}
	

}

