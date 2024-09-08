import java.util.*;
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