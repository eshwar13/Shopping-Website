
import java.util.Scanner ;
public class Customer 
{
	 public void displaycustomer(String name ,  String  mobile  ,int age, int amount)
	 {
		   System.out.println( "Name : " + name + "  AGe : " + age + "  mobile : " + mobile  +  "  Bill amount : " + amount );
		   }
		

   public static void main(String[] args)
   {
	   System.out.println(" 1 . Senior CItizen ");
	   System.out.println(" 2 . Priviligaed customer ");
	   System.out.println("3. Coupon customer ");
	   

	String take1 ;
	do
	   {
		
		
		
	   
     Scanner in = new Scanner(System.in);
      System.out.println("enter your choice ");
     int choice = in.nextInt();
     System.out.println(" Enter your name ");
     String name = in.next();
     System.out.println("enter your mobile number ");
     String mobile = in.next();
     System.out.println("Enter your Age ");
     int age = in.nextInt();
     
     
     System.out.println("Enter the purchased amount ");
     int amount = in.nextInt();
     switch(choice)
     {
     case 1 :
    	 Scitizen o1 = new Scitizen();
    	 o1.displaycustomer(name ,mobile , age , amount );
    	 o1.billamount(amount);
    	 break ;
     
    
     
     
    	 

    	 
     case 2 :
    	     Pcustomer o2 = new Pcustomer();
    	     o2.displaycustomer(name, mobile, age, amount);
    	     o2.billamount(amount);
    	     break ;
    	     
     case 3 :
    	
    	      Coupon o3 = new Coupon();
    	      o3.billamount(amount);
    	      break ;
    	 
     }
     System.out.println("To continue press Y or TO exit N ");
        take1 = in.next();
   }
	   
	   while(take1.equals("Y"));
	   while(take1.equals("N"))
	   {
		   System.out.println("Thanks for shopping ");
		   break ;
	   }

}
}
     
     
  


  
  

         class Scitizen extends Customer
{
      public void billamount( int amount) 
   {
    	  int res = amount - 500 ;
    System.out.println( "  Congracts !! you got discount of 10 %  " );
    System.out.println(" BIll amount " + res );
    }
     
}

         class Pcustomer extends Customer  
{
       public void billamount(int amount)
{
    	   int res = amount - 1500 ;
    	   System.out.println(" Congracts !!  You got discount of 30% ");
    	   System.out.println( "Bill amount " + res );
         
}
}
          class Coupon extends Customer 
          {
        	  public void billamount(int amount)
        	  {
        		if(amount >= 6000)
        		{
        			int res = amount - 2500 ;
        		  System.out.println("Congracts !! You are eligible for 50% off ");
        		  System.out.println("Bill amount " + res );
        	  }
        		else
        		{
        			System.out.println("BIll amount " +  amount );
        		}
          }
          }


