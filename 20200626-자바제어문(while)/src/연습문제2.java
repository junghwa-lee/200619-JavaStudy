
public class ��������2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int count=0;
		int sum=0;
		
		int i=0;
		for(i=100;i<=999;i++)
		{
			
			if(i%4!=0)
			{
				//
				count++;
				sum+=i;
			}
		}
		System.out.println("7�� ��� ����:"+count);
		System.out.println("7�� ��� ��:"+sum);
		
		count=0;
		sum=0;
		
		i=100;
		while(i<=999)
		{
			if(i%4!=0)
			{
				count++;
				sum+=i;
			}
			
			i++;
		}
		
			System.out.println("7�� ��� ����:"+count);
			System.out.println("7�� ��� ��:"+sum);
			
	}

}
