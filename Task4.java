package April5;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
    System.out.println("Enter the Input ");
            int r,sum=0,temp;
            int n=454;//It is the number variable to be checked for palindrome

            temp=n;
            while(n>0){
                r=n%10;  //getting remainder
                sum=(sum*10)+r;
                n=n/10;
            }
            if(temp==sum)
                System.out.println("palindrome number ");
            else
                System.out.println("not palindrome");
        }
    }
