package com.sist.util;
import java.util.*;
public class MainClass3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random r=new Random();
		int[] resDay=new int[r.nextInt(10)+5]; // 5~14
		
		String day="";
		for(int i=0;i<resDay.length;i++)
		{
			resDay[i]=r.nextInt(31)+1; //1~31
			day+=resDay[i]+"|";
			
		}
		day=day.substring(0, day.lastIndexOf("|")); // 마지막 "|" 글자를 제외
		
		System.out.println(day);
		
		//날짜별 분리
		String[] resdays=day.split("\\|"); //정규식에 사용 (regex)
		/*
		 *    정규식
		 *     ^ : 시작문자  => ^A   ^[가-힣] 한글로 시작하는문자 / [^가-힣] 한글을 제외한 문자
		 *     $ : 끝문자 =>  A$
		 *     . : 임의의 한글자(모든글자)  => \\.
		 *     | : 선택
		 *     ? : 있으면 출력, 없으면 출력X
		 *    
		 */
		for(String s:resdays) {
			System.out.println(s);
		}
		System.out.println("======StringTokenizer======");
		StringTokenizer st=new StringTokenizer(day, "|");
		while(st.hasMoreTokens())
		{
			System.out.println(st.nextToken());
		}
	}

}
