package models;

public class Water extends Liquid{
    private boolean distilated;

    public Water(String name, int baseReagent, int dissolubility, boolean distilated) {
        super(name, baseReagent, dissolubility);
        this.distilated = distilated;
    }

    @Override
    public int getReagent(){
        return super.getReagent()/(distilated?2:1);
    }

    @Override
    public String toString(){
        return super.toString() + "; destylowany: " + distilated;
    }
}
