import javax.swing.*;
/*
 *   class JFrame{
 *   }
 *   
 *   1 void aaa()
 *   2 int aaa(int a)
 *   3 double aaa()
 *   4 char aaa(char c)
 *   	1,3은 같은함수 => error => return형은 관계x
 *   
 *   생성자 ==> 매개변수가 없는 경우 => 초기값을 항상 동일하게 만들 경우
 *   		   매개변수가 존재 => 초기값을 변경해서 사용
 *   
 *   오버로딩
 *   1 void aaa(double d, double d1, double d2)
 *   2 void aaa(char d, double d1, int d2) 
 *   3 void aaa(int d, float d1, double d2)
 *   4 void aaa(float d, double d1, double d2)
 *   
 *   	aaa(4.5, 'A', 100) => 동일형태(double, char, int) 없음 -> 받을 수 있는 값을 찾음 -> 1번  실행
 */
public class MainClass3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame f=new JFrame("aaa"); //매개변수=>윈도우창 제목
		f.setSize(300, 200);
		f.setVisible(true);
	
	}

}
