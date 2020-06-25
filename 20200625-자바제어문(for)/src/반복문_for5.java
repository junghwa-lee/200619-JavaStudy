

public class 반복문_for5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	//1~100 까지의 짝수의 합, 홀수의 합	
		
		int odd=0;
		int even=0;
		for(int i=1;i<=100;i++) 
		{
			if(i%2==0)
				even+=i;
			else
				odd+=i;
		}
			System.out.println("1~100까지 짝수 합:"+even);
			System.out.println("1~100까지 홀수 합:"+odd);
			
	//1~100 까지의 3의 배수의 합, 5의 배수의 합, 7의배수의 합			
			
		int a3=0;
		int a5=0;
		int a7=0;
		for(int i=1;i<=100;i++)
		{
			if(i%3==0)
				a3+=i;
			if(i%5==0)
				a5+=i;
			if(i%7==0)
				a7+=i;	
		}
		System.out.println("1~100까지 3의배수 합:"+a3);
		System.out.println("1~100까지 5의배수 합:"+a5);
		System.out.println("1~100까지 7의배수 합:"+a7);
		
	//100~999까지 7의 배수 갯수
		
		int count=0;
		for(int i=100;i<=999;i++)
		{
			if(i%7==0)
				count++;
		}
		System.out.println("100~999까지 7의 배수 갯수:"+count);
		
	//1-2+3-4+5-6+7-8+9-10
	
		int sum=0;
		for(int i=1; i<=10; i++)
		{
			if(i%2==0)
				sum-=i;
			else
				sum+=i;
			
		}
		System.out.println("1-2+3-4+5-6+7-8+9-10:"+sum);
		
	//★★☆★★☆★★☆★★☆
		
		for(int i=1;i<=12;i++)
		{
			if(i%3==0)
				System.out.print("☆");
			else
				System.out.print("★");
		}
	
		
	}
	

}
