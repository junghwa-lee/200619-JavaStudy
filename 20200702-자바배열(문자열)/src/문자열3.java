/*
 *  문자열을 저장할 수 있는 공간 : String
 *  String : 일반변수의 역할
 *           클래스의 역할 => 기능(메소드)
 *           
 *           주요 기능 
 *            = 문자열 비교 : equals()
 *            = 포함 문자 : contains()
 *            = 문자열중에 한 개 문자 : charAt()
 *            = 저장된 문자의 갯수 : length()
 *            = 문자 자르기 : substring()
 *            = 찾는 문자의 위치 : indexOf(), lastIndexOf()
 *            = 모든 데이터형을 문자열로 변환 => valueOf()
 *            = 공백문자 제거 : trim() => 좌우만 제거
 *              " Hello Java " => "Hello Java"
 *            =  문자열 -> char[] => toCharArray()
 *            = startsWith, endsWith => 검색기 
 *            
 *            ============================
 *            Wrapper Class
 *            기본형 데이터(정수,실수,문자,논리)
 *            int -> Integer  / parseInt("2")=>2
 *            double -> Double
 */
// substring : 필요한 문자만 추출 => 형태소 분석 (명사, 형용사, 부사)
/*	
 * 	 substring(int start)  => start Index부터 끝까지 출력 (0번부터 시작)
 *   substring(int start, int end) => start index 부터 end index -1 까지 출력
 *   
 *   "Hello Java"
 *    ----------
 *    0123456789
 *    substring(6) => Java
 */
public class 문자열3 {
	public static void main(String[] args) {
	//String msg="0123456789";
	//System.out.println(msg.substring(5));
	//System.out.println(msg.substring(3));
	//System.out.println(msg.substring(3,6));
	
	String msg="100-010";
	System.out.println(msg.substring(0,3));
	System.out.println(msg.substring(4,7));
	
	
	
	
	
	}
}
