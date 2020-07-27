package com.sist.lib;
/*
 *   ArrayList ����, Vector ����, Map
 *   
 *    List ->  ArrayList, Vector, LinkedList
 *    
 *    ArrayList => ���ټ��� ���� / LinkedList => ���ټ��� ���� ����
 *    (���ټ� : ������ ã�Ƽ� ���)
 *    
 *    ArrayList => ����ȭ(����)   / Vector => �񵿱�ȭ
 */
import java.util.*;
public class MainClass2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//ArrayList<String> names=new ArrayList<String>();
		//Vector<String> names=new Vector<String>();
		LinkedList<String> names=new LinkedList<String>();
		// ==> ArrayList, Vector, LinkedList ���ϸ޼ҵ� => ��� �����ϰ� �۵�
		
		//=> names �޸� �ȿ��� ���ڿ��� ����
		names.add("ȫ�浿"); //0
		names.add("��û��"); //1
		names.add("�̼���"); //2
		names.add("������"); //3
		names.add("������"); //4
		
		System.out.println("����� ����:"+names.size());
		// ���
		for(int i=0;i<names.size();i++)
		{
			// �����͸� ������
			String name=names.get(i); // get(i) => ���ϴ� ��ġ�� ����� ������ �б�
			
			System.out.println(name+":"+i); // �ε����� �ڵ����� -> 0������ ����
		}
		
		System.out.println();
		
		// ���ϴ� ��ġ�� ���
		// add() => 5
		// add(index, "��");
		names.add(3, "��������");
		for(int i=0;i<names.size();i++)
		{
			String name=names.get(i); 
			System.out.println(name+":"+i); 
		}
	
		System.out.println();
		
		// ���� remove()
		names.remove(2);  
		for(int i=0;i<names.size();i++)
		{
			String name=names.get(i); 
			System.out.println(name+":"+i); 
		}
		
		System.out.println();
		
		// ���� set()
		names.set(2, "�ڹ���");
		for(int i=0;i<names.size();i++)
		{
			String name=names.get(i); 
			System.out.println(name+":"+i); 
		}
		
		System.out.println();
		
		//��ü���� clear()
		names.clear();
		System.out.println("����� ����:"+names.size());
		
		
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
