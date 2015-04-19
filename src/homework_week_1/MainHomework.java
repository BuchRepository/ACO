package homework_week_1;
import java.util.Scanner;
/**
 * 01/03/15 Homework ArtCode week 1
 */
public class MainHomework {
    public static void main(String[] args) {

        // Initialized value class "Address"
        Address addressFirstCompany = new Address("Ukraine", "Kyiv", "Frunze", "20b");
        Address addressTwoCompany = new Address("Poland", "Varshava", "Zapolskaya", "1");
        Address addressThreeCompany = new Address("Ukraine", "Kyiv", "Shiller", "34");

        // Initialized value class "Employee"
        Employee [] employeesFirstCompany = new Employee[4];
        employeesFirstCompany[0] = new Employee("Nikol", 2000, addressFirstCompany, "woman", 26, 24);
        employeesFirstCompany[1] = new Employee("Nikolay", 1200, addressFirstCompany, "man", 34, 42);
        employeesFirstCompany[2] = new Employee("Julia", 800, addressFirstCompany, "woman", 21, 5);
        Employee [] employeesSecondCompany = new Employee[2];
        employeesSecondCompany[0] = new Employee("Tamara", 500, addressTwoCompany, "woman", 21, 6);
        employeesSecondCompany[1] = new Employee("Bogdan", 1000, addressTwoCompany, "man", 30, 48);

        // Initialized value class "Company"
        Company [] company=new Company[2];
        company[0] = new Company("Utis", addressFirstCompany, employeesFirstCompany);
        company[1] = new Company("Bergamo", addressTwoCompany, employeesSecondCompany);

        System.out.println("List of possible commands:\n" +
                "1. Read about company\n" +
                "2. View list of employees\n" +
                "3. View employees, which work more than year.\n" +
                "4. View employees, which are girls and live in Kiev\n" +
                "5. Add an employee\n" +
                "6. Fire an employee\n" +
                "7*. Fire an employee, with salary less then 1000 and which works less then year\n" +
                "8*. Change an employee information\n" +
                "9*. View list of employees: first women and then men\n" +
                "10*. Employee has a hire date(implement class java.util.Date)\n" +
                "11*. View employees, which works between 100 and 200 hours (use Date)\n ");
        int chooseAction;

        Scanner sc = new Scanner(System.in); // System.in - console
        System.out.println("Make your choice...");
        if (sc.hasNextInt()) {
            chooseAction = sc.nextInt(); // get inputs value from console
            switch (chooseAction) {
                case 1:
                    //"View information about company.";
                    company[company[0].choiceCompany(company)].printCompany(); /*под элементом массива обьектов Company передаем return метода choiseCompany
                     (компанию которую выбрал пользователь, для вывода информации на консоль)*/
                    break;

                case 2:
                    //"View employees, choice company";
                    company[company[0].choiceCompany(company)].printEmployeesCompany();/*под элементом массива обьектов Company передаем return метода choiseCompany
                     (компанию которую выбрал пользователь, для вывода информации на консоль)*/
                    break;
                case 3:
                    //"View employees, which work more than year.";
                    company[company[0].choiceCompany(company)].employeeWorkingMoreOneYear();/*под элементом массива обьектов Company передаем return метода choiseCompany
                     (компанию которую выбрал пользователь, для вывода информации на консоль)*/
                    break;

                case 4:
                    //"View employees, which are girls and live in Kiev";
                    company[0].employeeGirlFromKyiv(company[company[0].choiceCompany(company)]);/*под элементом массива обьектов Company передаем return метода choiseCompany
                     (компанию которую выбрал пользователь, для вывода информации на консоль)*/
                    break;

                case 5:
                   //"Add an employee";
                    company[0].addEmployee(company[0], employeesFirstCompany[0]);
                    break;

                case 6:
                    //"Fire an employee";
                    company[0].deleteEmployee(company[0], employeesFirstCompany[2]);
                    break;

            }

        }
    }
}


