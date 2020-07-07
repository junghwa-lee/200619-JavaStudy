// 국어 영어 수학 => 총점, 평균, 학점
import java.util.*;
public class 자바메소드2 {
	// 입력
	static int userInput(String subject)
	{
		Scanner scan=new Scanner(System.in);
		System.out.print(subject+" 점수입력:");
		int score=scan.nextInt();
		return score;
	}
	
	static int total(int kor, int eng, int math)
	{
		return kor+eng+math;
	}
	
	static void avg(int total)
	{
		System.out.printf("평균:%.2f\n",total/3.0);
	}
	
	static void hakjum(int total)
	{
		int score=total/3;
		if(score>=90)
			System.out.println("학점:A");
		else if(score>=80)
			System.out.println("학점:B");
		else if(score>=70)
			System.out.println("학점:C");
		else if(score>=60)
			System.out.println("학점:D");
		else
			System.out.println("학점:F");
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int kor=userInput("국어");
		int eng=userInput("영어");
		int math=userInput("수학");
		int total=total(kor,eng,math); //변수명=메소드명
		
		
		//c출력
		System.out.println("국어점수:"+kor);
		System.out.println("영어점수:"+eng);
		System.out.println("수학점수:"+math);
		System.out.println("총점:"+total);
		avg(total);
		hakjum(total);
				
	}

}
