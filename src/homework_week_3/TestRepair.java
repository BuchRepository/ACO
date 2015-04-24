package homework_week_3;

/**
 * Created by Администратор on 24.04.2015.
 */
public class TestRepair {
    public static void main(String[] args) {

        Technics printer = new Technics("Epson 201", 200);
        Repair repairSC1 = new Repair(null, printer, "in work");
        System.out.println(repairSC1);
    }
}
