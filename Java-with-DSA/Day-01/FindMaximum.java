public class FindMaximum {
    public static void main(String[] args) {

        int[] arr = {10, 25, 7, 90, 45};

        int max = arr[0];

        for (int i = 1; i < arr.length; i++) {

            if (arr[i] > max) {
                max = arr[i];
            }
        }

        System.out.println("Maximum = " + max);
    }
}
/*
compare all number like  10 no is greater than other number tb compare krna hoga jaise
  25 > 10 → max = 25
7  > 25 → No
90 > 25 → max = 90
45 > 90 → No
  sabse greater hoga wahi maximum no hai
  */
