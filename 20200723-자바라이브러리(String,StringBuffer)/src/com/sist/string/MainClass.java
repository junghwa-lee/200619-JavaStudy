package com.sist.string;
/*
 *   java.lang
 *     String / StringBuffer      
 *      - 문자열은 자체가 주소  "Hello", "Java"...
 *      - String => char[]을 조작해서 사용하기 쉽게 만들어진 클래스 
 *        char[] -> 제어하는 클래스
 *      - 주요 기능(메소드)
 *        인스턴스 메소드
 *         - length() : 문자의 갯수
 *         - trim() : 좌우 공백제거
 *         - substring() : 문자분해
 *         - indexOf(), lastIndexOf() : 문자의 위치
 *         - equals () : 저장된 문자 비교 => 대소문자 구분o
 *           equalsIgnoreCase() => 대소문자 구분x
 *         - 문자 찾기 
 *             포함 : contains ==> LIKE
 *             시작 : startsWith
 *              끝  : endsWith
 *        ==> 따로 사용
 *            s1.length() , s2.length()..  
 *        ===================================== 
 *        static 메소드 
 *         - valueOf() : 모든 기본형을 문자열로 변환      
 *        ==> 공통으로 사용 
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
		System.out.println(temp.trim()); //공백 제거 위해 trim 꼭 사용할것
		
		String ss="예쁜 서해바다를 보면서 즐기는 애프터눈티. 조식먹는 곳 보다 뷰가 시원하지 않은게 아쉽지만 날 좋은 때 오후를 보내기에 나쁘지 않다. 샌드위치는";
		if(ss.length()>20)
		{
			String sss=ss.substring(0,20)+"...";
			System.out.println(sss); //예쁜 서해바다를 보면서 즐기는 애프터...
		}
		
		String s1="Hello";
		String s2="Hello";
		String s3=new String("hello");
		/*
		 *  equals : 대소문자 구분  => 로그인, 아이디중복체크
		 *  equalsIgnoreCase : 대소문자 구분 x => 검색
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





