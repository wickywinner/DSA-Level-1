/*1. You've to print first n fibonacci numbers.
2. Take as input "n", the count of fibonacci numbers to print.
3. Print first n fibonacci numbers.*/
//code :-
import java.util.*;
  
  public class Print_Fibonacci_Numbers_Till_N{
  
  public static void main(String[] args) {
      // write your code here
      Scanner scn = new Scanner(System.in);
      int n = scn.nextInt();
      int first_no = 0;
      int sec_no =1;
      for(int i= 0 ; i<n;i++)
      {
          System.out.println(first_no);
          int temp = first_no;
          first_no = sec_no;
          sec_no = temp+first_no;
      }


   }
  }