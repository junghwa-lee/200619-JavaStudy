/*
 *     �ڹ� => �⺻��
 *            �ڹٿ� �����ϴ� ��������
 *            ���� => boolean ==> �� : true / false 
 *            => if(���ǹ�)�� ����� �� �ַ� ����ϴ� ��������
 *               ��(true/false)
 *               
 *      ================================================
 
	     --------> upcasting (�ڵ�����ȯ)
			byte < short(char) < int < long < float < double 
	     				<----------downcasting (��������ȯ)
			boolean�� �ܵ����
			
	*      double d='a'; ==> d=97.0
	*      char c='a'; ====> c=a
	*      int i='A';  ====> i=65
	*      
	*      byte b1=10;
	*      byte b2=20;
	*      byte b3=b1+b2 => error / byte b1,b2�� ���� int�� �ٲ�� ���� 
	*      
	*      byte a=10;
	*      byte b=30;
	*      byte c=(byte)(a*b) 
	*         => a*b=300=100101100(2) byte=8bit�̹Ƿ� �ڿ��� 8���� �����´� 
	*         => c=44
	*         => 300�� ������� �ޱ� ���ؼ��� int�� ����ؾ� ��
	*      int c=(a*b) 
	*         => c=300
	*         
	*      (int)10.5+(int)10.5 ==>20
	*      (int)(10.5+10.5)  ==>21
	*  
	*       
	*/

public class �ڹٱ⺻�������� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// �����
		// boolean => 1byte
		boolean b = false; // �׻� �ҹ��ڷ� ���. False(x)
		System.out.println("b=" + b);
		b = true;
		System.out.println("b=" + b);
		
		System.out.println('A');
		System.out.println((int)'A');
		System.out.println((int)'ȫ');
		System.out.println((char)12619); // => �� 
		// ==> �� ���ڸ��� ���ڹ�ȣ�� ���� (char�� ���������� �ν��Ѵ�)
	}

}
