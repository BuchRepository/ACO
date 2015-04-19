package test;

/**
 * Created by Администратор on 28.03.2015.
 */
public class Random {

    public void random (int countelements){
        int []mas=new int[countelements];
        System.out.print(countelements + " randoms numbers: ");
        for (int i=0; i<mas.length; i++) {
            mas[i] = (int) (Math.random() * countelements);
            System.out.print(" "+mas[i]);
        }
    }
}

class testRandom{
    public static void main(String[] args) {
     Random random = new Random();
        random.random(4);
    }
}

