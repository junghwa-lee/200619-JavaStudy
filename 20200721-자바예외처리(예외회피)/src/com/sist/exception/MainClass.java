package com.sist.exception;
/*
 *   ����ȸ��
 *    - ������ ���� ������ �����ϰ� ����� ==> API(�ڹ�,���̺귯��)
 *      ��κ��� ���α׷��� ����ó�� (try~catch)
 *    - ���α׷��Ӱ� ����ó���� ���� ���α׷��� �°� ó�� ����
 *    ����) 
 *        �޼ҵ�() throws ������ ���� Ŭ���� ���
 *        ex) public void display() throws Exception,ArrayIndexOfBoundsException,NumberFormatException..
 *            {
 *            }
 *            ==> ���� ���� ���� ����
 *    - ���� ó���� ȣ���ϴ� �޼ҵ忡�� ó��       
 *     
 */
public class MainClass {
	public int div(int a,int b) throws Exception
	{							// ArithmeticException => ����ó������ ����(RuntimeException)
							  // Exception => checked + unchecked(Runtime) �̹Ƿ� ����ó�� �ؾ���
		return a/b; // ���� ���� => 0���� ������ ���� �߻��� �� �ִ�
		            // ���α׷��Ӱ� ���� ����ó���ϰ� ����ؾ���
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MainClass m=new MainClass();
		int res=0;
		try {
			res = m.div(10, 2);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		System.out.println(res);
	}

}
