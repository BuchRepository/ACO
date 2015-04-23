package homework_week_3;

import homework_week_1.*;

import java.util.ArrayList;

/**
 * Created by Администратор on 16.03.2015.
 */
public class ServiceCentre implements Work{
        private String name;
        private Address address;
        private ArrayList <Employee> employee;

    public ServiceCentre(String name, Address address, ArrayList<Employee> employee) {
        this.name = name;
        this.address = address;
        this.employee = employee;
    }

    public String getName() {
            return name;
        }

    public void setName(String name) {
            this.name = name;
        }

    public Address getAddress() {
            return address;
        }

    public void setAddress(Address address) {
            this.address = address;
        }

    public ArrayList<Employee> getEmployee() {
        return employee;
    }

    public void setEmployee(ArrayList<Employee> employee) {
        this.employee = employee;
    }

    //Added employee to ServiceCentre
    public  boolean addEmployee (Employee employee){
        boolean added = false;
        getEmployee().add(employee);
        added = true;
        return added;
    }

    //Remove employee to ServiceCentre
    public  boolean removeEmployee (Employee employee){
        boolean remove=false;
        boolean existence = getEmployee().contains(employee);
        if (existence){
            getEmployee().remove(employee);
            remove=true;
        } else {
            System.out.println("The service centre has not this employee");
        }
        return remove;
    }
    //Show all employee service centre
    public void showAllEmployee() {
        for (int i=0; i<getEmployee().size(); i++) {
            System.out.println(getEmployee().get(i));
        }
    }

    //Change Address service centre
    public boolean changeAddress (Address address){
        boolean change=false;
        this.address=address;
        change=true;
        return  change;
    }

    public String toString (){
        return ("Name = " + getName()
                + ", address = " + getAddress()
               // + ", Employee = " + getEmployee()
            );
    }




}

