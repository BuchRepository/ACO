package homework_week_3.stack;

/**
 * Created by Администратор on 16.03.2015.
 */
public class MyStack implements IStack {

    Object[] elements;
    int index ;

    public MyStack(Object[] elements, int index) {
        this.elements = elements;
        this.index = index;
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    @Override
    public boolean push(Object o) {
        if (index >= elements.length) {
            return false;
        }
        elements[index] = o;
        index++;
        return true;
    }

    @Override
    public Object pop() {
        if (index == 0)
            return new Object();
        Object top = elements[--index];
        return top;
    }

    @Override
    public Object peek() {
        if (index == 0) {
            System.out.println("You have not object");
        }
        Object top = elements[index];
        return top;
    }
}
