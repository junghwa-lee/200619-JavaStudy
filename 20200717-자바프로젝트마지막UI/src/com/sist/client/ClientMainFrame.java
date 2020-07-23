package com.sist.client;
// ������ ��ü => JFrame
// ������� ���õ� Ŭ������ �о�´�

import javax.swing.*; // ���������
import java.awt.*; // color, layout
import java.awt.event.*; // interface
/*
 *   ����
 *    - ��� (is-a) : ������ Ŭ������ �����ؼ� ���
 *    - ���� (has-a) : ������ Ŭ������ ������� ���
 *     
 *   
 */
public class ClientMainFrame extends JFrame implements ActionListener{
	// ������ ũ�� ���� ==> �����ڿ��� (291page)
	JLabel title=new JLabel("������ & ���� ��õ����Ʈ",JLabel.CENTER);
	MenuForm mf=new MenuForm();
	ChatForm cf=new ChatForm();
	ControlPanel cp=new ControlPanel();
	
	public ClientMainFrame()
	{
		/*
		 *  Ŭ�������� ������ ��� => ������ �ƴ϶� ������ ��
		 *  ��)
		 *   �����ͺ��̽� : ����Ŭ ����
		 *   ��Ʈ��ũ : ���� => IP,PORT => �ڵ���(����)
		 *   �� : ��Ű���� ���б� => �ڵ� �α���
		 */
		// Ÿ��Ʋ ��ġ
		title.setFont(new Font("����ü",Font.BOLD,55));
		//title.setOpaque(true);
		//title.setBackground(Color.GREEN);
		setLayout(null); //JFrame (BorderLayout) ����� ���Ƿ� ��ġ => (null)
		title.setBounds(10, 15, 1570, 100);
		add(title); // �����쿡 �߰�
		// �޴� ��ġ
		mf.setBounds(10, 120, 100, 300);
		add(mf);
		// ä����
		cf.setBounds(115, 760, 1465, 200);
		add(cf);
		// ���ȭ��
		cp.setBounds(115, 120, 1465, 635);
		add(cp);
		
		setSize(1600, 1000);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);// X��ư Ŭ�� => ����
		
		mf.b1.addActionListener(this);
		mf.b2.addActionListener(this);
	}
	
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		// �����ڴ� ȣ��ÿ� �ݵ�� ==> new ������()
		UIManager.setLookAndFeel("com.jtattoo.plaf.mcwin.McWinLookAndFeel"); // +build path
		new ClientMainFrame();
	}
	
	public static Image getImage(ImageIcon ii,int w,int h)
    {
    	Image dimg = ii.getImage().getScaledInstance(w, h,
    	        Image.SCALE_SMOOTH);
    	return dimg;
    } // ������ũ�⿡ �����

	@Override
	public void actionPerformed(ActionEvent e) {    // �޴��� ��ưó��
		// TODO Auto-generated method stub
		if(e.getSource()==mf.b1)
		{
			cp.card.show(cp, "DF");
		}
		else if(e.getSource()==mf.b2)
		{
			cp.card.show(cp, "LF");
		}
	}

}
