import java.util.*;
//  1D Array ---------------------------------------------------------------------------------------------------------
public class arr{
    public static void main (String args []){
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter the Array size:");
      //taking array size from user and declaring an array of given size.
      int size = sc.nextInt();
      int num []= new int[size]; 

         System.out.println("Enter array elements:");

        //input array
      for(int i= 0; i<size; i++){
        num[i] = sc.nextInt();
      }
      System.out.println("Enter the value to search:");

        int x=sc.nextInt();
        //output array
        for(int i=0; i<num.length; i++){
         if(num[i] == x){
          System.out.println("Value found at index " + i);
          break;
        }
      }
      sc.close();
  }
}

// 
class arr_refrence{

    static void printArray(int arr[]){
      for(int i=0; i<arr.length; i++){
        System.out.print(arr[i] + " ");
      }
      System.out.println();
    }
  public static void main (String args []){
    // Scanner sc = new Scanner(System.in);
    // System.out.print("Enter the Array Size : ");
    // int size = sc.nextInt();
    int arr [] = new int [5];
    arr[0]=1;
    arr[1]=2;
    arr[2]=3;
    arr[3]=4;
    arr[4]=5;
    
    // System.out.println("Enter array element");
    // for(int i=0; i<size ; i++){
    //     arr[i] = sc.nextInt();  
    // }
    
    // calling method (Original array)
    System.out.println("Original array");
    printArray(arr);

    //trying to copy arr to arr_2
    System.out.println("Copied array");
    int [] arr_2 = arr;
    printArray(arr_2);

    // Changing some values of arr_2
    arr_2[0] = 0;
    arr_2[1] = 0;

    System.out.println("original array after changing arr_2");
    printArray(arr);

    System.out.println("copied array after changing arr_2");
    printArray(arr_2);
  }
}

// ------Yeh code pass by value aur pass by reference ka basic concept demonstrate karta hai.
class app{

  static void printArray(int arr[]){
    for(int i=0; i<arr.length; i++){
      System.out.print(arr[i] + " ");
    }
    System.out.println();
  }

  static void  changeArray(int arr []){
    for(int i=0; i<arr.length; i++){
      arr[i]=0;
    }
  }

  static void change_val(int a){
    a =100;
  }
  public static void main ( String args [] ){
    int a=5;
    change_val(a);
    System.out.println(a);
    int arr [] = new int [3];

    arr[0]=1;
    arr[1]=2;
    arr[2]=3;

    changeArray(arr);
    printArray(arr);
  }
}





//  2D Array ---------------------------------------------------------------------------------------------------------
class TwoDarr{
  public static void main (String args []){
    Scanner sc = new Scanner (System.in);
    int [][] a = new int [3][3];
     
    for(int i=0; i<3; i++)
    {
      for( int j=0; j<3; j++){
        System.out.print("Enter array elements: ");
        a[i][j] = sc.nextInt();
      }

    }
    for(int i=0; i<3; i++)
{
  for(int j=0; j<3; j++){
    System.out.print(a[i][j]+"\t");
  }
  System.out.println();
  
}    
  }
}

// 29 Aug -----------------------------------------------------------------------
class multidimensionarray{

  static void printArray(int [][] arr){
    for(int i=0;i<arr.length;i++){ // row
      for( int j=0; j<arr[i].length; j++) { //column
        System.out.print(arr[i][j] + " ");
      }
      System.out.println();
    }
    
  }
  public static void main (String [] args){
    int[][] arr_2 = {
      {1,2,3},
      {4,5,6},
      {7,8,9}
    };
    printArray(arr_2);
  }
}

// 2d array input from user-----------------------------------------------------
class userinput2darray{
  public static void main (String args []){
    Scanner sc = new Scanner (System.in);
    System.out.print("Enter Number of Rows: ");
    int row = sc.nextInt();
    System.out.print("Enter Number of Cols: ");
    int cols= sc.nextInt();

    int [][] arr = new int [row] [cols];
    System.out.println("Enter " + row*cols + " Elements");
    for(int i=0; i<row; i++){         // Rows
      for(int j =0; j<cols; j++){   // Columns
        arr[i] [j] = sc.nextInt();
      }
    }
    System.out.println(arr);

    // printing 2D array
    System.out.println("The elements of the 2D array are:");
    for (int i = 0; i < row; i++) {
      for (int j = 0; j < cols; j++) {
        System.out.print(arr[i][j] + " ");
      }
      System.out.println(); // Newline after each row
    }

    sc.close(); // Close the scanner

  }
}


// Addition of two metrices--------------------------------------
class Add_Two_metrices{

  static void printMatrix(int [][] matrix){
    for(int i=0;i<matrix.length;i++){ // row
      for( int j=0; j<matrix[i].length; j++) { //column
        System.out.print(matrix[i][j] + " ");
      }
      System.out.println();
    }
    
  }
    static void add (int [][] a, int r1 , int c1 , int[][] b, int r2,int c2){
      if(r1 != r2 || c1 != c2){
        System.out.println("Wrong Input ! Addition not possible");
        return;
      }

      int sum [][]= new int[r1][c1];
      for(int i=0; i<r1; i++){   //rows
        for(int j=0; j<c1; j++){ // columns
          sum[i][j]= a[i][j] + b[i][j];
        }
      }
      printMatrix(sum);
    }
    public static void main (String args []){

      Scanner sc = new Scanner (System.in);
      // Taking Input Rows and column for matrix 1
      System.out.println("Enter Number of Rows and Columns of Matrix 1 : ");
      int r1 = sc.nextInt();
      int c1= sc.nextInt();
      
      // Taking input values of matrix 1 
      int [][] a = new int [r1] [c1];
      System.out.println("Enter matrix 1 values");
      for(int i=0; i<r1; i++){          
        for(int j =0; j<c1; j++){   
          a[i] [j] = sc.nextInt();
        }
      }
      // Taking Input Rows and column for matrix 2
      System.out.println("Enter Number of Rows and Columns of Matrix 2 : ");
      int r2 = sc.nextInt();
      int c2= sc.nextInt();
  
      // Taking input values of matrix 2
      int [][] b = new int [r2] [c2];
      System.out.println("Enter matrix 2 values");
      for(int i=0; i<r2; i++){          
        for(int j =0; j<c2; j++){   
          b[i] [j] = sc.nextInt();
        }
      }

      // print matrix 1
      System.out.println("Matrix 1");
      printMatrix(a);
       // print matrix 2
      System.out.println("Matrix 2");
      printMatrix(b);

      // Calling add mehod
      System.out.println("SUm of matrix 1 and Matrix 2 :");
      add(a,r1,c1,b,r2,c2);

    }
}