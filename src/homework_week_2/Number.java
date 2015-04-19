package homework_week_2;

public class Number {
    private int value;

    public Number (int value) {
        this.value = value;
    }
    //getter Number, output value object
    public int getValue() {
        return this.value;
    }
    //setter Number, output value object
    public void setValue(int value) {
        this.value = value;
    }

    //operation additions
    public Number addNumber(Number number) {
        int resultValue = this.value + number.getValue();
        Number result = new Number(resultValue);
        System.out.println(result.value);
        return result;

    }
    //operation subtraction
    public Number minusNumber(Number number) {
        int resultValue = this.value - number.getValue();
        Number result = new Number(resultValue);
        System.out.println(result.value);
        return result;
    }

    //operation multiplication
    public Number umnoghenieNumber(Number number) {
        int resultValue = this.value * number.getValue();
        Number result = new Number(resultValue);
        System.out.println(result.value);
        return result;
    }

    //operation devide
    public Number delenieNumber(Number number) {
        int resultValue = this.value / number.getValue();
        Number result = new Number(resultValue);
        System.out.println(result.value);
        return result;
    }

    //operation degree
    public Number stepenNumber(Number number) {
        int start = this.value; //"start" is value object which is degree
        for (int i = 0; i < number.getValue()-1; i++) {
            this.value=this.value*start;
        }  int resultValue = this.value ;
        Number result = new Number(resultValue);
        System.out.println(result.value);
        return result;
    }

    //operation modul(jstatok ot deleniya)
    public Number modulNumber(Number number) {
        int resultValue = this.value % number.getValue();
        Number result = new Number(resultValue);
        System.out.println(result.value);
        return result;
    }

    //operation factorial
    public Number factorialNumber(Number number) {
        int n;
        int result = 1;
        do {
            n = number.getValue();
            for (int i = 2; i <= n; i++)
                result *=i;
           System.out.println("result "+result);
            if (n == 0 || n == 1)
                System.out.println(result);
            if(n < 0)
                System.out.println("Вы ввели отрицательный факториал!");
        } while (n < 0);
        return new Number(result);
    }

    //operation equals ()
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
}
