/*
 *    ���� => 
 *         ��� : ������� �� �� ����
 *              int + int = int
 *              double + double = int
 *              float + long = float
 *         ==================
 *         �� : true/false
 *         �� : true/false
 *         ==================  ���ǹ� (if)
 *         ����
 *         
 *    �񱳿����� : ���� ���� �� => ����, �Ǽ�, ����, ��
 *    			���ڿ��� ���� �� ����
 *              "Hello" == "Hello" ===> equals()
 *              ==> ���ڿ��� �����ϴ� �������� => String
 *              char c='Hello' (x)  char�� �ѱ��ڸ� ����
 *              String s="Hello" (o)
 *      1) ����
 *          == ����            => 10==20 (false)
 *          != �����ʴ�   	=> 10!=20 (true)
 *          <  �۴�	    => 10<10 (false)
 *          >  ũ��		=> 10>10 (false)
 *          <= �۰ų� ����  => 10<=10 (true)
 *          >= ũ�ų� ����  => 10>=10 (true)
 *        
 *      2) ����� : boolean
 *      
 */
public class ���׿�����_�񱳿����� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=10;
		int b=9;
		char c='A';
		System.out.println(c++);//c�� ����(x)
		System.out.println(c);//c�� ����(o)
		//System.out.println(++b==a); //b=11
		System.out.println(b++==a); //b=9
		System.out.println(10==20); //false
		System.out.println(10!=20);//true
		System.out.println(10<10);//false
		System.out.println(10>10);//false
		System.out.println(10<=10);//true
		System.out.println(10>=10);//true
		
		System.out.println('A'==65);
		//char�� ��������ϸ� ������ ��ȯ�ȴ� 
		
	}

}
