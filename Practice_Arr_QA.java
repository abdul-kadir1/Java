import java.util.*;

//  Count the Number of Digits for a given number N
  class Count_Digits {
    public static void main (String args []){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number");
        int  n = sc.nextInt();  
        int numberOfDigits = 0;
        int original_n = n;

        while(n>0){
           n = n/10;
           numberOfDigits++;
        }
        System.out.println("Number of Digits in  " + original_n + " = " + numberOfDigits  );

    }
}

//  Find the sum of digits in given number n.
class SumDigits{
    public static void main (String args []){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number");
        int n = sc.nextInt();
        int sum = 0;
        int original_n = n;
        while(n>0){
            sum+= n%10;
            n=n/10;

        }
        System.out.println("Sum of digits of " + original_n + " is " + sum);
    }
} 

//  Reverse the  Digits of Number
class NumDigitsReverse{
    public static void main (String args []){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int n = sc.nextInt();
        int reversed = 0 ;
        int original_n = n;
        while(n>0){
            // n = n%10;
            reversed = reversed*10+n%10;
            n = n/10;
        }
        System.out.println("Reversed Digits of " + original_n + " is " + reversed);
    }
}

//  print first n factorial  of number

class Factorial {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Array Size:");
        int n = sc.nextInt();
        int factorial = 1;

        for (int i = 1; i <= n; i++) {
            factorial *= i;
        }

        // Print the final result outside the loop
        System.out.println("Factorial of " + n + " is = " + factorial);
    }
}

// calculate sum of all elements in the given array.
class sum_element_of_arr{
    public static void main (String args []){
        int arr [] = {1, 2,3,12,11,100};
        int sum = 0;
        for(int i=0; i<arr.length; i++){
            sum=sum+arr[i];
        }
        System.out.println(sum);

    }
}

// calculate the maximum value out of all the elements in the array.
class max_element_array{
    public static void main (String args []){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Array Size : ");
        int size = sc.nextInt();
        int arr [] = new int [size];
        
        System.out.println("Enter array element");
        for(int i=0; i<size ; i++){
            arr[i] = sc.nextInt();  
        }
        int max = arr[0];
        for(int i=1; i<arr.length; i++){
            if(arr[i] > max){
                max= arr[i];
            }
        }
        System.out.println("The Maximum value in the array is : " + max);
    }
}

// Search the given element x in the array. if present then return the index else return-1

class find_Element{
    public static void main (String args []){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Array Size");
        int size = sc.nextInt();

        int arr [] = new int[size];
  
        // Declare and Input Array Elements
        for(int i=0; i<size; i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter element for Search:");
        int x= sc.nextInt();
    }
}

//count the number of occurences of a particular element x.
 class Particular_element_occurence{
    public static void main (String args []){
        int count =0;
        int x=2;
        int arr [] = {1,2,3,2,3,2,5};

        for(int i= 0; i<arr.length; i++){
            if(x == arr[i]){
                count++;
            }   
        }
        System.out.println("Element " + x + " occurs " + count + " times in the array.");
    }
 }


 // find the last occurence of an element x in a given array;
class last_occurence_of_element{
    static int lastoccurence (int arr[],int x){
        int lastindex = -1;
        for(int i=0; i<arr.length; i++){
            if(arr[i] == x){
                lastindex=i;
            }
        }
        return lastindex;
    }
    public static void main (String args []){
        int arr []={1,2,3,4,5,3,3};

        System.out.print(lastoccurence(arr,0 ));
    }
}

//count the number of elements strictly greater than value x.
class check_strict_greater{
    public static void main (String args []){
        int count =0;
        int x=4;
        int arr [] = {1,2,3,5,6,7};

        for(int i= 0; i<arr.length; i++){
            if( arr[i]>x){
                count++;
            }   
        }
        System.out.println(count +" number are greater");
    }
 }

 
