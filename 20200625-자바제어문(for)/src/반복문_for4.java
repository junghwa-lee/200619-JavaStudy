/*
 *    1~100 ���� �� ���ϱ�
 *    
 *    
 */

public class �ݺ���_for4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// ���� => 1~100���� ���� �� -> ����
		
		int sum=0; 
		for(int i=1;i<=100;i++) {
			sum+=i; 
			/*
			 *    sum:�������� / i:��������
			 *    sum=sum+1
			 *    sum=sum+i (sum=0, i=1) => sum=1
			 *    sum=sum+i (sum=1, i=2) => sum=3
			 *    ....
			 */
			System.out.printf("1���� %d������ ��:%d\n",i,sum);
		}

	}

}
