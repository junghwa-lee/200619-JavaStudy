/*
 *    ����ÿ� ���� ����ϴ� ������
 *     => ���������� (++, --)
 *     => ��������� (+, -, *, / )
 *     => �񱳿�����, ��������
 *     => ���� (=, +=, -=)
 *     
 *     ==> ��Ÿ ������
 *         - ���׿����� ====> if~else ===> ����
 *           ���� ? ��1 : ��2
 *           ---
 *            -> true  => ��1 ���
 *            -> false => ��2 ���
 */
import java.util.*;
// import java.lang.* (��������) ===> System, String, Math 
// ������ �Է¹޾Ƽ� ¦��/Ȧ�� ���
public class ���׿�����_���� {	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* Scanner scan=new Scanner(System.in);
		//system.in : Ű���� �Է�
		//system.out : ȭ�� 
		
		System.out.println("���� �Է�:");
		// �Է¹��� ������ ����
		int a=scan.nextInt();
		System.out.println(a%2==0?"¦���Դϴ�":"Ȧ���Դϴ�");
		*/
		
		int a=(int)(Math.random()*100)+1;
	/*	      ---- ------------------- -
		       2          	1		   3
		       
		 ������ �켱����
		   1) ()
		   2) ���׿�����
		   3) ���׿�����
		   (Math.random()*100)
		   --------------
	          0.0~0.99    => *100 => 0.0~99.0
	       
	       (int)(0.0~99.0) ==> (0~99)+1 ==> 1~100
		   
	*/
		System.out.println("a="+a);
		System.out.println(a%2==0?"¦���Դϴ�":"Ȧ���Դϴ�");
	}

}
