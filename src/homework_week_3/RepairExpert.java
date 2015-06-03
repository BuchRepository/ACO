package homework_week_3;

import homework_week_1.*;

import java.util.ArrayList;

public class RepairExpert extends Employee {

    private DataBase dataBase;

    public RepairExpert(String name, int password, int salary, Position position, ServiceCentre serviceCentre, DataBase dataBase) {
        super(name, password, salary, position, serviceCentre);
        this.dataBase = dataBase;
    }



    public DataBase getDataBase() {
        return dataBase;
    }

    public void setDataBase(DataBase dataBase) {
        this.dataBase = dataBase;
    }
}
