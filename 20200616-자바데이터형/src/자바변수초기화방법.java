/*
 *     ���� ==> �ʱ�ȭ
 *     1) ���� ó��
 *        int a=100;
 *     2) ���� ==> Ű���忡�� �޾Ƽ� ����
 *     3) ������ ���� ���� (����)  ==> ����, �ζ�
 *     4) �Է�â�� ���� ���� �޴� ���
 *     
 *     ===> ���� ���ÿ� �ʱⰪ �ο�  => �����ڿ�
 *          int a=100;
 *     ===> �����ϰ� ���߿� �ʱⰪ�� �ο� => ����ڿ�
 *          int a;
 *          a=200;
 */
import java.util.*;
// String, System, Math ==> java.lang ==>  Ŭ���� ���� ����
public class �ڹٺ����ʱ�ȭ��� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=100;
		System.out.println("a="+a);
		
		int b;
		b=200;
	    System.out.println("b="+b);
		
	    int c;
	    c=(int)(Math.random()*100)+1; // ���� => ����ó��
	    //      ============>  0.0 ~ 0.99 -> *100 -> 0.0 ~99.0 -> int 0~99
	    // 1~100
	    System.out.println("c="+c);
	    
	    int d;
	    Scanner scan=new Scanner(System.in);
	    // System.in => Ű���� �Է°��� �о�´�
	    System.out.println("�����Է�:");
	    d=scan.nextInt();
	    
	    System.out.println("d="+d);
	}

}
