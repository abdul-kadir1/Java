class InsertionSort{
  static void Insertion_increasing_order(int arr []){
    int n = arr.length;
    for(int i=1; i<n; i++){
      int j=i;
      while(j > 0 && arr[j] < arr[j-1]){
        //swap a[j],and a[j-1]
        int temp = arr[j];
        arr[j]=arr[j-1];
        arr[j-1]=temp;
        j--;
      } 
    }
  }
  public static void main(String args []){
    int arr [] = {21,22,12,11,10,9,40,29};
    Insertion_increasing_order(arr);
    for(int i=0; i<arr.length; i++){
      System.out.print(arr[i] + " ");
    }
  }
}
