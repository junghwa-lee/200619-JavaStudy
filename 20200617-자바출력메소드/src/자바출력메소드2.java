import java.util.Scanner;
// import java.util.*; => util �� ��� Ŭ���� ��������

public class �ڹ���¸޼ҵ�2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 
		/*
		 * System.out.printf("%d*%d=%d\t",2,2,4); 
		 * System.out.printf("%d*%d=%d\n",3,2,6);
		 */
		// \n�� newLine => ���ο� �ٿ� ���
		// \t�� tab => ���� ������ ���  
		
		
		Scanner scan=new Scanner(System.in);
		/*
		 *  Scanner : ��������
		 *  scan : ����
		 *  new : �޸𸮿� ���� (Ŭ�������忡 ���)
		 *  Scanner(System.in) : �ʱ�ȭ
		 *  
		 *  Scanner => ���������� ���
		 */
		
		System.out.print("1' ���� �Է�:");
		 int a=scan.nextInt(); // �Էµ� ������ �о�ͼ� a��� �޸𸮿� ����
		 //System.out.print("2' ���� �Է�:");
		 int b=scan.nextInt();		 
		// ���
		 System.out.println("a="+a);
		 System.out.println("b="+b);
		// ==> �ѹ��� ��� 10 20 
		 
		
			/*
			 * System.out.print("1' ���� �Է�:"); 
			 * int a=scan.nextInt();
			 * System.out.print("2' ���� �Է�:"); -> �̺κ����츱���
			 * int b=scan.nextInt(); // ���
			 * System.out.println("a="+a); 
			 * System.out.println("b="+b); 
			 * // ==> ������ ��� 10���� �� 20
			 */	}

}
