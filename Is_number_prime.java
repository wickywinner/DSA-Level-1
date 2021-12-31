/*1. You've to check whether a given number is prime or not.
2. Take a number "t" as input representing count of input numbers to be tested.
3. Take a number "n" as input "t" number of times.
4. For each input value of n, print "prime" if the number is prime and "not prime" otherwise. */

//code:-
import java.util.*;
  
  public class Is_number_prime{
  
  public static void main(String[] args) {
      Scanner scn = new Scanner(System.in);
      int t= scn.nextInt();
      while(t>0)
      {
          int n = scn.nextInt();
          int flag = 0;
          for(int i=2;i*i<n;i++)
          {
              if(n%i==0)
              {
                  flag =1;
                  break;
              }
              else{
                  continue;
              }
              
          }
          if(flag == 1){
          System.out.println("not prime");
          }
          else{
          System.out.println("prime");
          }
          t=t-1;
      }
      
  
       // write ur code here

  
   }
  }