/*
 *   반복문 - for , while, do~while
 *      ==== 프로그래머의 사용빈도   
 *      for : 반복 횟수가 있는 경우에 주로 사용
 *      while : 반복 횟수가 없는 경우에 주로 사용
 *        ==> for <=> while , 다중조건문 <=> 선택문
 *      do~while : 조건을 나중에 검색 => 한 번 이상 반드시 수행
 *      
 *      1. for
 *         형식)  for(초기값(변수) ; 조건식(비교연산자,논리연산자,부정연산자) ; 증감식)
 *               					 -----
 *               					 반드시(true/false)
 *                ==> 초기값, 조건식, 수행문장, 증가식                       
 *                			 -------------------> 
 *                          = true => 반복
 *                          = false => 종료
 *               
	 *          ex)  for(int i=1;i<=10;i++)
	 *               {
	 *               	반복 수행문장
	 *               }
	 *               	1) int i=1 => 1부터 시작
	 *                  2) i<=10  => 10이 될 때까지
	 *                  3) 반복 수행 문장
	 *                  4) +1 증가
	 *                  => true일 경우 2~4 반복 , false일 때 종료
	 *                  
	 *                  ※주의점 : 조건식이 false가 없으면 무한루프
	 *                        
 */
public class 반복문_for {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1~10 ==> 출력
		System.out.println("===반복문===");
		for(int i=1;i<=10;i++) {
			System.out.println(i);
		}

	}

}
