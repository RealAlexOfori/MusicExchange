package instruments;

public abstract class Instrument {

    String material;
    String colour;
    String type;

    Piano piano;

    Guitar guitar;

    Trumpet trumpet;

    public Instrument(String material, String colour, String type){
        this.material = material;
        this.colour = colour;
        this.type = type;
    }
}
