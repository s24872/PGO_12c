import models.*;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args){
        List<Ingreadient> ingreadients = new ArrayList<>();
        ingreadients.add(new Ingreadient("Składnik", 42));

        try{
            ingreadients.add(new Ingreadient("Składnik", 10));
        }catch (RuntimeException e){
            System.out.println(e.getMessage());
        }

        ingreadients.add(new Alcohol("Wódka", 26, 45, 80));

        try {
            ingreadients.add(new Alcohol("Wódka", 22, 92, 29));
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
        }

        ingreadients.add(new Crystal("Kryształ", 58, 9, 25));
        ingreadients.add(new Flower("Kwiat", 15, 19));
        ingreadients.add(new Liquid("Ciecz", 6, 31));

        try{
            ingreadients.add(new Liquid("Ciecz", 57, 73));
        }catch (RuntimeException e){
            System.out.println(e.getMessage());
        }

        ingreadients.add(new Mineral("Minerał", 100, 55));
        ingreadients.add(new Ore("Ruda", 61, 97, true));
        ingreadients.add(new Plant("Roślina", 85, 81));
        ingreadients.add(new Root("Korzeń", 26, 19));
        ingreadients.add(new Water("Woda", 76, 12, true));

        Elixir elixir = new Elixir("Eliksir");
        elixir.setCatalyst(new Alcohol("Wódka", 96, 40, 90));
        System.out.println("Lista składników:");
        for (Ingreadient ingreadient : ingreadients) {
            elixir.addIngreadient(ingreadient);
            System.out.println(ingreadient.toString());
        }

        elixir.Create();
    }
}
