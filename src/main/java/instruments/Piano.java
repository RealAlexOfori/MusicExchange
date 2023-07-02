package instruments;

import behaviours.IPlay;

public class Piano extends Instrument implements IPlay {

    int noOfKeys;

    public Piano(String material, String colour, String type, int noOfKeys){
        super(material, colour, type);
        this.noOfKeys = noOfKeys;
    }

    public String play(){
        return "Peen peen";
    }

    public String getMaterial() {
        return material;
    }

    public String getColour() {
        return colour;
    }

    public String getType() {
        return type;
    }

    public int getNoOfKeys() {
        return noOfKeys;
    }
}
