package models;

public class Plant extends Ingreadient {
    private int toxity;

    public Plant(String name, int baseReagent, int toxity) {
        super(name, baseReagent);
        this.toxity = toxity;
    }

    @Override
    public int getReagent(){
        return super.getReagent()*toxity;
    }

    @Override
    public String toString(){
        return super.toString() + "; toksyczność: " + toxity;
    }
}
