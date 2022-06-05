package models;

public class Ingreadient {
    protected String name;
    private int baseReagent;

    public Ingreadient(String name, int baseReagent){
        if(name == null || name.trim().isEmpty()){
            throw new RuntimeException("Nazwa składnika nie może być pusta");
        }

        this.name = name;
        this.baseReagent = baseReagent;
    }

    public int getReagent(){
        return baseReagent;
    }

    @Override
    public String toString(){
        return this.getClass().getName() + " o nazwie " + name + "; wartość alchemiczna: " + baseReagent;
    }
}
