package class_week_3_day2.iinterface;

public class MyStack implements IStack{

    private static final int DEFAULT_SIZE = 16;
    private Object[] elements;
    private int index;

    public MyStack() {
        this(DEFAULT_SIZE);
    }
    public MyStack(int size) {
        elements = new Object[size];
    }
    @Override
    public Object pop() {
        if(index == 0) {
            return null;
        }
        Object top = elements[--index];
        return top;
    }
    @Override
    public boolean push(Object o) {
        if (index>=elements.length){
            return  false;
        }
        elements[index]=o;
            index++;
            return true;
    }
}


