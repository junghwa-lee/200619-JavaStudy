package com.sist.exception;
/*
 *   다중처리 ==> 예상되는 에러가 여러 개 있는 경우
 *   try 
 *   {
 *   	정상적으로 실행되는 문장
 *   }catch(예상되는 예외클래스)
 *   {
 *   	에러처리
 *   }
 *   catch(예상되는 예외클래스)
 *   {
 *   	에러처리
 *   }
 *   catch(예상되는 예외클래스)
 *   {
 *   	에러처리
 *   }
 *   
 *   ※catch를 여러 개 사용시에는 순서가 존재
 *     (상위계층일수록 마지막에 사용)
 *   
 *   예외처리 계층 구조
 *   	최상위 클래스 => 모든 클래스의 상위 클래스
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
			//catch(RuntimeException e)// 아래의 내용을 모두 처리할수있는 예외이므로 맨 아래에 써야한다
			
			int[] arr=new int[2];
			arr[0]=100;
			arr[2]=2; // error ==> Array..-> Runtime -> Exception -> Throwable
			
		
		  
		}
		catch(NumberFormatException e) 
		{
			System.out.println("정수변환 안됨");
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("배열범위 벗어난 경우");
		}
		catch(ArithmeticException e)
		{
			System.out.println("0으로 나눈 경우");
		}
		catch(RuntimeException e)//예상 못했던 에러 발생 ==> 처리
		{
			System.out.println("실행시 모든 에러를 처리");
		}
		catch(Exception e) // exception 모두 처리가능
		{
			System.out.println("수정이 가능한 모든 에러를 처리");
		}
		catch(Throwable e) // error, exception 모두 처리 가능
		{
			System.out.println("예외와 오류 동시에 처리");
		}
		
	}

}
