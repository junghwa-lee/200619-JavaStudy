package com.sist.data;
//������ ����
import java.util.*;
import java.io.*;
/*
 *    ���α׷� ����
 *    = ���� : �и��� �� ���� => ��ü�� ������ ���� ======> AI
 *      1) ��ü ������ �о �и� => �޸𸮿� ���� 
 *       					  ----------- ArrayList
 *         FileReader
 *         StringTokenizer, split 
 *      2) �޸𸮿��� ����
 *    
 *    = ����Ŭ : �и��� �Ǿ��ִ� ����
 *      - �ʿ�ø��� ����Ŭ�� ���� => �޼ҵ� �ȿ��� ó��
 *    
 *      
 */
public class MovieManager {
	//������ ����
	private static ArrayList<MovieVO> list= new ArrayList<MovieVO>();
	// ��� �ڹ����Ͽ��� �������� ��� => �ݵ�� static
	
	// ���α׷� ���� => ������ ���� => AraayList�� ���� �� ����
	static
	{
		try
		{
			/*
			 *  �����б� 
			 *  1. �ѱ��ھ� �д� ��� => read()
			 *     FileInputStream
			 *     FileReader
			 *  2. ���پ� �д� ��� => readLine()
			 *     ��ü �����͸� �ӽ���������� ���� �� ���
			 *     BufferedReader
			 */
			FileInputStream fr=new FileInputStream("c:\\\\javaDev\\\\daum_movie.txt");
			// �޸𸮿� ��ü �����͸� ��Ƽ� ����
			BufferedReader in=new BufferedReader(new InputStreamReader(fr));
			while(true)
			{
				String movie=in.readLine(); // readLine() => \n
				if(movie==null) break;//���� => ���� �� ���� ���
				/*
				 * 1|1|�ݵ�(2020)|
				 * https://img1.daumcdn.net/thumb/C155x225/?fname=https%3A%2F%2Ft1.daumcdn.net%2Fmovie%2F389d6e403d8ee48c419c7b16908919103e2c2670|
				 * ���� 05 . 7|
				 * ����ȣ|
				 * ������|
				 * �׼�/���|
				 * 2020.07.15 ����|
				 * 116��, 15���̻������|
				 * 2,862,890|
				 * ����̹��� �糭 �� �� 4�� ������ ������ �ٽ� ����! 4�� ��, ���� ��ü�� �۾������ ����̹��� �糭���� ����� Ż���ߴ� ��������(������). �ٱ��������κ��� ö���� ���� �ݵ��� �ٽ� ���� �ϴ� ���� �� ���� ������ �޴´�. ���� �ð� ���� ������ Ʈ���� Ȯ���� �ݵ��� ���� ���;� �ϴ� �̼��� �����ϴ� �� �ΰ����� ����� 631�δ�� 4�� ������ ���� �ż��� ��Ը� ���� ������ ���� ������ �����Ѵ�. ��ü������ ����, ���㰡 �� ������ ��Ƴ��� ��������(������) ������ �������� ���⸦ ����� ����ϰ� �̵�� �Բ� �ݵ��� Ż���� �� �ִ� ������ ��ȸ�� ���� �Ѵ�. �ǵ��ƿ� ��, ��Ƴ��� �� �׸��� ���Ĺ��� �� �ʻ��� ������ ���۵ȴ�!
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
					score=score.substring(score.indexOf("��")+1);
					vo.setScore(score.trim());
					vo.setDirector(st.nextToken());
					vo.setActor(st.nextToken());
					vo.setGenre(st.nextToken());
					String regdate=st.nextToken();
					regdate=regdate.substring(0,regdate.lastIndexOf("��"));
					vo.setRegdate(regdate);
					String grade=st.nextToken();
					grade=grade.substring(grade.indexOf(",")+1);
					vo.setGrade(grade.trim());
					vo.setShowUser(Integer.parseInt(st.nextToken().replace(",", ""))); // , -> ���ڿ��̹Ƿ� ����
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
			if(i<10 && j>=pagecnt) //pagecnt: ������ġ
			{
				movies.add(vo);
				i++; // 10���� �����ִ� ����
			}
			j++; // for ���ư��� Ƚ��
		}
		return movies;
	}
	
	public int movieTotalPage()
	{
		return (int)(Math.ceil(list.size()/10.0));
		//ceil : �ø��޼ҵ�
	}
	//�󼼺���
	public MovieVO movieDetailData(int mno)
	{
		return list.get(mno-1);
	}
	//��ȭ��ü�б�
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
	// ��ȭ�˻� 
	public ArrayList<MovieVO> movieFindData(String ss) // ArrayList:�����迭=>�˻�� �´� �������� VO�� ��� ó��
	{
		ArrayList<MovieVO> movies=new ArrayList<MovieVO>(); 
		// list ���� ������ ã�� -> movies�� ����
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
		System.out.println("������:");
		int page=scan.nextInt();
		
		MovieManager m=new MovieManager();
		System.out.println(page+" page / "+m.movieTotalPage()+" pages");
		
		//������ �б�
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
