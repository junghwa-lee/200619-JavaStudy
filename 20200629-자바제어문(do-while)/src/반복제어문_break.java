/*
 *     반복제어문
 *       - break ==> 반복문 종료할 때
 *       - continue ==> 특정부분을 제외하고 싶은 경우
 *       ==> 조건문과 같이 사용(if)
 *       
 *       ※ break, continue는 한 개의 반복문만 제어
 *         break => 반복문 전체 (for, do~while, while), switch
 *         continue => 반복문에서만 사용
 *         return => 보류(메소드 종료)
 		   return; // return에 없는 경우에 JVM이 자동으로 추가
 		   
 		   break => for, while, do~while 동일
 		   continue => while (조건식으로 이동),
 		   			   for (증가식으로 이동)
 		   			   
 		   			   for(int i=1;i<=10;i++)
 		   			   {
 		   			   		if(i==6)
 		   			   			continue;
 		   			   }
 		   			   
 		   			   	int i=1;
 		   			   	while(i<=10)
 		   			   	{
 		   			   		if(i==6)
 		   			   			continue; 
 		   			   		i++;
 		   			   	}
 */

public class 반복제어문_break {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=1;i<=10;i++)
		{
			System.out.print(i+" "); // 실행문장이 위에 있을 경우 출력 후 종료
			//5일때
			if(i==5)
				//종료
				break;   // i==5면 반복문 종료
		}	
		
		
		System.out.println("\n===== 조건문 =====");
		
		// 1~10까지 홀수만 출력
		// 1) 조건문
		for(int i=1;i<=10;i++)
		{
			if(i%2!=0)
				System.out.print(i+" ");
		}
		
		// 2) 증가=>2씩
		System.out.println("\n===== 2씩증가 =====");
		for(int i=1;i<=10;i+=2)
		{
				System.out.print(i+" ");
		}
		
		// 3) continue 사용
		System.out.println("\n===== continue =====");
		for(int i=1;i<=10;i++)
		{
			if(i%2==0)
				continue;  			// 짝수만 제외 ==> 증가식(i++)으로 이동
			System.out.print(i+" ");
		}
		
		System.out.println("\n===== while =====");
		
	/*	int i=1;
		while(i<=10)
		{
			if(i%2==0)
				continue;
			System.out.println(i+" ");
			i++;
		}  
		==> 무한루프
		*/
		
		

	}

}
