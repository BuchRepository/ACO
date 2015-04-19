package test.iinterface;


public class Dogg extends Animal implements Pet{

    public Dogg (String name, int size) {
        super(name, size);
    }


    public void bark(){
        System.out.println("gav gav gav");
    }
}
