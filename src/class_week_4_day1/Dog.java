package class_week_4_day1;

import java.util.Date;

public class Dog implements Cloneable {

    private  String name;
    private int age;
    private Date Birthday;

    public void setBirthday(Date birthday) {
        Birthday = birthday;
    }

    public Dog(String name, int age) {
        this.name = name;
        this.age = age;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void bark(int count)throws  MyException{
        if (count<2){
            throw new MyException();
        }
        for (int i = 0; i <count ; i++) {
            System.out.println("gav");
        }

    }

    protected  Object clone() throws CloneNotSupportedException{
        Dog dog=new Dog(name,age);
        dog.name=name+"";
        dog.Birthday=(Date) Birthday.clone();
        return dog;
    }

    public String toString (Dog dog){
        return String.format("name%s, age%d,Birthday%s", name,age,Birthday);
    }
}
