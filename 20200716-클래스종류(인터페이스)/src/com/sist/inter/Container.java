package com.sist.inter;
import java.util.*;
// 인터페이스 ==> 여러 개 클래스를 묶어서 인터페이스로 관리(서로 다른 클래스들에게 관계를 맺어준다)
interface Connection{
	public void connection();
	//default public void aaa() {}  =>영향x(독립적인프로그래밍)
}
class 오라클 implements Connection{
	public void connection()
	{
		System.out.println("오라클 연결");
	}
}
class DB2 implements Connection{
	public void connection()
	{
		System.out.println("DB2 연결");
	}
}
class MSSQL implements Connection{
	public void connection()
	{
		System.out.println("MSSQL 연결");
	}
}
class MySQL implements Connection{
	public void connection()
	{
		System.out.println("MySQL 연결");
	}
}
// 팩토리패턴
public class Container {
	Map map=new HashMap();
	public Container()
	{
		map.put("oracle", new 오라클());
		map.put("db2", new DB2());
		map.put("mssql", new MSSQL());
		map.put("mysql", new MySQL());
	}
	public Connection getBean(String key)
	{
		return (Connection)map.get(key);
	}
}
