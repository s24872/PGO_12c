package models;

import java.util.ArrayList;
import java.util.List;

public class Elixir {
    private String name;
    private boolean isCreated;
    private int power;
    private Liquid catalyst;
    private List<Ingreadient> ingreadients = new ArrayList<>();

    public Elixir(String name){
        this.name = name;
    }

    public void Create(){
        if(isCreated){
            throw new RuntimeException("Nie można utworzyć eliksiru, który został już utworzony");
        }

        int elixirPower = 0;

        for (Ingreadient ingreadient: ingreadients) {
            elixirPower += ingreadient.getReagent();
        }

        this.power = elixirPower/catalyst.getReagent();
        this.isCreated = true;

        System.out.println("Eliksir " + this.name + " został utworzony");
    }

    public void addIngreadient(Ingreadient ingreadient){
        if(this.isCreated){
            throw new RuntimeException("Nie można zmienić listy składników po utworzeniu eliksiru");
        }

        ingreadients.add(ingreadient);
    }

    public void removeIngreadient(Ingreadient ingreadient){
        if(this.isCreated){
            throw new RuntimeException("Nie można zmienić listy składników po utworzeniu eliksiru");
        }

        ingreadients.remove(ingreadient);
    }

    @Override
    public String toString(){
        if(isCreated){
            return "Eliksir " + this.name + ", który nie został jeszcze utworzony.";
        } else {
            return "Eliksir " + this.name + " o mocy " + this.power + ", którego katalizatorem jest ";
        }
    }

    public void setCatalyst(Liquid catalyst) {
        if(this.isCreated){
            throw new RuntimeException("Nie można zmienić katalizatora eliksiru po jego utworzeniu");
        }

        this.catalyst = catalyst;
    }
}
