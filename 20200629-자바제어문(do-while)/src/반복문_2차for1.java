/*
 *    중첩for문
 *    =======
 *    형식)
 *              ①     ②    ④
 *         for(초기값;조건식;증가식)
 *         {
 *         	 ======================	③	
 *            for(초기값;조건식;증가식)
 *            {
 *                반복 수행문장
 *            }
 *           ======================
 *         }
 *         
 *         ex)
 *             for(int i=1;i<=3;i++) // 세로출력(줄수)
 *             {
 *             		for(int j=1;j<=3;j++) // 가로출력
 *                  {
 *                  	system.out.println("i="+i+",j="+j);
 *                  }
 *             }
 *             
 *             i=1    ==>  j=1
 *             			   j=2
 *             			   j=3
 *             		      ===== i++
 *             ...
 *             i=4   ==> 종료
 *             
 *           ex)  
 *             구구단
 *             2*1  ....   9*1=9   ====> 8단(2차for)
 *             
 *             2*9  ....   9*9=81  
 *           ==>9줄(1차for)
 *             
 *        
 */
public class 반복문_2차for1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=1;i<=9;i++) // 줄수
		{
			for(int j=2;j<=9;j++) // 
			{
				System.out.printf("%2d*%2d=%2d\t",j,i,j*i);
			}
			System.out.println();
		}
		
		
		
		
	}

}
