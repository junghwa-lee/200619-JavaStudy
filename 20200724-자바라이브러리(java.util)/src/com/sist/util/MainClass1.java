package com.sist.util;

import java.util.StringTokenizer;

/*
 *  StringTokenizer  :  단어별로 분리
 *    - hasMoreTokens()
 *    - nextToken()
 *    
 *    String msg="Red,Green,Blue,Black,Yellow";
 *    => StringTokenizer st=new StringTokenizer(msg,",");
 *       String color1=st.nextToken();
 *       String color2=st.nextToken();
 *       String color3=st.nextToken();
 *       String color4=st.nextToken();
 *       String color5=st.nextToken();
 *       
 *       st.nextToken => 범위 초과시 에러
 *       
 *    => StringTokenizer st=new StringTokenizer(msg,",");
 *    	 while(st.hasMoreTokens()) => 갯수 모를때
 *    	 {
 *    		String color=st.nextToken();
 *    	 }
 *    
 *    => StringTokenizer st=new StringTokenizer(msg);
 *       ===> 구분문자 없는 경우 : 공백 (default)
 *      
 *      
 */
public class MainClass1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String  msg="Red,Green,Blue,Black,Yellow";
		StringTokenizer st=new StringTokenizer(msg,",");
		String color1=st.nextToken();
		String color2=st.nextToken();
		String color3=st.nextToken();
		String color4=st.nextToken();
	 	String color5=st.nextToken();
	 	//String color6=st.nextToken(); => error
	 	
	 	System.out.println(color1);
	 	System.out.println(color2);
	 	System.out.println(color3);
	 	System.out.println(color4);
	 	System.out.println(color5);
	 	//System.out.println(color6);
	 	
	 	st=new StringTokenizer(msg,",");
	 	while(st.hasMoreTokens())
	 	{
	 		System.out.println(st.nextToken());
	 	}
	}

	
	
	
	
	
	
	
	
	
}
