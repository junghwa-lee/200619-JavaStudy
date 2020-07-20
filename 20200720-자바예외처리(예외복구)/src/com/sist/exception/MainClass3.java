package com.sist.exception;
//부분 처리
public class MainClass3 {
	public static void main(String[] args) {
		//부분적으로 try 사용할 수 있다
		try
		{
			for(int i=1;i<=10;i++)
			{
				try
				{
					System.out.println("i="+i);
					int a=i/(int)(Math.random()*3); // random값이 0이면 error발생 
					System.out.println("a="+a);
				}catch(Exception e) {System.out.println("for문 i++로 이동");} // for문 안에 try~catch => 무조건 i=10까지 수행
			}
		}catch(Exception ex)
		{
			System.out.println("에러발생");			
		}
		System.out.println("프로그램 정상 종료!!");
		
		
	
	}
}
