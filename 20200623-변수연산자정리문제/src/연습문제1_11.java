
public class 연습문제1_11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/* 1번
		 * int a;
		int b;
		a=3;
	    b=a+5;
		System.out.printf("a의 값:%d \n", a);
		System.out.printf("b의 값:%d \n", b);
	   */
		/*2번
		 * int a,b; 
		 * a=6; 
		 * b=2; 
		 * System.out.printf("덧셈 연산 결과:%d \n", a+b);
		 * System.out.printf("뺄셈 연산 결과:%d \n", a-b); 
		 * System.out.printf("곱셈 연산 결과:%d \n",a*b); 
		 * System.out.printf("나누기 연산 결과:%d \n", a/b);
		 * System.out.printf("나머지 연산 결과:%d \n", a%b);
		 */
		
		/* 3번
		 * int num1, num2; 
		 * num1=10/3; 
		 * num2=10%3; 
		 * System.out.printf("목:%d\n", num1);
		 * System.out.printf("나머지:%d\n", num2);
		 */	
		/*4번
		 * int num1=1, num2=2, num3=3, num4=4, num5=5; 
		 * num1=num1+num2; 
		 * num2=num2-2;
		 * num3=num3*2; 
		 * num4=num4/2; 
		 * num5=num5%2;
		 * System.out.printf("%d,%d,%d,%d,%d \n",num1,num2,num3,num4,num5);
		 */
		/*5번
		 * int num1=10; 
		 * System.out.printf("%d \n",num1); 
		 * num1++;
		 * System.out.printf("%d \n",num1); 
		 * ++num1; 
		 * System.out.printf("%d \n",num1);
		 * --num1; 
		 * System.out.printf("%d \n",num1); 
		 * num1--;
		 * System.out.printf("%d \n",num1);
		 */
		/*6번
		 * int num1=10, num2=10; 
		 * int a, b;
		 * a=++num1;
		 * b=num2++;
		 * System.out.printf("%d, %d \n",b,num2);
		 */
		/*7번
		 * int num1=10, num2=10; 
		 * int a,b; 
		 * num1=num1+1; 
		 * a=num1;
		 * System.out.printf("%d, %d \n",a,num1); 
		 * b=num2; 
		 * num2=num2+1;
		 * System.out.printf("%d, %d \n",b,num2);
		 */
		/*8번
		 * int num1=10, num2=10; 
		 * System.out.printf("%d \n",++num1);
		 * System.out.printf("%d \n",num1); 
		 * System.out.printf("%d \n",num2++);
		 * System.out.printf("%d \n",num2);
		 */
		/*9번
		 * int num1=10, num2=10; 
		 * System.out.printf("%d \n",++num1);
		 * System.out.printf("%d \n",num1); 
		 * System.out.printf("%d \n",num2++);
		 * System.out.printf("%d \n",num2);
		 */
		/*10번
		 * int num1 = 2; 
		 * int num2 = 7; 
		 * int num3; 
		 * int num4; 
		 * num1++; 
		 * num3=--num1; 
		 * --num2;
		 * num4=num2++; 
		 * System.out.printf("%d \n",num3);
		 * System.out.printf("%d \n",num4);
		 */
		//11번
		int i=0;
		int re=0;
		i=3;
		re=++i;
		System.out.println("re:"+re+",i:"+i);
		i=3;
		re=i++;
		System.out.println("re:"+re+",i:"+i);
	}

}
