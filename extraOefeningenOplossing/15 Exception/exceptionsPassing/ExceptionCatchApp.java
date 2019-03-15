package exceptionsPassing;

public class ExceptionCatchApp {

	public static void main(String[] args) {
		System.out.println("main method starts");
		
		try {
			//System.out.println("try block starts");
			//inBetweenMethod();
			//inBetweenMethodTry();
			//System.out.println("try block stops");
		} catch (ArithmeticException|NullPointerException appelmoes) {
			appelmoes.printStackTrace();
		} finally {
			System.out.println("this will always be printed");
		}
		
		inBetweenMethodTry();
		
		System.out.println("main method stops");

	}

	public static void inBetweenMethod() {
		System.out.println("\tin between method starts");
		exceptionThrowingMethod();
		System.out.println("\tin between method stops");
	}
	
	public static void inBetweenMethodTry() {
		System.out.println("\tin between method starts");
		try {
			exceptionThrowingMethod();
		} catch (NullPointerException appelmoes) {
			System.out.println("Better catch hier");
		}
		System.out.println("\tin between method stops");
	}


	public static void exceptionThrowingMethod() {
		System.out.println("\t\texception throwing method starts");
		String s = null;
		System.out.println(s.length());
		System.out.println("\t\texception throwing method stops");
	}
	
	
	
	
	
	
	
	
	

}
