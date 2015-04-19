package test.animal;

import test.iinterface.*;

public class Cat extends Animal implements Pet{

    public Cat(String name, int size) {
        super(name, size);
    }

    public void bark (Animal animal){
        System.out.println("myau myau mayu");
    }

    @Override
    public void make(Animal animal) {
        System.out.println("I used inerface and i"+getName());
    }

    @Override
    public int size(Animal animal) {
        int result=animal.size+5;
        System.out.println(animal.getClass().getName()+" "+result);
        return result;
    }
}
