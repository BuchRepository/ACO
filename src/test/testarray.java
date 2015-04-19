package test;

/**
 * Created by Администратор on 07.03.2015.
 */
public class testarray {
    public static void main(String[] args) {

        int countElement = 3;
        int[] mas = new int[countElement];
        for (int i = 0; i < mas.length; i++) {
            mas[i] = (int) ((Math.random() * 10));
            System.out.print(mas[i] + " ");

        }
    }
}
