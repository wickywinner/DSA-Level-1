/*1. You are required to display the prime factorization of a number.
    2. Take as input a number n.
    3. Print all its prime factors from smallest to largest.*/
//code
import java.util.*;

public class Prime_Factorization_Of_A_Number{

public static void main(String[] args) {
  // write your code here  
  Scanner scn = new Scanner(System.in);
  int n = scn.nextInt();
  while(n%2==0)
  {
      n=n/2;
      System.out.print("2 ");
  }
  for(int i =3;i<Math.sqrt(n);i+=2)
  {
      while(n%i==0)
      {
          n=n/i;
          System.out.print(i+" ");
      }
  }
  if(n>2)
  {
      System.out.print(n);
  }
 }
}