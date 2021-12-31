/*1. You've to print all prime numbers between a range. 
2. Take as input "low", the lower limit of range.
3. Take as input "high", the higher limit of range.
4. For the range print all the primes numbers between low and high (both included).*/
//code:-

import java.util.*;

public class Prime_All_Till_N{
    public static void main(String[] args) {
        // write your code here
        Scanner scn = new Scanner(System.in);
        int low = scn.nextInt();
        int high = scn.nextInt();
        for(int n= low;n<=high;n++)
        {
        int flag = 0;
          for(int i=2;i*i<=n;i++)
          {
              if(n%i==0)
              {
                  flag =1;
                  break;
              }
              else
              {
                  continue;
              }
              
          }
          if(flag == 0)
          {
          System.out.println(n);
          }
        }
          
    }
}