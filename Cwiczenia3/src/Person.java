import java.util.ArrayList;
import java.util.List;

public class Person {
    private String name;
    private String surname;
    private double moneyInCash;
    private double moneyOnCard;
    private List<ShoppingCart> history = new ArrayList<>();
    private ShoppingCart current;

    public Person(String name, String surname, double moneyInCash, double moneyOnCard) {
        this.name = name;
        this.surname = surname;
        this.moneyInCash = moneyInCash;
        this.moneyOnCard = moneyOnCard;
    }

    public void makeOrder(){
        current = new ShoppingCart();
    }
    public void buyByCard(){
        if(current == null){
            throw new RuntimeException("Koszyk nie istnieje");
        }
        if(current.getTotalPrice() > moneyOnCard){
            throw new RuntimeException("Brak wystarczającej ilości pieniędzy na karcie");
        }

        history.add(current);
        current = null;
    }
    public void buyInCash(){
        if(current == null){
            throw new RuntimeException("Koszyk nie istnieje");
        }
        if(current.getTotalPrice() > moneyInCash){
            throw new RuntimeException("Brak wystarczającej ilości pieniędzy w gotówce");
        }

        history.add(current);
        current = null;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if(name == null){
            throw new RuntimeException("Imie nie może być nullem");
        }
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        if(surname == null){
            throw new RuntimeException("Nazwisko nie może być nullem");
        }
        this.surname = surname;
    }

    public double getMoneyInCash() {
        return moneyInCash;
    }

    public void setMoneyInCash(double moneyInCash) {
        if(moneyInCash < 0){
            throw new RuntimeException("Ilość pieniędzy w gotówce nie może być mniejsza od 0.");
        }
        this.moneyInCash = moneyInCash;
    }

    public double getMoneyOnCard() {
        return moneyOnCard;
    }

    public void setMoneyOnCard(double moneyOnCard) {
        if(moneyOnCard < 0){
            throw new RuntimeException("Ilość pieniędzy na karcie nie może być mniejsza od 0.");
        }
        this.moneyOnCard = moneyOnCard;
    }

    public List<ShoppingCart> getHistory() {
        return history;
    }

    public ShoppingCart getCurrent() {
        return current;
    }
}
