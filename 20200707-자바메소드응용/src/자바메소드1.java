/*
 *   �޼ҵ� : �� ���� ��ɸ� ���� -> ������ �ٽ� ��� ����
 *    - ���� 
 *        1) ����
 *        2) �ݺ� ����
 *    - ����
 *        ��ȯ���� ���� ��� : void
 *        �Ű������� ���� ��� (�Ű����� : ����ڰ� ��û�� ��)
 *        ��ȯ���� �ִ� ��� : ����ڰ� ��û�� ������ ����� => �ݵ�� 1���� ����
 *        �Ű������� �ִ� ��� => ID �ߺ�üũ(id), �����ȣ �˻�(��, ��), �α���(id, pwd)
 *        					���� �� => �迭, Ŭ����
 *        
 *        ��ȯ��(������) �޼ҵ��(�Ű�����,�Ű�����..)
 *        {
 *        		���� => return 
 *        }
 *        
 *        void process()
 *        {
 *        	if(key==ENTER)
 *        	{
 *        		return;//�������� => �� �������� ����ϴ°��� �ƴ�
 *        		System.out.println(); => ����
 *        	}
 *        	����
 *        	return; => return ���� �ؿ��� �ҽ� �ڵ��� �� �� ����
 *        }
 *        
 *        �� ���� (break, continue, return) 
 *          => �ؿ� �ҽ� �ڵ� x
 *       
 *     - ȣ��
 *     	 int add(int a,int b) {
 *     		return a+b; }
 *       => int a = add(10,20)
 *     	 
 *       
 *       void add(int a, int b)
 *        => add(10,20)
 *       
 *       ȣ��ø��� �޼ҵ� ó������ return���� ���� => �ٽ� ȣ���� ��ġ�� ���ƿ�
 *        
 */
// ����ڰ� �⵵�� �Է��ϸ� ���⿩��Ȯ��
// ������ �ٽ� ����� �� �ִ°�? => ���� ���� modify(�������̵�) , �߰� ���� new(�����ε�)
import java.util.*; 
public class �ڹٸ޼ҵ�1 {
	// �޼ҵ� 2�� 
	//����� ���� �Է�
	static int userInput()
	{
		Scanner scan=new Scanner(System.in);
		System.out.print("������ �Է�:");
		int year=scan.nextInt();
		return year;
	}
	//���� ���� Ȯ��=>����
	static boolean isYear(int year)
	{
		boolean bCheck=false;
		if((year%4==0 && year%100!=0) || (year%400==0))
		{
			bCheck=true;
		}
		else
		{
			bCheck=false;
		}
		return bCheck;
	}
	
	
	public static void main(String[] args) {
		/*
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.print("������ �Է�:");
		int year=scan.nextInt();
		
		if((year%4==0 && year%100!=0) || (year%400==0))
		{
			System.out.println(year+"�⵵�� �����Դϴ�");
		}
		else
		{
			System.out.println(year+"�⵵�� ������ �ƴմϴ�");
		}
	*/
		
	int year=userInput();
	boolean bCheck=isYear(year);
	if(bCheck==true)
		System.out.println("�����Դϴ�");
	else
		System.out.println("�����̾ƴմϴ�");	
		
		
		
		
		
		
		
	}

}
