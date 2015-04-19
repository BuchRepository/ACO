package class_week_3_day2;

/**
 * Created by Администратор on 13.03.2015.
 */
public class TestOuter {
    public static void main(String[] args) {


        Outer outer = new Outer();
        Outer.Inner inner = outer.new Inner();
        inner.method(10);


    }

}
