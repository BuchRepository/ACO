package class_week_4_day1;

/**
 * Created by Администратор on 18.03.2015.
 */
public class Money {

    private String currency;
    private int value;

    public Money(String currency, int value) {
        this.currency = currency;
        this.value = value;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

  /*  public int compare (Money money1, Money money2)
    //if (money1.getCurrency().equals(money2.getCurrency()))
    {
        if (money1.getValue()>money2.getValue()){
            return 1;
        }
        if (money1.getValue()<money2.getValue()) {
            return -1;
        }
        return 0;
    }
  */
}
