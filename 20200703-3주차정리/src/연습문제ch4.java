import java.util.*;
public class 연습문제ch4 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//4-2
				int sum=0;
				for(int i=1;i<=20;i++)
				{
					if(i%2!=0 && i%3!=0)
					{
						sum+=i;
					}
				}
				System.out.println(sum);
				
				//4-3
				sum=0;
				for(int i=1;i<=10;i++)
				{
					sum+=i*(11-i);
				}
				System.out.println(sum);
				
				//4-4
				/*
				sum=0;
				int i=1;
				
				while(true)
				{
					sum+=i;
					
					if(sum>=100)
						break;
					
					i++;
					i=-i;

				}
				System.out.println(i);
				*/
				
				//4-5
				int i=0;
				while(i<=10)
				{
					
					int j=0;
					while(j<=i)
					{
						System.out.print("*");
						j++;
					}
					
					System.out.println();
					i++;
				}
				
				//4-6
				i=0;
				int j=0;
				
				for(i=1;i<=6;i++)
				{
					for(j=1;j<=6;j++)
						if(i+j==6)
						{
							System.out.println(i+"+"+j+"="+(i+j));
						}
				}
				
				//4-14
				int answer=(int)(Math.random()*100)+1;
				int input=0;
				int count=0;
				
				Scanner scan=new Scanner(System.in);
				
				do {
					count++;
					System.out.println("1과 100사이의 값을 입력하세요 :");
					input=scan.nextInt();
					
					if(answer>input)
						System.out.println("더 큰 수를 입력하세요.");
					else if(answer<input)
						System.out.println("더 작은 수를 입력하세요.");
					else if(answer==input) 
					{
						System.out.println("맞췄습니다.");
						break;
					}		
				}while(true);
				
					System.out.println("시도횟수는 "+count+"번입니다.");
	}

}
