/*
 *   ����� => �����Է� (1~12)
 *   12,1,2 => �ܿ��Դϴ�
 *   3,4,5  => ���Դϴ�
 *   6,7,8  => �����Դϴ�
 *   9,10,11=> �����Դϴ�
 *   
 *   
 *   ========================
 *   ���� => ch=scan.next().charAt(0);
 *   ���ڸ� �Է� �޾Ƽ� char ch
 *     = ����  ch>='0' && ch<='9'
 *     = ���ĺ� ch>='A' && ch<='Z' || ch>='a' && ch<='z'
 *     = �ѱ� ch>='��' && ch<='�R'
 *     = Ư������  else
 *     
 *   
 */
import java.util.*;
public class �������ǹ�4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		int month=0;
		Scanner scan=new Scanner(System.in);
		System.out.print("���� �Է��ϼ���:");
		month=scan.nextInt();
		
		if(month==12 || month==1 || month==2) {
			System.out.println("�ܿ��Դϴ�");
		}
		else if(month==3 || month==4 || month==5) {
			System.out.println("���Դϴ�");
		}
		else if(month==6 || month==7 || month==8) {
			System.out.println("�����Դϴ�");
		}
		else if(month==9 || month==10 || month==11) {
			System.out.println("�����Դϴ�");
		}
		else {
			System.out.println("�߸��� �Է��Դϴ�");
		}
		*/
		
		char ch;
		Scanner scan=new Scanner(System.in);
		System.out.print("���ڸ� �Է��ϼ���:");
		ch=scan.next().charAt(0);
		
		if(ch>='0' && ch<='9') {
			System.out.println("����");
		}
		else if(ch>='A' && ch<='Z' || ch>='a' && ch<='z') {
			System.out.println("���ĺ�");
		}
		else if(ch>='��' && ch<='�R') {
			System.out.println("�ѱ�");
		}
		else {
			System.out.println("Ư������");
		}
			
	}

}
