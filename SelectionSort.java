// selection sort in increasing order
class SelectionSort {
  static void selectionSort(int arr[]){
    int n= arr.length;

    for(int i=0; i< n-1; i++){  // i represent the current index

      // find the minimum element in unsorted part of array
      int min_index = i;
      for(int j=i+1; j<n; j++){
        if(arr[j]<arr[min_index]){
          min_index = j;
        }
      }

      // swap current element and minimum element --> current index i will have correct element
      // swap these two values 
      int temp = arr[i];
      arr[i] = arr[min_index];
      arr[min_index]= temp;

    }
  }
  public static void main (String args []){
    int []arr = {7,5,4,2,3};
    selectionSort(arr);
    for(int i=0; i<arr.length; i++){
      System.out.print(arr[i] + " ");
    }
  }}
  
  // Decreasing order of selection sort
class SelectionSort2 {
  static void selectionSort(int arr[]){
    int n= arr.length;

    for(int i=0; i< n-1; i++){  // i represent the current index

      // find the minimum element in unsorted part of array
      int min_index = i;
      for(int j=i+1; j<n; j++){
        if(arr[j]>arr[min_index]){
          min_index = j;
        }
      }

      // swap current element and minimum element --> current index i will have correct element
      // swap these two values 
      int temp = arr[i];
      arr[i] = arr[min_index];
      arr[min_index]= temp;

    }
  }
  public static void main (String args []){
    int []arr = {12,11,3,4,3,2,20};
    selectionSort(arr);
    for(int i=0; i<arr.length; i++){
      System.out.print(arr[i] + " ");
    }
  }
}



