package com.sist.temp;
/*
 *   서버 -> ip고정
 *          클라이언트에서 연결 => 연결번호(PORT)
 *          PORT => 0~65535 => 사용중인PORT (0~1023)
 *            예) HTTP : 80, SMTP : 25, FTP : 21, TELNET : 23
 *                Spring : 3000 , React : 3000, 오라클 : 1521, MS-SQL : 1433, 머드 : 4000
 *                => 음성 : 20000 , 화상 : 30000
 *                
 *   서버 제작 
 *     1) bind (IP+PORT)  => 핸드폰 개통
 *     2) 대기상태 => listen
 *     3) 접속 대기 => 접속 ==> accept() : 발신자전화번호(IP)가 생성
 *     4) 저장 => 동기화 
 *               ---- 
 *                ArrayList : 비동기화
 *                Vector : 동기화
 *     5) 데이터전송 : write()
 *     6) 사용자부터 요청 : readLine()
 *     
 *   서버에서 하는 역할 
 *     1) 사용자 요청 받기
 *     2) 요청처리 => 찾기
 *     3) 결과값을 사용자에게 전송
 *     
 *   서버
 *     1) 1:1 (Peer To Peer)
 *     2) 1:多 => 데이터 동일, 사용자가 따라 요청 할 수 있게 만든다
 *      		 => 사용자 요청을 받아서 처리하는 프로그램이 존재
 *       		 => 통신 -> 별도수행 (쓰레드)
 *       
 *   ==============================================
 *   쓰레드
 *       => 자원을 보다 효율적으로 사용
 *       => 사용자에 대한 응답성이 향상
 *       => 작업이 분리된다(소스 간결화)
 *       => CPU를 효율적으로 사용 => 속도 빨라짐
 *       => 실행중인 프로그램 => 프로세스(쓰레드가 1개이상 존재)
 *   
 *   쓰레드를 구현하는 방법  
 *     1) 인터페이스
 *        Runnable
 *        class A implements Runnable => 윈도우
 *     2) Thread 클래스 상속
 *        class A extends Thread => 일반 쓰레드 
 *   
 *   쓰레드 실행과정
 *     생성			  	 대기(쓰레드에서 사용하는 데이터수집)		쓰레드 동작
 *     new Thread()    		     start()				 run()
 *     ==> 쓰레드의 동작 정의 run()구현
 *     ==> 쓰레드는 반드시 한 개의 동작만 수행
 *         run() => 종료 : interrupt() / 일시정지 : sleep(), wait(), join()
 *         
 *     
 */
class MyThread extends Thread
{
	//동작
	public void run()
	{
		try {
			for(int i=1;i<=10;i++)
			{
				System.out.println(getName()+":"+i);
				Thread.sleep(50); // 1/1000
				
			}
		} catch (Exception e) {}
	}
}
public class Server {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyThread t1=new MyThread();
		MyThread t2=new MyThread();
		MyThread t3=new MyThread();

		/*
		 생성 => JVM (순위결정 => 1~10 ) => 사용자 정의 쓰레드(5)
		 1 : MIN_PRIORITY, 10: MAX_PRIORITY, 5: NORM_PRIORITY
		 각 쓰레드마다 이름 부여 Thread-0, Thread-1....
		 자바프로그램은 MAX_PRIORITY(main), MIN_PRIORITY(gc)
		*/
		
		//run 호출 => start()호출하면 자동으로 run()호출됨
		// start와 상관 없이 높은 순위부터 호출
		// 한번씩 수행 => 순위가 매번 바뀐다
		
		//이름부여
		t1.setName("서울");
		t2.setName("부산");
		t3.setName("강원");
		
		//순위부여
		t1.setPriority(10);
		t2.setPriority(1);
		t3.setPriority(1);
		
		t1.start();
		t2.start();
		t3.start();
		
		
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
