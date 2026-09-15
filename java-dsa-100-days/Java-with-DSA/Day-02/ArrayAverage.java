public class ArrayAvarage{
  public static void main (string[ args){

  int[] arr = {10,20,30,40,50};
    int sum = 0;
    for(int i = 0; i < arr.length;i++){
      sum += arr[i;
    }
    double avg = (double)sum/arr.length;
    System.out.println("Average =" + average);

      }
}

/*average = 30.0
  double(sum) type casting hai agar int ko int /int karoge toh decimal part lose ho sakta hai*/
