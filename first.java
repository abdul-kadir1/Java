import java.util.Scanner;

public class first {
    public static void main(String[] args){
    //    System.out.println("*****");
    //    System.out.println("   *");
    //    System.out.println("  *");
    //    System.out.println(" *");
    //   System.out.println("*****");


// int x= 5;
// if(x%2==0){
//     System.out.println("Even Number");
// }
// else {
//     System.out.println("Odd Number");
// }

// int marks=90;
// if(marks>=90){
//     System.out.println("Excellent");
// }
// else if(marks>=80 || marks<90){
//     System.out.println("good");
// }
// else if(marks>=70 || marks<80){
//     System.out.println("Fair");
// }
// else if (marks>=60 || marks<70){
// System.out.println("meet expectations");
// }
// else {
//     System.out.println("below par");
// }


// int i = 1;
// while (i<=10) {
//     System.out.println(i);
//     i++;    //i=i+1;
// }


    try (Scanner sc = new Scanner(System.in)) {
        int n=sc.nextInt();
        for(int i=0; i<n; i++) {
            System.out.println(i);
            }
    }

}}
