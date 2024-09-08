import java.util.*;
// Reverse an array
class Rev_array {
    static int[] revArray(int arr[]){
        int n = arr.length;
        int [] ans = new int[n]; // store reversed element of array
        int j =0;

        //traverse original array in reverse direction
        for( int i=n-1; i>=0; i-- ){
            ans[j++] = arr[i];

        }
        return ans;
    }
    static void printArray(int[] arr){
         
        for(int i=0; i<arr.length; i++){
            System.out.println(arr[i] + " ");
        }
        System.out.println();
    }


    public static void main (String args []){
        int a= 9;
        int b= 3;
        int [] arr = new int []{1,2,3,4,5};
        int[] ans = revArray(arr);

        printArray(ans);
    }
     
}

//find the total number of pairs in the array whose sum is equal to the given value x;
class pair_sum{

    static int pairsum (int []arr,int target){
        int n= arr.length;
        int ans=0;
        for(int i=0; i<n; i++){ // This loop picks every element of array
            for(int j=i+1; j<n; j++){ // This loop picks elements after i

            if(arr[i] + arr[j] == target){
                ans++;
            }
            }
        }
        return ans;
    }
    public static void main (String args []) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array size");
        int n = sc.nextInt();

        int arr []= new int [n];
        System.out.println("Array "+ n +"Elements: ");
        for(int i=0; i<arr.length; i++){
            arr[i]=sc.nextInt();
        }
        //printing array element.
        System.out.println("enter Target Sum: ");
        int target = sc.nextInt();
        
        System.out.println(pairsum(arr, target));
    }
}

//Count the number of triplets whose sum is equal to the given Value x.

class Triplet_sum{

    static int TripletSum (int []arr,int target){
        int n= arr.length;
        int ans=0;
        for(int i=0; i<n; i++){ // This loop picks every element of array
            for(int j=i+1; j<n; j++){ // This loop picks elements after i
                for(int k=j+1; k<n; k++){
                    if(arr[i] + arr[j] + arr[k] == target){
                        ans++;
                    }
                }
            
            }
        }
        return ans;
    }
    public static void main (String args []) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array size");
        int n = sc.nextInt();

        int arr []= new int [n];
        System.out.println("Array "+ n +"Elements: ");
        for(int i=0; i<arr.length; i++){
            arr[i]=sc.nextInt();
        }
        //printing array element.
        System.out.println("enter Target Sum: ");
        int target = sc.nextInt();
        
        System.out.println(TripletSum(arr, target));
    }
}
// 27 August code
// find the unique number in a given array where all the elements are being repeated twice with one value being --
//unique.
class FindUnique{

    static int findunique(int arr []){
        int n= arr.length;
        for(int i=0; i<n; i++){
            for(int  j=i+1; j<n; j++){
                if(arr[i] == arr[j]){
                    arr[i]=-1;
                    arr[j]=-1;
                    
                }
            }
        }
        int ans = -1;
        for(int i=0; i<n; i++){
            if(arr[i] > 0){
                ans = arr[i];
                break; // Stop after finding the first unique element
            }

        }
        return ans;

    }


    public static void main (String args []) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array size");
        int n = sc.nextInt();

        int arr []= new int [n];
        System.out.println("Array "+ n + " Elements: ");
        for(int i=0; i<arr.length; i++){
            arr[i]=sc.nextInt();
        }
       
        System.out.println("Unique Element: " + findunique(arr));
         
}
}

// 28 AUG code
// find the second largest element in the given array;

class Second_largest{

    static int find_max(int arr[]){
        int mx=Integer.MIN_VALUE;
        for(int i=0; i<arr.length; i++){
            if(arr[i] > mx){
                mx=arr[i];

            }
        }
        return mx;
    }

    static int secondmax(int []arr){
        int mx = find_max(arr);
        for(int i=0; i<arr.length; i++){
            if(arr[i] == mx){
                arr[i] = Integer.MIN_VALUE;
            }
        }
        int secondmax =find_max(arr);
        return secondmax;
    }

    public static void main (String args []) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array size");
        int n = sc.nextInt();

        int arr []= new int [n];
        System.out.println("Array "+ n + " Elements: ");
        for(int i=0; i<arr.length; i++){
            arr[i]=sc.nextInt();
        }
       
         System.out.println("Second Maximum Element: " + secondmax(arr));
}
}

// Given an array 'a' consisting of integers . Return the first value that is repeating in this array.if no value is
// being repeated , return -1;
class Repeating_integer{

    static int firstRepeatingInteger(int arr[]){
        int n=arr.length;
//n=7
        for(int i=0; i<n; i++){ // picks first number
            for(int j=i+1; j<n; j++){ // picks second number
                if(arr[i] == arr[j]){ 
                    return arr[i];
                }
            }
        }
        return -1;
    }
    public static void main (String args []) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter array size : ");
        int n = sc.nextInt();

        int arr []= new int [n];
        System.out.println("Array "+ n + " Elements: ");
        for(int i=0; i<arr.length; i++){
            arr[i]=sc.nextInt();
        }
       
         System.out.println("First Repeating number : " + firstRepeatingInteger(arr));
}
}