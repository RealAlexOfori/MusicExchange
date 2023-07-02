package instruments;

import behaviours.IPlay;

public class Trumpet extends Instrument implements IPlay {

    int noOfValves;
    int noOfButtons;

    public Trumpet(String material, String colour, String type, int noOfValves, int noOfButtons){
        super(material, colour, type);
        this.noOfValves = noOfValves;
        this.noOfButtons = noOfButtons;
    }

    public String play(){
        return "Poon Poon";
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

    public int getNoOfValves() {
        return noOfValves;
    }

    public int getNoOfButtons() {
        return noOfButtons;
    }
}
