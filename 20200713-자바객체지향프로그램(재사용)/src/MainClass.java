/*
 *   ���� => ������ ������� Ŭ������ ��� (�ݺ��ڵ� ����)
 *     1) ��� (is-a)
 *        �̹� ������� ����� �����ؼ� ���
 *        
 *        public class MyWindow extends JFrame  ==> ���
 *        						-------
 *        						Ȯ��� Ŭ����
 *        		JFrame (����Ŭ����)
 *        		  ��
 *        	   MyWindow
 *        
 *        *** �ڹ� ����� ���� ���
 *        	   ���� ����� �ʿ��� ��� ���� ���� ���
 *        
 *         �� ����� ���� : private
 *         			  static => ��븸 ������ �� ����� �������� ����
 *         
 *         �� String, Math, System, Scanner : ��� �Ұ� Ŭ����(final)
 *        
 *          
 *          
 *     2) ���� (has-a)
 *        �̹� ������� ����� ������� �״�� ���
 *        public class MyWindow
 *        {
 *        	 JFrame f=new JFrame(); ==> ����Ŭ���� 
 *        }
 *        
 */
/*
 * 	   AŬ������ ������ �ִ� ��� ���� ��� => ����(private, static, ������)
 *     public class A
 *     {
 *     	  private String name;
 *        int age;
 *        public void display();
 *     }
 *     
 *     public class B extends A
 *     {
 *        int age;
 *        public void display();
 *        =======================> ������ ������ �ڵ����� ����� ���
 *     }
 *     
 *   
 *         
 *     
 */
import javax.swing.*;
public class MainClass extends JFrame {
	/*
	 * public MainClass() { // �����ڴ� �������̸� public �޼���� �����
	 * 
	 * }
	 */
	public MainClass() {
		//���
		super.setSize(300, 300); //����Ŭ���� JFrame �޼ҵ� ȣ��
		this.setVisible(true); //�ڱ�Ŭ���� MainClass �޼ҵ� ȣ�� (this ��������)
		 					   //==> ����̹Ƿ� ���� ���
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new MainClass();

	}

}
