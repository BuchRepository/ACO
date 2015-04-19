package test.equals;

/**
 * Created by Администратор on 17.03.2015.
 */
public class Employee {

    private String name;
    private int salary;
    private int counter;
    Worker [] workers;

    public Employee(String name, int salary) {
        this.name = name;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
/*
    public  boolean addEmployee (Employee employee){
        boolean added = false;
        if (counter < this.workers.length) {
            this.workers[counter] = employee;
            counter++;
            added = true;
        }
        return added;
    }*/
}
