/*
 *   »ç¿ëÀÚ => Á¤¼öÀÔ·Â (1~12)
 *   12,1,2 => °Ü¿ïÀÔ´Ï´Ù
 *   3,4,5  => º½ÀÔ´Ï´Ù
 *   6,7,8  => ¿©¸§ÀÔ´Ï´Ù
 *   9,10,11=> °¡À»ÀÔ´Ï´Ù
 *   
 *   
 *   ========================
 *   ¹®ÀÚ => ch=scan.next().charAt(0);
 *   ¹®ÀÚ¸¦ ÀÔ·Â ¹Þ¾Æ¼­ char ch
 *     = ¼ýÀÚ  ch>='0' && ch<='9'
 *     = ¾ËÆÄºª ch>='A' && ch<='Z' || ch>='a' && ch<='z'
 *     = ÇÑ±Û ch>='°¡' && ch<='ÆR'
 *     = Æ¯¼ö¹®ÀÚ  else
 *     
 *   
 */
import java.util.*;
public class ´ÙÁßÁ¶°Ç¹®4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		int month=0;
		Scanner scan=new Scanner(System.in);
		System.out.print("¿ùÀ» ÀÔ·ÂÇÏ¼¼¿ä:");
		month=scan.nextInt();
		
		if(month==12 || month==1 || month==2) {
			System.out.println("°Ü¿ïÀÔ´Ï´Ù");
		}
		else if(month==3 || month==4 || month==5) {
			System.out.println("º½ÀÔ´Ï´Ù");
		}
		else if(month==6 || month==7 || month==8) {
			System.out.println("¿©¸§ÀÔ´Ï´Ù");
		}
		else if(month==9 || month==10 || month==11) {
			System.out.println("°¡À»ÀÔ´Ï´Ù");
		}
		else {
			System.out.println("Àß¸øµÈ ÀÔ·ÂÀÔ´Ï´Ù");
		}
		*/
		
		char ch;
		Scanner scan=new Scanner(System.in);
		System.out.print("¹®ÀÚ¸¦ ÀÔ·ÂÇÏ¼¼¿ä:");
		ch=scan.next().charAt(0);
		
		if(ch>='0' && ch<='9') {
			System.out.println("¼ýÀÚ");
		}
		else if(ch>='A' && ch<='Z' || ch>='a' && ch<='z') {
			System.out.println("¾ËÆÄºª");
		}
		else if(ch>='°¡' && ch<='ÆR') {
			System.out.println("ÇÑ±Û");
		}
		else {
			System.out.println("Æ¯¼ö¹®ÀÚ");
		}
			
	}

}
