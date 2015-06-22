package homework_week_3.helper;

import homework_week_3.Employee;
import homework_week_3.Position;
import homework_week_3.RepairExpert;
import homework_week_3.ServiceCentre;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by Администратор on 24.04.2015.
 */
public class Helper {
   /* private int chooseAction;
    int ordinalPosition;
    Employee userInSystem;*/

    public int[] randomNumber() {
        int[] mas = new int[10];
        for (int i = 0; i<mas.length; i++) {
            mas[i] =(int)(Math.random()*20);
        }
        return mas;
    }

/*    //Help metod for choice position, used in console display
    public int choicePosition () {
        int choicePosition = 0;
        Scanner caseUser;
        System.out.println("Enter number your user notice. List possible name:");
        System.out.println(Arrays.toString(Position.values())+" - 1, 2, 3"); //write all possible value Enum Position
        caseUser = new Scanner(System.in);
        choicePosition = caseUser.nextInt();
        return choicePosition;
    }*/

/*    public Employee inputInSystem (ServiceCentre serviceCentre) {
        Scanner sc = new Scanner(System.in); // System.in - console
        boolean userFound = false;
        String userName;
        int userPassword;
        System.out.println("Input your name: ");
        if (sc.hasNext()) {
            userName = sc.next(); // get inputs value from console
            for (int i = 0; i < serviceCentre.getEmployee().size(); i++) {
                System.out.println(serviceCentre.getEmployee().get(i).getName());
                if (serviceCentre.getEmployee().get(i).getName().equals(userName)) {
                    userInSystem=serviceCentre.getEmployee().get(i);
                    System.out.println("Input your password: ");
                    if (sc.hasNextInt()) {
                        userPassword = sc.nextInt(); // get inputs value from console
                            if (serviceCentre.getEmployee().get(i).getPassword()==userPassword){
                                userFound=true;
                                ordinalPosition = userInSystem.getPosition().ordinal()+1;
                            }
                    }
                }
            }
            if (userFound==true){
                System.out.println("Welcome to system");
            }
        }
        return userInSystem;
    }*/
/*
    public void showPossibleCommandForChoiceUser (ServiceCentre serviceCentre) {
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
            commandForAdministrator(serviceCentre);
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

    public int continueShowYesOrNo (){
        int number=0;
        System.out.println("You want continue: input '1' if yes and '2' if no \n");
        Scanner yesno = new Scanner(System.in); // System.in - console
        if (yesno.hasNextInt()) {
            number = yesno.nextInt();
        }
        return number;
    }

    public void  commandForAdministrator (ServiceCentre serviceCentre){
        switch (chooseAction) {
            case 1:
                //Show information about this administrator
                userInSystem.showInfo();
                if  (continueShowYesOrNo()==1) {
                    showPossibleCommandForChoiceUser(serviceCentre);
                }
                break;
            case 2:
                //"Show all employees Service centre
                serviceCentre.showAllEmployee();
                if  (continueShowYesOrNo()==1) {
                    showPossibleCommandForChoiceUser(serviceCentre);
                }
                break;
            case 3:
                //"Show finance about Service centre
                serviceCentre.getFinance();
                if  (continueShowYesOrNo()==1) {
                    showPossibleCommandForChoiceUser(serviceCentre);
                }
                break;
        }
    }*/
}




