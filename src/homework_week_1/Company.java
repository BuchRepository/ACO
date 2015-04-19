package homework_week_1;

import java.util.Arrays;
import java.util.Scanner;

/**
 * 01/03/15 Homework ArtCode week 1
 */
    public class Company {
        private String name;
        private Address address;
        private Employee[] masEmployees;
        private int counter;

        public Company(String name, Address address, Employee[] masEmployees) {
            this.name=name;
            this.address=address;
            this.masEmployees=masEmployees;
        }

        /*Input name employee */
        public void setName(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }

        public Address getAddress() {
            return address;
        }

        public int getCounter() {
        return counter;
    }

        public Employee[] getMasEmployees() {
        return masEmployees;
    }

        public int choiceCompany (Company [] company) {
            int input = 0;
            Scanner caseUser;
            System.out.println("List of possible company for view");
            for (int i = 0; i < company.length; i++) {
                System.out.println((i + 1) + ")" + company[i].getName());
            }
            caseUser = new Scanner(System.in);
            if (caseUser.hasNextInt()) {
                input = caseUser.nextInt()-1;
            }
                return input;
        }

        public void printCompany() {
            System.out.println("Information about - " + getName() + "\n" + getAddress() + "\n" + "Information about employees "+getName()+"\n" + Arrays.deepToString(getMasEmployees()));
        }

        public void printEmployeesCompany() {
            System.out.printf("Information about employees %s, \n, %s", getName(), Arrays.deepToString(getMasEmployees()));
        }

        public void employeeWorkingMoreOneYear (){
            for (int i = 0; i < masEmployees.length; i++) {
                boolean empty = masEmployees[i]==(null);//Присваиваем переменой empty - true, если попадаем на незаполенный элемент массива
                if (empty){
                    continue;//если empty=true, то переходим к следующей итерации цикла, но не выходим с него
                }
                if (masEmployees[i].getExperience()>12){ //Если в текущего сотрудника стаж больше 12 месяцев, то запускаем метод вывода информации о нем - show
                     masEmployees[i].show();
                 }
            }
        }

        public void employeeGirlFromKyiv (Company company){
            int counterGirl=0;
            int currentCounter=0;
            for (int x = 0; x < company.masEmployees.length; x++) {
                if (company.masEmployees[x]!=(null)){
                   currentCounter = company.masEmployees[x].ListGirlKyiv();
                }
                counterGirl=counterGirl+currentCounter;
            }
            if (counterGirl==company.masEmployees.length){
                System.out.println("The company have not girl from Kyiv");
            }
        }

        public boolean addEmployee (Company company, Employee  employee){
            boolean add=false; //we added new  employee
            int counterAdd=0;
            int currentCounter=0;
            for (int i = 0; i <company.masEmployees.length ; i++) {
                if (company.masEmployees[i]==null){
                    company.masEmployees[i] = employee;
                    add = true;
                    System.out.println("Employee #"+(i+1)+" successfully added!");
                    System.out.println(" ");
                    printEmployeesCompany();
                    break;
                } {currentCounter=1;}
                counterAdd=counterAdd+currentCounter;
                }
            if (counterAdd==company.masEmployees.length){
                System.out.println("Massiv is full");
                }
            return add;
        }

         public boolean deleteEmployee (Company company, Employee  employee){
            boolean delete=false;
            for (int i = 0; i <company.masEmployees.length ; i++) {
                if (company.masEmployees[i]==(employee)) {
                    company.masEmployees[i] = null;
                    delete = true;
                    System.out.println("Employee #"+(i+1)+" successfully deleted!");
                    System.out.println(" ");
                    printEmployeesCompany();
                    break;
                }
            }
            if (delete==false)
                 System.out.printf("The company have not this employee");
            return delete;
         }
}



