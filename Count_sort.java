class Count_sort {
  static int findMax(int arr []){
    int mx=Integer.MIN_VALUE;
    for(int i=0; i<arr.length; i++){
      if(arr[i]>mx){
        mx = arr[i];
      }
    }
    return mx;
  }
  static void basicCountsort(int [] arr){
    int max= findMax(arr); //find largest element of array
    int [] count = new int [max+1];
    for(int i=0; i<arr.length; i++){
      count[arr[i]]++;
    }

    int k=0;
    for(int i=0; i<count.length; i++){
      for(int j=0; j<count[i]; j++){
        arr[k++] =i;
      }
    }
  }

  static void display(int a []){
      for(int i=0; i<a.length; i++){
        System.out.print(a[i] + " ");
      }
      System.out.println();
  }

  static void count_Sort( int arr [] ){
    int n = arr.length;
    int [] output = new int[n];
    int max= findMax(arr); //find largest element of array
    int [] count = new int [max+1];

    for(int i=0; i<arr.length; i++){ // Make frequency array
      count[arr[i]]++;
    }
    // Make prefix sum array of count array
    for(int i=1; i<count.length; i++){
      count[i]+=count[i-1];
    }

    // find the index of each element in the original array and put it in output array

    for(int i=n-1; i>=0; i--){
      int idx = count[arr[i]] -1;
      output[idx] = arr[i];
      count[arr[i]]--;
    }

    // copy all elements of output to arr
    for(int i=0; i<n; i++){
      arr[i]=  output[i];
    }

  }
  public static void main (String args []){
    int [] arr = {1,4,5,2,2,3};
    // basicCountsort(arr);
    count_Sort(arr);
    display(arr);
  }
}
