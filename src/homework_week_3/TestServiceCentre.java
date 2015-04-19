package homework_week_3;

import java.util.ArrayList;

public class TestServiceCentre {
    public static void main(String[] args) {

        Address addressSC1 = new Address ("Ukraine", "Kiyv", "Pragskaya", "25/2");
        Address address2SC1 = new Address ("Ukraine", "Lviv", "Rynkova", "2");

        Director directorSC1=new Director("Vasya", 1000, null);

        Admin adminSC1= new Admin("Misha",1100,null);
        RepairExpert repairExpertSC1=new RepairExpert("Kolya",2000,null);

        ArrayList <Employee> employeeSC1 =new ArrayList<Employee>();

        ServiceCentre sc1 = new ServiceCentre("ITIS", addressSC1, employeeSC1);
        directorSC1.setServiceCentre(sc1);
        adminSC1.setServiceCentre(sc1);
        repairExpertSC1.setServiceCentre(sc1);
        Director director2SC1=new Director("Sergey", 4000, sc1);
        directorSC1.addEmployee(director2SC1);
        directorSC1.addEmployee(directorSC1);
        directorSC1.addEmployee(director2SC1);
        directorSC1.addEmployee(adminSC1);
        directorSC1.addEmployee(repairExpertSC1);
        director2SC1.showInfo();
        directorSC1.showInfo();
        adminSC1.showInfo();
        repairExpertSC1.showInfo();
        director2SC1.changeAddress(address2SC1);
        System.out.println(sc1.getAddress());
        sc1.changeAddress(addressSC1);
        System.out.println(sc1.getAddress());
        // directorSC1.removeEmployee(adminSC1);
        sc1.showAllEmployee();
        System.out.println(employeeSC1.get(0));
        System.out.println(employeeSC1.get(1));

    }
}
