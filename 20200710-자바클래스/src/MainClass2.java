/*
 *   Ŭ���� �������
 *     - �޼ҵ� : ���, ����, ����
 *     	  ex)
 *         ���Ǳ�
 *           ����, ����� => ����
 *           ���� ���Խ� ó�� => �޼ҵ�
 *           ��ư ���� �� ó�� => �޼ҵ�
 *           
 *           
 *      public static void main(String[] args) => ok
 *      static public void main(String[] args) => ok
 *      public void main(String[] args) => error!
 *      static void main(String[] args) => error!
 *      static public void main(String[] a) =>ok
 */
public class MainClass2 {

	static public void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(args[0]);
		System.out.println(args[1]);
		System.out.println(args[2]);

		
		
	}

}
