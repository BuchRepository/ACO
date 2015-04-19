package test.iinterface;

public class Animal {

    private String name;
    private int size;

    public Animal(String name, int size) {
        this.name = name;
        this.size=size;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public void eat(Animal animal){
        System.out.println(animal+" want eat");
    }

    @Override
    public String toString() {
        return name + " size " + size;
    }
}
