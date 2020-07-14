/*
 *   재사용 => 기존에 만들어진 클래스를 사용 (반복코딩 제거)
 *     1) 상속 (is-a)
 *        이미 만들어진 기능을 변경해서 사용
 *        
 *        public class MyWindow extends JFrame  ==> 상속
 *        						-------
 *        						확장된 클래스
 *        		JFrame (슈퍼클래스)
 *        		  ↑
 *        	   MyWindow
 *        
 *        *** 자바 상속은 단일 상속
 *        	   다중 상속이 필요할 경우 이중 단일 상속
 *        
 *         ※ 상속의 예외 : private
 *         			  static => 사용만 가능할 뿐 상속을 내리지는 못함
 *         
 *         ※ String, Math, System, Scanner : 상속 불가 클래스(final)
 *        
 *          
 *          
 *     2) 포함 (has-a)
 *        이미 만들어진 기능을 변경없이 그대로 사용
 *        public class MyWindow
 *        {
 *        	 JFrame f=new JFrame(); ==> 포함클래스 
 *        }
 *        
 */
/*
 * 	   A클래스가 가지고 있는 모든 것이 상속 => 예외(private, static, 생성자)
 *     public class A
 *     {
 *     	  private String name;
 *        int age;
 *        public void display();
 *     }
 *     
 *     public class B extends A
 *     {
 *        int age;
 *        public void display();
 *        =======================> 보이진 않지만 자동으로 기능이 상속
 *     }
 *     
 *   
 *         
 *     
 */
import javax.swing.*;
public class MainClass extends JFrame {
	/*
	 * public MainClass() { // 생성자는 가급적이면 public 메서드로 만든다
	 * 
	 * }
	 */
	public MainClass() {
		//기능
		super.setSize(300, 300); //상위클래스 JFrame 메소드 호출
		this.setVisible(true); //자기클래스 MainClass 메소드 호출 (this 생략가능)
		 					   //==> 상속이므로 같은 기능
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new MainClass();

	}

}
