package models;

public class Liquid extends Ingreadient{
    private int dissolubility;

    public Liquid(String name, int baseReagent, int dissolubility) {
        super(name, baseReagent);

        if(dissolubility < 0 || dissolubility > 100){
            throw new RuntimeException("Wartość rozpuszczalności musi być w przedziale [0, 100]");
        }

        this.dissolubility = dissolubility;
    }

    @Override
    public int getReagent(){
        return super.getReagent()/dissolubility;
    }

    @Override
    public String toString(){
        return super.toString() + "; rozpuszczalność: " + dissolubility;
    }
}
