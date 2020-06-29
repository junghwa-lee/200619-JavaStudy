/*
 *     do-while => 반드시 한 번 이상 수행해야 할 때
 *     
 *     	 형식) 
 *            초기값 ==> int i=1; ①
 *            do{
 *            		반복 수행 문장 출력
 *            		System.out.print(i+" ");  ②
 *            		증가식
 *            		i++;  ③  
 *            				=> false면 종료, true면 ② 로 이동
 *            }while(조건식); ==> 1<=5; ④
 *            
 *            i=1
 *              1   --> i++ (i=2) --> i<=5 비교 true => do 안으로 이동
 *            i=2
 *              1 2 --> i++ (i=3) --> i<=5 비교 true => do 안으로 이동
 *            ..
 *            i=5
 *              1 2 3 4 5 --> i++ (i=6) --> i<=5 비교 false
 *            
 */
public class 반복문 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 초기값
		int i=1; // 루프변수 => 횟수 지정
		do
		{
			System.out.print(i+" ");  // 반복 실행문장 (여러문장 동시 실행 가능)
			i++; 
		}while(i<=5);
		// ==> i=6
	
		System.out.println("\n ===== while =====");
		
		//초기값
		i=1; // 기존변수 초기화(i=1) or 다른변수 설정 (int j=1;)
		while(i<=5)
		{
			System.out.print(i+" ");
			i++;
		}
		// ==> i=6
		
		System.out.println("\n ===== for =====");
		
		
		for(i=1;i<=5;i++)
		{
			System.out.print(i+" ");
		}
		
		
		
		
		
	}

}
