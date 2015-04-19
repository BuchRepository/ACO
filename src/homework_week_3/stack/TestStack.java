package homework_week_3.stack;

/**
 * Created by Администратор on 16.03.2015.
 */
public class TestStack {
    public static void main(String[] args) {
        Object [] elements=new Object[2];
        elements[0]=new Object();
        elements[1]=new Object();
        MyStack stack = new MyStack(elements, 3);
        stack.push(elements[0]);
        stack.push(elements[1]);

    }
}
