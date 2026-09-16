public class SearchAllOccurrences {
    public static void main(String[] args) {

        int[] arr = {2, 5, 2, 7, 2, 9};
        int target = 2;

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] == target) {
                System.out.println("Found at index: " + i);
            }
        }
    }
}
/*//logic SearchAllOccurrence
output :
found at index 0;
found at index 2;
found at index 4;
 difference linear search me break hota hai or yaha pe break nhi hota hai
   */
