
/*
 *    ���� : �ʿ� => �����ؼ� ����� �� �ִ� �޸� ������
 *    ��� : ������ �� ���� ��
 *    
 *    ������ ����
 *    --------
 *    1) �� ���� ������ ����  => ����
 *    2) ���� Ÿ���� ������ �����ϴ� ����
 *    3) �ٸ� Ÿ���� ������ �����ϴ� ����  => Ŭ����
 *       = �����θ� ����ϴ� ���(����� ���� ��������) : �������� Ŭ����
 *       = ��ɸ� ���� => �׼� Ŭ����
 *    *** ���� => �޸𸮿� ���� => ���α׷��� �����ϸ� �ڵ����� �޸𸮿��� �������
 *    ������ ���
 *      �޸𸮿� ���� =>  �޸� ũ��, ������ -> {}�ȿ����� ��� ����
 *    
 *    
 *      
 *      
 */
      
public class �������� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 10���� ������(����) => �迭
		// 2���� ���� => �Ϲ� ���� 
		// ���� ������ ���� => char[], String[]
		// true/false ==> boolean
		
		
		// ���ڸ� 1~10 ���� => �ߺ�x (���Ƿ� ����)
		int[] com=new int[10]; 
		/*
		// 10�� �����Ϳ� �ʱⰪ ����
		for(int i=0;i<10;i++)
		{
			com[i]=(int)(Math.random()*10)+1;
		}
		
		for(int i:com)
		{
			System.out.print(i+" ");
		}
		*/
		
		int su=0; //������ ����
		//�ߺ��� ������ ����(false), �ߺ��� �Ǹ� (true) ������ �ٽ� �߻�
		boolean bCheck=false;
		// ����Ǽ�
		// �α��� -> 3�� => String, int, char
		// ID, PWD, LOGIN
		for(int i=0;i<10;i++)
		{
			//�ߺ����� Ȯ��, �ߺ��� �Ǹ� �ٽ� ���� �߻�
			bCheck=true;
			while(bCheck)
			{
				//����
				su=(int)(Math.random()*10)+1;
				//����Ȯ��
				bCheck=false;
				//��=>���� ���� ����Ǿ����� Ȯ��
				for(int j=0;j<i;j++)
				{
					if(com[j]==su)
					{
						bCheck=true;
						break;
					}
				}
				
			}//while end
			com[i]=su;
			
			
		}
		for(int i:com)
		{
			System.out.print(i+" ");
		}
		
		
		
		
		
		
	}

}
