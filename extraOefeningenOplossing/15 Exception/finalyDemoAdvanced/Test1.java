package finalyDemoAdvanced;

//case if no exception

class Test1 {
	public static void main(String[] args) {
		try {
			System.out.println("try block executed");
		} catch (ArithmeticException e) {
			System.out.println("catch block executed");
		} finally {
			System.out.println("finally block executed");
		}
	}
}