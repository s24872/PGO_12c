package models;

public class Mineral extends Ingreadient {
    private int power;

    public Mineral(String name, int baseReagent, int power) {
        super(name, baseReagent);
        this.power = power;
    }

    @Override
    public int getReagent(){
        return super.getReagent()+power;
    }

    @Override
    public String toString(){
        return super.toString() + "; moc: " + power;
    }
}
