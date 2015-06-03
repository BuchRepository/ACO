package homework_week_3;

import homework_week_3.helper.Helper;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

/**
 * Created by Администратор on 19.04.2015.
 */
public class Repair {
    private String name;
    private static long idGenerator=1;
    private RepairExpert repairExpert;
    private Technics technics;
    private SimpleDateFormat dateTakeRepair;
    private SimpleDateFormat dateReturnRepair;
    private double price;
    private long IDRepair;
    private double NDS;

    public Repair() {
    }

    public Repair(Technics technics) {
        this.IDRepair=idGenerator++;
        this.name="Repair"+IDRepair;
        this.repairExpert = null;
        this.technics = technics;
        this.dateTakeRepair = new SimpleDateFormat("dd.MM.yyyy hh:mm");
        this.dateReturnRepair = new SimpleDateFormat("dd.MM.yyyy hh:mm");
        this.price = technics.getPrice()*0.1;;
        this.NDS=price*0.2;
    }

    public double getNDS() {
        return NDS;
    }

    public long getIDRepair() {
        return IDRepair;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public RepairExpert getRepairExpert() {
        return repairExpert;
    }

    public void setRepairExpert(RepairExpert repairExpert) {
        this.repairExpert = repairExpert;
    }

    public Technics getTechnics() {
        return technics;
    }

    public void setTechnics(Technics technics) {
        this.technics = technics;
    }

    public SimpleDateFormat getDateTakeRepair() {
        return dateTakeRepair;
    }

    public void setDateTakeRepair(SimpleDateFormat dateTakeRepair) {
        this.dateTakeRepair = dateTakeRepair;
    }

    public SimpleDateFormat getDateReturnRepair() {
        return dateReturnRepair;
    }

    public void setDateReturnRepair(SimpleDateFormat dateReturnRepair) {
        this.dateReturnRepair = dateReturnRepair;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }





    public String toString (){
        return ("\n"+
                "Information about repair:\n"+
                " Name   |   Repair Expert   |  Date take repair   |  Date return repair   |  price |  Name repair techniks \n"+
                "      "+getName()+
                "      "+getRepairExpert()+
                "       "+getDateTakeRepair().format(new Date())+
                "       "+getDateReturnRepair().format(new Date())+
                "       "+getPrice()+
                "       "+getTechnics().getName());
    }
}
