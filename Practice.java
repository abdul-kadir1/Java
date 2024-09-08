// Q1 Enter 3 numbers from the user & make a function to print their average.
import java.util.*;
// public class practice {
//     public static void calculateAverage(int num1, int num2, int num3){
//         int average = (num1 + num2 + num3) / 3;
//         System.out.println("The average of the three numbers is: " + average);
//     }
//     public static void main(String[] args){
//         Scanner sc = new Scanner (System.in);
//         int num1 = sc.nextInt();
//         int num2 = sc.nextInt();
//         int num3 = sc.nextInt();
//         calculateAverage(num1, num2, num3);


//     }

// Q3 Write a function which takes input 2 numbers and returns the greater of those two.
// public class Practice{
//     public void greaterNumer(int a , int b){
//         if(a>b){
//             System.out.println("The greater number is: " + a);
//         }
//         else {
//             System.out.println("The greater number is: " + b);
//         }
//     }
//     public static void main(String[] args){
//         Scanner scanner = new Scanner(System.in);
//         System.out.println("Enter the first number:");
//         int a = scanner.nextInt();
//         System.out.println("Enter the second number:");
//         int b = scanner.nextInt();
//         Practice obj = new Practice();
//         obj.greaterNumer(a, b);
    
// }  }


// Write an infinite loop using do while condition.
// public class Practice{
//     public static void main(String[] args){
//         int i = 0;
//         do{
//             System.out.println("Hello World");
//             // i++;
//         }
//         while(i<5);

//     }
// }

// Write a function to print the sum of all odd numbers from 1 to n.

// public class Practice {
//     public static void printSumOfOddNumbers(int n) {
//         int sum = 0;
//         for (int i = 1; i <= n; i += 2) {
//             sum += i;
//         }
//         System.out.println("The sum of all odd numbers from 1 to " + n + " is: " + sum);
//     }

//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);
//         System.out.println("Enter a number:");
//         int n = scanner.nextInt();
//         printSumOfOddNumbers(n);
//     }
// }


// basic practice question 
// Q1
// public class Practice{
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter a string:");
//         String str  = sc.nextLine();
//         System.out.println(str);
//     }

// }

// Q2 Swapping numbers between two numbers
// public class Practice{
//     public static void main(String[] args){
//         int temp;
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter first number");
//         int a = sc.nextInt();
//         System.out.println("Enter second number");
//         int b = sc.nextInt();
//         temp = a;
//         a=b;
//         b=temp;
//         System.out.println("After swapping, first number is: " + a);
//         System.out.println("After swapping, second number is: " + b);
//     }  
// }

// Q3:3. Java Program to Add Two Complex number
// public class Practice {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter a first number:");
//         int num1 = sc.nextInt();
//         System.out.println("Enter second  number:");
//         int num2 = sc.nextInt();
//         // int sum = num1 + num2;
//         System.out.println("Enter first complex number");
//         double imaginaryPart1 = sc.nextDouble();
//         System.out.println("Enter second complex number");
//         double imaginaryPart2 = sc.nextDouble();
//         double sumRealPart = num1 + imaginaryPart2 ;
//         double sumImaginaryPart = imaginaryPart1 + num2;
//         System.out.println("Sum of two numbers: " + sumRealPart + " + " + sumImaginaryPart + "i");
//     }}

// Q4 Java Program to Check Even or Odd Integer
// class Practice{
//     public static void main(String[] args){
//             Scanner sc = new Scanner(System.in);
//             System.out.println("Enter FIrst number");
//             int num = sc .nextInt();
//             if(num%2==0){
//                 System.out.println("The number is even");
//             }
//             else{
//                 System.out.println("The number is odd");
//             }
//     }
// }

//Q5 5. Java Program to Find Largest Among 3 Numbers
// public class Practice{
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter the first number:");
//         int num1 = sc.nextInt();
//         System.out.println("Enter the second number:");
//         int num2 = sc.nextInt();
//         System.out.println("Enter the third number:");
//         int num3 = sc.nextInt();
//         // int max = Math.max(Math.max(num1, num2), num3);
//         // System.out.println("The maximum number is: " + max);
//         if(num1>num2 && num1>num3){
//             // if(num1>num3){
//             // }
//             System.out.println("The maximum number is: " + num1);

//         }
//         else if(num2>num1 && num2>num3){
//             // if(num2>num3){
//             // }
//             System.out.println("The maximum number is: " + num2);

//         }
//         else if (num3>num1 && num3>num2){
//             System.out.println("The maximum number is: " + num3);
//         }
//         else{
//             System.out.println("All numbers are equal.");
//         }
//     }
// }

// Q6   check  prime number or not
// class Practice{
//     public static void main (String[] args){
//         int count = 0;
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter a number:");
//         int n = sc.nextInt();
//        int i=1;
//         while(i<=n){
//             if(n%i==0){
//                 count=count+1;
               
//             }
//             i=i+1;
//         }
           
//             if(count==2){
//                 System.out.println(n + " is a prime number.");
//             }
//             else{
//                 System.out.println(n + " is not a prime number.");
//             }
//     }
// }

// Q7 6. Java Program to Display All Prime Numbers from 1 to N

// class Practice{
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter a number:");
//         int n= sc.nextInt();
//         for(int i=1; i<=n; i++){
//           int  count =0;
//             for(int j=1;j<=i;j++){
//                 if(i%j==0){
//                     count++;
//                 }        
//     }
//     if(count==2 ){
//         System.out.print(i + " ");

// }}}}

// Q8  check character vowel or not  
// class Practice{
//     public static void main(String[] args)
//     {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter a string:");
//         int index;
//         char ch = sc.nextLine().charAt(0);
//         ch=Character.toLowerCase(ch);

//         if(ch=='a' || ch=='e' || ch=='i' || ch=='i' || ch=='u'){
//             System.out.println("vowel");
//         }
//         else{
//             System.out.println("constant");
//         }
//     }

// }


// class Practice{
//     public static void main(String[] args){
//       int i = 1;
//       do{
//         System.out.println("Hello World");
//         i++;
//       }while(i<=5);
//     }
// }

// class Practice{
//     public static void main(String[] args){
//         // int sum = 0;
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter the number");
//         int n = sc.nextInt();
//         for(int i= 1; i<=10; i++){
//             // sum = sum+i;
//             System.out.println(i*n);
//         }
//         // System.out.println(sum);
//     }

// }

// ===================================== Printing Patterns =================================================

// Printing Solid Rectangle
/*class Practice {
    public static void main(String[] args){
        // Outer loop
        for(int i=1; i<=4; i++){
        // Inner loop
            for(int j= 1; j<=5; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
} */

// Printing Hollow Rectangle

    /*class Practice {
        public static void main(String[] args){
            int n=4;
            int m = 5;
            // outer loop
            for (int i=1; i<=n; i++){
                // inner loop      
                for(int j= 1; j<=m; j++){
                    // cell (i,j)
                    if(i ==1 || j ==1 || i==n || j==m){
                        System.out.print("*");
                    }
                    else{
                        System.out.print(" ");
                    }
                }
                System.out.println();
            }
        }
    }*/

    //  Printing half Pyramid

    /*class Practice {
        public static void main(String[] args){
            int n = 4;
            //outer loop
            for ( int i = 0; i < n; i++ ){
            // inner loop
                for(int j=0; j<=i; j++){
                    System.out.print("* ");
                }
                System.out.println();
            }
        }
    }*/

//  Printing the inverted half pyramid

    /*class Practice {
        public static void main(String[] args){
            int n = 4;
            //outer loop
            for ( int i = n; i>=0; i-- ){
            // inner loop
                for(int j=0; j<=i; j++){
                    System.out.print("* ");
                }
                System.out.println();
            }
        }
    }*/

//  Printing Inverted half Pyramid (roated 180 deg)
    /*  public class Practice {
        public static void main(String[] args) {
            int n = 4;
            // outer loop
            for(int i = 1; i <= n; i++) {
                // inner loop -> for print space
                for(int j= 1; j<=n-i; j++) {
                    System.out.print(" ");
                }
                // inner loop -> for print '*'
                for(int  j= 1; j<=i; j++){
                    System.out.print("*");
                }
                System.out.println();

            }
        }
    }*/

//  printing Half Pyramid with numbers

    /*class Practice {
        public static void main(String[] args) {
            int n=5;
            for(int i=1; i<=n; i++) {
                // inner loop
                for(int j= 1; j<=i; j++){
                    System.out.print(j+" ");
                }
                System.out.println();
            }
        }
    }*/


    // Printing the inverted half pyramid with numbers
   /*class Practice {
        public static void main(String[] args) {
            int n=5;
            // outer loop
            for(int i=n; i>=0; i--) {
                // inner loop
                for(int j= 1; j<=i; j++){
                    System.out.print(j+" ");
                }
                System.out.println();
            }
        }
    } */ 

    // Printing Floyd's Triangle pattern
    /*class Practice{
        public static void main(String[] args) {
            int n =5;
            int number = 1;
            //outer loop
            for(int i=1; i<=n; i++) {
            // inner loop
                for(int j= 1 ; j<=i; j++){
                    System.out.print(number + " ");
                    number++;
                }
                System.out.println();
            }

        }
    }*/
    