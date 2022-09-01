package for5_object;

public class Upper {
	public static void main(String[] args) throws Number{
       String a="9876543210";
       try {
    	   if(a.length()==10) {
    		   System.out.println("Valid Mobile number");
    	   }
    	   else {
    		   throw new Number("Not a valid number");
    	   }
       }
       catch(Number e) {
    	   System.out.println(e.getMessage());
    	   
       }
	}
}