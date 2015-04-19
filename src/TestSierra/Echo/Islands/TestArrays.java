package TestSierra.Echo.Islands;

import javax.sound.midi.Soundbank;

/**
 *  Arrays - exemple from books Sierra, page 94
 */
public class TestArrays {

    public static void main(String[] args) {
        int y=0;
        int [] index = new int[4];
        index[0] = 1;
        index[1] = 3;
        index[2] = 0;
        index[3] = 2;

        String [] islands=new String[4];
        islands[0]="Bermudu";
        islands[1]="Fidgi";
        islands[2]="Azarskie islands";
        islands[3]="Kosumel";

        int ref;
        while (y<4) {
            //ref = index[y];
            System.out.print("islands= ");
            System.out.println(islands[index[y]]);
            y=y+1;
        }
    }
}
