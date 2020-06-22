import java.util.Scanner;

/*  *     2. 정수 3개 입력받아서 총점, 평균, 
 *         				 학점 => 조건문 (60이상 D, 70이상 C, 80이상 B, 90이상 A 나머지 F)
 *         => 국어점수 :80
 *            영어점수 :80
 *            수학점수 :80
 *            
 *            총점 :240
 *            평균 :80.0
 *            학점 : B
 */

public class 자바조건문문제2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("국어점수 영어점수 수학점수 입력:");
		int kor=scan.nextInt();
		int eng=scan.nextInt();
		int math=scan.nextInt();
		int total=kor+eng+math;
		double avg=total/3.0;
		char score='A';
		if(avg<60)
		{
			score='F';
		}
		if(avg>=60 && avg<70)
		{
			score='D';
		}
		if(avg>=70 && avg<80)
		{
			score='C';
		}
		if(avg>=80 && avg<90)
		{
			score='B';
		}
		if(avg>=90 && avg<100)
		{
			score='A';
		}
		
		System.out.println("총점:"+total);
		System.out.printf("평균:%.2f\n",avg); // 소수점 줄일 때 
		System.out.println("학점:"+score);
	}

}
