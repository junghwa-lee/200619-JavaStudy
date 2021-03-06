package com.sist.back;
import java.util.*;
public class BoardManager {
	private static ArrayList<BoardVO> list=
			new ArrayList<BoardVO>();
	public int sequence() // sequence : 자동증가번호 제작
	{
		int max=0;
		for(BoardVO vo:list)
		{
			if(max<vo.getNo())
				max=vo.getNo();			
		}
		return max+1;
	}
	// 추가 
	public void insert(BoardVO vo)
	{
		vo.setRegdate(new Date());
		vo.setNo(sequence());
		list.add(vo);
	}
	//목록출력
	public ArrayList<BoardVO> select()
	{
		return list;
	}
}
