import javax.swing.*;
/* 
 *  �����쳻���� ���� => ���
 *  class A extends JFrame
 *  
 *  �ִ� �״�� => ����
 *  class A
 *  {
 *  	JFrame f=new JFrame();
 *  }
 *  
 *  �� �ڹ��� ��� Ŭ������ ���(����)
 *    class MainWindow2 (extends Object)
 *    						     ------
 *    							 ��� Ŭ������ ����� �޾Ƽ� ó��
 */

//���
public class MainWindow extends JFrame{
	//�������ڸ��� => ������ ����
	// ������
	public MainWindow()
	{
		//������ ȭ�� ����
		setSize(800, 600); //JFrame=>�޼ҵ� => ���
		setVisible(true);
	}
	public static void main(String[] args) {
		// ������ 
		new MainWindow();
	}
}
