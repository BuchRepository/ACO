package TestSierra.Echo;

import java.util.Scanner;

/**
 * tester brain switch 09/04/15
 */

public class Switch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input=sc.nextInt();
        input=1;
        switch (input){

            case 1:{
                System.out.println("1");
                break;
            }
            case 2:{
                System.out.println("2");
                break;
            }
        }

    }

}

