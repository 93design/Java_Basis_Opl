package exercise07_01;

public class SelectionSort {

   public static void main(String[] args) {
      int[] numbers = {2,6,9,3,5,7,8};
      
      System.out.println("Unsorted array");
      for(int n: numbers) {
         System.out.println(n);
      }
      
      for(int i = 0; i < numbers.length;i++) {
         int smallestIndex = i;
         for(int j= i+1; j < numbers.length; j++) {
            if(numbers[j] < numbers[smallestIndex]) {
               smallestIndex = j;
            }
         }
         int temp = numbers[smallestIndex];
         numbers[smallestIndex] = numbers[i];
         numbers[i] = temp;
      }
      
      System.out.println("Sorted array");
      for(int n: numbers) {
         System.out.println(n);
      }
      
      
   }

}
