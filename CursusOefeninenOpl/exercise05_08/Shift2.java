package exercise05_08;

public class Shift2 {
	public static void main(String[] args) {
		long freeMemory = 12536485945L;
		System.out.println("bytes: " + freeMemory);
		System.out.println("KB   : " + (freeMemory >> 10));
		System.out.println("MB   : " + (freeMemory >> 20));
		System.out.println("GB   : " + (freeMemory >> 30));
	}
}
