public class FindLastOccurrence {
    public static void main(String[] args) {

        int[] arr = {10, 20, 30, 20, 40};
        int target = 20;

        int last = -1;

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] == target) {
                last = i;
            }
        }

        System.out.println("Last occurrence = " + last);
    }
}
//last index
