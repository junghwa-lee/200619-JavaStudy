import java.util.Scanner;

/*  *     2. ���� 3�� �Է¹޾Ƽ� ����, ���, 
 *         				 ���� => ���ǹ� (60�̻� D, 70�̻� C, 80�̻� B, 90�̻� A ������ F)
 *         => �������� :80
 *            �������� :80
 *            �������� :80
 *            
 *            ���� :240
 *            ��� :80.0
 *            ���� : B
 */

public class �ڹ����ǹ�����2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("�������� �������� �������� �Է�:");
		int kor=scan.nextInt();
		int eng=scan.nextInt();
		int math=scan.nextInt();
		int total=kor+eng+math;
		double avg=total/3.0;
		char score='A';
		if(avg<60)
		{
			score='F';
		}
		if(avg>=60 && avg<70)
		{
			score='D';
		}
		if(avg>=70 && avg<80)
		{
			score='C';
		}
		if(avg>=80 && avg<90)
		{
			score='B';
		}
		if(avg>=90 && avg<100)
		{
			score='A';
		}
		
		System.out.println("����:"+total);
		System.out.printf("���:%.2f\n",avg); // �Ҽ��� ���� �� 
		System.out.println("����:"+score);
	}

}
