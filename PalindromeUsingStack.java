import java.util.Stack;
import java.util.Scanner;

public class PalindromeUsingStack {
    public static boolean isPalindrome(String str) {
        /*
         Implementation Plan: 
             1. Declare variable length and set it equal to the length of the string
             2. Declare second variable Middle and set it equal to half of the length of the string
             3. Use for loop to traverse the characters of the string untill the middle character
                  and push those character(characters<middle) onto the stack.
             4. If the length of the string is odd, skip the middle character to the following character
             5. use for loop in the range between middle character and the length(last char)
                  and pop the previously pushed charcters from the stack and compare it with the remaining characters.
                  example: 0<=characters<middle vs middle<=charcters<length. If they are the same, return true, else return false.
             
         */
        Stack<Character> stack = new Stack<>();
        int length = str.length();
        int middle = length / 2;
      /*
        caaaaac=6;
        mid=6/2
        maariiraam=7
        mid


       */
        
        for (int i = 0; i < middle; i++) {//loop through the characters of the string untill the middle character
            stack.push(str.charAt(i));
            //System.out.println(str.charAt(i));
        }
       if (length % 2 != 0) {// if the string has odd length, skip the middle character
           middle++;
        }

        // pop the characters from the stack and compare with the second half of the
        // string
      
        for (int i = middle; i < length; i++) {
            
            if (stack.pop() != str.charAt(i)) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
       
        
        while(true){
           
            System.out.println("\nManage the Program");
            System.out.println("(P)alindrome\n(q)uit: ");
            char option = scn.next().charAt(0);
          if(option=='P'||option=='p'){
            System.out.println("Enter String: ");
            scn.nextLine();
            String anystring = scn.nextLine();
            if (isPalindrome(anystring)) {
                System.out.println("\nResult: "+anystring + " is a PALINDROME");
            } 
            else {
                System.out.println("\nResult: "+anystring + " is not a PALINDROME");
                
            }
           
          
        }
    if(option=='Q'|option=='q'){
        System.out.println("Thanks for using this program");
        System.exit(0);
           }


       }

       
       
    }
}
