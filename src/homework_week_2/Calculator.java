package homework_week_2;


public class Calculator {

    int value;

    public Calculator(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public int addention (Calculator a, Calculator b){
        return (a.getValue()+b.getValue());
        }

    public int subtraction (Calculator a, Calculator b){
        return (a.getValue()-b.getValue());
    }
    public int multiplay  (Calculator a, Calculator b){
        return (a.getValue()*b.getValue());
    }

    public int devide (Calculator a, Calculator b){
        return (a.getValue()/b.getValue());
    }

}
