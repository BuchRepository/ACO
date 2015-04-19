package test.animal;

import test.iinterface.*;

public class Dog extends Animal implements Pet{

    public Dog(String name, int size){
        super (name,size);
    }

    @Override
    public void bark(Animal animal) {
        if (animal.size > 10) {
            System.out.println("Gav Gav Gav");
            animal.getName();
        } else {
            System.out.println("gav gav gav");
            animal.getName();
        }
    }

    @Override
    public void make(Animal animal) {
        System.out.println("I used interface and i"+getName());
    }

    @Override
    public int size(Animal animal) {
        int result=animal.size+10;
        System.out.println(animal.getName()+" "+result);

        return result;
    }

}
