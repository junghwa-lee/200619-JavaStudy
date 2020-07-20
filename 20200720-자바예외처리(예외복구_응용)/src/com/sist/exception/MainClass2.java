package com.sist.exception;

public class MainClass2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//각각따로
		try
		{
			
		}catch(ArithmeticException e)
		{
			
		}catch(ArrayIndexOutOfBoundsException e)
		{
			
		}catch(NumberFormatException e)//web에서 주로 출력하는 error
		{
			
		}
		
		// |로 묶기
		try
		{
			
		}catch(ArithmeticException | ArrayIndexOutOfBoundsException | NumberFormatException e)
		{
			
		}
		
		//한번에 처리
		try
		{
			
		}catch(RuntimeException e) {}
		
		
		
		
		
		
		
		
		
	}

}
