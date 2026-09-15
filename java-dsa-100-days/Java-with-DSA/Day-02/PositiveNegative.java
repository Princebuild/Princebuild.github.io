public class PositiveNegative{
  public class static void main(String[]args){
    int[] arr = { -2,5,9,-9,-10,1};

    int Positive = 0;
    int Negative = 0;

    for(int i = 0; i,arr.length;i++){
      if(arr[i]>0){
      Positive++;
      }
      elseif(arr[i]<0){
        Negative++;
      }
    }
    System.out.println("Positive = " + Positive);
      System.out.println("Negative = " + Negative);
      
  }
  
}
/*
most important codition
  if(condition){
  count ++;}
ye counting problem me bahut importAN HAI
  */
