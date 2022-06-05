package models;

public class Ore extends Mineral {
    private boolean metallic;

    public Ore(String name, int baseReagent, int power, boolean metallic) {
        super(name, baseReagent, power);
        this.metallic = metallic;
    }

    @Override
    public int getReagent(){
        return super.getReagent()/(!metallic?2:1);
    }

    @Override
    public String toString(){
        return super.toString() + "; metaliczność: " + metallic;
    }
}
