package com.sist.exception;
/*
 *   예외회피
 *    - 에러에 대한 예측이 가능하게 만든다 ==> API(자바,라이브러리)
 *      대부분의 프로그램은 직접처리 (try~catch)
 *    - 프로그래머가 예외처리를 각자 프로그램에 맞게 처리 유도
 *    형식) 
 *        메소드() throws 예측한 예외 클래스 등록
 *        ex) public void display() throws Exception,ArrayIndexOfBoundsException,NumberFormatException..
 *            {
 *            }
 *            ==> 순서 없이 나열 가능
 *    - 예외 처리는 호출하는 메소드에서 처리       
 *     
 */
public class MainClass {
	public int div(int a,int b) throws Exception
	{							// ArithmeticException => 예외처리생략 가능(RuntimeException)
							  // Exception => checked + unchecked(Runtime) 이므로 예외처리 해야함
		return a/b; // 에러 예측 => 0으로 나누면 에러 발생할 수 있다
		            // 프로그래머가 직접 예외처리하고 사용해야함
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MainClass m=new MainClass();
		int res=0;
		try {
			res = m.div(10, 2);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		System.out.println(res);
	}

}
