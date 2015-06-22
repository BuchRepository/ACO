package homework_week_3;

import homework_week_1.*;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.lang.Exception;
import  java.lang.Throwable;
import java.lang.Exception;

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
    //---------
    private static int chooseAction;
    private static int ordinalPosition;
    private static Employee userInSystem;
    //--------------
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
    public  boolean addEmployee (Employee employee) throws Exception{
        boolean added = false;
        if (getEmployee().equals(employee)){
            throw  new Exception("This employee exist in Service centre ");
        }
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
        return ("SC = " + getName()
                + ", address = " + getAddress()
            );
    }


    public int inputInSystem () {
        Scanner sc = new Scanner(System.in); // System.in - console
        boolean userFound = false;
        String userName;
        int userPassword;
        System.out.println("Input your name: ");
        if (sc.hasNext()) {
            userName = sc.next(); // get inputs value from console
            for (int i = 0; i < getEmployee().size(); i++) {
                System.out.println(getEmployee().get(i).getName());
                if (getEmployee().get(i).getName().equals(userName)) {
                    userInSystem = getEmployee().get(i);
                    System.out.println("Input your password: ");
                    if (sc.hasNextInt()) {
                        userPassword = sc.nextInt(); // get inputs value from console
                        if (getEmployee().get(i).getPassword() == userPassword) {
                            userFound = true;
                            ordinalPosition = userInSystem.getPosition().ordinal() + 1;
                        }
                    }
                }
            }
            if (userFound == true) {
                System.out.println("Welcome to system");
            }
        }
        return ordinalPosition;
    }

    public  void showPossibleCommandForChoiceUser () {
        Scanner sc = new Scanner(System.in); // System.in - console

        switch (ordinalPosition) {
            case 1://User enter as an Administrator
                System.out.println("\nList of possible command for " + Position.ADMINISTRATOR.toString() +
                           "\n1) Show information about this administrator\n" +
                            "2) Show all employees Service centre\n" +
                            "3) Show finance about Service centre\n");
                System.out.println("Input number your choices command: \n");
                if (sc.hasNextInt()) {
                    chooseAction = sc.nextInt(); // get inputs value from console
                }
                    commandForAdministrator();
                    break;
            case 2://User enter  as a RepairExpert
                System.out.println("\nList of possible command for " + Position.REPAIREXPERT.toString());
                System.out.println("\n1) Repair this technics\n" +
                            "2) Comeback techniks after repair to administrator\n");
                break;
            case 3: //User enter as a Director
                System.out.println("\nList of possible command for" + Position.DIRECTOR.toString());
                System.out.println("1) Change address Service Centre\n" +
                            "2) Add employeee to a Service centre\n" +
                            "3) Remove employee\n" +
                            "4) Show all employees a Service centre \n" +
                            "5) Pay NDS\n" +
                            "6) Raise salary employees  by 10%\n" +
                            "7) Show profit for day, month, year\n" +
                            "8) Pay salary to employee");
                    break;
        }
    }

    public static int continueShowYesOrNo(){
        int number=0;
        System.out.println("You want continue: input '1' if yes and '2' if no \n");
        Scanner yesno = new Scanner(System.in); // System.in - console
            if (yesno.hasNextInt()) {
                number = yesno.nextInt();
            }
        return number;
    }

        public void  commandForAdministrator (){
            switch (chooseAction) {
                case 1:
                    //Show information about this administrator
                    userInSystem.showInfo();
                    if  (continueShowYesOrNo()==1) {
                        showPossibleCommandForChoiceUser();
                    }
                    break;
                case 2:
                    //"Show all employees Service centre
                    showAllEmployee();
                    if  (continueShowYesOrNo()==1) {
                        showPossibleCommandForChoiceUser();
                    }
                    break;
                case 3:
                    //"Show finance about Service centre
                    getFinance();
                    if  (continueShowYesOrNo()==1) {
                        showPossibleCommandForChoiceUser();
                    }
                    break;
            }
        }

}

