package class_week_3_day1;

/**
 * Created by Администратор on 12.03.2015.
 */
public class TestApple {
    public static void main(String[] args) {

        Apple apple1 = new Apple(12, "Gold");
        Apple apple2 = new Apple(10, "Gold");
        System.out.println(apple1.compareTo(apple2));
        Apple []apples = new Apple[5];
        for (int i = 0; i < apples.length; i++) {
            apples[i]=new Apple(10,"Gold");
            System.out.println(apples[i]);
        }



    }


}
