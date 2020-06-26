/*
 *       영화 => 정보 저장하는 변수
 *       변수 => 변경이 가능
 *       
 *       
 *      온워드: 단 하루의 기적(2020) 상영중 
 *                             ------> boolean
		Onward 평점 08 . 1
		판타지/어드벤처
		미국
		2020.06.17 개봉
		 102분, 전체관람가
		감독 댄 스캔론 주연 크리스 프랫, 톰 홀랜드, 옥타비아 스펜서, 줄리아 루이스 드레퓌스
		예매 3위 누적관객192,053명 
		            --------> string

		결백(2019)상영중
		潔白 평점 08 . 8
		드라마
		한국
		2020.06.10 개봉
		 110분, 15세이상관람가
		감독 박상현 주연 신혜선, 배종옥, 허준호
		예매 2위 누적관객617,898명
		
		
 */
public class 변수설정 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub\
		//제목
		String title="온워드: 단 하루의 기적(2020)";
		boolean isOpen=true;
		double score=8.1;
		String na="미국";
		String genre="";
		String regdate="2020.06.17";
		String director="댄 스캔론";
		String actor="크리스 프랫";
		int time=102;
		int grade=15;
		int rank=3;
		int showUser=192053;
		
		System.out.println("====== 영화정보 ======");
		System.out.println("영화명:"+title);
		System.out.println(" "+(isOpen==true?"상영중":"미개봉"));
		System.out.println("기타:"+na+" "+grade);
		System.out.println("시간:"+time+"분");
		System.out.println("개봉일:"+regdate);
		System.out.println("감독:"+director);
		System.out.println("출연:"+actor);
		System.out.println("순위:"+rank);
		System.out.println("누적관객수:"+showUser);
		
		
		title="결백(2019)";
	    isOpen=true;
		score=8.8;
		na="한국";
		genre="드라마";
		regdate="2020.06.10";
		director="박상현";
		actor="신혜선, 배종옥, 허준호";
		time=110;
		grade=15;
		rank=2;
		showUser=617898;
		
		System.out.println("====== 영화정보 ======");
		System.out.println("영화명:"+title);
		System.out.println(" "+(isOpen==true?"상영중":"미개봉"));
		System.out.println("기타:"+na+" "+grade);
		System.out.println("시간:"+time+"분");
		System.out.println("개봉일:"+regdate);
		System.out.println("감독:"+director);
		System.out.println("출연:"+actor);
		System.out.println("순위:"+rank);
		System.out.println("누적관객수:"+showUser);
		
	}

}
