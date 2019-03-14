package finalyDemoAdvanced;


//case if exception and wrong Exception is catched
class Test3 {
	public static void main(String[] args) {
		try {
			System.out.println("try block executed");
			System.out.println(10 / 0);
		} catch (NullPointerException e) {
			System.out.println("catch block executed");
		} finally {
			System.out.println("finally block executed");
		}
	}
}
