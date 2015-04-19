package TestSierra.Echo.Dog;

/**
 * Created by Администратор on 24.03.2015.
 */
public class TestDog {
    public static void main(String[] args) {
        Dog dog1 = new Dog();
        dog1.bark(dog1);
        dog1.setName("Bart");
        System.out.println(dog1.getName());
        Dog [] dogs = new Dog[3];
        for (int i = 0; i <dogs.length ; i++) {
            dogs[i]=new Dog();
            dogs[2]=dog1;
        }
        System.out.println(dogs[2].getName());
        dogs[0].setName("fred");
        dogs[1].setName("bob");
        int x=0;
        while (x<dogs.length) {
            dogs[x].bark(dogs[x]);
            x=x+1;
        }
    }

}
