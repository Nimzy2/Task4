/*
 *Section 4 Number 1
*Name: Marion Kariuki
*Reg No: 21/07779
// Java Program to check if an array contains a given value
 */
package array;

import java.util.Arrays;
import java.util.Scanner;

public class Array
        {
public static void main(String[] args) {
   int[] array = {1,2,4,5,6,7,9,10,20,45,15,30,77,54,60};
System.out.println(Arrays.toString(array));


Scanner input= new Scanner (System.in);
System.out.println("Enter Number");
int find = input.nextInt();

boolean check = false;
for(int element:array){
   if(element==find){
       check = true;
       break;
   }
}
// if else statements
if(check){
   System.out.println(find + " " + "The number found at index");
}
else{
 System.out.println(find +" " + "number not found in this array");
}

}
}


   
     
   
    