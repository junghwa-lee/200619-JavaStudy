/*
 *    논리연산자 ==> if문에 주로 사용
 *    형식) && (직렬) , || (병렬)
 *        ---------   --------
 *        두개 true    한개이상 true
 *        
 *        && => 범위, 기간을 포함**
 *        || => 범위나 기간을 벗어나는 경우에 주로 사용**
 *        
 *           조건     (&&, ||) 조건
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
 *       효율적인 연산(단축계산)**
 *       	 int a=10;
 *      	 int b=9;
 *      	 a<b && ++b==a  => false , b=9
 *      	 오른쪽 조건 연산 수행 여부
 *      	 && ==> 왼쪽에 있는 조건이 false 이면 수행x
 *      	 || ==> 왼쪽에 있는 조건이 true 이면 수행x
 */
public class 이항연산자_논리연산자 {

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
