package homework_week_3;

import javafx.scene.input.DataFormat;

import javax.xml.crypto.Data;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

/**
 * Created by Администратор on 15.03.2015.
 */
public class Technics {
    private static long idTechnics = 1;//ID number technics
    private String name;//Name technics
    private double price;//price techniks
    private Client ownerTechnics; //owner Techniks
    private SimpleDateFormat dateBuy;//date and time then bought techniks client
    private Date currentDate; //current time, support time for dateBuy
    private StatusTechniks status;//conditions techniks
    private  long IDTechnics;//ID number technics

    public Technics(String name, double price) {
        this.IDTechnics=idTechnics++;
        this.name = name;
        this.price = price;
        this.ownerTechnics=null;
        this.status = StatusTechniks.NEW;
        this.currentDate = new Date();
        this.dateBuy=new SimpleDateFormat("dd.MM.yyyy hh:mm");
    }

    public void setOwnerTechnics(Client ownerTechnics) {
        this.ownerTechnics = ownerTechnics;
    }

    public Client getOwnerTechnics() {
        return ownerTechnics;
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

    public StatusTechniks getStatus() {
        return status;
    }

    public void setStatus(StatusTechniks status) {
        this.status = status;
    }

    //show condition techniks
    public StatusTechniks showStatus (){
        return getStatus();
    }

    //show date for purchase techniks
    public String dateForPurchase(){
        return  getDateBuy().format(currentDate);
    }

    //show price for techniks
    public double priceForTechniks(){
        return getPrice();
    }

    public String toString (){
        return ("Information about techniks\n:"+
                "ID    | name    |  price    |   status    |    date of purchase\n"+
                "   "+getIDTechnics()+
                "   "+getName()+
                "   "+getPrice()+
                "   "+getStatus().name()+
                "   "+getDateBuy().format(currentDate)
        );
    }
}
