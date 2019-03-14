package OutOfBOunce;

public class MyClass{
	 
	   public static void main(String args[]){
	      try{
	         int myArray[] = new int[7];
	         // trying to access element 9
	         System.out.println(myArray[9]);
	      }
	      catch(ArrayIndexOutOfBoundsException e){
	         System.out.println("The element " + e.getMessage() + " does not exist!");
	         System.out.println(e.getMessage());
	      }
	   }
	}