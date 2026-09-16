public class FindDuplicate {
    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 2, 4};

        boolean duplicate = false;

        for (int i = 0; i < arr.length; i++) {

            for (int j = i + 1; j < arr.length; j++) {

                if (arr[i] == arr[j]) {
                    System.out.println("Duplicate = " + arr[i]);
                    duplicate = true;
                    break;
                }
            }

            if (duplicate) {
                break;
            }
        }
    }
}
/*Hume dekhna hai kaunsa number dobara aaya hai.
hame ek ek karke sabhi element se compare karna
i = 0 → arr[i] = 1

1 ko compare karo:
1 vs 2 ❌
1 vs 3 ❌
1 vs 2 ❌
1 vs 4 ❌
*/
