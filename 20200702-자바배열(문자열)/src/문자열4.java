/*
 *   indexOf(�պ���), lastIndexOf(�ں���) => ������ ��ġ ã�� => ���� 
 *   // ���� �ڸ��� => substring()
 *   
 */
public class ���ڿ�4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String msg="alskdf.alksjdfjlaks.java";
		System.out.println(msg.indexOf("."));
		System.out.println(msg.lastIndexOf("."));
		System.out.println("Ȯ����:"+msg.substring(msg.lastIndexOf(".")+1));
		System.out.println("Ȯ����:"+msg.substring(msg.indexOf(".")+1));
	}

}
