package pack;

public class Access{
	     
	    public int sum(int x, int y)
	    {
	    	return (x + y);
	    	} 
	    static int sum(int z) {
	    	return(z);
	    }
	    public int sum(int x, int y, int z) 
	    { 
	        return (x + y + z); 
	    } 
	   
	    public static void main(String args[]) 
	    { 
	       Access a= new Access(); 
	        System.out.println(a.sum(10, 20)); 
	        System.out.println(a.sum(10, 20, 30)); 
	        System.out.println(Access.sum(12));
	         
	    } 
	}
	