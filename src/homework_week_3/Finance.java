package homework_week_3;

/**
 * Created by Администратор on 19.04.2015.
 */
public class Finance {
    private double amountProfit; //All profit from repair
    private double salaryEmployee; //Salary all employee
    private double NDS;//All price repair*20%
    private double profitAfterNDSAndSalary;
    private ServiceCentre serviceCentre;

    public Finance(double amountProfit, double salaryEmployee, double NDS, double profitAfterNDSAndSalary, ServiceCentre sc) {
        this.amountProfit = amountProfit;
        this.salaryEmployee = salaryEmployee;
        this.NDS = NDS;
        this.profitAfterNDSAndSalary = profitAfterNDSAndSalary;
        this.serviceCentre=sc;
    }
    //amount profit all price from repair
    public void AmountProfit (){
        double amount = 0;
        for (int i = 0; i < serviceCentre.getDataBase().getRepair().size(); i++) {
            amount=amount+serviceCentre.getDataBase().getRepair().get(i).getPrice();
        }
        amountProfit=amount;
        System.out.println(amountProfit);
    }

    //amount salary all employee
    public void salaryAllEmployee (ServiceCentre serviceCentre){
        double amount=0;
        for (int i = 0; i < serviceCentre.getEmployee().size(); i++) {
            amount=amount+serviceCentre.getEmployee().get(i).getSalary();
        }
        salaryEmployee=amount;
        System.out.println(salaryEmployee);
    }

    //amount NDC Service Centre
    public void nDS (ServiceCentre serviceCentre){
        double amount=0;
        for (int i = 0; i < serviceCentre.getDataBase().getRepair().size(); i++) {
            amount=amount+serviceCentre.getDataBase().getRepair().get(i).getNDS();
        }
        NDS=amount;
        System.out.println(NDS);
    }

    //profit - NDS And - Salary Employee;
    public void profitAfterNDSAndSalary (ServiceCentre serviceCentre){
        profitAfterNDSAndSalary=amountProfit-salaryEmployee-NDS;
        System.out.println(profitAfterNDSAndSalary);
    }

    public String toString (){
        return ("Service Centre:    Black Profit   |   Salary Employee   |   NDS   |   White Profit \n"+serviceCentre+ amountProfit+
        +salaryEmployee +NDS+profitAfterNDSAndSalary);
    }
}
