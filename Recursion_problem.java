import java.util.*;
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

//given an integer , find out the sum of its digits using recursion
class sum_of_digits{

    static int SOD(int n){
        // base case
        if(n>=0 && n<=9){
            return n;
        }

        // recursive work
        int ans = SOD(n/10);   
        return SOD(n/10)+1;
        // self work
        // return ans + n%10;
    }
    public static void main(String args []){
    //    int n;
    System.out.println(SOD(5));
    }
}

// Find count of digits using recursion
class coutn_of_digits{

    static int COD(int n){
        // base case
        if(n>=0 && n<=9){
            return 1;
        }

        // recursive work
        int ans = COD(n/10);   

        // self work
        return ans+1;
        
    }
    public static void main(String args []){
    //    int n;
    System.out.println(COD(23245));
    }
}

// given two number p, q .find the value of p^q using a recursive function

class calc_power{
    static int Calc_power(int p , int q ){
        // base case 
        if(q == 0){
            return 1;
        }
        //recursive work
            int smallans = Calc_power(p, q-1);

        // self work
            return smallans * p;
    }
    public static void main (String args []){
        System.out.println(Calc_power(5, 4)); // means 5^4 (625)
    }
}

// Given a number num and a value K.print the K multiple of num
class Multiple{

    static void K_multiple_of_num(int num ,int k){

        // base case
        if(k==1){
            System.out.println(num);
            return  ; 
        }
        // Small problem
         K_multiple_of_num(num, k-1); //(5,10,15)
        
        // self work
        System.out.println(num*k); //(5*4)
        
       
    }
    public static void main (String [] args){
        K_multiple_of_num(5, 4);
    }
} 

class seriesSum{
    static int SeriesSum(int n){
        if(n==0){
            return 0;
        }
        // recursive work
        return SeriesSum(n-1)+n;
    }
    public static void main(String args []){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int n = sc.nextInt();
        System.out.println(SeriesSum(n));
    }
}