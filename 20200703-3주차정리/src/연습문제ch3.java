
public class ��������ch3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//3-2
				int numOfApples=123;
				int sizeOfBucket=10;
				int numOfBucket=0;
				
				if(numOfApples%sizeOfBucket==0)
				{
					numOfBucket=numOfApples/sizeOfBucket;
				}
				else
				{
					numOfBucket=numOfApples/sizeOfBucket+1;
				}
				System.out.println("�ʿ��� �ٱ����� ��:"+numOfBucket);
				
				//3-9
				char ch='z';
				boolean b= (ch>='a' && ch<='z' || ch>='A' && ch<='Z' || ch>='0' && ch<='9');
				System.out.println(b);	
	}

}
