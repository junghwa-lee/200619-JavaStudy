
public class �ڹٺ����ʱ�ȭ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * int kor=78; int eng=85; int math=96;
		 */
		/*
		 *   ���ڿ� ����
		 *   =======
		 *     7+7+"1"+7+7 
		 *     ===
		 *     14 +"1"  
		 *     =======
		 *      "141" +7
		 *      "1417"  +7
		 *      "14177"
		 *   => �޺κ��� ����Ϸ��� ()
		 *      
		 *   
		 *      
		 */
		/*
		 * System.out.println("����:"+(kor+eng+math));  =>����:259
		 * System.out.println("����:"+kor+eng+math);    =>����:788596
		 * 
		 * 
		 * 
		 */
		int a=97;
		char c=97; // char => ���� , ���� 
		System.out.println("a="+a);
		System.out.println("c="+c);
		/* a=65 c=65 ==> c=A
		 * a=97 c=97 ==> c=a
		 * 
		 */
		
		int d=1;
	    int e='1';
		System.out.println("d="+d);
		System.out.println("e="+e);
		// char �� ����, ���� ����Ѵ�
		/* 
		 *     long = int
		 *      8      4
		 *     
		 *     int = long
		 *      4     8     ==> error
		 *      
		 *     double = int, long, float
		 *     int = double ==> error
		 *    
		 *     *���� => char = int 
		 *    
		 */
		double f=10.6;
	    
	    // byte < char < int < long < float < double
		System.out.println(100); // 100�� int
		System.out.println(10.8); // 10.8�� double
		
		long i=21400000000L;
		//double i=21400000000L; ==> �Ѵٰ���
		

	}

}
 
