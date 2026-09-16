public CountOccurrences.java{
  public void static main(String[] args){
    
    int [] arr = { 2,4,5,7,9,2};
    int target = 2;

  int count = 0;
    for(int i = 0; i<arr.length; i++){
      if (arr[i] == target){
        count++;
      }
    }
    Syste.out.println("Occurences =" +count);
  }
}
/*
output: occurences = 2;
important pattern = if(condition){
  count++;
}
ye pattern dsa ke liye best important hai
countoccurence ka mtlb target no me  jo number hai oo kitn baar repeat hua haiarray me
  */
