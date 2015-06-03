package homework_week_3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public abstract class Employee {
    private String name;
    private int password;
    private int salary;
    private Position position;
    private ServiceCentre serviceCentre;
    private  long IDEmployee;
    private static long idGenerator = 1;

    public Employee(String name, int password, int salary, Position position, ServiceCentre serviceCentre) {
        this.name = name;
        this.password=password;
        this.salary = salary;
        this.position=position;
        this.serviceCentre=serviceCentre;
        this.IDEmployee=idGenerator++;
    }

    public ServiceCentre getServiceCentre() {
        return serviceCentre;
    }

    public void setServiceCentre(ServiceCentre serviceCentre) {
        this.serviceCentre = serviceCentre;
    }

    public Position getPosition() {
        return position;
    }

    public void setPosition(Position position) {
        this.position = position;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPassword() {
        return password;
    }


    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public long getIDEmployee() {
        return IDEmployee;
    }

    //show information about Employee
    public void showInfo() {
        System.out.printf("\n Id  |   Name    |  Salary   |  Position   |\n" + "  %d     %s     %d     %s  \n", IDEmployee, name, salary, position);
    }


    public String toString (){
        return ("ID = "+getIDEmployee()+
                ", name = "+ getName()+
                ", salary ="+getSalary()+
                ", position = "+getPosition()
        );
    }
}
