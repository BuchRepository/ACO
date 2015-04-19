package test;

public class Number {
    private double value;

    public Number(double value) {
        this.value = value;
    }

    public double getValue() {
        return this.value;
    }

    public void setValue(double value) {
        this.value = value;
    }

    public Number addNumber(Number number) {
        return new Number(this.value + number.getValue());
    }

    public boolean equals(Object obj) {
        if(obj == null) {
            return false;
        } else if(obj == this) {
            return true;
        } else if(!(obj instanceof Number)) {
            return false;
        } else {
            Number other = (Number)obj;
            return other.getValue() == this.value;
        }
    }

    public String toString() {
        return String.valueOf(this.value);
    }
}
