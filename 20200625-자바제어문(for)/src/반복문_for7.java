/*
 *    for => Ƚ���� ������ �ݺ���
 *    => UPDOWN ����
 *    => ��ǻ�Ͱ� 1~100������ ���� �߻�
 *    => ����ڰ� ���� ���ߴ� ����
 *       ��Ʈ : ���� , ����
 */
import java.util.*; // ����� �Է�
/* 
 *      1. ��ǻ�Ͱ� ���� �߻� (1~100)
 *      	(int)(Math.random()*100)+1
 *      -----------------
 *      2. ����� �Է� 
 *      3. �Է��ϸ� => ��Ʈ
 *      4. ���Ῡ��
 *      -----------------> ���ѷ���
 */
public class �ݺ���_for7 {
 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int com=(int)(Math.random()*100)+1; //1~100���� ���� �߻�
		Scanner scan=new Scanner(System.in);
		int count=0;
		
		for(;;) // ���ѷ��� => while(true)
		{
			System.out.print("1~100������ ���� �Է�:");
			int  user=scan.nextInt();
			if(user<1 || user>100)
			{
				System.out.println("�߸��� �Է��Դϴ�!");
				continue; //ó������ �ٽ� ���ư���
				// for => ���������� �̵�
			}
			
			// ���������� �Է��� �� ����
			count++;   // �ݺ��� Ƚ�� ����
			// ��
			if(com>user)
			{
				System.out.println("�Էµ� ������ ���� ���� �Է��ϼ���");
			}
			else if(com<user)
			{
				System.out.println("�Էµ� ������ ���� ���� �Է��ϼ���");
				
			}
			else
			{
				System.out.println("Game Over!!");
				System.out.println("�Է�Ƚ��:"+count);
				break;
			}
			
		}
		
		System.out.println("���α׷� ����");
		
		
	}

}
