/*1. You've to display the digits of a number.
2. Take as input "n", the number for which digits have to be displayed.
3. Print the digits of the number line-wise.*/
//code:-
import java.util.*;
    
    public class Digits_of_A_Number{
    
    public static void main(String[] args) {
      // write your code here  
      Scanner scn = new Scanner(System.in);
      int n = scn.nextInt();
      int temp = n;
      int div = 1;
      while(temp>=10)
      {
          temp = temp/10;
          div*=10;
      }
    //   System.out.println(div);
      while(div>=1)
      {
          int q = n/div;
          n=n%div;
          div=div/10;
          System.out.println(q);
          
      }
     }
    }