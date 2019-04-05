package April5;

import java.util.Scanner;

public class Task3 {
        public static void main(String[] args) {
            System.out.println("Input the number");
                    Scanner sc = new Scanner(System.in);
                    System.out.println("Input the number 40");
                    int number = sc.nextInt();

                        int a = 0;
                        int b = 1;

                        System.out.println(a);
                        System.out.println(b);

                        for(int cnt=2; cnt<number;cnt++) {
                            int c = a + b;
                            a = b;
                            b = c;
                            System.out.println(c);
                        }

                    }
                }
