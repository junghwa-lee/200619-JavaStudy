/*
 * 	3. ����������
 *    ����� �Է� ==> 0 or 1 or 2
 *    
 *    => 0�̸� => ����
 *    => 1�̸� => ����
 *    => 2�̸� => ��
 *    
 *    
 *    == ����, �Ǽ�, ������ ��� ���
 *    "" ���ڿ��� ==���� �� �Ұ��� => equals()
 *    
 */
import java.util.*;

public class �ڹ����ǹ�����3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.print("����(0),����(1),��(2) �Է�:");
		
		//�����
		int user=scan.nextInt();
		if(user==0)
	     { 
			System.out.println("����");
	     }
		if(user==1)
		{
			System.out.println("����");
		}
		if(user==2)
		{
			System.out.println("��");
		}
			
	    //��ǻ��
		int com=(int)(Math.random()*3);
		//        	  -------------
		//				0.0~0.99 	==> *3 ==> 0.0~2.9... ===> 0~2 (int��ȯ)
		if(com==0)
		{
			System.out.println("��ǻ��:����");
		}
		if(com==1)
		{	
			System.out.println("��ǻ��:����");
		}
		if(com==2)
		{
			System.out.println("��ǻ��:��");
		}
		
		// ����� 
		
		// �� 9���� ����� ��
		/*  com-user
		*    com 		user
		 *     0		 0  
		 *     			 1
		 *     			 2
		 *     1		 0
		 *     			 1
		 *     			 2
		 *     2		 0
		 *     			 1
		 *     			 2
		 */
		
		// �ߺ� ���ǹ�
		// ��ǻ�� : ����
		/*
		if(com==0)
		{
			if(user==0)
			{
				System.out.println("����!!");
			}
			if(user==1)
			{
				System.out.println("Player Win!!");
			}
			if(user==2)
			{
				System.out.println("Computer Win!!");
			}
		}
		// ��ǻ�� : ����
		if(com==1)
		{
			if(user==0)
			{
				System.out.println("Computer Win!!");
			}
			if(user==1)
			{
				System.out.println("����!!");
			}
			if(user==2)
			{
				System.out.println("Player Win!!");
			}
		}
		// ��ǻ�� : ��
		if(com==2)
		{
			if(user==0)
			{
				System.out.println("Player Win!!");
			}
			if(user==1)
			{
				System.out.println("Computer Win!!");
			}
			if(user==2)
			{
				System.out.println("����!!");
			}
			*/
		
		
		if(com-user==2 || com-user==-1)
		{
			System.out.println("Player Win!");
		}
		if(com-user==1 || com-user==-2)
		{
			System.out.println("Computer Win!");
		}
		if(com-user==0)
		{
			System.out.println("����!");
		}
		}
	

}

