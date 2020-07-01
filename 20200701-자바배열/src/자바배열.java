/*
 *     �迭 
 *       => ���� ���� ������ �ϳ��� ��� ����
 *          (���� �̸��� �� ���� ������ ��� => �迭��)
 *          ������ ���� ���̱� ������ ���� => �ε���(÷��)
 *          �� ���� : �ε��� ��ȣ�� 0������ ����
 *       => �迭�� ������ ������ �� �� => �迭��.length
 *       => �迭 ���� 
 *       	int[] �迭��=new int[��������]  new ��� 
 *            int[] arr= new int[5]; => 0���� �ʱ�ȭ
 *            double[] arr=new doubel[5]; => 0.0���� �ʱ�ȭ
 *            ���ڿ� ������ _ String[] arr=new String[10] => null�� �ʱ�ȭ
 *          *** ��� Ŭ���� => �ּҸ� ������ �ִ� (�ּ� ���� ��� : null)
 *       => �迭 �ʱ�ȭ
 *          1) new �̿��ؼ� �ڵ� �ʱ�ȭ
 *          2) ���α׷��Ӱ� ���� �Է�
 *              int[] arr={10,20,30,40,50}
 *          3) ����ڰ� �Է�, ����..
 *       => �迭 �� ����
 *       	�迭��[���ϴ� �κ�]=��
 *       	     --------- �ε���
 *       	ex)	10�� => 7��° �� ����
 *          		   ----
 *          		    ����[6]=100  ==> �Ϲ� ������ ����    
 *       => �迭 �� ���
 *          0���� ���� ==> for�� ����� ���� => while ��� ����
 *          => �Ϲ� for : �ε��� �̿�  ==> �迭 �� ����, ����
 *          => for-each : ���� ����� ���� �о��  ==> ��¿�
 *       
 */
// ����ڰ�  ��, ��, �� �Է� -> ���� ���
import java.util.*;
public class �ڹٹ迭 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// ����, ��, �� �޴� ���� �ʿ�
		int year=0,month=0,day=0;
		// ����ڷκ��� ��û���� �޴´�
		Scanner scan=new Scanner(System.in);
		System.out.print("�⵵ �Է�:");
		year=scan.nextInt();
		// scan.nextInt() ==> Ű����� �Էµ� �������� �о���� ����
		System.out.print("�� �Է�:");
		month=scan.nextInt();
		System.out.print("�� �Է�:");
		day=scan.nextInt();
		
		System.out.println(year+"�⵵ "+month+"�� "+day+"��");
		
		/*
		 *   ���� ���ϱ� 2020�� 7�� 1��
		 *   1) ���⵵������ �� ����  1�� 1�� 1�� ~ 2019�� 12�� 31��
		 *   2) ���ޱ����� �� ����  2020�� 1�� 1�� ~ 2020�� 6�� 30�� 
		 *   3) �Էµ� day������ �� ������ ���Ѵ�
		 *   ===========================  +
		 *   => ��ü �� ���� % 7 ==> ���� ���� �� ����
		 *      ------------
		 *      0(��) .... 6(��)
		 *      => 1�⵵ 1�� 1�� ==> ������ ����
		 */
		
		// 1) ���⵵������ �� ����
		int total=(year-1)*365
				+(year-1)/4
				-(year-1)/100
				+(year-1)/400;
				// ���� ==> 366�� => 4�⸶�� , 100�⸶�� ����, 400�⸶�� ����	
		// 2) ���ޱ����� �� ����
		int[] lastDay= {31,28,31,30,31,30,31,31,30,31,30,31};
				// 1�� = 0
				// 2�� = total+31
				// 3�� = total+31+28
		
		// �� 2���� ��� => 28 or 29
		if((year%4==0 && year%100!=0) || (year%400==0))
		{
			lastDay[1]=29;
		}
		else
		{
			lastDay[1]=28;
		}
		
		for(int i=0;i<month-1;i++)
		{
			total+=lastDay[i];
		}
		
		// 3) �Էµ� day
		total+=day;
		
		// ���� ���ϱ�
		int week=total%7;
		char[] strWeek= {'��','��','ȭ','��','��','��','��'};
		System.out.println(strWeek[week]+"�����Դϴ�");
		
		/*
		switch(week)
		{
		case 0:
			System.out.println("�Ͽ����Դϴ�");
			break;
		case 1:
			System.out.println("�������Դϴ�");
			break;
		case 2:
			System.out.println("ȭ�����Դϴ�");
			break;
		case 3:
			System.out.println("�������Դϴ�");
			break;
		case 4:
			System.out.println("������Դϴ�");
			break;
		case 5:
			System.out.println("�ݿ����Դϴ�");
			break;
		case 6:
			System.out.println("������Դϴ�");
			break;
		}
		*/
		
		
		
		
		
		
		
	}

}




