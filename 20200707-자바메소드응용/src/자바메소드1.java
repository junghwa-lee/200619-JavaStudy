/*
 *   메소드 : 한 가지 기능만 수행 -> 다음에 다시 사용 가능
 *    - 목적 
 *        1) 재사용
 *        2) 반복 제거
 *    - 형식
 *        반환형이 없는 경우 : void
 *        매개변수가 없는 경우 (매개변수 : 사용자가 요청한 값)
 *        반환형이 있는 경우 : 사용자가 요청한 내용의 결과값 => 반드시 1개만 존재
 *        매개변수가 있는 경우 => ID 중복체크(id), 우편번호 검색(동, 길), 로그인(id, pwd)
 *        					여러 개 => 배열, 클래스
 *        
 *        반환형(리턴형) 메소드명(매개변수,매개변수..)
 *        {
 *        		종료 => return 
 *        }
 *        
 *        void process()
 *        {
 *        	if(key==ENTER)
 *        	{
 *        		return;//강제종료 => 꼭 마지막에 써야하는것은 아님
 *        		System.out.println(); => 오류
 *        	}
 *        	동작
 *        	return; => return 문장 밑에는 소스 코딩을 할 수 없다
 *        }
 *        
 *        ※ 제어 (break, continue, return) 
 *          => 밑에 소스 코딩 x
 *       
 *     - 호출
 *     	 int add(int a,int b) {
 *     		return a+b; }
 *       => int a = add(10,20)
 *     	 
 *       
 *       void add(int a, int b)
 *        => add(10,20)
 *       
 *       호출시마다 메소드 처음부터 return까지 수행 => 다시 호출한 위치로 돌아옴
 *        
 */
// 사용자가 년도를 입력하면 윤년여부확인
// 다음에 다시 사용할 수 있는가? => 수정 가능 modify(오버라이딩) , 추가 가능 new(오버로딩)
import java.util.*; 
public class 자바메소드1 {
	// 메소드 2개 
	//사용자 연도 입력
	static int userInput()
	{
		Scanner scan=new Scanner(System.in);
		System.out.print("연도를 입력:");
		int year=scan.nextInt();
		return year;
	}
	//윤년 여부 확인=>재사용
	static boolean isYear(int year)
	{
		boolean bCheck=false;
		if((year%4==0 && year%100!=0) || (year%400==0))
		{
			bCheck=true;
		}
		else
		{
			bCheck=false;
		}
		return bCheck;
	}
	
	
	public static void main(String[] args) {
		/*
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.print("연도를 입력:");
		int year=scan.nextInt();
		
		if((year%4==0 && year%100!=0) || (year%400==0))
		{
			System.out.println(year+"년도는 윤년입니다");
		}
		else
		{
			System.out.println(year+"년도는 윤년이 아닙니다");
		}
	*/
		
	int year=userInput();
	boolean bCheck=isYear(year);
	if(bCheck==true)
		System.out.println("윤년입니다");
	else
		System.out.println("윤년이아닙니다");	
		
		
		
		
		
		
		
	}

}
