package com.sist.io;
//���� ���ε� (���� Copy) page880
import java.util.*;
import java.io.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class MainClass5 extends JFrame implements ActionListener{
	JTextField tf=new JTextField(25); //�гξȿ� �����Ҷ�->ũ������
	JButton b=new JButton("���ϼ���");
	public MainClass5()
	{
		JPanel p=new JPanel();
		p.add(tf);
		p.add(b);
		add("Center",p);
		setSize(450, 250);
		setVisible(true);
		b.addActionListener(this); // this:�ڽ�
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new MainClass5();
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==b) // b��ư�� Ŭ���ߴٸ� 
		{
			JFileChooser jc=new JFileChooser();
			if(jc.showOpenDialog(this)==jc.APPROVE_OPTION) //'����'��ư ��������?
			{
				tf.setText(jc.getSelectedFile().getPath()); // getpath :���� ��� �б�
				try
				{
					FileInputStream fis=new FileInputStream(tf.getText());
					FileOutputStream fos=new FileOutputStream("c:\\upload\\"+jc.getSelectedFile().getName());
					
					int i=0;
					byte[] buffer=new byte[1024];
					while((i=fis.read(buffer, 0, 1024))!=-1)
					{
						fos.write(buffer, 0, i);
						// i-> ���� ����Ʈ ��						
					}
					fis.close();
					fos.close();
					JOptionPane.showMessageDialog(this, "���� ���ε� �Ϸ�");
				}catch(Exception ex) {}
					
				}
			}
		}
	}


