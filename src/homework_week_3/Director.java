package homework_week_3;


import java.util.Scanner;

public class Director extends Employee{

    public Director(String name, int password, int salary, Position position, ServiceCentre serviceCentre) {
        super(name, password, salary, position, serviceCentre);
    }

    public void work(){
        System.out.println("I am working");
    }

    //change address a Service Centre
    public boolean changeAddress (Address address){
        getServiceCentre().changeAddress(address);
        return true;
    }
    //add Employee a Service centre
    public boolean addEmployee (Employee employee){
        getServiceCentre().addEmployee(employee);
        return true;
    }
    //remove Employee a Service centre
    public boolean removeEmployee (Employee employee){
        getServiceCentre().removeEmployee(employee);
        return true;
    }

}
