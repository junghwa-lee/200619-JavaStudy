/*
 *     AaBbCcDdEe....Zz 
 */
public class 반복문_for {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=1;i<=5;i++)
		{
			System.out.println("Hello!");
			System.out.println("Java=>For");
		} // 두줄 모두 반복
		
		System.out.println("============");
		for(int i=1;i<=5;i++)
			System.out.println("Hello!");
			System.out.println("Java=>For"); // 블록x => 윗문장만 반복
			
			
		char c='a';
		for(char ch='A';ch<='Z';ch++)
		{
			System.out.print(ch+""+c++); // 기본형타입 -> 문자열 변환 (page 35) 
			c++;
			//System.out.print(ch+""+(char)(ch+32));
		}
			System.out.println();
			
		// 조건 없이 1~10 ==> 홀수만 출력, 짝수만출력
		for(int i=1;i<=10;i+=2)
			System.out.print(i+"\t");
		
		for(int i=2;i<=10;i+=2)
			System.out.print(i+"\t");
		
		// 1~5 ==> 1,2,3,4,5
		System.out.println();
		for(int i=1;i<=5;i++)
		{
			System.out.print(i);
			if(i<5)
			System.out.print(",");
		}
		
		// 10==>1010, 15==>1111
		System.out.println();
		int su=10;
		String s="";
		for(;;)
		{
			int a=su%2;
			s+=a+"";
			System.out.print(a);
			su=su/2;
			if(su==0)
				break;
		}
		for(int i=s.length()-1;i>=0;i--)
		{
			System.out.print(s.charAt(i));
			
		}
	}

}
