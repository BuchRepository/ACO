package homework_week_3;

public abstract class Employee {
    private String name;
    private int salary;
    private String position;
    private  long IDEmployee;
    private ServiceCentre serviceCentre;
    private static long idGenerator = 1;

    public Employee(String name, int salary, String position,ServiceCentre serviceCentre) {
        this.name = name;
        this.salary = salary;
        this.position=position;
        IDEmployee=idGenerator++;
        this.serviceCentre = serviceCentre;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public long getIDEmployee() {
        return IDEmployee;
    }

    public ServiceCentre getServiceCentre() {
        return serviceCentre;
    }

    public void setServiceCentre(ServiceCentre serviceCentre) {
        this.serviceCentre = serviceCentre;
    }
    //show information about Employee
    public void showInfo() {
        System.out.println("Name = " + name
                        + ", salary = " + salary
                        + ", IdEmployee = " + IDEmployee
                        + ", Service Centre = "+ serviceCentre.getName()
        );
    }

    public String toString (){
        return ("Name = "+ getName()+
                ", salary ="+getSalary()+
                ", IdEmployee = "+getIDEmployee()+
                ", Service Centre = "+getServiceCentre().getName()+
                ", Class = "+getClass()
        );
    }
}
