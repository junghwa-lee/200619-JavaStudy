// 형변환 => 자신의 데이터형을 다른 형식의 데이터형으로 변환
/*
 *   값의 대입, 연산 처리는 같은 데이터끼리만 가능 (큰 데이터로 변경 후 계산)
 *   
 *         --------> upcasting (자동형변환)
			byte < short(char) < int < long < float < double 
	     			        	<----------downcasting (강제형변환)			
 *          boolean : 제외
 *   
 *   정수 => 실수, 문자, 정수               int a=(int)10L - 강제형변환 / long a=(long)10 => long a=10 - 자동형변환
 *   							double d=(double)10 / double d=10
 *   							int a=(int)10.5 => a=10
 *   실수 => 정수, 문자
 *   문자 => 정수, 실수                         예외 ) char a=65  
 *   
 *   예외) byte, short, char 끼리의 계산 결과값은 무조건 int
 *        
 *   
 *    10.5 + 10  => 10.5 + 10.0 자동형변환되어 출력
 *    
 */
public class 자바형변환 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * double d=5/2; 
		 * System.out.println("d="+d);  => 2.0 
		 * double d=5/(double)2; or double d=5/2.0;
		 * System.out.println("d="+d);  => 2.5
		 */
		
	}

}
