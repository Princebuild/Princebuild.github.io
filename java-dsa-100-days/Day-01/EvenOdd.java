import java.util.Scanner;
/*
even n0 =( n%2 ==0) then no is even
  if(n % 2 is not equal to zero tb  no odd hota hai
  */
public class EvenOdd {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        if (n % 2 == 0) {
            System.out.println("Even");
        } else {
            System.out.println("Odd");
        }

        sc.close();
    }
}
