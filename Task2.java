package April5;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        System.out.println("Enter the amount of people in the room" );
        Scanner sc= new Scanner(System.in);
        int p1 = sc.nextInt();
        System.out.println("The amount of people in the room " +p1);
        int p2 = sc.nextInt();
        System.out.println("The amount of people in the room" +p2);
        int sum= p1+p1;
        if (sum<=100){
            System.out.println("The amount of people can fit in the room" );

        }
        else{
            System.out.println("The amount of people can not fit in the room" );

        }

    }
}
