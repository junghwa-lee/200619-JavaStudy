
public class MainClass1 {
	public static void main(String[] args) {
		 // ǥ�� => �ڹ�
		/*
		 *    ����
		 *      = 10����  10,20..
		 *      = 8����(0)
		 *           011 => 9
		 *           =
		 *      = 16����(0x)
		 *           0x10
		 *           ==
		 *      = 2����(0b)
		 *           0b1010
		 *           ==
		 *    �Ǽ�
		 *      = ���� ũ�� => 4byte (�Ҽ������� 8��)  10.5f or 10.5F (��ҹ��� ����x)
		 *      = ���� ũ�� => 8byte (�Ҽ������� 16��) 10.5d (d�� ��������)
		 *    ����
		 *      = ' ' => �ѱ��ڸ� ����!(�ѱۻ�뵵 ����)
		 *    ���ڿ�
		 *      = " " => �������� ����
		 *      
		 *      ASC (c) =======> 1byte
		 *      Unicode (�ڹ�) => 2byte
		 *      
		 *      UTF-8 ==> 2byte�� ��ȯ�ϴ°�(�ѱ��� ������ ����)
		 *      
		 *      
		 */
		System.out.println('ȫ');
		System.out.println("Hello");
		
		System.out.println(10.5);
		System.out.println(10.5f);
		System.out.println(10.5F);
		
		System.out.println(10);// ���������Ʈ�� 10�� ���
		System.out.println(0b01010);
		System.out.println(012);
		System.out.println(0xA);
		/*
		 *   1. �⺻ ����
		 *   ============
		 *     => ��ҹ��� ����
		 *        => ���̺귯�� (Ŭ����:��ҹ���  System, �޼ҵ�:�ҹ��� println, ���:��� �빮��)
		 *        PI=3.14
		 *        
		 *        ����/���  ������� ������ ����
		 *        final�� ������ ���, ������ ���� (�빮�ڰ� ��� ����� �ƴ�)
		 *        int kor=100;
		 *        final int KOR=200;
		 *      
		 *      => ��ɹ��� ����Ǹ� �ݵ�� ; ���
		 *      
		 *      
		 *    3. �鿩����
		 *      
		 */
		
	}
}
