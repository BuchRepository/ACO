package QA.week3.day1.Utils;

/**
 * Created by Администратор on 20.10.2015.
 */
public class ClassNameUtil {   // What Do class doing?

    private ClassNameUtil(){}

    public static String getCurrentClassName() {
        try {
            throw new RuntimeException();
        } catch (RuntimeException e){
            return e.getStackTrace()[1].getClassName();
        }
    }
}