package com.sist.data;
//데이터 관리
import java.util.*;
import java.io.*;
/*
 *    프로그램 작정
 *    = 파일 : 분리할 수 없다 => 전체를 통으로 저장 ======> AI
 *      1) 전체 파일을 읽어서 분리 => 메모리에 저장 
 *       					  ----------- ArrayList
 *         FileReader
 *         StringTokenizer, split 
 *      2) 메모리에서 제어
 *    
 *    = 오라클 : 분리가 되어있는 상태
 *      - 필요시마다 오라클에 연결 => 메소드 안에서 처리
 *    
 *      
 */
public class MovieManager {
	//데이터 저장
	private static ArrayList<MovieVO> list= new ArrayList<MovieVO>();
	// 모든 자바파일에서 공통으로 사용 => 반드시 static
	
	// 프로그램 시작 => 데이터 수집 => AraayList에 저장 후 시작
	static
	{
		try
		{
			/*
			 *  파일읽기 
			 *  1. 한글자씩 읽는 방법 => read()
			 *     FileInputStream
			 *     FileReader
			 *  2. 한줄씩 읽는 방법 => readLine()
			 *     전체 데이터를 임시저장공간에 저장 후 사용
			 *     BufferedReader
			 */
			FileInputStream fr=new FileInputStream("c:\\\\javaDev\\\\daum_movie.txt");
			// 메모리에 전체 데이터를 모아서 관리
			BufferedReader in=new BufferedReader(new InputStreamReader(fr));
			while(true)
			{
				String movie=in.readLine(); // readLine() => \n
				if(movie==null) break;//종료 => 파일 다 읽은 경우
				/*
				 * 1|1|반도(2020)|
				 * https://img1.daumcdn.net/thumb/C155x225/?fname=https%3A%2F%2Ft1.daumcdn.net%2Fmovie%2F389d6e403d8ee48c419c7b16908919103e2c2670|
				 * 평점 05 . 7|
				 * 연상호|
				 * 강동원|
				 * 액션/드라마|
				 * 2020.07.15 개봉|
				 * 116분, 15세이상관람가|
				 * 2,862,890|
				 * 전대미문의 재난 그 후 4년 폐허의 땅으로 다시 들어간다! 4년 전, 나라 전체를 휩쓸어버린 전대미문의 재난에서 가까스로 탈출했던 ‘정석’(강동원). 바깥세상으로부터 철저히 고립된 반도에 다시 들어가야 하는 피할 수 없는 제안을 받는다. 제한 시간 내에 지정된 트럭을 확보해 반도를 빠져 나와야 하는 미션을 수행하던 중 인간성을 상실한 631부대와 4년 전보다 더욱 거세진 대규모 좀비 무리가 정석 일행을 습격한다. 절체절명의 순간, 폐허가 된 땅에서 살아남은 ‘민정’(이정현) 가족의 도움으로 위기를 가까스로 모면하고 이들과 함께 반도를 탈출할 수 있는 마지막 기회를 잡기로 한다. 되돌아온 자, 살아남은 자 그리고 미쳐버린 자 필사의 사투가 시작된다!
				 */
				StringTokenizer st=new StringTokenizer(movie, "|");
				while(st.hasMoreTokens())
				{
					MovieVO vo=new MovieVO();
					vo.setMno(Integer.parseInt(st.nextToken()));
					vo.setCno(Integer.parseInt(st.nextToken()));
					vo.setTitle(st.nextToken());
					vo.setPoster("https:"+st.nextToken());
					String score=st.nextToken();
					score=score.substring(score.indexOf("점")+1);
					vo.setScore(score.trim());
					vo.setDirector(st.nextToken());
					vo.setActor(st.nextToken());
					vo.setGenre(st.nextToken());
					String regdate=st.nextToken();
					regdate=regdate.substring(0,regdate.lastIndexOf("개"));
					vo.setRegdate(regdate);
					String grade=st.nextToken();
					grade=grade.substring(grade.indexOf(",")+1);
					vo.setGrade(grade.trim());
					vo.setShowUser(Integer.parseInt(st.nextToken().replace(",", ""))); // , -> 문자열이므로 삭제
					vo.setStory(st.nextToken());
					list.add(vo);
				}
			}
					
				
		}catch(Exception ex)
		{
			System.out.println(ex.getMessage());
		}
		
	}
	
	public ArrayList<MovieVO> movieListData(int page)
	{
		ArrayList<MovieVO> movies=new ArrayList<MovieVO>();
		int i=0;
		int j=0;
		int pagecnt=(page*10)-10;
		/*
		 *  1page => 0~9
		 *  2page => 10~19
		 *  ..
		 */
		for(MovieVO vo:list)
		{
			if(i<10 && j>=pagecnt) //pagecnt: 저장위치
			{
				movies.add(vo);
				i++; // 10개식 나눠주는 변수
			}
			j++; // for 돌아가는 횟수
		}
		return movies;
	}
	
	public int movieTotalPage()
	{
		return (int)(Math.ceil(list.size()/10.0));
		//ceil : 올림메소드
	}
	//상세보기
	public MovieVO movieDetailData(int mno)
	{
		return list.get(mno-1);
	}
	//영화전체읽기
	public ArrayList<MovieVO> movieAllData(int cno)
	{
		ArrayList<MovieVO> movies=new ArrayList<MovieVO>();
		for(MovieVO vo:list)
		{
			if(vo.getCno()==cno)
			{
				movies.add(vo);
			}
		}
		return movies;
	}
	// 영화검색 
	public ArrayList<MovieVO> movieFindData(String ss) // ArrayList:가변배열=>검색어에 맞는 여러개의 VO를 묶어서 처리
	{
		ArrayList<MovieVO> movies=new ArrayList<MovieVO>(); 
		// list 에서 데이터 찾기 -> movies에 저장
		for(MovieVO vo:list)
		{
			if(vo.getTitle().contains(ss))
			{
				movies.add(vo);
			}
		}
		return movies;
	}
	
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("페이지:");
		int page=scan.nextInt();
		
		MovieManager m=new MovieManager();
		System.out.println(page+" page / "+m.movieTotalPage()+" pages");
		
		//데이터 읽기
		ArrayList<MovieVO> list=m.movieListData(page);
		
		for(MovieVO vo:list){
			System.out.println(vo.getTitle());
			System.out.println(vo.getGrade());
		}
		/*
		 * for(MovieVO vo:list) { System.out.println(vo.getTitle(ss)); {
		 * System.out.println(vo.getTitle());}}
		 */
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
