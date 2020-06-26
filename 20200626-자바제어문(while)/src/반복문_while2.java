
/* 사용자가 알파벳을 입력  B ==> AB , D==> ABCD
 *      char ==> scan.next().charAt(0)
 *     "ABCDE" => scan.next()
 *     'A' => charAt(0)
 *     'B' => charAt(1)		
 */

import java.util.*;
public class 반복문_while2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char user=' ';
		// while ==> 조건이 false가 될 때까지 변경하는 변수 : 루프변수
		char c='A';
		
		Scanner scan=new Scanner(System.in);
		System.out.print("알파벳 입력(대문자):");
		user=scan.next().charAt(0);
		
		while(c<=user)
		{
			System.out.print(c);
			c++;
		}
	}

}
