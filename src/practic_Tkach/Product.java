package practic_Tkach;

/**
 * Practic Tkach sentence #4
 */
public abstract class Product {
    private String title;
    private int price;
    private int quality;
    public static final int DEF_Discount=10;

    public String getTitle (){
        return  title;
    }
    public void setTitle (String title){
        this.title=title;
    }

    public int getQuality() {
        return quality;
    }

    public void setQuality(int quality) {
        this.quality = quality;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public  int getCost (){
        return quality*price;
    }

    protected int countDiscount(){
        if (quality>10)
            return DEF_Discount;
        else return 0;

    }
}
