package com.sist.lib;
/*
 *  라이브러리 -> import 
 *  -------
 *   1. java.lang
 *      = Object : 최상위 클래스
 *        - clone() : 복제
 *        - finalize() : 소멸자
 *        - toString() : 객체를 문자열로 변환
 *      = String (StringBuffer) 
 *        - substring() : 문자를 추출
 *        - indexOf(), lastIndexOf() : 문자를 찾는 경우 (MVC)
 *        - trim() : 로그인 처리, 사용자 입력값
 *        - equals() : 실제 저장된 문자열을 비교 => 로그인 처리, 우편번호 검색...
 *        - length() : 문자 갯수
 *        - valueOf() : 유일한 static => 모든 데이터형을 문자열로 변환
 *        - join() : 변환
 *        *** StringBuffer : append() => 문자열 
 *      = Wrapper : 클래스 형변환, 문자열을 다른 데이터형으로 변경
 *        - Integer : parseInt() => 정수형변환
 *        - Double : parseDouble() => 실수형변환
 *        - Boolean : parseBoolean() => "true" -> true, "false" -> false
 *      = Math
 *        - random()
 *        - ceil() : 올림 => 총페이지
 *      = System
 *        - gc() : 메모리 회수
 *        - exit() : 프로그램 종료
 *        ※ web => 자동 메모리 회수 (틈캣)
 *      
 *   2. java.util
 *      = StringTokenizer : 문자를 분해 => split() -> 정규식
 *        - nextToken() : 한 개의 구분문자를 자름
 *        - hasMoreTokens() : 자른 갯수만큼 루프
 *      = Date, Calendar
 *        - Date : 시스템의 시간, 날짜 읽기
 *        		   Date date=new Date() ==> date.toString()
 *        - Calendar : 요일구하기, 달의 마지막 날짜 읽기
 *        			 	날짜 등록 => 월 : month-1
 *        						    요일 : week-1
 *      = Collection 
 *        - ArrayList : 비동기화 => 데이터베이스 
 *        - Vector : 동기화 => 네트워크에서 사용자 관리 (네트워크)
 *        - HashMap : 키(일반문자열) , 값(클래스 주소값) ==> 클래스 관리
 *            -> MyBatis(Mapper : 데이터베이스 연결), Spring(Web)
 *        ※ 장점 : 모든 클래스, 데이터를 한번에 저장 => Object => 형변환
 *          단점을 변경 => 제네릭스 프로그램 : <원하는 데이터형>   
 */
import java.util.*;
import java.text.*;  // 형태08                                          변환(시간, 날짜) => SimpleDateFormat()
// yyyy 연도 => yy , 월 => M(MM), 일 =>dd(d), 시간 => hh(h), 분(mm) , 초(s)

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Date date=new Date();
		System.out.println(date.toString()); //표준시간 읽어온다
		//변환
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
		System.out.println(sdf.format(date));
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
