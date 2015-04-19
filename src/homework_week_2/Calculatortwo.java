package homework_week_2;
import java.util.Scanner;

public class Calculatortwo {
   private int value;

    public int getValue() {
        return this.value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public int inputFirstNumber (Calculatortwo a){
        Scanner first = new Scanner(System.in);
        if (first.hasNextInt()) {
            a.setValue(first.nextInt()); // get int from console
            System.out.println("You input first number - " + a.getValue());
        }
        return  a.getValue();
    }

    public int inputSecondNumber (Calculatortwo b){
        int secondnumber = 0;
        Scanner second = new Scanner(System.in);
        if (second.hasNextInt()) {
            b.setValue(second.nextInt()); // get int from console
            System.out.println("You input second number - " +b.getValue());
        }
        return  b.getValue();
    }

    public int addention (Calculatortwo a, Calculatortwo b){
        return (a.getValue()+b.getValue());
    }

    public int subtraction (Calculatortwo a, Calculatortwo b){
        return (a.getValue()-b.getValue());
    }

    public int multiplay  (Calculatortwo a, Calculatortwo b){
        return (a.getValue()*b.getValue());
    }

    public int devide (Calculatortwo a, Calculatortwo b){
        return (a.getValue()/b.getValue());
    }
}
