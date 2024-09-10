class Quick_sort {
  // displaying array
    static void displayArr(int [] arr){
      for(int val : arr){
        System.out.print(val + " ");
      }
    }

  // swapping method
  static void swap(int arr[],int x, int y){
    int temp = arr[x];
    arr[x]=arr[y];
    arr[y]=temp;
  }
  

  //partition method
  static int partition(int arr[] ,int st , int end){
    int pivot = arr[st];
    int count =0;
    for(int i=st+1; i<= end; i++){
      if(arr[i] <= pivot) count++;
    }
    int pivotidx=st+count;
    swap(arr,st,  pivotidx);
    int i=st , j=end;

    // less or equal element  comes at left side of pivotidx and greater element comes at right side of pivotidx
    while(i<pivotidx &&  j>pivotidx){
      while (arr[i] <= pivot) i++;
      while(arr[j]> pivot) j--;
      if(i < pivotidx && j>pivotidx){
        swap(arr, i,j);
        i++;
        j--;
      }
    }

    return pivotidx;
  }



  static void quicksort (int [] arr,int st,int end){
    //Base Case
    if(st>=end) return;
    int pi = partition(arr,st,end);
    quicksort(arr, st, pi-1);
    quicksort(arr, pi+1, end);

  }
  
  public static void main (String args[]){
    int arr[] = {5, 9,10, 3, 2, 1};
    // int n = arr.length;

    System.out.println("Array before sorting:");
    displayArr(arr);
    System.out.println();

    quicksort(arr, 0, arr.length-1);

    System.out.println("Array after sorting:");
    displayArr(arr);
  }

}


// quick sort in decreasing order--------------------


 class Quick_sort_decresing {
  // Displaying array
  static void displayArr(int[] arr) {
      for (int val : arr) {
          System.out.print(val + " ");
      }
  }

  // Swapping method
  static void swap(int arr[], int x, int y) {
      int temp = arr[x];
      arr[x] = arr[y];
      arr[y] = temp;
  }

  // Partition method for descending order
  static int partition(int arr[], int st, int end) {
      int pivot = arr[st];
      int i = st + 1;
      int j = end;

      while (i <= j) {
          while (i <= end && arr[i] > pivot) i++;
          while (j >= st + 1 && arr[j] < pivot) j--;

          if (i < j) {
              swap(arr, i, j);
          }
      }
      swap(arr, st, j);
      return j;
  }

  // Quicksort method
  static void quicksort(int[] arr, int st, int end) {
      // Base Case
      if (st >= end) return;
      int pi = partition(arr, st, end);
      quicksort(arr, st, pi - 1);
      quicksort(arr, pi + 1, end);
  }

  public static void main(String[] args) {
      int arr[] = {1,2,3,4,5};

      System.out.println("Array before sorting:");
      displayArr(arr);
      System.out.println();

      quicksort(arr, 0, arr.length - 1);

      System.out.println("Array after sorting:");
      displayArr(arr);
  }
}


