

/*
 *   =========================
 *   	1	2	3	4	5
 *   =========================
 *   		6	7	8
 *   =========================
 *   			9
 *   =========================
 *   		10	11	12
 *   =========================
 *   	13	14	15	16	17
 *   =========================
 *   		j_s		j_e
 *   i=0	 0    	 4
 *   i=1	 1		 3
 *   i=2	 2		 2
 *   	
 *  	i와 j_s ==> j_s=i
 *  	i와 j_e ==> i+j_e=4 ==> j_e=4-i
 *  	for(int i=0;i<3;i++)
 *	   {
 *			for(int j=i;j<4-i<j++)
 *			{
 *			}
 *	   }
 *		
 *	 		j_s		j_e
 *   i=3	 1    	 3
 *   i=4	 0		 4
 *   	
 *   	i와 j_s ==> j_s=4-i
 *   	i와 j_e ==> j_e=i
 */
public class 이차원배열2 {
	public static void main(String[] args) {
		//5행 5열 배열
		int[][] arr=new int[5][5];		

		int k=1;
		for(int i=0;i<3;i++)
		{
			for(int j=i;j<=4-i;j++)
			{
				arr[i][j]=k;
				k++;
			}
		}
		
		for(int i=3;i<=4;i++)
		{
			for(int j=4-i;j<=i;j++)
			{
				arr[i][j]=k;
				k++;
			}
		}
		
		//출력
		for(int i=0;i<5;i++)
		{
			for(int j=0;j<5;j++)
			{
				if(arr[i][j]==0)
					System.out.print("\t");
				else
					System.out.print(arr[i][j]+"\t");
			}
			System.out.println("\n");
		}
		
 /*   
 *   
 *   =========================
 *   			1
 *   =========================
 *   		2	3	4
 *   =========================
 *   	5	6	7	8	9
 *   =========================
 *   		10	11	12
 *   =========================
 *   			13
 *   =========================
 */   
  
 /*    
  * =========================
 *   	1				13
 *   =========================
 *   	2	6		10	14
 *   =========================
 *   	3	7	9	11	15
 *   =========================
 *   	4	8		12	16
 *   =========================
 *   	5				17
 *   =========================
 */

		
		
		
		
		
	}
}
