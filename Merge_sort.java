public class Merge_sort {
  static void displayArr(int arr[]){
    for(int i=0; i<arr.length; i++){
      System.out.print(arr[i] + " ");
    }
    System.out.println();
  }

  static void merge(int[] arr, int l, int mid, int r){
    int n1 = mid - l + 1;
    int n2 = r - mid;

    int[] left = new int[n1];
    int[] right = new int[n2];

    // Copy data to temp arrays left[] and right[]
    for(int i = 0; i < n1; i++) {
      left[i] = arr[l + i];
    }
    for(int j = 0; j < n2; j++) {
      right[j] = arr[mid + 1 + j];
    }

    int i = 0, j = 0;
    int k = l;

    // Merge the temp arrays back into arr[l..r]
    while(i < n1 && j < n2) {
      if(left[i] <= right[j]) {
        arr[k++] = left[i++];
      } else {
        arr[k++] = right[j++];
      }
    }

    // Copy the remaining elements of left[], if any
    while(i < n1) {
      arr[k++] = left[i++];
    }

    // Copy the remaining elements of right[], if any
    while(j < n2) {
      arr[k++] = right[j++];
    }
  }

  static void merge_Sort(int[] arr, int l, int r){
    if(l >= r){
      return;
    }
    int mid = (l + r) / 2;

    // Sort first and second halves
    merge_Sort(arr, l, mid);
    merge_Sort(arr, mid + 1, r);

    // Merge the sorted halves
    merge(arr, l, mid, r);
  }

  public static void main (String args[]){
    int arr[] = {5, 4, 3, 2, 1};
    int n = arr.length;

    System.out.println("Array before sorting:");
    displayArr(arr);

    merge_Sort(arr, 0, n - 1);

    System.out.println("Array after sorting:");
    displayArr(arr);
  }
}
