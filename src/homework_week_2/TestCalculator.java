package homework_week_2;

import java.util.Scanner;


public class TestCalculator {
    public static void main(String[] args) {

        int firstnumber = 0;
        int secondnumber = 0;

        System.out.println("Input first number: ");
        Scanner first = new Scanner(System.in);
        if (first.hasNextInt()) {
            firstnumber = first.nextInt(); // get int from console
            System.out.println("You input first number - " + firstnumber);
        }
        System.out.println("Input second number: ");
        Scanner second = new Scanner(System.in);
        if (second.hasNextInt()) {
            secondnumber = second.nextInt(); // get int from console
            System.out.println("You input second number - " + secondnumber);
        }
        Calculator a = new Calculator(firstnumber);
        Calculator b = new Calculator(secondnumber);

        System.out.println("List of possible commands with number, input your change:\n" +
                "1. addation\n" +
                "2. substraction\n" +
                "3. multiplay\n" +
                "4. devide\n");

        int chooseAction = 0;
        String command = null;
        Scanner sc = new Scanner(System.in); // System.in - console
        if (sc.hasNextInt()) {
            chooseAction = sc.nextInt(); // get int from console
            switch (chooseAction) {
                case 1:
                    a.addention(a, b);
                    System.out.println("Result - "+a.addention(a, b));
                    break;
                case 2:
                    a.subtraction(a, b);
                    System.out.println("Result - "+a.subtraction(a, b));
                    break;
                case 3:
                    a.multiplay(a, b);
                    System.out.println("Result - "+a.multiplay(a, b));
                    break;
                case 4:
                    a.devide(a, b);
                    System.out.println("Result - "+a.devide(a, b));
                    break;
            }
        }
    }
}
