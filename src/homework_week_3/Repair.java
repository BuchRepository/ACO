package homework_week_3;

import javafx.scene.input.DataFormat;

import java.text.SimpleDateFormat;

/**
 * Created by Администратор on 19.04.2015.
 */
public class Repair {
    private RepairExpert repairExpert;
    private Technics technics;
    private String status;
    private SimpleDateFormat dateTakeRepair;
    private SimpleDateFormat dateReturnRepair;
    private double price;

    public Repair() {
    }

    public Repair(RepairExpert repairExpert, Technics technics, String status) {
        this.repairExpert = repairExpert;
        this.technics = technics;
        this.status = "inWork";
        this.dateTakeRepair = new SimpleDateFormat("dd.MM.yyyy hh:mm");
        this.dateReturnRepair = new SimpleDateFormat("dd.MM.yyyy hh:mm");
        this.price = technics.getPrice()*0.1;;
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

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
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
        return ("repairExpert = "+ getRepairExpert()+
                ", technics ="+getTechnics()+
                ", status = "+getStatus()+
                ", date take repair = "+getDateTakeRepair()+
                ", date return repair = "+getDateReturnRepair()+
                ", price");
    }

}
