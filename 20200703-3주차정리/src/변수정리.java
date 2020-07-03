
/*
 *    변수 : 필요 => 변경해서 사용할 수 있는 메모리 기억공간
 *    상수 : 변경할 수 없는 값
 *    
 *    변수의 종류
 *    --------
 *    1) 한 개의 데이터 공간  => 변수
 *    2) 같은 타입을 여러개 저장하는 공간
 *    3) 다른 타입을 여러개 저장하는 공간  => 클래스
 *       = 변수로만 사용하는 방법(사용자 정의 데이터형) : 데이터형 클래스
 *       = 기능만 설정 => 액션 클래스
 *    *** 변수 => 메모리에 저장 => 프로그램이 종료하면 자동으로 메모리에서 사라진다
 *    변수를 사용
 *      메모리에 저장 =>  메모리 크기, 사용범위 -> {}안에서만 사용 가능
 *    
 *    
 *      
 *      
 */
      
public class 변수정리 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 10개의 데이터(정수) => 배열
		// 2개의 정수 => 일반 변수 
		// 문자 여러개 저장 => char[], String[]
		// true/false ==> boolean
		
		
		// 숫자를 1~10 저장 => 중복x (임의로 추출)
		int[] com=new int[10]; 
		/*
		// 10개 데이터에 초기값 주입
		for(int i=0;i<10;i++)
		{
			com[i]=(int)(Math.random()*10)+1;
		}
		
		for(int i:com)
		{
			System.out.print(i+" ");
		}
		*/
		
		int su=0; //난수값 저장
		//중복이 없으면 저장(false), 중복이 되면 (true) 난수를 다시 발생
		boolean bCheck=false;
		// 경우의수
		// 로그인 -> 3개 => String, int, char
		// ID, PWD, LOGIN
		for(int i=0;i<10;i++)
		{
			//중복여부 확인, 중복이 되면 다시 난수 발생
			bCheck=true;
			while(bCheck)
			{
				//난수
				su=(int)(Math.random()*10)+1;
				//종료확인
				bCheck=false;
				//비교=>같은 수가 저장되었는지 확인
				for(int j=0;j<i;j++)
				{
					if(com[j]==su)
					{
						bCheck=true;
						break;
					}
				}
				
			}//while end
			com[i]=su;
			
			
		}
		for(int i:com)
		{
			System.out.print(i+" ");
		}
		
		
		
		
		
		
	}

}
