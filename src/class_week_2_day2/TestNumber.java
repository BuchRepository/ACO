package class_week_2_day2;

/**
 * Created by Администратор on 05.03.2015.
 */
public class TestNumber {
    public static void main(String[] args) {
        Number n1 = new Number (5);
        Number n2 = new Number (8);
        Number result = n1.addNumber(n2);

        System.out.println(n2.sString());
        n2.isSame(n1);


        //System.out.println(result);

    }
}
