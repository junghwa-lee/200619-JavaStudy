/*
 *     �ݺ����
 *       - break ==> �ݺ��� ������ ��
 *       - continue ==> Ư���κ��� �����ϰ� ���� ���
 *       ==> ���ǹ��� ���� ���(if)
 *       
 *       �� break, continue�� �� ���� �ݺ����� ����
 *         break => �ݺ��� ��ü (for, do~while, while), switch
 *         continue => �ݺ��������� ���
 *         return => ����(�޼ҵ� ����)
 		   return; // return�� ���� ��쿡 JVM�� �ڵ����� �߰�
 		   
 		   break => for, while, do~while ����
 		   continue => while (���ǽ����� �̵�),
 		   			   for (���������� �̵�)
 		   			   
 		   			   for(int i=1;i<=10;i++)
 		   			   {
 		   			   		if(i==6)
 		   			   			continue;
 		   			   }
 		   			   
 		   			   	int i=1;
 		   			   	while(i<=10)
 		   			   	{
 		   			   		if(i==6)
 		   			   			continue; 
 		   			   		i++;
 		   			   	}
 */

public class �ݺ����_break {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=1;i<=10;i++)
		{
			System.out.print(i+" "); // ���๮���� ���� ���� ��� ��� �� ����
			//5�϶�
			if(i==5)
				//����
				break;   // i==5�� �ݺ��� ����
		}	
		
		
		System.out.println("\n===== ���ǹ� =====");
		
		// 1~10���� Ȧ���� ���
		// 1) ���ǹ�
		for(int i=1;i<=10;i++)
		{
			if(i%2!=0)
				System.out.print(i+" ");
		}
		
		// 2) ����=>2��
		System.out.println("\n===== 2������ =====");
		for(int i=1;i<=10;i+=2)
		{
				System.out.print(i+" ");
		}
		
		// 3) continue ���
		System.out.println("\n===== continue =====");
		for(int i=1;i<=10;i++)
		{
			if(i%2==0)
				continue;  			// ¦���� ���� ==> ������(i++)���� �̵�
			System.out.print(i+" ");
		}
		
		System.out.println("\n===== while =====");
		
	/*	int i=1;
		while(i<=10)
		{
			if(i%2==0)
				continue;
			System.out.println(i+" ");
			i++;
		}  
		==> ���ѷ���
		*/
		
		

	}

}
