package com.sist.exception;
/*
 *   ����ó�� ==> ����Ǵ� ������ ���� �� �ִ� ���
 *   try 
 *   {
 *   	���������� ����Ǵ� ����
 *   }catch(����Ǵ� ����Ŭ����)
 *   {
 *   	����ó��
 *   }
 *   catch(����Ǵ� ����Ŭ����)
 *   {
 *   	����ó��
 *   }
 *   catch(����Ǵ� ����Ŭ����)
 *   {
 *   	����ó��
 *   }
 *   
 *   ��catch�� ���� �� ���ÿ��� ������ ����
 *     (���������ϼ��� �������� ���)
 *   
 *   ����ó�� ���� ����
 *   	�ֻ��� Ŭ���� => ��� Ŭ������ ���� Ŭ����
 *       
 *        	Object
 *         	  |
 *         Throwable
 *      -----------------
 *      |				|
 *    Error		 	Exception
 *   				    |
 *   			 -----------------
 *   			|				  |
 *   	  IOException
 *   	  SQL"
 *        ClassFound "
 *        MalformedURL "
 *        Interrupted  "
 *       ================         |
 *        checkException      RuntimeException
 *        	                      |
 *                            NumberFormatException
 *                            Arithmetic "
 *                            NullPointer "
 *                            ArrayIndexOutOfBounds "
 *                            ClassCast "
 *                           ========================
 *                             uncheckException
 *                            
 */
public class MainClass4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
			//catch(RuntimeException e)// �Ʒ��� ������ ��� ó���Ҽ��ִ� �����̹Ƿ� �� �Ʒ��� ����Ѵ�
			
			int[] arr=new int[2];
			arr[0]=100;
			arr[2]=2; // error ==> Array..-> Runtime -> Exception -> Throwable
			
		
		  
		}
		catch(NumberFormatException e) 
		{
			System.out.println("������ȯ �ȵ�");
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("�迭���� ��� ���");
		}
		catch(ArithmeticException e)
		{
			System.out.println("0���� ���� ���");
		}
		catch(RuntimeException e)//���� ���ߴ� ���� �߻� ==> ó��
		{
			System.out.println("����� ��� ������ ó��");
		}
		catch(Exception e) // exception ��� ó������
		{
			System.out.println("������ ������ ��� ������ ó��");
		}
		catch(Throwable e) // error, exception ��� ó�� ����
		{
			System.out.println("���ܿ� ���� ���ÿ� ó��");
		}
		
	}

}
