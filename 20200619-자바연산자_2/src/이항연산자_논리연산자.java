/*
 *    �������� ==> if���� �ַ� ���
 *    ����) && (����) , || (����)
 *        ---------   --------
 *        �ΰ� true    �Ѱ��̻� true
 *        
 *        && => ����, �Ⱓ�� ����**
 *        || => ������ �Ⱓ�� ����� ��쿡 �ַ� ���**
 *        
 *           ����     (&&, ||) ����
 *        
 *        jumsu>=90  &&   jumsu<=100
 *        jumsu<=0   ||    jumsu>100
 *        
 *           				&&    ||
 *       ==================================    
 *       true  true 	  true	  true 
 *       ==================================
 *       true  false 	  false	  true
 *       ==================================
 *       false	true      false	  true
 *       ==================================
 *       false	false     false	  false
 *       ==================================
 *       
 *        6<5  &&  10==10
 *       false &&   true   ====> false
 *       
 *       ȿ������ ����(������)**
 *       	 int a=10;
 *      	 int b=9;
 *      	 a<b && ++b==a  => false , b=9
 *      	 ������ ���� ���� ���� ����
 *      	 && ==> ���ʿ� �ִ� ������ false �̸� ����x
 *      	 || ==> ���ʿ� �ִ� ������ true �̸� ����x
 */
public class ���׿�����_�������� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    char c1='A';
	    int i=65;
	    char c2='B';
	    boolean bCheck=c1==i || ++c1==c2;
	    System.out.println(bCheck);
	    System.out.println(c1);
	    

	}

}
