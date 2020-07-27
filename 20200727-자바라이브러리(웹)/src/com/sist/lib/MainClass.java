package com.sist.lib;
/*
 *  ���̺귯�� -> import 
 *  -------
 *   1. java.lang
 *      = Object : �ֻ��� Ŭ����
 *        - clone() : ����
 *        - finalize() : �Ҹ���
 *        - toString() : ��ü�� ���ڿ��� ��ȯ
 *      = String (StringBuffer) 
 *        - substring() : ���ڸ� ����
 *        - indexOf(), lastIndexOf() : ���ڸ� ã�� ��� (MVC)
 *        - trim() : �α��� ó��, ����� �Է°�
 *        - equals() : ���� ����� ���ڿ��� �� => �α��� ó��, �����ȣ �˻�...
 *        - length() : ���� ����
 *        - valueOf() : ������ static => ��� ���������� ���ڿ��� ��ȯ
 *        - join() : ��ȯ
 *        *** StringBuffer : append() => ���ڿ� 
 *      = Wrapper : Ŭ���� ����ȯ, ���ڿ��� �ٸ� ������������ ����
 *        - Integer : parseInt() => ��������ȯ
 *        - Double : parseDouble() => �Ǽ�����ȯ
 *        - Boolean : parseBoolean() => "true" -> true, "false" -> false
 *      = Math
 *        - random()
 *        - ceil() : �ø� => ��������
 *      = System
 *        - gc() : �޸� ȸ��
 *        - exit() : ���α׷� ����
 *        �� web => �ڵ� �޸� ȸ�� (ƴĹ)
 *      
 *   2. java.util
 *      = StringTokenizer : ���ڸ� ���� => split() -> ���Խ�
 *        - nextToken() : �� ���� ���й��ڸ� �ڸ�
 *        - hasMoreTokens() : �ڸ� ������ŭ ����
 *      = Date, Calendar
 *        - Date : �ý����� �ð�, ��¥ �б�
 *        		   Date date=new Date() ==> date.toString()
 *        - Calendar : ���ϱ��ϱ�, ���� ������ ��¥ �б�
 *        			 	��¥ ��� => �� : month-1
 *        						    ���� : week-1
 *      = Collection 
 *        - ArrayList : �񵿱�ȭ => �����ͺ��̽� 
 *        - Vector : ����ȭ => ��Ʈ��ũ���� ����� ���� (��Ʈ��ũ)
 *        - HashMap : Ű(�Ϲݹ��ڿ�) , ��(Ŭ���� �ּҰ�) ==> Ŭ���� ����
 *            -> MyBatis(Mapper : �����ͺ��̽� ����), Spring(Web)
 *        �� ���� : ��� Ŭ����, �����͸� �ѹ��� ���� => Object => ����ȯ
 *          ������ ���� => ���׸��� ���α׷� : <���ϴ� ��������>   
 */
import java.util.*;
import java.text.*;  // ����08                                          ��ȯ(�ð�, ��¥) => SimpleDateFormat()
// yyyy ���� => yy , �� => M(MM), �� =>dd(d), �ð� => hh(h), ��(mm) , ��(s)

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Date date=new Date();
		System.out.println(date.toString()); //ǥ�ؽð� �о�´�
		//��ȯ
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
		System.out.println(sdf.format(date));
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
