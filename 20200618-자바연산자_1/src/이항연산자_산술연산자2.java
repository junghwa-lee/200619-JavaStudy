/* 
 *     'A' + 'B'
 *     65  +  66 = 131 (int) char, short, byte ���� => ����� int
 *    
 *     *** ������ : ���������� �ʰ��ϸ� error�� �ƴ϶� �����÷ο��� �߻� 
 *       		   => ������ �ʴ� ����� �߻�
 *        
 *        byte : -128~127 ==> 127 �ʰ��ϸ� �Ǿ��ڸ��� 1�� �ǹǷ� -128�� ���ư� 
 *        01111111(2) = 127 
 *        10000000(2) = -128
 */
public class ���׿�����_���������2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * byte b1=64; byte b2=64; byte b3=(byte)(b1+b2); System.out.println("b3="+b3);
		 */
		// % ==> double + int + char ==> double
		int a=5; 
		int b=2;
		System.out.println(a%b); // 5%2 = 1
		System.out.println(-a%b); // -5%2 = -1
		System.out.println(a%-b); // 5%-2 = 1
		System.out.println(-a%-b); // -5%-2 = -1
		
		System.out.println((int)(10.5+10.5));
		System.out.println((int)10.5+(int)10.5);
	}

}