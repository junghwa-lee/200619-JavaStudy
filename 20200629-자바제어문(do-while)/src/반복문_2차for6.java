/*
 *   *
 *   **
 *   ***
 *   ****
 *   *****
 *   =>  ����ڰ� �Է��� ����(�ټ�)��ŭ ��� 
 *   
 *   	[1,1][1,2][1,3][1,4][1,5]
		[2,1][2,2][2,3][2,4][2,5]
		[3,1][3,2][3,3][3,4][3,5]
		[4,1][4,2][4,3][4,4][4,5]
		[5,1][5,2][5,3][5,4][5,5]

 *   
 */
import java.util.*;
public class �ݺ���_2��for6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		int user=0;
		Scanner scan=new Scanner(System.in);
		System.out.print("���� �Է�:");
		user=scan.nextInt(); // => �ټ�
		for(int i=1;i<=user;i++)
		{
			for(int j=1;j<=i;j++) // j<=user+1-i
			{
				System.out.print("*");
			}
			System.out.println();
		}
		*/
		
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=5;j++)
			{
				System.out.printf("[%d,%d]",i,j);
			}
			System.out.println();
		}
		
		
		
		
		
	}

}
