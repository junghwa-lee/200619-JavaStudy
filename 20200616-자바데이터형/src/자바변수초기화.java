
public class 자바변수초기화 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * int kor=78; int eng=85; int math=96;
		 */
		/*
		 *   문자열 결합
		 *   =======
		 *     7+7+"1"+7+7 
		 *     ===
		 *     14 +"1"  
		 *     =======
		 *      "141" +7
		 *      "1417"  +7
		 *      "14177"
		 *   => 뒷부분을 계산하려면 ()
		 *      
		 *   
		 *      
		 */
		/*
		 * System.out.println("총점:"+(kor+eng+math));  =>총점:259
		 * System.out.println("총점:"+kor+eng+math);    =>총점:788596
		 * 
		 * 
		 * 
		 */
		int a=97;
		char c=97; // char => 문자 , 숫자 
		System.out.println("a="+a);
		System.out.println("c="+c);
		/* a=65 c=65 ==> c=A
		 * a=97 c=97 ==> c=a
		 * 
		 */
		
		int d=1;
	    int e='1';
		System.out.println("d="+d);
		System.out.println("e="+e);
		// char 는 문자, 정수 취급한다
		/* 
		 *     long = int
		 *      8      4
		 *     
		 *     int = long
		 *      4     8     ==> error
		 *      
		 *     double = int, long, float
		 *     int = double ==> error
		 *    
		 *     *예외 => char = int 
		 *    
		 */
		double f=10.6;
	    
	    // byte < char < int < long < float < double
		System.out.println(100); // 100은 int
		System.out.println(10.8); // 10.8은 double
		
		long i=21400000000L;
		//double i=21400000000L; ==> 둘다가능
		

	}

}
 
