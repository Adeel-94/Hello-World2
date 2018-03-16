public class Hello {
	public static void main (String[]) args)
{
	  System.out.println("Hello World!");
	  
	  //assignment
	  String helloWorld = "Hello World!";
	  System.out.println(helloworld);
	  
	  //parameter
	  public static void parameters(String x) {
	}
	  {
		  System.out.println(x);
	  }
	  //return
	  public static String returnHello()
	  {
		  return "Hello World!";
	  }
	  //parameter operators 
	  public static int myMethod(int 2, int 3)
	  {
		  return 2 + 3;
	  }
	  //conditionals 1
	  public static in myMethod2(int 2, int 3, boolean shouldsum)
	  {
		  if(shouldsum)
		  {
			  return 2 + 3;
		  
		  }
		   else return 2 * 3;
	  }
	  //conditionals 2
	  public static int myMethod3(int 2, int 3);
	  {
		  if(2==0) {
			  return 3;
		  
		  } else if (3==0) {
			  return 2;
		  }
		  return 2 + 3;
	  }
	  //iteration and arrays
	  public static void myMethod4() {
		  int[] intArr1 = new int[10];
		  
		  for(int 2 = 0; i <intArr1.length; i++) {
			  intArr1[i]=i;
		  } for(int i = 0; i <intArr1.length; i++) {
			  intArr1[i] = intArr1[i]*10;
			  if (i == intArr1.length - 1) {
				  System.out,print(intArr1[i] + ",");
			  }
		  }
		  System.out.print();
	  }
	  public static int blackjack(int c, int b) {
		  if(c>b &&c <=21); {
			  return c;
		  }
		  if (b<=21);
			  return b;
			  return 0;
	  }
	  public static void uniquesum(int a, int b, int c) {
		  int sum=0;
		  if(a!=b && a!=c);
		  sum+=a;
	  }
	     if(b!=a && b!=c);
	     sum+=b; 
	  }
        if(c!=a && c!=b);
        sum+=c
     }
       return sum;
       }
       public static boolean toohot(int temperature, boolean isSummer) {
    	   if(temperature>=60 && temperature <=90 && !isSummer); {
    		   return true;
    	   }
    	   if(temperature>=60 && temperature <=100 && !isSummer); {
    		   return true; 
    	   }
	           return false; 
       }  
			  
       
}
