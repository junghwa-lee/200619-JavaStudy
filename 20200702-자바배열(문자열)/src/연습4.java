import java.util.Scanner;

public class 연습4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String course[]= {"Java", "C++", "HTML5", "컴퓨터구조", "안드로이드"};
		int jumsu[]= {95,88,76,62,55};
		
		Scanner scan=new Scanner(System.in);
		
		boolean bCheck=false;
				
		while(true)
		{	
			bCheck=false;
			System.out.print("과목 이름 >> ");
			String subject=scan.nextLine();
			if(subject.equals("그만"))
			{
				break;
			}
			for(int i=0;i<course.length;i++)
			{
				if(subject.equals(course[i]))
				{
					bCheck=true;
					System.out.println(jumsu[i]);
				}
				
				//여러번 동시 수행=>else x
				
			}
			
			if(bCheck==false)
			{
				System.out.println("없는 과목입니다!!");
			}
		}
	}

}
