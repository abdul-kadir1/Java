import java.util.*;
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
//Given a number n. find the sum of the natural numbers till n but with alternate signs.
// example : if n=5 you have to return 1-2+3-4+5.
class Sum_of_Series{

  // Main question sum with alternate signs
  static int Seriessum(int n){
    // base case
    if(n==0) return 0;

    // recursive work and self work
    if(n%2 ==0){ // if n is even  
      return Seriessum(n-1)-n;
    }
    else { // if n is odd  
      return Seriessum(n-1)+n;
    }
  }


  // static int SeriesSum1(int n){
  //     if(n==0){
  //         return 0;
  //     }
  //     // recursive work and self work
  //     return SeriesSum1(n-1)+n;
  // }
  public static void main(String args []){
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter the number : ");
      int n = sc.nextInt();
      System.out.println(Seriessum(n));
  }
}