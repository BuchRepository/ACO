package homework_week_3;

import homework_week_3.helper.Helper;

import java.util.ArrayList;
import java.util.Scanner;

public class TestServiceCentre {
    public static void main(String[] args) {


        Address addressSC1 = new Address ("Ukraine", "Kiyv", "Pragskaya", "25/2");
        Address address2SC1 = new Address ("Ukraine", "Lviv", "Rynkova", "2");

        ArrayList <Employee> employeeSC1 =new ArrayList<Employee>();
        ServiceCentre sc1 = new ServiceCentre("ITIS", addressSC1, employeeSC1);
        Client client1=new Client("Julia",1000);

        Director directorSC1=new Director("Vasya",1111, 1000,Position.DIRECTOR,sc1);
        Director director2SC1=new Director("Sergey", 2222,4000, Position.DIRECTOR,sc1);
        Admin adminSC1= new Admin("Misha",3333, 1100,Position.ADMINISTRATOR,sc1);
        RepairExpert repairExpertSC1=new RepairExpert("Kolya",4444,2000,Position.REPAIREXPERT, sc1, null);
        RepairExpert repairExpert2SC1=new RepairExpert("Anatoliy",0005,5000,Position.REPAIREXPERT, sc1,null);
        employeeSC1.add(directorSC1);
        employeeSC1.add(adminSC1);
        employeeSC1.add(repairExpertSC1);

        Technics  technics1=new Technics("TV Panasonic", 200);
        technics1.setOwnerTechnics(client1);
        System.out.println(technics1);

        DataBase db = new DataBase();
        System.out.println(db.addRepair(sc1,technics1));



/*        System.out.println("You in System direct service centre");
        sc1.inputInSystem();
        sc1.showPossibleCommandForChoiceUser();*/

/*
        directorSC1.addEmployee(director2SC1);
        directorSC1.addEmployee(directorSC1);
        directorSC1.addEmployee(adminSC1);
        directorSC1.addEmployee(repairExpertSC1);
        directorSC1.addEmployee(repairExpert2SC1);
        System.out.println("1----");
        director2SC1.showInfo();
        directorSC1.showInfo();
        adminSC1.showInfo();
        repairExpertSC1.showInfo();
        repairExpert2SC1.showInfo();
        System.out.println("2-----");

        director2SC1.changeAddress(address2SC1);
        System.out.println(sc1.getAddress());
        sc1.changeAddress(addressSC1);
        System.out.println(sc1.getAddress());
        directorSC1.removeEmployee(adminSC1);
        System.out.println("------------");
        adminSC1.showInfo();
        System.out.println("------------");
        sc1.showAllEmployee();
        System.out.println("------------");
        System.out.println(employeeSC1.get(0));
        System.out.println(employeeSC1.get(1));
        System.out.println(employeeSC1.get(2));
        */
/*

        Technics printer = new Technics("Epson 201", 200);
        Technics scaner = new Technics("Canon SWE 5000", 1000);
        ArrayList <Repair> repairsSC1=new ArrayList<Repair>();
        ArrayList <Technics> technicsSC1=new ArrayList<Technics>();
        DataBase dataSC=new DataBase(repairsSC1, technicsSC1);
        Repair repair1=new Repair(printer);
        Repair repair2=new Repair(scaner);
        dataSC.getRepair().add(repair1);
        dataSC.getRepair().add(repair2);

        Client client1 = new Client("Stezko", 2);
        client1.setDataBase(dataSC);

        System.out.println("1--------");
        System.out.println(printer+"  "+scaner);
        System.out.println("=--------");
        System.out.println(client1.buyTechniks(client1, scaner));
        System.out.println("2--------");
        System.out.println(client1.addTechnicsRepair(sc1, scaner));
        System.out.println("___----");
        System.out.println(client1);
        System.out.println("3--------");
        System.out.println(scaner);
        System.out.println("4--------");
        client1.comeBackTechnicsFromRepair(scaner);
        System.out.println("5--------");
        System.out.println(scaner);

        Finance financeSC1=new Finance(0,0,0,0);
        financeSC1.AmountProfit(sc1);
        financeSC1.salaryAllEmployee(sc1);
        sc1.showAllEmployee();
        financeSC1.nDS(sc1);
        financeSC1.profitAfterNDSAndSalary(sc1);
*/


    }
}
