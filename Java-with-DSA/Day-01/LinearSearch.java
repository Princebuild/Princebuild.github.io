public class LinearSearch {
    public static void main(String[] args) {
      
//inear Search ek simple searching technique hai jisme hum array ke elements ko ek-ek karke,
      //starting se end tak check karte hain, jab tak required element mil nahi jata.
      
        int[] arr = {10, 20, 30, 40, 50};
        int target = 30;

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] == target) {
                System.out.println("Found at index: " + i);
                break;
            }
        }
    }
}
//Elements ko one by one check karta hai.
//Best case: O(1) → element first position par ho.
//Worst case: O(n) → element last par ho ya mile hi nahi.
