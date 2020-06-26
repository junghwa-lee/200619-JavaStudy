/*
 *    ※ 주의점
 *    1) while은 조건이 없는 경우 error  
 *       while() 
 *       {
 *       }  => 조건식 x => 오류발생
 *    2) while에서 무한루프
 *       => while(true) : 가장 많이 등장 
 *  ------------------------------------------     
 *     > for문
 *       	for(int i=0;i<10;i++)
 *       
 *     > while문
 *       	int i=0;
 *       	while(i<10)
 *      	{
 *       		i++;
 *       	}
 *  ------------------------------------------     
 *      int i=5;
 *      while(--i!=0) ==> i>=0
 *      {
 *      	system.out.println(i); ==> i--;
 *      }
 *       
 */
//사용자가 입력한 값까지의 누적 합 구하기
import java.util.*;
public class 반복문_while5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int user=0; // 사용자가 요청한 변수
		int i=1;  // 사용자가 요청한 변수까지 증가 ( 루프변수 )
		int sum=0; // 누적 합을 저장하는 변수
		
		Scanner scan=new Scanner(System.in);
		System.out.print("정수입력:");
		user=scan.nextInt();
		
		i=1;
		while(i<=user)
		{
			sum+=i;
			i++;	
		}
		System.out.println("sum="+sum);
		
		
		i=1; //변수초기화
		while(i<=5)
		{
			System.out.print(i);
			i++;
		}	
		// i=6
		System.out.println();
		
		i=5;
		while(i>=1)
		{
			System.out.print(i);
			i--;
		}
		// i=-1
		
		
		
	
	
	
	}
	
	
	

}
