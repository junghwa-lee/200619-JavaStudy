// updown���� ==> �߸��� �Է� => �������
// ���� => �Է� ���� => continue  
//        ���� ���� => break
// ���ڸ� ���� ������ ������ ��� => while

import java.util.*;
public class �ݺ����_break_continue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// ������ ���ڸ� ���� => ����(com)
		int com=(int)(Math.random()*100)+1;
		// 1~100 ���� ������ �� ����
		
		// main=> ���� �Ұ���
		// ���α׷��� ���α׷��Ӱ� ����� �� ������ ����
	    // ���ѷ��� => Ƚ���� �������� ���� ��� (while)
		Scanner scan=new Scanner(System.in);
		while(true)
		{
			System.out.print("1~100 ������ �����Է�:");
			int user=scan.nextInt();
			
			if(user<1 || user>100)
			{
				System.out.println("�߸��� �Է°��Դϴ�");
				//ó������ �ٽ� ����
				continue;
			}
			
			//�������
			//��
			if(user>com)
			{
				System.out.println("�Է°����� ���� ������ �Է��ϼ���");
			}
			else if(user<com)
			{
				System.out.println("�Է°����� ���� ������ �Է��ϼ���");
			}
			else
			{
				System.out.println("Game Over!!");
				break; 
				//�ݺ��� ����
			}

		}
		
		
		
	}

}
