// ����ڰ� �Է� (����) ===> 2���� ���
// bit => 16bit ==> 32767
// 17�� ���� ==> 0 or 1 16�� + ����� �Է°� 1��
// 10 = 0000 0000 0000 1010  
//        -------------------> �����뵵 => �迭���
/*
 *   ����
 *     ���
 *     ����
 *     �ݺ�  = for (Ƚ�� ���� => �ڵ� ����)
 *         = while (��������� �ݵ�� �Է�) => break;
 *     ������ ������ ��� => ���, ����  
 *     		���ǹ� ��� => ��, ����, �� 
 */
import java.util.*;
public class �ڹٹ迭_�뵵3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] binary=new int[16];
		//0, 1�� ����
		//����ڰ� ��û�� ����
		int user=0;
		int index=15; // �ڿ������� ��� ==> �迭 ����
		
		Scanner scan=new Scanner(System.in);
		System.out.print("���� �Է�(0~32767):");
		user=scan.nextInt();
		
		System.out.println("==== Lib�̿� ====");
		System.out.println(Integer.toBinaryString(user));
		
		
		// while=> ����ڰ� �Է��� ���� ���� 2�� ������ Ƚ���� �޶��� => Ƚ�������ȵ�
		while(true) // ������� when? => break
		{
			binary[index]=user%2;
			user=user/2;
			if(user==0)break;
			index--;
		}
		
		// ��� ��� 
		for(int i=0;i<16;i++)
		{
			if(i%4==0 && i!=0) {
				System.out.print(" ");
			} // 4ĭ���� ����
			
			System.out.print(binary[i]);
		}
		
		
		
		
	}

}
