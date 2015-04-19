package class_week_2_day2;

import java.util.Objects;

/**
 * Created by Администратор on 05.03.2015.
 */
public class Number {
    private double  value;

    public Number(double value) {
        this.value = value;
    }

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }

    public Number addNumber (Number number){
      return new Number(this.value+number.getValue());

    }

   /* public void minusNumber (Number number){
        this.value=this.value-number.value;

    }

    public void devideNumber(Number number){
        this.value=this.value/ number.value;
    }
*/
    public String sString(){
        return  String.valueOf(value);
    }

    public void isSame(Number number){
        boolean equal;
        if (this.value==number.value)
        {
            System.out.println("chisla ravnie");
        } else
        {
            System.out.println("chisla neravmie");
        }
    }
    @Override
    public  boolean equals (Object obj){
        if (obj ==null){
            return false;
        }
        if (obj==this){
            return true;
        }
        if(!(obj instanceof Number)){
            return false;
        }
        Number other = (Number) obj;
        return  other.getValue()==value;
    }
}
