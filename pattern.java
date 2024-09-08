// 1----------------------------------  Printing Solid Rectangle

class Rec{
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
} 

// 2-------------- ------------------- Printing Hollow Rectangle

    class HollowRec {
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
    }

 //3 ------------------------------ Printing half Pyramid

    class PyramidHalf {
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
    }

// 4------------------------------------ Printing the inverted half pyramid

    class invPyramid {
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
    }


// 5--------------------------Printing Inverted half Pyramid (roated 180 deg)

      public class pattern {
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
    }

// 6-------------------------------------printing Half Pyramid with numbers

    class NumPyramid {
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
    }

// 7 --------------------------------Printing the inverted half pyramid with numbers

   class InvHalfPyramid {
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
    } 

// 8---------------------------------Printing Floyd's Triangle pattern

    class FloydPattern{
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
    }

    