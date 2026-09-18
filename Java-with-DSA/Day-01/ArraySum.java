public class ArraySum {
    public static void main(String[] args) {

        int[] arr = {10, 20, 30, 40};

        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
        }

        System.out.println("Sum = " + sum);
    }
}
/* logic simple  ek array lo or  phir sum ko 0 ke equal kr do uske baad ek for loop lga
  or jitna length n times hai to n tk chla do 
uske baad print kr do 
*/
