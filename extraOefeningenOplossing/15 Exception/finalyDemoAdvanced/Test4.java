package finalyDemoAdvanced;

//case if no exception

class Test4 {
	public static void main(String[] args) {
		try {
			System.out.println("try block executed");
			System.out.println(10/0);
		}  catch (Exception e) {
			System.out.println("Exception block executed");
		} catch (ArithmeticException e) {
			System.out.println("ArithmeticException catch block executed");
		} finally {
			System.out.println("finally block executed");
		}
	}
}