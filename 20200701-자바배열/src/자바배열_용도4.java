/*
 *    �迭 = �뵵���� ��� ����Ѵ�
 *     => ���� 
 *            ������[] �迭��;
 *            ---- �⺻��
 *            byte[] b => file ����
 *            String[] s => ���ڿ��� ���� ��� (�̸�, �ּ�, ��ȭ��ȣ)
 *            int[] i => �������, ���
 *            double[] d => ���, �󵵼�, ������
 *            boolean[] b => ���翩��
 *    
 */
public class �ڹٹ迭_�뵵4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] s= {
				"strawberry",
				"tangerine", 
				"melon",
				"banana",
				"grape",
				"watermelon",
				"plum"
		};
		// ���ϸ� �߿� ���� �� ������?
		
		// ��ü���ϸ��
		System.out.println("==== ��ü ���ϸ� ====");
		for(String ss:s) // **index�� �������� ����, ���� ������ �� ����
		{
			System.out.println(ss);
		}
		System.out.println("================");
		System.out.println("���ϸ� �߿� ���� �� ������?");
		int max=0;
		for(String ss:s)
		{
			int len=ss.length(); // ���ڿ� => ������ ���� (length())
			if(max<len)
				max=len;
		}
		
		//���
		for(String ss:s)
		{
			if(ss.length()==max)
			{
				System.out.println(ss);
			}
		}
		
		// ���ϸ� �߿� ���� ª�� ������?
		
		System.out.println("================");
		System.out.println("���ϸ� �߿� ���� ª�� ������?");
		int min=100;
		for(String ss:s)
		{
			int len=ss.length(); // ���ڿ� => ������ ���� (length())
			if(min>len)
				min=len;
		}
		
		//���
		for(String ss:s)
		{
			if(ss.length()==min)
			{
				System.out.println(ss);
			}
		}
		
		System.out.println("================");
		
		
		// ���� ���� Ȯ�� ==> ��й�ȣ
		/*
		 *   ���ڿ� ==>
		 *   String ===> char[]==> ���۹�ȣ�� 0
		 *   "Hello Java"
		 *   
		 */
		
		String msg="Hello Java"; //charAt() ==> ���ڿ����� ���ϴ� ���� ����
		// ���� ��ȣ�� 0���� ����
		
		//System.out.println("5��° ����?");
		//System.out.println(msg.charAt(5));
		
		for(int i=0;i<msg.length();i++)
		{
			System.out.println(msg.charAt(i));
		}
		 
	}

}
