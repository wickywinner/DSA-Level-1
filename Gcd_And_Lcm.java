/*1. You are required to print the Greatest Common Divisor (GCD) of two numbers.
2. You are also required to print the Lowest Common Multiple (LCM) of the same numbers.
3. Take input "num1" and "num2" as the two numbers.
4. Print their GCD and LCM.*/
//code

import java.util.*;
    
    public class Gcd_And_Lcm{
    
    public static void main(String[] args) {
      // write your code here  
      Scanner scn = new Scanner(System.in);
      int n = scn.nextInt();
      int m = scn.nextInt();
      if(n>m)
      {
          int div = m;
          int divd =n;
          while(div>0)
          {
              int rem = divd%div;
              if(rem==0)
              {
                  break;
              }
              else
              {
                  divd=div;
                  div=rem;
                  
              }
          }
          System.out.println(div);
          int lcm = n*m/div;
          System.out.println(lcm);
      }
      else
      {
          int div = n;
          int divd =m;
          while(div>0)
          {
              int rem = divd%div;
              if(rem==0)
              {
                  break;
              }
              else
              {
                  divd=div;
                  div=rem;
                  
              }
          }
          System.out.println(div);
          int lcm = n*m/div;
          System.out.println(lcm);
      }

     }
    }


