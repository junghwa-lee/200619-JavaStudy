/*
 *     AaBbCcDdEe....Zz 
 */
public class �ݺ���_for {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=1;i<=5;i++)
		{
			System.out.println("Hello!");
			System.out.println("Java=>For");
		} // ���� ��� �ݺ�
		
		System.out.println("============");
		for(int i=1;i<=5;i++)
			System.out.println("Hello!");
			System.out.println("Java=>For"); // ���x => �����常 �ݺ�
			
			
		char c='a';
		for(char ch='A';ch<='Z';ch++)
		{
			System.out.print(ch+""+c++); // �⺻��Ÿ�� -> ���ڿ� ��ȯ (page 35) 
			c++;
			//System.out.print(ch+""+(char)(ch+32));
		}
			System.out.println();
			
		// ���� ���� 1~10 ==> Ȧ���� ���, ¦�������
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
