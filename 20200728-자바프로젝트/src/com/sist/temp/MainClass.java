package com.sist.temp;
import java.io.*;
import java.util.*; // '|' 글자 잘라내기 -> split , StringTokenizer 

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 파일 읽기 => 예외처리 필요
		FileReader fr=null; 
		/*
		 *  파일에 저장 : FileWriter ==> 문자 스트링 (한글 포함) => 2byte
		 *  		  FileInputStream, FileOutputStream => 1byte ( png, jpg, zip..)
		 */
		
		
		try
		{
			// 파일읽기
			fr=new FileReader("c:\\javaDev\\daum_movie.txt");
			// 한글자 읽기 => 문자의 번호 -> char 변환해 문자로 출력
			int i=0;
			StringBuffer sb=new StringBuffer();
			while((i=fr.read())!=-1)
			{
				//System.out.print((char)i);
				sb.append(String.valueOf((char)i));
			}
			//출력
			System.out.println(sb.toString());
		}catch(Exception ex)
		{
			// 에러 처리 => 디버깅
			/*
			 *  에러 메세지 확인 ..getMessage()
			 *  Trace => 실행과정 => 해당위치 찾기  ..printStackTrace() 
			 */
			ex.printStackTrace();
		}
		finally
		{
			// 파일 닫기, 쓰레드 종료, 네트워크 서버 종료, 오라클 연결 해제
			try
			{
				fr.close();
			}catch(Exception ex) {}
		}
		
		
		
		
		
		
		
		
	}

}
