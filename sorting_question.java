// Given an integer array arr, move all 0's to the end of it while maintaining the relative order of the nonw zero elements. Ensure that you must do this in-place without making a copy of the array.[input:0 5 0 3 42 & output:5 3 42 0 0]
class sorting_question {
  
    public static void main (String args []){
      int arr [] = {0,5,0,3,42};
      int n=arr.length;
      for(int i=0; i<n-1; i++){
        for(int j=0; j<n-i-1; j++){
          if(arr[j] == 0 && arr[j+1] != 0){
            //swap arr[j],arr[j+1]
            int temp = arr[j];
            arr[j] = arr[j+1];
            arr[j+1]=temp;
          }
        }
        }
        for(int i=0; i<n; i++){
          System.out.print(arr[i] + " ");
        }
    }
}

//Given an array of names of the fruits; you are supposed to sort it in lexixographical order using the selection sort. input ["papaya","lime","Watermelon","apple","mango","Kiwi"]
class  sorting_question2{
  static void sortFruits(String [] fruits){
    int n= fruits.length;

    for(int i=0; i<n-1; i++){
      int min_index = i;

      for(int j=i+1; j<n; j++){
        if(fruits[j].compareTo(fruits[min_index]) < 0 ){
          min_index=j;
        }
      }
      //swap fruits[min_index],fruits[i]
      String temp = fruits[i];
      fruits[i]=fruits[min_index];
      fruits[min_index] = temp;
    }

  }
  public static void main (String args []){
    String [] fruits = {"papaya","lime","watermelon","apple","mango","kiwi"};
    sortFruits(fruits);
    for(String val : fruits){
      System.out.println(val+" ");
    }
  }
}