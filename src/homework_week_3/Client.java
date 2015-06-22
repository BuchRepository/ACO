package homework_week_3;

import java.math.BigDecimal;
import java.util.ArrayList;

public class Client {
    private String name;
    private double money;
    private DataBase dataBase;

    public Client(String name, double money) {
        this.name = name;
        this.money = money;
        this.dataBase=null;
    }

    public DataBase getDataBase() {
        return dataBase;
    }

    public void setDataBase(DataBase dataBase) {
        this.dataBase = dataBase;
    }

    public String getName() {
        return name;
    }

    public double getMoney() {
        return money;
    }

    //Add clients techniks to repair
    public boolean addTechnicsRepair (ServiceCentre sc, Technics technics) {
        boolean addRepair=false;
        boolean arrayListHaveGotTechnics=dataBase.getTechnics().contains(technics);
        if (arrayListHaveGotTechnics){
            dataBase.addRepair(sc,technics);
            addRepair = dataBase.addRepair(sc,technics);
        }
        System.out.println("Current client has not this technics!");
        return addRepair;
    }

    //Buy techniks
    public boolean buyTechniks (Client client, Technics technics){
        boolean buyTechniks=false;
        if (!dataBase.getTechnics().contains(technics)){
            dataBase.getTechnics().add(technics);
            technics.setOwnerTechnics(client);
            buyTechniks=true;
        }
        System.out.println("You have got this technics yet");
        return buyTechniks;
    }
    //comeback technics from Repair
    public boolean comeBackTechnicsFromRepair (Technics technics){
        boolean comeBackTechnicsFromRepair=false;
        if (dataBase.getRepair().contains(technics)){
            technics.setStatus(StatusTechniks.AFTERREPAIR);
            comeBackTechnicsFromRepair=true;
        }
        System.out.println("Current technics is not in repair");
        return comeBackTechnicsFromRepair;
    }

    public String toString (){
        return ("Name = "+ getName()+
                ", money "+getMoney()+"$\n");
    /*            "Clients techniks: \n"+dataBase.getTechnics()+
                "Clients repair: \n"+ dataBase.getRepair()*/

    }
}





