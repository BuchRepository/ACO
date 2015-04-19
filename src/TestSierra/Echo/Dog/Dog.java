package TestSierra.Echo.Dog;

/**
 * Created by Администратор on 24.03.2015.
 */
public class Dog {


    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void bark(Dog dog){
        System.out.println(dog.name+"Gav gav gav");
    }

    public void eat(){
        System.out.println("I need eat");
    }

    public void chaseCat(){
        System.out.println("chase me");
    }
}
