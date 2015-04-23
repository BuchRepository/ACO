package homework_week_3;

import javafx.scene.input.DataFormat;

/**
 * Created by Администратор on 19.04.2015.
 */
public class Repair {
    private RepairExpert repairExpert;
    private Technics technics;
    private String status;
    private DataFormat dateTakeRepair;
    private DataFormat dateReturnRepair;
    private double price;

    public Repair(Technics technics, double price) {
        this.technics = technics;
        this.price = price;
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

    public DataFormat getDateTakeRepair() {
        return dateTakeRepair;
    }

    public void setDateTakeRepair(DataFormat dateTakeRepair) {
        this.dateTakeRepair = dateTakeRepair;
    }

    public DataFormat getDateReturnRepair() {
        return dateReturnRepair;
    }

    public void setDateReturnRepair(DataFormat dateReturnRepair) {
        this.dateReturnRepair = dateReturnRepair;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void addRepair (Technics technics){
        Repair repair = new Repair(technics, (technics.getPrice()*0.1));
      //  this.repairExpert=repairExpert.get


    }
}
