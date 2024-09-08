// import java.util.ArrayList;
import java.util.*;
import java.util.Collection;
class wrapper {
    public static void main (String args []){
        // wrapper classes
    Integer j = Integer.valueOf(j=4);
    System.out.println(j);

    Float f = Float.valueOf(0.4f);
    System.out.println(f);
    
    // ArrayList syantax
    ArrayList <Integer> l1 = new ArrayList<Integer>();

    // add new element 
    l1.add(5);
    l1.add(3);
    l1.add(4);
    l1.add(1);
    l1.add(8);
    // printing the array list directly
        System.out.println(l1); // expected output [5,3,4,1,8]


    //  If you not specify the class , you can put anything inside l
        ArrayList    l = new ArrayList  ();
        l.add("hello");
        l.add(1);
        l.add(true);
        System.out.println(l);


    // get an element at index i

        System.out.print(l1.get(2));

    // print with for loop
        for(int i=0; i < l1.size(); i++){ // size() is a method
            // System.out.println(l1.get(i));
            
        }
        
        // adding element at some index i 
        l1.add(1,100);  // expected output should be [5 100 3 4 1 8]
        // System.out.println(l1);

        //Modifying element at index i
        l1.set(1,10);  // expected output should be [5 10 3 4 1 8]
        // System.out.println(l1);
        
        //Removing an element at index i 
        l1.remove(1);   // expected output should be [5 3 4 1 8]
        // System.out.println(l1);

        // removing an element e (// suppose we don't know the index of element) 
        l1.remove(Integer.valueOf(8));
        // System.out.println(l1);

        // Checking if an element exists or not
        boolean ans = l1.contains(Integer.valueOf(3)); // expected output true or false
        // System.out.println(ans);
}
}

// Practice questions---------------------------------------------------------------

// Write a program to reverse a given array list
class practice_arrayList {
    static void reverseArrayList (ArrayList<Integer> list){
        int i=0, j=list.size()-1;

        while(i<j){
            /* int temp =a;
                a=b;
                b=temp;
             */
        
        Integer temp = Integer .valueOf(list.get(i));
        list.set(i,list.get(j));
        list.set(j,temp);

        i++;
        j--;
    }
    }

    // or 
    public static void main ( String args []){
        ArrayList <Integer> list = new ArrayList<>();
        list.add(0);
        list.add(10);
        list.add(3);
        list.add(5);
        list.add(22);
        list.add(10);
        System.out.println("Original list" + list);
        reverseArrayList(list);
        Collections.reverse(list); // this is collections class method .

        System.out.println("Reversed List" + list);
        reverseArrayList(list);
    }
}

// Write a program to sort an Arraylist of string in descending order.--------------------------------------------------------------
class Sort_ArrayList {
    public static void main ( String args []){
        ArrayList <Integer> list = new ArrayList<>();
        list.add(0);
        list.add(10);
        list.add(3);
        list.add(5);
        list.add(22);
        list.add(10);
        System.out.println("Original list" + list);
        Collections.reverse(list); // this is collections class method use to reverse array list .
        System.out.println("Reversed List" + list);
        Collections.sort(list); // if we write only list . it will do sort in ascending order
        System.out.println("Ascending order:" + list); 
        Collections.sort(list , Collections.reverseOrder());
        System.out.println("Descending Order:" + list);

        // sort an Array List of String.
        ArrayList <String> s1= new ArrayList<>();
        s1.add("My");
        s1.add("Name");
        s1.add("is");
        s1.add("Abdul");
        s1.add("Kadir");
        System.out.println("Original String"+ s1);
        Collections.sort(s1);
        System.out.println("Sorted:" + s1);
        Collections.sort(s1 , Collections.reverseOrder());
        System.out.println("reversed order" + s1);
    }
}
