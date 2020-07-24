package com.sist.string;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;
import java.util.*;

/*
 * Find
 *   ========================================================
 *   => ���� contains()   ======> LIKE '%������%'   ������:boolean
 *   => ���� ���ڿ� startsWith() ==> LIKE '������%'   ������:boolean
 *   => �� ���ڿ� endsWith() =====> LIKE '%������'   ������:boolean
 *   ========================================================> if
 */

public class MainClass2 {
	public void find(String ss)
	{
		try
		{
			for(int i=1;i<=3;i++) 
			{
				Document doc=Jsoup.connect("https://movie.daum.net/premovie/released?reservationOnly=N&sort=reservation&page="+i).get();
				Elements title=doc.select("a.name_movie");
				for(int j=0;j<title.size();j++)
				{
					if(title.get(j).text().endsWith(ss))     
					//if(title.get(j).text().startsWith(ss))
					//if(title.get(j).text().contains(ss))
					{
						System.out.println(title.get(j).text());
					}
					/*
					 *  ���� ã�� => contains()
					 *  ������Ʈ (�ڵ��ϼ�) => startsWith() 
					 */
					
				}
			}
		}catch(Exception ex) {}

	}
	public static void main(String[] args) {
		MainClass2 m=new MainClass2();
		Scanner scan=new Scanner(System.in);
		System.out.print("�˻���:");
		String ss=scan.next();
		m.find(ss);
	}








}
