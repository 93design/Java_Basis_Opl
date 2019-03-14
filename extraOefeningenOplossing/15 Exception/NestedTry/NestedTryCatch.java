package NestedTry;

public class NestedTryCatch {

    public static void main(String args[]){
        //Parent try block
        try{
            //Child try block1
            try{
                System.out.println("Inside block1");
                int b =45/0;
                System.out.println(b);
            } catch(ArithmeticException e1){
                System.out.println("Exception: e1");
            }
            //Child try block2
            try{
                System.out.println("Inside block2");
                int b =45/1;
                int[] temp = new int[5];
                temp[7] = 5;
                System.out.println(b);
            } catch(ArrayIndexOutOfBoundsException e2){
                System.out.println("Exception: e2");
            }
            
            //first statement you want to run
            System.out.println("Just other statement");
        } catch(ArithmeticException e3){
            System.out.println("Arithmetic Exception");
            System.out.println("Inside parent try catch block");
        } catch(ArrayIndexOutOfBoundsException e4){
            System.out.println("ArrayIndexOutOfBoundsException");
            System.out.println("Inside parent try catch block");
        } catch(Exception e5){
            System.out.println("Exception");
            System.out.println("Inside parent try catch block");
        }
        
        //next after first succeeded
        System.out.println("Next statement..");

    }

}
