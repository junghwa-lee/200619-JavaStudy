package com.sist.string;
/*
 *   java.lang
 *     String / StringBuffer      
 *      - ���ڿ��� ��ü�� �ּ�  "Hello", "Java"...
 *      - String => char[]�� �����ؼ� ����ϱ� ���� ������� Ŭ���� 
 *        char[] -> �����ϴ� Ŭ����
 *      - �ֿ� ���(�޼ҵ�)
 *        �ν��Ͻ� �޼ҵ�
 *         - length() : ������ ����
 *         - trim() : �¿� ��������
 *         - substring() : ���ں���
 *         - indexOf(), lastIndexOf() : ������ ��ġ
 *         - equals () : ����� ���� �� => ��ҹ��� ����o
 *           equalsIgnoreCase() => ��ҹ��� ����x
 *         - ���� ã�� 
 *             ���� : contains ==> LIKE
 *             ���� : startsWith
 *              ��  : endsWith
 *        ==> ���� ���
 *            s1.length() , s2.length()..  
 *        ===================================== 
 *        static �޼ҵ� 
 *         - valueOf() : ��� �⺻���� ���ڿ��� ��ȯ      
 *        ==> �������� ��� 
 *            String.valueOf()
 */
public class MainClass {
	/*                                            
	 *   String s="0123456789"
	 *   s.substring(3,7) end-1
	 *   
	 *   &nbsp; ==> entity 
	 *   
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="background-image: url(' https://mp-seoul-image-production-s3.mangoplate.com/d8e852bf7058841a7a0694af93af1b9a.jpg ');";
		String temp=s.substring(s.indexOf("'")+1,s.lastIndexOf("'"));
		System.out.println(temp.trim()); //���� ���� ���� trim �� ����Ұ�
		
		String ss="���� ���عٴٸ� ���鼭 ���� �����ʹ�Ƽ. ���ĸԴ� �� ���� �䰡 �ÿ����� ������ �ƽ����� �� ���� �� ���ĸ� �����⿡ ������ �ʴ�. ������ġ��";
		if(ss.length()>20)
		{
			String sss=ss.substring(0,20)+"...";
			System.out.println(sss); //���� ���عٴٸ� ���鼭 ���� ������...
		}
		
		String s1="Hello";
		String s2="Hello";
		String s3=new String("hello");
		/*
		 *  equals : ��ҹ��� ����  => �α���, ���̵��ߺ�üũ
		 *  equalsIgnoreCase : ��ҹ��� ���� x => �˻�
		 *  
		 */
		/*
		 * if(s1==s3) 
		 * { 
		 * 		System.out.println("s1==s3"); 
		 * } 
		 * else 
		 * {
		 * 		System.out.println("s1!=s3");
		 *  }
		 * 
		 */
		/*
			if(s1.equals(s3))
			{
				System.out.println("s1==s3");
			}
			else 
			{
				 System.out.println("s1!=s3"); 
			}
		*/
		
		if(s1.equalsIgnoreCase(s3))
		{
			System.out.println("s1==s3");
		}
		else 
		{
			 System.out.println("s1!=s3"); 
		}
		
		
		
		
	}

}





