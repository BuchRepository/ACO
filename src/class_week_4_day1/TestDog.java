package class_week_4_day1;

import java.util.Calendar;
import java.util.Date;

/**
 * Created by Администратор on 18.03.2015.
 */
public class TestDog {

    public static void main(String[] args) throws CloneNotSupportedException, MyException {
        Dog dog = new Dog("Ches",10);

        Cloneable cloneable = dog;
        dog.setBirthday(new Date(233243243244L));
        Dog clonedDog = (Dog) dog.clone();

        System.out.println(dog);
        System.out.println(cloneable);
        dog.bark(5);
        dog.bark(-2);

    }


}
