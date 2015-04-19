package homework_week_2;



public class Drob {

    private int value1;
    private int value2;


    public Drob(int value1, int value2) {
        this.value1 = value1;
        this.value2 = value2;
    }

    //getter Number, output value object
    public int getValue1() {
        return this.value1;
    }

    //setter Number, output value object
    public void setValue1(int value1) {
        this.value1 = value1;
    }

    public int getValue2() {
        return value2;
    }

    public void setValue2(int value2) {
        this.value2 = value2;
    }

    //operation additions
    public void addention(Drob number) {
        int znamenatel1_1 = (this.value1 * number.getValue2());
        int znamenatel1_2 = (this.value2 * number.getValue2());
        int znamenatel2_1 = (number.getValue1() * this.value2);
        int znamenatel2_2 = (number.getValue2() * this.value2);
        int resultUp = znamenatel1_1 + znamenatel2_1;
        int resultDown = znamenatel1_2 + znamenatel2_2;
        System.out.println(resultUp);
        System.out.println("--");
        System.out.println(resultDown);
    }
}
    /*
        //operation subtraction
        public Drob minusNumber(Drob number) {
            return new Drob(this.value - number.getValue());
        }

        //operation multiplication
        public Drob umnoghenieNumber(Drob number) {
            return new Drob(this.value * number.getValue());
        }

        //operation multiplication
        public Drob delenieNumber(Drob number) {
            return new Drob(this.value / number.getValue());
        }
/*
        //operation degree
        public Number stepenNumber(Number number) {
            int start = this.value; //start value object which is degree
            for (int i = 0; i < number.getValue()-1; i++) {
                this.value=this.value*start;
            }return new Number(this.value);
        }

        //operation factorial
        public Number factorialNumber(Number number) {
            int n;
            int result = 1;
            do {
                n = number.getValue();
                for (int i = 2; i <= n; i++)
                    result *= i;
                // System.out.println("result "+result);
                if (n == 0 || n == 1)
                    System.out.println(result);
                if(n < 0)
                    System.out.println("Вы ввели отрицательный факториал!");
            } while (n < 0);
            return new Number(result);
        }

        //operation modul(jstatok ot deleniya)
        public Number modulNumber(Number number) {
            return new Number(this.value % number.getValue());
        }

        //operation equals (jstatok ot deleniya)
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
*/


