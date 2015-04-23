package homework_week_3;


import java.util.Scanner;

public class Director extends Employee{

    public Director(String name, int salary, ServiceCentre serviceCentre) {
        super(name, salary, serviceCentre);
    }

    public void work(){
        System.out.println("I am working");
    }

    //change address a Service Centre
    public boolean changeAddress (Address address){
        getServiceCentre().changeAddress(address);
        return true;
    }

    public boolean addEmployee (Employee employee){
        getServiceCentre().addEmployee(employee);
        return true;
    }

    public boolean removeEmployee (Employee employee){
        getServiceCentre().removeEmployee(employee);
        return true;
    }

}
