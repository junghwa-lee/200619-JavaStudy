/*
 *    ������ ���� : �迭, Ŭ����
 *    -------
 *      ���ڿ� ���� ���� : String
 *      ����)
 *           char c='A' => ���� 1���� ����
 *           String s="ABCDEF"  => ���ڿ� ����  => ��, ������ (��� ������ ���ڿ�)
 *           
 *           ==> String : Ŭ����
 *               ��� (����)
 *                => ���� ����
 *                   String s="ABCDEF";
 *                   s.length() => 6 
 *                => String s="ABCDEF";
 *                   => s.charAt(0) ==> 'A'
 *                   
 *        
 *         s=scan.next(); => ���� �ν�x 
 *         s=scan.nextLine(); => ���� ���� 
 *           
 */
// ����ڰ� ���ڿ��� �Է�
// �빮�� ����, �ҹ��� ���� Ȯ��
import java.util.*;
public class �ݺ���_while3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s=""; // ���� ������ ����
		Scanner scan=new Scanner(System.in);
		System.out.print("���ڿ��� �Է��ϼ���>>");
		s=scan.nextLine();  //String���� ���� �� ����
		System.out.println(s);
		//System.out.println("����:"+s.length());
		
		int a=0, b=0;       // a=> �ҹ��� ���� , b=> �빮�� ����
		int i=0; 			// ������ ������ŭ �����ϴ� ���� => ��������
		/*
		 *   ABCDEFG => s.length=7
		 *   -------
		 *   0123456 => 0������ �����ϹǷ� '<=' �� �ƴ�  i<s.length�� ����
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
		   // ++ => ����
		   // += => ��
		
		System.out.println("�빮�� ����:"+b);
		System.out.println("�ҹ��� ����:"+a);
		
		
		
	}

}
