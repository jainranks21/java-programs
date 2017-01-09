import java.util.*;
import java.lang.*;
import java.io.*;

/* Takes a number as an input and prints n numbers of fibonnaci sequence.*/
public class fibonacci {
    public static void main (String args[]){
        int current = 0, next = 1;
        int temp_next = 0;
        Scanner mScanner = new Scanner(System.in);
        int n = mScanner.nextInt();
        System.out.println("fibonacci series is :");
        for(int i = 0; i < n; i++) {
          System.out.println(current);
          temp_next = current + next;
          current = next;
          next=temp_next;
        }
    }
}
