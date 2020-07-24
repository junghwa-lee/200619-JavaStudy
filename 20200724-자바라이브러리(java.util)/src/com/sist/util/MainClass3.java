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
		day=day.substring(0, day.lastIndexOf("|")); // ¸¶Áö¸· "|" ±ÛÀÚ¸¦ Á¦¿Ü
		
		System.out.println(day);
		
		//³¯Â¥º° ºĞ¸®
		String[] resdays=day.split("\\|"); //Á¤±Ô½Ä¿¡ »ç¿ë (regex)
		/*
		 *    Á¤±Ô½Ä
		 *     ^ : ½ÃÀÛ¹®ÀÚ  => ^A   ^[°¡-ÆR] ÇÑ±Û·Î ½ÃÀÛÇÏ´Â¹®ÀÚ / [^°¡-ÆR] ÇÑ±ÛÀ» Á¦¿ÜÇÑ ¹®ÀÚ
		 *     $ : ³¡¹®ÀÚ =>  A$
		 *     . : ÀÓÀÇÀÇ ÇÑ±ÛÀÚ(¸ğµç±ÛÀÚ)  => \\.
		 *     | : ¼±ÅÃ
		 *     ? : ÀÖÀ¸¸é Ãâ·Â, ¾øÀ¸¸é Ãâ·ÂX
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
