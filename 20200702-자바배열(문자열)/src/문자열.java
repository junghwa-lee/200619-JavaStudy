/*
 *   1. 배열
 *      => 같은 타입을 여러개 묶어서 관리
 *      => 배열생성 -> 연속적인 메모리 구조(인덱스)
 *      => 일차원 배열 [] 
 *      		  ---
 *      		  1) 문자열 배열
 *      			 String[] arr  == String arr[]
 *                2) 정수 배열
 *                	 int[] arr
 *                3) 논리 배열
 *                   boolean[] arr
 *      => 선언 방식
 *          문자열 10개 
 *          String[] arr;
 *      => 초기값
 *          1) String[] arr;
 *             arr=new String[10];
 *          2) String[] arr=new String[10]; => 선언과 동시에 초기값
 *          3) int[] arr={10,20,30,40,50} => 등록된 갯수(5개 배정)
 *             => 선언시에 메모리 저장 갯수를 등록 (고정적)
 *      => 인덱스 사용
 *          ex)
 *              int[] arr={10,20,30,40,50}
 *              =====
 *              배열의 첫번째 주소 
 *              0x100
 *              ===== arr[0] arr[1]  arr[2] arr[3] arr[4]  => index번호 0부터 시작
 *         			  ====================================
 *             		     10    20       30    40    50
 *           		 |======|======|=======|=====|========
 *                  100    104    108     112   116     => 4byte(int) / 4byte(String)
 *                  
 *                  arr[0] ==> 일반변수와 동일 역할 수행
 *                  arr[0]=100 => 값 변경 가능
 *      => 출력
 *          번호(0~~) => 연속적으로  인덱스번호를 가짐
 *          for, while문을 이용해서 출력
 *          
 *          - for (횟수지정)
 *            1) 일반for문  ===> 인덱스 이용(제어)
 *                => 값 변경, 삭제
 *                => Back-end
 *            2) 향상된 for문(for-each)  ==> 실제 저장된 값(출력용)
 *           	  => 값 변경 불가능
 *           	  => Front-end
 *           
 */
public class 문자열 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 정수 ==> 5개 저장 => 평균
		// 1. 정수 5개 저장하는 메모리 공간 설정 (연속적으로 사용)
		int[] arr={30,50,70,90,10};
		/*
		int total=arr[0]+arr[1]+arr[2]+arr[3]+arr[4];
		double avg=total/5.0;
		System.out.println("저장된 정수의 평균:"+avg);
		*/
		
		int total=0;
		for(int i=0;i<5;i++)
		{
			total+=arr[i]; //arr[0]+arr[1]+arr[2]+arr[3]+arr[4]	
		}
		
		System.out.println("저장된 정수의 평균:"+(total/5.0));
		
		// 향상된 for
		// for(실제 저장된 데이터형 : 배열명)
		/*
		 *  arr => 30,50,70,90,10
		 *  for(int i:arr)
		 *  => i=30 
		 *  => i=50
		 *  => i=70
		 *  => i=90
		 *  => i=10
		 *  => 값이 없을 때 자동 종료
		 */  
		
		total=0;
		for(int i:arr)
		{
			total+=i;
		}
		System.out.println("저장된 정수의 평균:"+(total/5.0));
		
		
		

	}

}
