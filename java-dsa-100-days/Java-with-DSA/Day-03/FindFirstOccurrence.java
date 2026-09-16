public class FindFirstOccurrence{
  public static void main{

  int [] arr = { 10,20,30,40,50};
    int target = 20;
     for (int i = 0; i < arr.length; i++) {

            if (arr[i] == target) {
                System.out.println("First occurrence = " + i);
                break;
            }
        }
    }
}
// first occurence ka mtlb first index ke value  like first index 10
