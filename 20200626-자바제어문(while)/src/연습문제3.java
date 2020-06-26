
public class ¿¬½À¹®Á¦3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	    int a=0;
	    int b=0;
	    
	    for(int i=1;i<=30;i++)
	    {
	    	if(i%2==0)
	    	{
	    		a+=i;
	    	}
	    	else
	    	{
	    		b+=i;
	    	}
	    }
	    
	    System.out.println("Â¦¼öÇÕ:"+a); 
	    System.out.println("È¦¼öÇÕ:"+b); 
	    
	    
	    a=0;
	    b=0;
	    
	    int i=1;
	    while(i<=30)
	    {
	    	if(i%2==0)
	    	{
	    		a+=i;
	    	}
	    	else
	    	{
	    		b+=i;
	    	}
	    	
	    	i++;
	    }
	    
	    System.out.println("Â¦¼öÇÕ:"+a); 
	    System.out.println("È¦¼öÇÕ:"+b); 
	}

}
