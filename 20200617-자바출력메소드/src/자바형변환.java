// ����ȯ => �ڽ��� ���������� �ٸ� ������ ������������ ��ȯ
/*
 *   ���� ����, ���� ó���� ���� �����ͳ����� ���� (ū �����ͷ� ���� �� ���)
 *   
 *         --------> upcasting (�ڵ�����ȯ)
			byte < short(char) < int < long < float < double 
	     			        	<----------downcasting (��������ȯ)			
 *          boolean : ����
 *   
 *   ���� => �Ǽ�, ����, ����               int a=(int)10L - ��������ȯ / long a=(long)10 => long a=10 - �ڵ�����ȯ
 *   							double d=(double)10 / double d=10
 *   							int a=(int)10.5 => a=10
 *   �Ǽ� => ����, ����
 *   ���� => ����, �Ǽ�                         ���� ) char a=65  
 *   
 *   ����) byte, short, char ������ ��� ������� ������ int
 *        
 *   
 *    10.5 + 10  => 10.5 + 10.0 �ڵ�����ȯ�Ǿ� ���
 *    
 */
public class �ڹ�����ȯ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * double d=5/2; 
		 * System.out.println("d="+d);  => 2.0 
		 * double d=5/(double)2; or double d=5/2.0;
		 * System.out.println("d="+d);  => 2.5
		 */
		
	}

}
