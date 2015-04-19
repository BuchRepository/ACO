package class_week_1_day2;

public class GroupMain {

    public static void main(String[] args) {

    Group group =new Group("TV 41", 3);
    Student student = new Student("Kolya", 123124);

    group.addStudent(student);
        System.out.println(group.getSizeGroup());
        System.out.println(group.toString());
    }
}
