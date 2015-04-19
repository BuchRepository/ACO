package test.animal;

/**
 * Created by Администратор on 14.03.2015.
 */
public class TestAnimal {
    public static void main(String[] args) {
        Animal animal=new Dog("Buldog",30);
        animal.setSize(40);
        System.out.println(animal.getSize()+" "+animal.getName());
        Cat cat=new Cat("barsik",10);
        Dog dog=new Dog("bigl",4);
        cat.bark(cat);
        dog.bark(dog);
        cat.make(cat);
        dog.make(dog);
        System.out.println(cat.equals(dog));
        cat.size(cat);
        dog.size(dog);

    }
}
