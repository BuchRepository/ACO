package homework_week_3;

import homework_week_1.*;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by Администратор on 16.03.2015.
 */
public class ServiceCentre implements Work{
    private String name;
    private Address address;
    private ArrayList <Employee> employee;
    private ArrayList <Client> clients;
    private DataBase dataBase;
    Finance finance;

    public DataBase getDataBase() {
        return dataBase;
    }

    public void setDataBase(DataBase dataBase) {
        this.dataBase = dataBase;
    }

    public Finance getFinance() {
        return finance;
    }

    public void setFinance(Finance finance) {
        this.finance = finance;
    }

    public ServiceCentre(String name, Address address, ArrayList<Employee> employee) {
        this.name = name;
        this.address = address;
        this.employee = employee;
        this.clients=null;
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

    public ArrayList<Client> getClients() {
        return clients;
    }

    public void setClients(ArrayList<Client> clients) {
        this.clients = clients;
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

    public int choiceEmployee () {
        int input = 0;
        Scanner caseUser;
        System.out.println("List of possible employee for view");
        for (int i = 0; i <getEmployee().size(); i++) {
            System.out.println((i + 1) + ")" + getEmployee().get(i).getName());
        }
        caseUser = new Scanner(System.in);
        if (caseUser.hasNextInt()) {
            input = caseUser.nextInt()-1;
        }
        return input;
    }
 /*   //Help metod for choice position, used in console display
    public int choicePosition () {
        int choicePosition = 0;
        Scanner caseUser;
        System.out.println("Enter number your user notice. List possible name:");
        System.out.println(Arrays.toString(Position.values())); //write all possible value Enum Position
        caseUser = new Scanner(System.in);
        choicePosition = caseUser.nextInt();
        return choicePosition;
    }*/

    //Show all employee service centre
    public void showAllEmployee() {
        for (int i=0; i<getEmployee().size(); i++) {
            System.out.println(getEmployee().get(i));
        }
    }

    //Added clients to ServiceCentre
    public  boolean addClient (Client client){
        boolean added = false;
        getClients().add(client);
        added = true;
        return added;
    }

    //Remove client to ServiceCentre
    public  boolean removeClient (Client client){
        boolean remove=false;
        boolean existence = getClients().contains(client);
        if (existence){
            getClients().remove(client);
            remove=true;
        } else {
            System.out.println("The service centre has not this employee");
        }
        return remove;
    }

    //Show all clients service centre
    public void showAllClients() {
        for (int i=0; i<getClients().size(); i++) {
            System.out.println(getEmployee().get(i));
        }
    }

    //Change Address service centre
    public boolean changeAddress(Address address){
        boolean change=false;
        this.address=address;
        change=true;
        return  change;
    }

    public String toString (){
        return ("Name = " + getName()
                + ", address = " + getAddress()
            );
    }




}

