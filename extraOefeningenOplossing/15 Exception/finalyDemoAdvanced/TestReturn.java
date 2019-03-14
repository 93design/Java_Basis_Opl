package finalyDemoAdvanced;


//case if exception but return
class TestReturn {
	public static void main(String[] args) {
		try {
			System.out.println("try block executed");
			return;
		} catch (ArithmeticException e) {
			System.out.println("catch block executed");
		} finally {
			System.out.println("finally block executed");
		}
	}
}