package test;

import java.util.Scanner;

public class TestDog {
    public static void main(String[] args) {
        Dog[] dog = new Dog[3];
        int x = 0;
        while (x < 3) {
            System.out.println("Input name " + (x + 1) + " dog");
            Scanner sc_name = new Scanner(System.in);
            dog[x] = new Dog();
            if (sc_name.hasNextLine()) {
                dog[x].name = (String)sc_name.nextLine();
            }
            x++;
        }
            System.out.println("Thanks you input all name dogs");

        for (int i = 0; i < dog.length; i++) {
            System.out.println(dog[i].name);
        }
        Cat tomas = new Cat();
        tomas.bark(dog[1]);

    }
}
