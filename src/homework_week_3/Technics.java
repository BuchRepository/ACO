package homework_week_3;

import javafx.scene.input.DataFormat;

import java.util.ArrayList;

/**
 * Created by Администратор on 15.03.2015.
 */
public class Technics {
    private static long idGenerator = 1;
    private String name;
    private double price;
    private DataFormat dateBuy;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public DataFormat getDateBuy() {
        return dateBuy;
    }

    public void setDateBuy(DataFormat dateBuy) {
        this.dateBuy = dateBuy;
    }
}
