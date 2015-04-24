package homework_week_3;

import javafx.scene.input.DataFormat;

import java.text.SimpleDateFormat;
import java.util.ArrayList;

/**
 * Created by Администратор on 15.03.2015.
 */
public class Technics {
    private static long idTechnics = 1;
    private String name;
    private double price;
    private SimpleDateFormat dateBuy;
    private  long IDTechnics;

    public Technics(String name, double price) {
        this.IDTechnics=idTechnics++;
        this.name = name;
        this.price = price;
        this.dateBuy = new SimpleDateFormat("dd.MM.yyyy hh:mm");
    }

    public long getIDTechnics() {
        return IDTechnics;
    }

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

    public SimpleDateFormat getDateBuy() {
        return dateBuy;
    }

    public void setDateBuy(SimpleDateFormat dateBuy) {
        this.dateBuy = dateBuy;
    }

    public String toString (){
        return ("ID Technics = "+ getIDTechnics()+
                ", name ="+getName()+
                ", price = "+getPrice()+
                ", date Buy = "+getDateBuy()
                );
    }
}
