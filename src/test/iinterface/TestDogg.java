package test.iinterface;



public class TestDogg {
    public static void main(String[] args) {
        Pet animal = new Dogg("birya",10);
        Dogg taksa = new Dogg("taksa",7);
        Animal cat=new Animal("vasya",2);
        cat.eat(cat);
        animal.bark();
        System.out.println(taksa.getSize());
        System.out.println(taksa.getName());
    }
}
