package com.sist.util;
//Calendar ==> ����, ������ ��¥
// ��¥����
import java.util.*;
public class MainClass4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Ŭ���� ����
		Calendar cal=Calendar.getInstance(); // �̱��� ���� => �޸𸮸� �Ѱ��� ����
		//�ý����� ���� ��¥�� �о�´�
		/*
		���ó�¥
		System.out.println(cal.get(Calendar.YEAR));
		System.out.println(cal.get(Calendar.MONTH)+1); // month+1
		System.out.println(cal.get(Calendar.DATE)); 
		System.out.println(cal.get(Calendar.DAY_OF_WEEK)-1); // week-1
		int week=cal.get(Calendar.DAY_OF_WEEK)-1;
		*/
		String[] strWeek= {"��","��","ȭ","��","��","��","��"};
		/*
		System.out.println(strWeek[week]+"����");
		System.out.println(cal.getActualMaximum(Calendar.DATE)); // ���� ��������¥
		*/
		
		
		Scanner scan=new Scanner(System.in);
		System.out.print("�����Է�:");
		int year=scan.nextInt();
		
		System.out.print("�� �Է�:");
		int month=scan.nextInt();
		
		//System.out.print("�� �Է�:");
		//int day=scan.nextInt();
		
		cal.set(Calendar.YEAR,year);
		cal.set(Calendar.MONTH,month-1);
		//cal.set(Calendar.DATE, day);
		cal.set(Calendar.DATE, 1); // �޷¸���� -> 1������ ���� Ȯ��
		
		System.out.println(cal.get(Calendar.YEAR));
		System.out.println(cal.get(Calendar.MONTH)+1); // month+1
		System.out.println(cal.get(Calendar.DATE)); 
		System.out.println(cal.get(Calendar.DAY_OF_WEEK)-1);
		int week=cal.get(Calendar.DAY_OF_WEEK)-1;
		System.out.println(strWeek[week]+"����");
	}

}
