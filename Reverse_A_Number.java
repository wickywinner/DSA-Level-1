/*1. You've to display the digits of a number in reverse.
2. Take as input "n", the number for which digits have to be display in reverse.
3. Print the digits of the number line-wise, but in reverse order.*/
//code:-
import java.util.*;
   
   public class Reverse_A_Number{
   
   public static void main(String[] args) {
       Scanner scn = new Scanner(System.in);
       int n = scn.nextInt();
       while(n>0)
       {
           int rem = n%10;
           System.out.println(rem);
           n=n/10;
       }
     // write your code here  
    }
   }
