package class_week_3_day2.immutable;

/**
 * Created by Администратор on 13.03.2015.
 */
public class Testdog {

    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.bark();
        dog = new MyDog();
        dog.bark();
        System.out.printf("%.2f", Math.PI);

    }
}
