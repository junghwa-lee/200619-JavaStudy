import java.util.*; // Scanner ==> ������ ������� �ڹ������� �о�´�
/*
 *   <import> 
 *   class Scanner{
 *   }
 */
public class �ڹ�����¸޼ҵ� {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// �Է°� �ޱ�
		/*
		 *   print : ���� �Է� / println : �ؿ� �Է�
		 *  
		 *   System.out.println("�����Է�:");
		 *   System.out.print("�����Է�:\n");
		 *   ===> ���� ��� (�ٹٲ�)
		 */
		Scanner scan=new Scanner(System.in);
		System.out.print("�Ǽ��Է�:"); // \n  or  \t ��� ����
		double a=scan.nextDouble(); // ���� => int a=scan.nextint(); 
		// double a=100 ==> double�� ����ǹǷ� ������� a=100.0
		// char a=97    ==> char�� ����ǹǷ� a='a'
		System.out.print("a="+a);
		
		
		
	}

}
