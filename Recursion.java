import java.util.*;
// natural number 1 to n
class Recursion {
    static void printIncreasing(int n){ //1,2,.....n-1 , n
        // base case
        if(n==1){
            System.out.println(n);
            return;
        }
        //self work
        printIncreasing(n-1); // 1,2,......n-1
        // recursive work
        System.out.println(n);
    }
    public static void main(String args []){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number:");
        int n = sc.nextInt();
        printIncreasing(n);
    }
}


// print all natural number from n to 1 using recursion
class PrintDecreasing{

    static void printdecreasing(int n){ // n,n-1.........2,1
        // base case
        if(n==1){
            System.out.println(1);
            return ;
        }
        // self work
        System.out.println(n);
        // recursive work
        printdecreasing(n-1); // n,n-1......2,1


    }
    public static void main(String args []){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number:");
        int n = sc.nextInt();
        printdecreasing(n);
    }
}


// find the factorial of n using recursion
class find_Factorial{

    static int factorial (int n){
        // base case
        if(n==0)  return 1;
        

        // smaller problem -> recursive work
        // int smallAns = factorial(n-1); // factorial(4) = 24

        // big problem : self work
        // int ans = n*smallAns;            
        // return ans;
            //  OR 
            return n*factorial(n-1);
    }
    public static void main (String args []){
        System.out.println(factorial(4));
    }
}

// print fibonacci series of give number
class fibonacci_series{

    static int Fibonacci(int n ){
        // base case
        if (n==0 || n==1){
            return n;
        }
        // recursive work
        int ans1 = Fibonacci(n-1);
        int ans2= Fibonacci(n-2);

        // self work
        return  ans1+ans2;
        
    }
    public static void main (String args []){
        for (int i=0; i<= 10 ; i++){
        System.out.println(Fibonacci(i));
        }
    }
}