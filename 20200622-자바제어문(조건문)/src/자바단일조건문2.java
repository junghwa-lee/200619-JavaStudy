/* 
 *    1) 단일 조건문은 여러개를 사용해도 처음부터 마지막까지 수행됨
 *    2) 블록{}을 생략할 때는 수행문장이 1개일 경우
 */


public class 자바단일조건문2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=15; // 3의배수? 5의배수? 7의배수?
		if(a%3==0)
			System.out.println(a+"는 3의 배수입니다"); // if문
			System.out.println("if(a%3==0) 수행문장"); // 단독실행문장(무조건실행)
		// 한문장
		if(a%5==0)
			System.out.println(a+"는 5의 배수입니다");
		// 한문장
		if(a%7==0)
			System.out.println(a+"는 7의 배수입니다");
		// 한문장
		//==> if문 뒤에 ; 없음
	}

}
