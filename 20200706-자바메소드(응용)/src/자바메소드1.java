/*
 *   5개의 정수를 보낸다
 *   5개의 정수 => SORT => 전송
 *             ------
 *             select 
 *    
 *   =========================
 *   1) 메소드 : 재사용 목적(사용편리하게 제작)
 *             반복제거
 *   
 */
public class 자바메소드1 {
	/*
	 *   10 40 30 50 20
	 *   -- --
	 *   10 40			① i와 i다음값(j)부터 비교
	 *   --    --	
	 *   10    30
	 *   --       --
	 *   10		  50
	 *   --			 --
	 *   10          20  
	 *   ===============> for i=0 
	 *   10 40 30 50 20
	 *      -- -- 			
	 *      30 40
	 *      --    --
	 *      30    50
	 *      --		 --
	 *      20		 30
	 *   ================> i=1
	 *   10 20 40 50 30
	 *    	   -- --
	 *    	   40 50
	 *    	   --    --
	 *         30    40
	 *   ================> i=2
	 *   10 20 30 50 40
	 *    		  -- --
	 *            40 50
	 *   ================> i=3
	 *   10 20 30 40 50
	 */
	static int[] sort(int[] arr, String type)
	{
		//sort 
		for(int i=0;i<arr.length-1;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
			  if(type.equals("ASC"))
			  {
				  if(arr[i]>arr[j])  // > 올림차순 , < 내림차순
				  {
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				  }
			  }
			  if(type.equals("DESC"))
			  {
				  if(arr[i]<arr[j]) 
				  {
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				  }
			  }
			  
			}
		}
		return arr;
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 호출
		int[] arr= {10,40,30,50,20}; // sort => 10,20,30,40,50
		System.out.println("정렬 전:");
		for(int i:arr)
		{
			System.out.print(i+" ");
		}
		
		System.out.println("\n정렬 후:");
		int[] result=sort(arr, "ASC");
		for(int i:result)
		{
			System.out.print(i+" ");
		}
		System.out.println();
		
		result=sort(arr, "DESC");
		for(int i:result)
		{
			System.out.print(i+" ");
		}
		
		
		
	}

}
