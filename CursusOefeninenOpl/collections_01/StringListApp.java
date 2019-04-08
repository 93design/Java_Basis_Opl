package collections.collections_01;

public class StringListApp {

    public static void main (String[] args) { }

//        /*
//        Making a scanner for userInput and
//        a list to store that userInput
//         */
//        Scanner scanner = new Scanner(System.in);
//        List<String> words = new ArrayList<String>();
//
//        /*
//        We make a String instance to store the userInput
//         */
//        String word = null;
//
//        /*
//        We use a doWhile to see if the input ends with a given criteria
//         */
//
//        do {
//            word = scanner.next();
//            /*
//            Add to our list here
//             */
//            words.add(word);
//        } while (!word.endsWith("."));
//
//        /*
//        Close the resource of the scanner
//         */
//        scanner.close();
//
//        /*
//        Reverse iterate
//         */
//        for (int i = words.size(); i > 0; i--) {
//            System.out.println(words.get(i - 1));
//        }
//
//        /*
//        Print the quantity of elements in our list
//         */
//        System.out.println("Number of words: " + words.size());
//
//        /*
//        Convert our list to String []
//         */
//        String[] wa = words.toArray(new String[words.size()]);
//        for (String s : wa) {
//            /*
//            Iterate over it print the values with a space between them on 1 line.
//             */
//            System.out.print(s + " ");
//        }
//    }
}
