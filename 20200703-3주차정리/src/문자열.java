/*
 *   ���ڿ� => �����ϴ� ���� (String)
 *   �⺻�� => ����, �Ǽ�, ��, ����
 *   ������ => ���� ���� ��Ҵ� �ٸ� ���� �ְ� => ������ �ּ�
 *   ----
 *    = �迭, Ŭ����, ����� ���� Ŭ����
 *    
 *    1) ���� ���
 *         String s="��������"; ==> ���� ���
 *         String s=new String("")
 *    2) �ֿ� ���
 *         ���ڸ� ������ �� �ִ� ��� (�޼ҵ�) => ���̺귯�� �ٽ�
 *        	 �� ������ 
 *         	���� ������� �ʴ´�
 *        
 *        - length() : ���� ����
 *        - substring() : ���� �ڸ� ��
 *          substring(int start) => ���ڹ�ȣ
 *          substring(int start,int end) => end�� ���� start~end-1
 *       	  ��)
 *            String s="Hello Java ! !";
 *            			01234567891011
 *            s.substring(0,5) => Hello  , s="Hello Java!!"
 *            ==> s=s.substring(0,5) => s="Hello"
 *        - contains() => ���ڿ��߿� ���Ե� �ܾ�          
 *        - startsWith, endsWith : ������Ʈ(�ڵ� �ϼ���) - �˻��� ���� ��
 *          --------------------
 *            ���� : �˻��� ������ �����͸� ��Ƽ� ó��
 *            ��Ű, ����
 *        - trim() => �¿��� ���� ����
 *           String s=" Hello Java ";
 *           s.trim() --> "Hello Java"
 *           ��� ���� ���� => s.replace(" ","")
 *           => ����� �Է�â(�α���-> ID, PWD,ȸ������)
 *        - equals() => ���ڿ� ���� �� ���  
 *        				���� : ��ҹ��� ����
 *        - split() => ���ڸ� �����ؼ� �迭�� ����� ��
 *               --> ���й��ڸ� ����
 *        - replace, replaceAll => ���ڸ� ������ ���
 *            replace : �Ϲ�
 *            replaceAll : ���� (���Խ�)
 *        - valueOf() => ��� ���������� ���ڿ��� ����
 *        - toLowerCase() => �ҹ��� , toUpperCase() => �빮��
 */
import javax.swing.*;
import java.awt.event.*;
public class ���ڿ� extends JFrame implements ActionListener{
	JTextField tf=new JTextField();
	JTextField tf1=new JTextField();
	public ���ڿ�()
	{
		add("North",tf);
		add("South",tf1);
		//tf.setText(String.valueOf(20));
		
		setSize(350, 300);
		setVisible(true);
		
		tf.addActionListener(this); // tf���� ���� => actionPerformed ȣ��
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new ���ڿ�();
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==tf)//tf���� �Է� =>����
		{
			//tf1.setText(tf.getText().toUpperCase());
			tf1.setText(tf.getText().toLowerCase());
		}
		
		
	}

}
