public class ArrayElements {
    public static void main(String[] args) {

        int[] arr = {10, 20, 30, 40, 50};

        int sum = 0;

        for (int value : arr) {
            sum += value;
        }

        System.out.println("Sum = " + sum);
    }
}
/* mtlab starting me sum zero hai
  int sum = 0;
 fir ek loop use karengefor (int value : arr)
   iska mtlab  har ek element ko ek ek karke value me aayega
   value = 10
sum = 0 + 10 = 10

value = 20
sum = 10 + 20 = 30

value = 30
sum = 30 + 30 = 60

value = 40
sum = 60 + 40 = 100

  sum = sum + value
  */
value = 50
sum = 100 + 50 = 150
