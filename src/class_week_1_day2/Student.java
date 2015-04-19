package class_week_1_day2;

public class Student {
    private String name;
    private long studentId;
    private String group;

    public Student(String name, String group) {
        this.name = name;
        this.group = group;
    }

    public Student(String name, long studentId) {
        this.name = name;
        this.studentId = studentId;
    }

    public void setName (String name1){
        name=name1;
    }

    public void setStudentid (long id){
        studentId=id;
    }

    public String getName (){
        return name;
    }

    public long getStudentid (){
        return studentId;
    }

    public void setGroup (String group){
        this.group=group;
    }

    public String getGroup (String group){
        return group;
    }

    public void showInfo (){
        System.out.println("Name = "+name
                            + " id=" + studentId
                            + ", Group = "+ group);
    }

    public String toString (){
        return (
                name+" name1  "+
                group+" group1");

    }
}
