package com.sist.exception;
/*
 *   예외처리
 *      형식) 
 *        1. 직접처리 (try~catch)
 *           try
 *           {
 *           	실행이 가능한 코딩 (정상 수행할 수 있는 문장)
 *           }catch(예외클래스 객체)
 *           {
 *           	실행 과정에 에러가 날 경우에 처리 문장
 *           }
 *           *** catch 여러번 사용 가능
 *           *** finally를 사용할 수 있다 (필요한 경우에만 사용)
 *               서버, 데이터베이스 관련 => 서버닫기, 오라클 연결 해제..
 *         
 *        2. 자바에서 제공하는 예외처리
 *           한 개만 처리
 *             NumberFormatException
 *             ArrayIndexOutOfBoundsException
 *             NullPointerException
 *             IOException
 *             SQLException
 *           여러개 처리
 *             RuntimeException : 실행시 에러 전체를 묶어서 한번에 처리
 *             Exception
 *             Throwable
 *        
 *        3. catch는 여러 개를 사용할 수 있음
 *           해당 에러를 찾는 경우에는 처음부터 마지막까지 검색 => 예외처리 순서대로 코딩
 *        
 *        4. try에서 에러가 발생하면 발생위치에서 catch로 이동
 *           ----------------------> 밑에있는 소스는 실행되지 않음
 *           int a=10;  ==> 실행
 *           int b=0;   ==> 실행
 *           int c=a/b; ==> 에러 발생
 *           System.out.println(c)  ==> 실행X
 *        
 *        5. 목적 : 에러체크(에러확인 -> 소스변경) ==> 디버깅
 *        6. 예외처리 => 수정이 가능한 에러
 *        
 *           1문장
 *           2문장
 *           try
 *           {
 *             3문장
 *             4문장  ===> error ==> 프로그램 종료 (비정상 종료)
 *             5문장
 *                  ==> 4,5문장 건너뛰고 6문장으로 이동
 *           }catch(Exception e)
 *           { 
 *             6문장
 *           }
 *           7문장
 *           8문장
 *        
 *        7. 자바의 모든 코딩은 예외처리 존재
 *           단, 실행시는 생략 가능
 *           
 *           void display()
 *           {
 *             return; => 없는 경우 자동추가
 *           }
 *           
 *           class A
 *           {
 *            	A(){} => 없는 경우 자동추가
 *           }
 *           
 *           => 원래는 존재해야하지만 생략 ==> 예외처리
 *           system.out.println() => 예외처리 생략 가능
 *           system.in.read() => 예외처리 생략 불가
 *           *** 생략을 할 수 있지만 특별한 경우에는 예외처리를 할 줄 알아야 한다
 *               ---
 *               조건문으로 주로 처리 => 조건문으로 처리가 어려운 경우에 예외처리 사용
 *               => 에러처리의 기본 조건문
 *                
 *               int a=10;
 *               int b=0;
 *               if(b==0)
 *                 System.out.println("0으로 나눌 수 없다")
 *               else
 *                 System.out.println(a/b);
 *                 
 *               try
 *               {
 *                 	int a=10;
 *              	int b=0;
 *              	System.out.println(a/b);
 *               }catch(Exception e)
 *               {
 *                  System.out.println("0으로 나눌 수 없다")
 *               }
 *               
 *         8. 예외처리는 반드시 처리해야하는 클래스가 존재
 *            --------------
 *              IO와 관련
 *              쓰레드와 관련
 *              네트워크 관련
 *              데이터베이스 관련  => Web과 관련
 */
import javax.swing.*;
public class MainClass {
	public static void main(String[] args) {
	    try
	    {
			String num1=JOptionPane.showInputDialog("첫번째 정수 입력:");
			String num2=JOptionPane.showInputDialog("두번째 정수 입력:");
			//배열에 첨부
			int[] arr=new int[2];
			// 문자열-> 정수 변환 
			arr[0]=Integer.parseInt(num1); // 숫자 => "10" (o) / "1 0" (X)
			arr[1]=Integer.parseInt(num2);
			int result=arr[0]/arr[1];
			System.out.println("result="+result);
	    } 
	    /*catch(NumberFormatException e)
	    {
	    	System.out.println("정수만 입력");
	    }catch(ArrayIndexOutOfBoundsException e)
	    {
	    	System.out.println("배열범위 초과");
	    }catch(ArithmeticException e)
	    {
	    	System.out.println("0으로 나눌 수 없다");
	    }*/
	    catch(RuntimeException e) 
	    {
	    	//System.out.println(); // ==> 에러의 위치를 알기 어려움
	    	//System.out.println(e.getMessage()); //에러 메시지 알려줌
	    	e.printStackTrace(); // =>에러 줄 수를 보여줌
	    }
	    System.out.println("처음부터 다시 입력!");
		
		
		
		
		      
	}
}
