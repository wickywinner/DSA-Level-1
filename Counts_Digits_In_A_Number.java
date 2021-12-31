/*1. You've to count the number of digits in a number.
2. Take as input "n", the number for which the digits has to be counted.
3. Print the digits in that number.*/
//Code:-
import java.util.*;
  
  public class Counts_Digits_In_A_Number{
  
  public static void main(String[] args) {
    // write your code here  
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    int d=0;
    while(n>0)
    {
        n=n/10;
        d=d+1;

    }
    System.out.println(d);

   }
  }