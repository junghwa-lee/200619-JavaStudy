/*
 *    �� ������
 *    1) while�� ������ ���� ��� error  
 *       while() 
 *       {
 *       }  => ���ǽ� x => �����߻�
 *    2) while���� ���ѷ���
 *       => while(true) : ���� ���� ���� 
 *  ------------------------------------------     
 *     > for��
 *       	for(int i=0;i<10;i++)
 *       
 *     > while��
 *       	int i=0;
 *       	while(i<10)
 *      	{
 *       		i++;
 *       	}
 *  ------------------------------------------     
 *      int i=5;
 *      while(--i!=0) ==> i>=0
 *      {
 *      	system.out.println(i); ==> i--;
 *      }
 *       
 */
//����ڰ� �Է��� �������� ���� �� ���ϱ�
import java.util.*;
public class �ݺ���_while5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int user=0; // ����ڰ� ��û�� ����
		int i=1;  // ����ڰ� ��û�� �������� ���� ( �������� )
		int sum=0; // ���� ���� �����ϴ� ����
		
		Scanner scan=new Scanner(System.in);
		System.out.print("�����Է�:");
		user=scan.nextInt();
		
		i=1;
		while(i<=user)
		{
			sum+=i;
			i++;	
		}
		System.out.println("sum="+sum);
		
		
		i=1; //�����ʱ�ȭ
		while(i<=5)
		{
			System.out.print(i);
			i++;
		}	
		// i=6
		System.out.println();
		
		i=5;
		while(i>=1)
		{
			System.out.print(i);
			i--;
		}
		// i=-1
		
		
		
	
	
	
	}
	
	
	

}
