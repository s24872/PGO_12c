package models;

public class Alcohol extends Liquid{
    private int percent;

    public Alcohol(String name, int baseReagent, int dissolubility, int percent) {
        super(name, baseReagent, dissolubility);

        if(percent < 0 || percent > 100){
            throw new RuntimeException("Procent alkoholu w płynie musi być w przedziale [0, 100]");
        }

        this.percent = percent;
    }

    @Override
    public int getReagent(){
        return (int) (super.getReagent()*((double)percent/100));
    }

    @Override
    public String toString(){
        return super.toString() + "; zawartość alkoholu: " + percent +"%";
    }
}
