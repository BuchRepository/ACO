package class_week_1_day2;

public class Group {

    private String name;
    private int sizeGroup;
    private Student[] students;

    public Group(String name, int sizeGroup) {
        this.name = name;
        this.students=new Student[sizeGroup];
        System.out.println("Group " + name + " size " + sizeGroup);
    }

    public int getSizeGroup() {
        return sizeGroup;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public Student[] getStudents() {
        return  students;
    }

    public boolean addStudent(Student student) {
        boolean added = false;
        if (sizeGroup < students.length) {
            students[sizeGroup] = student;
            sizeGroup++;
            added = true;
        }
        return added;
    }

    public void showStudents() {
        for (int i = 0; i < sizeGroup; i++) {
            students[i].showInfo();
        }
    }

    public String toString () {
        String studentsinfo="";

        for (int i = 0; i < students.length; i++) {
            if (students[i]!=null)
        studentsinfo += students[i].toString();
        }
            return
                    "\n"+this.name+"\n"+
                            " students info \n"
                        +studentsinfo+" students";
    }
}
