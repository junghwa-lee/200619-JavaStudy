import java.util.Scanner;

/*
 *   4. �� ���� ������ �޾Ƽ� �ִ밪, �ּҰ� ���
 *   
 *   int a, b
 *   int max, min
 */

import java.util.*;
public class �ڹ����ǹ�����4 {

	// 4. ���� a,b �Է¹޾� max, min ���
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		Scanner scan=new Scanner(System.in);
		System.out.println("�� ���� ���� �Է�:");
		int a=scan.nextInt();
		int b=scan.nextInt();
		int max,min;
		
		if (a>b)
		{
			max=a;
			min=b;
		}
		else
		{
			max=b;
			min=a;
		}
		
		System.out.println("max="+max);
		System.out.println("min="+min);
		*/
		
		
  // 5. ������ �Է� �޾� ���밪�� ����ϴ� ���α׷�
  //	 1, -1 ==> 1
		
		Scanner scan=new Scanner(System.in);
		System.out.print("���� �Է�:");
		int a=scan.nextInt();
		if(a<0)
		{
			System.out.println(-1*a);
		}
		else
		{
			System.out.println(a);
		}
		
		//System.out.println("���밪:"+Math.abs(a));
	}

}
