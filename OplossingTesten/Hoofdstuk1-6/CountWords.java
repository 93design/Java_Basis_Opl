package be.intecbrussel.test_basis;

public class CountWords {

	public static void main(String[] args) {


		String test = "this is not a tip";
		int wordCount=0;
		char  space= ' ';
		for (int i = 0; i < test.length(); i++) {
			if (test.charAt(i) == space) {		
				wordCount++;
			}			
		}
		if (wordCount ==0) {
			System.out.println("One word");
		} else {
			wordCount +=1;
			System.out.println(wordCount);
		}
		

	}

}
