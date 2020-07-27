package com.sist.lib;
/*
 *   ArrayList 사용법, Vector 사용법, Map
 *   
 *    List ->  ArrayList, Vector, LinkedList
 *    
 *    ArrayList => 접근성이 좋음 / LinkedList => 접근성이 좋지 않음
 *    (접근성 : 데이터 찾아서 출력)
 *    
 *    ArrayList => 동기화(안정)   / Vector => 비동기화
 */
import java.util.*;
public class MainClass2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//ArrayList<String> names=new ArrayList<String>();
		//Vector<String> names=new Vector<String>();
		LinkedList<String> names=new LinkedList<String>();
		// ==> ArrayList, Vector, LinkedList 동일메소드 => 모두 동일하게 작동
		
		//=> names 메모리 안에는 문자열만 저장
		names.add("홍길동"); //0
		names.add("심청이"); //1
		names.add("이순신"); //2
		names.add("강감찬"); //3
		names.add("춘향이"); //4
		
		System.out.println("저장된 갯수:"+names.size());
		// 출력
		for(int i=0;i<names.size();i++)
		{
			// 데이터를 받을때
			String name=names.get(i); // get(i) => 원하는 위치에 저장된 데이터 읽기
			
			System.out.println(name+":"+i); // 인덱스는 자동생성 -> 0번부터 시작
		}
		
		System.out.println();
		
		// 원하는 위치에 출력
		// add() => 5
		// add(index, "값");
		names.add(3, "을지문덕");
		for(int i=0;i<names.size();i++)
		{
			String name=names.get(i); 
			System.out.println(name+":"+i); 
		}
	
		System.out.println();
		
		// 삭제 remove()
		names.remove(2);  
		for(int i=0;i<names.size();i++)
		{
			String name=names.get(i); 
			System.out.println(name+":"+i); 
		}
		
		System.out.println();
		
		// 수정 set()
		names.set(2, "박문수");
		for(int i=0;i<names.size();i++)
		{
			String name=names.get(i); 
			System.out.println(name+":"+i); 
		}
		
		System.out.println();
		
		//전체삭제 clear()
		names.clear();
		System.out.println("저장된 갯수:"+names.size());
		
		
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
