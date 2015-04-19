package practic_Tkach;

/**
 * Created by Администратор on 15.04.2015.
 */
public class PhotoProduct extends Product {
    private double megapx;
    private boolean digital;

    public double getMegapx() {
        return megapx;
    }

    public void setMegapx(double megapx) {
        this.megapx = megapx;
    }

    public boolean isDigital() {
        return digital;
    }

    public void setDigital(boolean digital) {
        this.digital = digital;
    }

    protected int countDiscount (){
        int DEF=super.getCost();
        if(!digital){
            DEF+=20;
        }
        return DEF;
    }
}
