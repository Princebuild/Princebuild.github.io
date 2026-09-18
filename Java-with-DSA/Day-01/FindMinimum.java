public class FindMinimum {
    public static void main(String[] args) {

        int[] arr = {10, 25, 7, 90, 45};

        int min = arr[0];

        for (int i = 1; i < arr.length; i++) {

            if (arr[i] < min) {
                min = arr[i];
            }
        }

        System.out.println("Minimum = " + min);
    }
}
//arr.length  like a  given table or number {10, 25, 7, 90, 45} 
