package com.sist.method;

import java.lang.reflect.Method;

class A
{
	public void display1(String name)
	{
		System.out.println("Hello~~\n"+name);
	}
	public void display2(String name)
	{
		System.out.println("Hello~~\n"+name);
	}


}
public class 메소드2 {
	public static void main(String[] args) {
		//A a=new A();
		//a.display("홍길동");
		try
		{
			Class clsName=Class.forName("com.sist.method.A");
			Object obj=clsName.newInstance();
			//System.out.println(obj);
			//A a=(A)obj; //클래스 형변환
			//a.display("심청이");
			Method[] method=clsName.getDeclaredMethods();
			for(Method m:method)
			{
				System.out.println(m.getName()); 
			}
		}catch(Exception ex) {}
	}

}
