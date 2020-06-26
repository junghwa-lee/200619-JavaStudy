/*
 *    참조형 변수 : 배열, 클래스
 *    -------
 *      문자열 저장 변수 : String
 *      형식)
 *           char c='A' => 문자 1개만 저장
 *           String s="ABCDEF"  => 문자열 저장  => 웹, 윈도우 (모든 데이터 문자열)
 *           
 *           ==> String : 클래스
 *               기능 (제공)
 *                => 문자 갯수
 *                   String s="ABCDEF";
 *                   s.length() => 6 
 *                => String s="ABCDEF";
 *                   => s.charAt(0) ==> 'A'
 *                   
 *        
 *         s=scan.next(); => 공백 인식x 
 *         s=scan.nextLine(); => 공백 포함 
 *           
 */
// 사용자가 문자열을 입력
// 대문자 갯수, 소문자 갯수 확인
import java.util.*;
public class 반복문_while3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s=""; // 문자 여러개 저장
		Scanner scan=new Scanner(System.in);
		System.out.print("문자열을 입력하세요>>");
		s=scan.nextLine();  //String으로 받은 값 저장
		System.out.println(s);
		//System.out.println("갯수:"+s.length());
		
		int a=0, b=0;       // a=> 소문자 갯수 , b=> 대문자 갯수
		int i=0; 			// 문자의 갯수만큼 증가하는 변수 => 루프변수
		/*
		 *   ABCDEFG => s.length=7
		 *   -------
		 *   0123456 => 0번부터 시작하므로 '<=' 이 아닌  i<s.length로 설정
		 */
		while(i<s.length())
		{
			char c=s.charAt(i);
			if(c>='A' && c<='Z')
				b++;             
			if(c>='a' && c<='z')
				a++;
			
			i++;
		}
		   // ++ => 갯수
		   // += => 합
		
		System.out.println("대문자 갯수:"+b);
		System.out.println("소문자 갯수:"+a);
		
		
		
	}

}
