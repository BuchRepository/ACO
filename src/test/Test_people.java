package test;


public class Test_people {
    public static void main(String[] args) {
        People people = new People("Иван", 14);
        people.name = "Дурак";
        people.age = 25;

        People_two people2 =new People_two("Boris",20);
        System.out.println(people2.getName());



    }
}