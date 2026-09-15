public class SecondLargest {
    public static void main(String[] args) {

        int[] arr = {10, 25, 7, 90, 45};

        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] > largest) {
                secondLargest = largest;
                largest = arr[i];
            } 
            else if (arr[i] > secondLargest && arr[i] != largest) {
                secondLargest = arr[i];
            }
        }

        System.out.println("Second Largest = " + secondLargest);
    }
}
/* suppose 10;
then largest = 10
secondLargest = -∞
  25 aaya
  largest = 25
secondLargest = 10
  */
