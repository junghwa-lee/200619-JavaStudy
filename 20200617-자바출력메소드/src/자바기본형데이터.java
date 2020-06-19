/*
 *     자바 => 기본형
 *            자바에 지원하는 데이터형
 *            논리형 => boolean ==> 값 : true / false 
 *            => if(조건문)을 사용할 때 주로 사용하는 데이터형
 *               턴(true/false)
 *               
 *      ================================================
 
	     --------> upcasting (자동형변환)
			byte < short(char) < int < long < float < double 
	     				<----------downcasting (강제형변환)
			boolean은 단독사용
			
	*      double d='a'; ==> d=97.0
	*      char c='a'; ====> c=a
	*      int i='A';  ====> i=65
	*      
	*      byte b1=10;
	*      byte b2=20;
	*      byte b3=b1+b2 => error / byte b1,b2의 값이 int로 바뀌기 때문 
	*      
	*      byte a=10;
	*      byte b=30;
	*      byte c=(byte)(a*b) 
	*         => a*b=300=100101100(2) byte=8bit이므로 뒤에서 8개만 가져온다 
	*         => c=44
	*         => 300의 결과값을 받기 위해서는 int를 사용해야 함
	*      int c=(a*b) 
	*         => c=300
	*         
	*      (int)10.5+(int)10.5 ==>20
	*      (int)(10.5+10.5)  ==>21
	*  
	*       
	*/

public class 자바기본형데이터 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 사용방법
		// boolean => 1byte
		boolean b = false; // 항상 소문자로 사용. False(x)
		System.out.println("b=" + b);
		b = true;
		System.out.println("b=" + b);
		
		System.out.println('A');
		System.out.println((int)'A');
		System.out.println((int)'홍');
		System.out.println((char)12619); // => ㅋ 
		// ==> 각 문자마다 숫자번호가 있음 (char는 정수형으로 인식한다)
	}

}
