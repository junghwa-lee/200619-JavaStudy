/*
 *    ���� ���ǹ� => ������ ���� ��� ���
 *             => ������ �´� ���常 ���� (1���� ����)
 *     int a=15;
 *     if(a%3==0)
 *       System.out.println("3�� ���");  ==> ����
 *     else if(a%5==0)
 *       System.out.println("5�� ���");
 *     else if(a%7==0)
 *       System.out.println("7�� ���");
 *     ==> �������ǹ� : ù��°���忡�� ��
 *     
 *    if(a%3==0)
 *       System.out.println("3�� ���"); => ����
 *    if(a%5==0)
 *       System.out.println("5�� ���"); => ����
 *    if(a%7==0)
 *       System.out.println("7�� ���");
 *     ==> �������ǹ� ������ : ��� ������ ���� (������)
 *     
 *     ����)
 *          if(���ǽ�)
 *          {
 *              ������ true�� �����ϴ� ����
 *              ���� �� ����
 *          }
 *          else if(���ǽ�)
 *          {
 *              ������ true�� �����ϴ� ����
 *              ���� �� ����
 *          }
 *          else if(���ǽ�)
 *          {
 *          	������ true�� �����ϴ� ����
 *              ���� �� ����
 *          }
 *          else => ��������  
 *          {
 *          	�ش� ������ ���� ��� �����ϴ� ����
 *          }
 */ 
/*
 * 	�������
 *     3���� ������ �޾Ƽ�
 *     ����, ���, ���� ==> ��� 
 */
import java.util.*;
public class �������ǹ� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int kor=0,eng=0,math=0;
		int total=0;
		double avg=0.0;
		char hakjum='A';
		// �Է� ���� => ������ ����
		Scanner scan=new Scanner(System.in);
		System.out.print("���� ���� �Է�:");
		kor=scan.nextInt(); // Ű����� �Է��� ������ �о�´�
		System.out.print("���� ���� �Է�:");
		eng=scan.nextInt();
		System.out.print("���� ���� �Է�:");
		math=scan.nextInt();
		
		// 1. ����
		total=kor+eng+math;
		// 2. ���
		avg=total/3.0; 
		// 3. ����
		if(avg>=90)
		{
			hakjum='A';
		}
		else if(avg>=80)
		{
			hakjum='B';
		}
		else if(avg>=70)
		{
			hakjum='C';
		}
		else if(avg>=60)
		{
			hakjum='D';
		}
		else
		{
			hakjum='F';
		}
		
		// 4. ó���Ϸ� ==> ȭ�鿡 ���
		System.out.println("===== ���� =====");
		System.out.println("��������:"+kor);
		System.out.println("��������:"+eng);
		System.out.println("��������:"+math);
		System.out.println("����:"+total);
		System.out.printf("���:%.2f\n",avg); // �Ҽ������� 2�ڸ� ���
		System.out.println("����:"+hakjum);
		
		
		
	}

}
