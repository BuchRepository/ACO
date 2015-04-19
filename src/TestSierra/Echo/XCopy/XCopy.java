package TestSierra.Echo.XCopy;

/**
 * Exemple - Xcopy from book Sierra, page 118
 */
public class XCopy {
    public static void main(String[] args) {
        int orig = 42;
        int y = 0;
        XCopy x = new XCopy();
        y = x.go(orig);
        System.out.println(orig + "   " + y);
    }
       int go (int arg){
        arg=arg*2;
        return arg;
    }

}
