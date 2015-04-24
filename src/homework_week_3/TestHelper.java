package homework_week_3;

/**
 * Created by Администратор on 24.04.2015.
 */
public class TestHelper {
    public static void main (String[]args){
        int[] mas = new int[10];
            for (int i = 0; i < mas.length; i++) {
                mas[i] = (int) (Math.random()*20);
            }
        for (int i = 0; i < mas.length; i++) {

            System.out.print(mas[i]+" ");
        }

        }
    }

