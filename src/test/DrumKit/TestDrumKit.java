package test.DrumKit;

/**
 * Magnit code, page 73, Sierra
 */
public class TestDrumKit {

           public static void main(String[] args) {
            DrumKit d = new DrumKit();
            d.playTopHat();
            d.playSnare();
            d.snare=false;

            if (d.snare==true){
                d.playSnare();
            }
        }

    }


