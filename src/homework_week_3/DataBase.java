package homework_week_3;

import java.util.ArrayList;

/**
 * Created by Администратор on 03.05.2015.
 */
public class DataBase {
    private  ArrayList <Repair> repair;
    private  ArrayList <Technics> technics;
    private int count;

    public DataBase() {
        this.repair = new ArrayList <Repair> ();
        this.technics = new ArrayList<Technics> ();
    }

    public int getCount() {
        return count;
    }

    public ArrayList<Repair> getRepair() {
        return repair;
    }

    public void setRepair(ArrayList<Repair> repair) {
        this.repair = repair;
    }

    public ArrayList<Technics> getTechnics() {
        return technics;
    }

    public void setTechnics(ArrayList<Technics> technics) {
        this.technics = technics;
    }

    public boolean addRepair (ServiceCentre sc, Technics technics){
        boolean addRepair=false;
        Repair r = new Repair(technics);
        getRepair().add(r);
        getTechnics().add(technics);
        technics.setStatus(StatusTechniks.INWORKING);
        int sizeRepairExpert=0;   //counter under repairExpert
        RepairExpert currentExpert=null;
        RepairExpert choiceExpert=null;
        for (Employee element: sc.getEmployee()) {
            if (element.getPosition() == Position.REPAIREXPERT) {
                sizeRepairExpert++;
                currentExpert = (RepairExpert)element;

                if( currentExpert.getDataBase()==(null)) {
                    currentExpert.setDataBase(new DataBase());
                    currentExpert.getDataBase().setRepair(getRepair());
                    currentExpert.getDataBase().setTechnics(getTechnics());
                    if (currentExpert.getDataBase().getRepair().size() < 3) {
                        getRepair().get(count).setRepairExpert(currentExpert);
                    }
                }
                count++;
                addRepair=true;
                break;
            }
        }
        if (addRepair==false)
        {
            System.out.println("All repairExpert working or repairExpert have not");
            repair.get(count).setRepairExpert(null);
        }

        return addRepair;
    }


    public String toString (){
        return (
                "Clients techniks: \n"+getTechnics()+
                "Clients repair: \n"+ getRepair()
        );
    }
}
