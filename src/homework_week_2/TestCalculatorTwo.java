package homework_week_2;

import java.util.Scanner;


public class TestCalculatorTwo {
    public static void main(String[] args) {

        Calculatortwo a = new Calculatortwo();
        Calculatortwo b = new Calculatortwo();

        System.out.println("Input first number: ");
        a.inputFirstNumber(a);
        System.out.println("Input second number: ");
        a.inputSecondNumber(b);

        System.out.println("List of possible commands with number, input your change:\n" +
                "1. addation\n" +
                "2. substraction\n" +
                "3. multiplay\n" +
                "4. devide\n");
        int chooseAction = 0;

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
