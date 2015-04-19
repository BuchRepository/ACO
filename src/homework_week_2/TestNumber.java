package homework_week_2;
public class TestNumber {

    public static void main(String[] args) {
        Number n1 = new Number(5);
        Number n2 = new Number(4);
        System.out.println("Number first - "+n1.getValue());
        System.out.println("Number second - "+n2.getValue());
        System.out.print("Addation - ");
        n1.addNumber(n2);
        System.out.print("Raznica - ");
        n1.minusNumber(n2);
        System.out.print("Umnoghenie - ");
        n1.umnoghenieNumber(n2);
        System.out.print("Delenie - ");
        n1.delenieNumber(n2);
        System.out.print("Stepen - ");
        n1.stepenNumber(n2);
        System.out.print("Factorial - ");
        n1.factorialNumber(n2);
        System.out.print("Ostatok ot deleniya - ");
        n1.modulNumber(n2);
        System.out.println("Equals or not - " + n1.equals(n2));
    }
}
