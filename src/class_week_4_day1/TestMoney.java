package class_week_4_day1;

import java.util.Arrays;
import java.util.Comparator;



public class TestMoney {
    public static void main(String[] args) {

        Money[] moneys = new Money[3];
        moneys[0] = new Money("ua",100);
        moneys[1] = new Money("usa",50);

        Arrays.sort(moneys, new Comparator<Money>() {
            @Override
            public int compare(Money money1, Money money2) {
                if (money1.getValue()>money2.getValue()){
                    return 1;
                }
                if (money1.getValue()<money2.getValue()) {
                    return -1;
                }
                return 0;
            }
        });
    }
}
