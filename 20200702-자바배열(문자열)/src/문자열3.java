/*
 *  ���ڿ��� ������ �� �ִ� ���� : String
 *  String : �Ϲݺ����� ����
 *           Ŭ������ ���� => ���(�޼ҵ�)
 *           
 *           �ֿ� ��� 
 *            = ���ڿ� �� : equals()
 *            = ���� ���� : contains()
 *            = ���ڿ��߿� �� �� ���� : charAt()
 *            = ����� ������ ���� : length()
 *            = ���� �ڸ��� : substring()
 *            = ã�� ������ ��ġ : indexOf(), lastIndexOf()
 *            = ��� ���������� ���ڿ��� ��ȯ => valueOf()
 *            = ���鹮�� ���� : trim() => �¿츸 ����
 *              " Hello Java " => "Hello Java"
 *            =  ���ڿ� -> char[] => toCharArray()
 *            = startsWith, endsWith => �˻��� 
 *            
 *            ============================
 *            Wrapper Class
 *            �⺻�� ������(����,�Ǽ�,����,��)
 *            int -> Integer  / parseInt("2")=>2
 *            double -> Double
 */
// substring : �ʿ��� ���ڸ� ���� => ���¼� �м� (���, �����, �λ�)
/*	
 * 	 substring(int start)  => start Index���� ������ ��� (0������ ����)
 *   substring(int start, int end) => start index ���� end index -1 ���� ���
 *   
 *   "Hello Java"
 *    ----------
 *    0123456789
 *    substring(6) => Java
 */
public class ���ڿ�3 {
	public static void main(String[] args) {
	//String msg="0123456789";
	//System.out.println(msg.substring(5));
	//System.out.println(msg.substring(3));
	//System.out.println(msg.substring(3,6));
	
	String msg="100-010";
	System.out.println(msg.substring(0,3));
	System.out.println(msg.substring(4,7));
	
	
	
	
	
	}
}
