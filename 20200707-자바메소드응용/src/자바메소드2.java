// ���� ���� ���� => ����, ���, ����
import java.util.*;
public class �ڹٸ޼ҵ�2 {
	// �Է�
	static int userInput(String subject)
	{
		Scanner scan=new Scanner(System.in);
		System.out.print(subject+" �����Է�:");
		int score=scan.nextInt();
		return score;
	}
	
	static int total(int kor, int eng, int math)
	{
		return kor+eng+math;
	}
	
	static void avg(int total)
	{
		System.out.printf("���:%.2f\n",total/3.0);
	}
	
	static void hakjum(int total)
	{
		int score=total/3;
		if(score>=90)
			System.out.println("����:A");
		else if(score>=80)
			System.out.println("����:B");
		else if(score>=70)
			System.out.println("����:C");
		else if(score>=60)
			System.out.println("����:D");
		else
			System.out.println("����:F");
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int kor=userInput("����");
		int eng=userInput("����");
		int math=userInput("����");
		int total=total(kor,eng,math); //������=�޼ҵ��
		
		
		//c���
		System.out.println("��������:"+kor);
		System.out.println("��������:"+eng);
		System.out.println("��������:"+math);
		System.out.println("����:"+total);
		avg(total);
		hakjum(total);
				
	}

}
