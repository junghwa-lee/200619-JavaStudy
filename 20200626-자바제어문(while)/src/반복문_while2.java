
/* ����ڰ� ���ĺ��� �Է�  B ==> AB , D==> ABCD
 *      char ==> scan.next().charAt(0)
 *     "ABCDE" => scan.next()
 *     'A' => charAt(0)
 *     'B' => charAt(1)		
 */

import java.util.*;
public class �ݺ���_while2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char user=' ';
		// while ==> ������ false�� �� ������ �����ϴ� ���� : ��������
		char c='A';
		
		Scanner scan=new Scanner(System.in);
		System.out.print("���ĺ� �Է�(�빮��):");
		user=scan.next().charAt(0);
		
		while(c<=user)
		{
			System.out.print(c);
			c++;
		}
	}

}
