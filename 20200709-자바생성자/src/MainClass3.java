import javax.swing.*;
/*
 *   class JFrame{
 *   }
 *   
 *   1 void aaa()
 *   2 int aaa(int a)
 *   3 double aaa()
 *   4 char aaa(char c)
 *   	1,3�� �����Լ� => error => return���� ����x
 *   
 *   ������ ==> �Ű������� ���� ��� => �ʱⰪ�� �׻� �����ϰ� ���� ���
 *   		   �Ű������� ���� => �ʱⰪ�� �����ؼ� ���
 *   
 *   �����ε�
 *   1 void aaa(double d, double d1, double d2)
 *   2 void aaa(char d, double d1, int d2) 
 *   3 void aaa(int d, float d1, double d2)
 *   4 void aaa(float d, double d1, double d2)
 *   
 *   	aaa(4.5, 'A', 100) => ��������(double, char, int) ���� -> ���� �� �ִ� ���� ã�� -> 1��  ����
 */
public class MainClass3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame f=new JFrame("aaa"); //�Ű�����=>������â ����
		f.setSize(300, 200);
		f.setVisible(true);
	
	}

}
