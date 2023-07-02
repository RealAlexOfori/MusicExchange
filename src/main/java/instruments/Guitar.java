package instruments;

import behaviours.IPlay;
import behaviours.ISell;

public class Guitar extends Instrument implements IPlay {

    int noOfStrings;

    public Guitar(String material, String colour, String type, int noOfStrings){
        super(material, colour, type);
        this.noOfStrings = noOfStrings;
    }

    public String play(){
        return "thinning thinning";
    }

    public String getMaterial() {
        return material;
    }

    public String getColour() {
        return this.colour;
    }

    public String getType() {
        return type;
    }

    public int getNoOfStrings() {
        return this.noOfStrings;
    }
}
