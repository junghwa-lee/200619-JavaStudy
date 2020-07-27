package com.sist.io;
// 파일에 쓰기 => 회원가입, 댓글, 게시판
/*
 *   파일 -> 저장 -> ArrayList
 *   데이터 -> ArrayList에 모아서 -> 저장
 */
import java.io.*;
public class MainClass2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 	 파일 입출력
		 *    r => read
		 *    w => write ==> create
		 *    a => append
		 *     
		 * 
		 *   FileOutputStream (1byte)
		 *   생성자
		 *     new FileOutputStream("경로명")
		 *     new FileOutputStream("경로명",true/false) => false는 default값
		 *   FIleWriter(2byte)
		 */
		//FileOutputStream fos=null;
		FileWriter fos=null;
		try
		{
			//생성
			//fos=new FileOutputStream("c:\\javaDev\\temp.txt",true);
			fos=new FileWriter("c:\\javaDev\\temp.txt",true);
		
			//저장
			String str="ABCDEFGHIJKLMNOP";
			//fos.write('L');
			//fos.write('M');
			//fos.write('N');
			//fos.write(str.getBytes());
			fos.write(str+"\r\n"); // FileWriter일 경우 

			/*
			 *  글자를 바꾸면 새롭게 저장(덮어쓰기)
			 *  파일명 뒤에 true를 설정하면 원래 파일에 덧붙여 써진다 (append)
			 *  getBytes() : 문자열을 바이트 배열로 변경할 때 사용
			 *  "\r\n" : 다음줄에 출력
			 */
			
			 System.out.println("저장완료!!");
		}catch(Exception ex)
		{
			//에러처리
			System.out.println(ex.getMessage());
		}
		finally
		{
			// 파일 닫기
			// finally ==> 파일닫기 , 서버닫기, 오라클 연결헤제 
			try
			{
				fos.close();
			}catch(Exception ex) {}
		}
		
		
		
		
		
		
		
		
	}

}
