
public class 연습문제5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum7=0;
		int sum9=0;
		
		int i=0;
		for(i=1;i<=1000;i++)
		{
			if(i%7==0) {
				sum7+=i;
			}
			if(i%9==0) {
				sum9+=i;
			}
		}
		
		System.out.println("7의 배수:"+sum7);
		System.out.println("9의 배수:"+sum9);
		System.out.println("7의 배수+9의 배수:"+(sum7+sum9));
		
		
		sum7=0;
		sum9=0;
		
		i=1;
		while(i<=1000)
		{
			if(i%7==0) {
				sum7+=i;
			}
			if(i%9==0) {
				sum9+=i;
			}
		 
			i++;
		}
		
		System.out.println("7의 배수:"+sum7);
		System.out.println("9의 배수:"+sum9);
		System.out.println("7의 배수+9의 배수:"+(sum7+sum9));
		
		
		
	}

}
