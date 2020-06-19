/*
 *    필요시에 데이터형을 변경해서 사용 : 강제형변환
 *    
 *    자동형변환 )
 *    int + long = long
 *    char + int + long + double = double
 *    강제형변환 )
 *    (int)double = int
 *    (char)int = char
 *    
 *    1) boolean 제외
 *    2) int이하는 연산을 하면 결과값이 int
 *       ex) byte + byte => int
 *           char + char => int
 *           char + short + byte => int
 *           
 *   
 */
public class 단항연산자_형변환연산자 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 자동형변환
		int a='A'; // a=65
		double d=10; // d=10.0 
	    char c=65; //c='A'
	    System.out.println("a="+a);
	    System.out.println("d="+d);		  
	    System.out.println("c="+c);

	    // 강제형변환
	    int i=(int)10.5;
	    int ii=(int)'A';
	    System.out.println("i="+i);
	    System.out.println("ii="+ii);
	    
	}

}
