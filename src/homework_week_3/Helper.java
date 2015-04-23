package homework_week_3;

import java.util.ArrayList;

/**
 * Created by Администратор on 24.04.2015.
 */
public class Helper {
    public int[] randomNumber() {
        int[] mas = new int[10];
        for (int i = 0; i < mas.length; i++) {
            mas[i] = (int) (Math.random() * 20);
        }
         //   for (int i = 0; i < mas.length; i++) {
         //  System.out.print(mas[i]+" ");
        return mas;
    }

    public int randomEmployee(ArrayList <Employee> employee) {
        int sizeRepairExpert=0;
        for (Employee element: employee) {
            if (element.getPosition() == "RepairExpert") {
                sizeRepairExpert++;
            }
        }
            int random = (int) (Math.random() * sizeRepairExpert);
            return  random;
    }
}




