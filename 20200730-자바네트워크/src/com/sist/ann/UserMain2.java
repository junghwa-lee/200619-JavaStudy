package com.sist.ann;
import java.lang.reflect.Method;
import java.util.*;
public class UserMain2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("요청:");
		String ss=scan.next();
		try {
			Class clsName=Class.forName("com.sist.ann.MovieModel");
			//클래스 정보 읽기
			Object obj=clsName.newInstance(); //메모리할당
			//메소드 찾기
			Method[] methods=clsName.getDeclaredMethods();
			for(Method m:methods)
			{
				//System.out.println(m.getName());
				RequestMapping rm=m.getAnnotation(RequestMapping.class);
				if(rm.value().equals(ss))
				{
					m.invoke(obj, null); //찾은 메소드 호출 (메소드 이름을 몰라도 가능)
				}
			}
		} catch (Exception ex) {}
	}

}
