/*
 *    ���� Scope
 *    ========
 *    ��������
 *    =======
 *       = ��������
 *       = �������
 *       = ��������
 *       
 *       public class A
 *       {
 *           int a;  ==> ������� : class A�� ������ �� ������ ����
 *           static int b; ==> �������� : JVM class�� �ε��� �� 
 *           public static void main(String[] args)
 *           {
 *             	int c; ==> �������� 
 *           } // c���� -> main������ ����� ����
 *       }
 *       
 *       
 *       
 */
public class ���������� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		for(int i=1;i<=10;i++)
		{
			System.out.println("i="+i);
		} //i�� ����(�޸�)
		System.out.println("i="+i); => error(i����)
		*/
		
		/*
		int i=1;       ==> int i=1; �� for�ۿ� �����
		for(i=1;i<=10;i++)
		{
			System.out.println("i="+i); 
		}
		System.out.println("i="+i);  // i=11
		
		i=1;          ==>  i=11 -> i=1 ����
		System.out.println("i="+i); 
		
		
		System.gc(); // �޸� ȸ��(�������÷���)
		*/
		
		
		
		// for, while, do~while ����
		
		int i=1;
		for(i=1;i<=5;i++)
		{
			System.out.print(i+" ");
		}
		System.out.println();
		
		i=1;
		while(i<=5)
		{
			System.out.print(i+" ");
			i++;
		}
		System.out.println();
		
		i=1;
		do
		{
			System.out.print(i+" ");
			i++;
		}while(i<=5);
		
		
	}

}
