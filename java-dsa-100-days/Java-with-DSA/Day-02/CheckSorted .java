public class CheckSorted {
    public static void main(String[] args) {

        int[] arr = {10, 20, 30, 40, 50};

        boolean sorted = true;

        for (int i = 1; i < arr.length; i++) {

            if (arr[i] < arr[i - 1]) {
                sorted = false;
                break;
            }
        }

        if (sorted) {
            System.out.println("Sorted");
        } else {
            System.out.println("Not Sorted");
        }
    }
}
/*
sort ka matalb selection acending order or descending order
  alawys compare adjcent number 
  10 <= 20 ✅
20 <= 30 ✅
30 <= 40 ✅
40 <= 50 ✅*/
