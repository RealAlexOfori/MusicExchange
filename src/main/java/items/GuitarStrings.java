package items;

import behaviours.ISell;

public class GuitarStrings implements ISell {

    String type;

    double buyingPrice;

    double sellingPrice;

    public GuitarStrings(String type, double buyingPrice, double sellingPrice){
        super();
        this.type = type;
        this.buyingPrice = buyingPrice;
        this.sellingPrice = sellingPrice;
    }

    @Override
    public double calculateMarkup(double price) {
        return price;
    }

    public String getType() {
        return type;
    }

    public double getBuyingPrice() {
        return buyingPrice;
    }

    public double getSellingPrice() {
        return sellingPrice;
    }
}
