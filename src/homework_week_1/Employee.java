package homework_week_1;
import javax.sound.midi.Soundbank;
import java.util.Scanner;

/**
 * 01/03/15 Homework ArtCode week 1
 */
public class Employee {

    private String name;
    private int salary;
    private Address address;
    private String sex;
    private int age;
    private int experience;

    public Employee() {
    }

    public Employee(String name, int salary, Address address, String sex, int age, int experience) {
        this.name=name;
        this.salary=salary;
        this.address=address;
        this.sex=sex;
        this.age=age;
        this.experience=experience;
    }

    /*Input name employee */
    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setSalary (int salary) {
        this.salary = salary;
    }

    public int getSalary() {
        return salary;
    }

    public void setAddress (Address address) {
        this.address = address;
    }

    public Address  getAddress() {
        return address;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getSex () {
        return sex;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge () {
        return age;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    public int getExperience () {
        return experience;
    }

    public void show() {
        System.out.printf("%8s %8d %30s %6s %6d %6s", getName(), getSalary(), getAddress(),
                getSex(), getAge(), getExperience());
        System.out.println();
    }
    public String printEmployee() {
        return  ("List employee: name "+name+" ,salary$"+salary+" ,address"+address.print()+" ,sex "+sex+" ,age"+age+" ,experience"+experience);
    }

    public int ListGirlKyiv () {
        int counter=0;
        boolean thisGirlFromKyiv = getSex().equals("woman")&&getAddress().getCity().equals("Kyiv");
        if (thisGirlFromKyiv) {
            System.out.println("List employees girl from Kyiv: name ");
            show();
        } else {counter=1;}
        return counter;
    }

@Override
    public String toString (){
        return ("Name     Salary$    Sex     Age    Experience  "+" \n"
                +getName()+"   "+getSalary()+"      "+getSex()+"      "+getAge()+"       "+getExperience()+"\n");
    }
}