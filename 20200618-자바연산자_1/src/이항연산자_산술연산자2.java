/* 
 *     'A' + 'B'
 *     65  +  66 = 131 (int) char, short, byte 연산 => 결과값 int
 *    
 *     *** 주의점 : 데이터형을 초과하면 error가 아니라 오버플로워를 발생 
 *       		   => 원하지 않는 결과값 발생
 *        
 *        byte : -128~127 ==> 127 초과하면 맨앞자리가 1이 되므로 -128로 돌아감 
 *        01111111(2) = 127 
 *        10000000(2) = -128
 */
public class 이항연산자_산술연산자2 {

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