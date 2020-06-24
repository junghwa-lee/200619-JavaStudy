
public class 선택문5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=10;
		switch(a)
		{
		case 10:
		{
			int b=100;
			System.out.println("a="+a+",b="+b);
			break;
		}
		case 11:
		{
			int b=200; // 지역변수 : 같은 블록안에서는 같은 변수 사용x => 블록을 따로 설정해야함 
			System.out.println("a="+a+",b="+b);
			break;
		}
		}

	}

}
