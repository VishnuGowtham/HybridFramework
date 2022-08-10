package java_pratcie;

public class LocalAndGlobalVariable {

     int	x;
     
     public void test(int x)
     
     {
    	 System.out.println(x);
    	 x = 50;
    	 System.out.println(x);  	 
     }
      
	public static void main(String[] args) {
		
       LocalAndGlobalVariable obj = new LocalAndGlobalVariable(); 
       System.out.println(obj.x);
       obj.test(10);
       System.out.println(obj.x);
	}
	
}
