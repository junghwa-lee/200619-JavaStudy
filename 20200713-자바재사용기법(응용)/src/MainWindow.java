import javax.swing.*;
/* 
 *  윈도우내용을 변경 => 상속
 *  class A extends JFrame
 *  
 *  있는 그대로 => 포함
 *  class A
 *  {
 *  	JFrame f=new JFrame();
 *  }
 *  
 *  ※ 자바의 모든 클래스는 상속(생략)
 *    class MainWindow2 (extends Object)
 *    						     ------
 *    							 모든 클래스가 상속을 받아서 처리
 */

//상속
public class MainWindow extends JFrame{
	//실행하자마자 => 윈도우 생성
	// 생성자
	public MainWindow()
	{
		//윈도우 화면 설계
		setSize(800, 600); //JFrame=>메소드 => 상속
		setVisible(true);
	}
	public static void main(String[] args) {
		// 생성자 
		new MainWindow();
	}
}
