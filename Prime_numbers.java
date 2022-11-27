/*
 * Section 4 Question 2
*Name:Marion Kariuki
*Reg No: 21/07779
*A program that prints prime numbers from 1-500 and identifies a prime numbers

 */
package prime_numbers;


public class Prime_numbers 
 {
    //Main Method
public static void main(String[] args) {
 
    System.out.println(isPrime(20));
    mainmethod();
}

//isPrime Method
public static boolean isPrime(int number)
{

  for(int i = 2; i < number; i++)
{
    if(number % i == 0)
        {
            return false;
        }
    }
   
    return true;
}

public static Void mainmethod(){
    
     System.out.println("Prime numbers from 1-500");
   
    // Run loop from 1 to 500
    for(int i=1; i <= 500; i++){
        boolean isprime = true;
       
        for(int j = 2; j<i; j++){
            if(i%j == 0){
                isprime=false;
                break;
               
            }
        }
       
        if(isprime){
            System.out.println(i);
        }
    }
    return null;
}


}  
   
   