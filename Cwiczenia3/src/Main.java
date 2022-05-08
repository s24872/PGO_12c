import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args){
        Person person = new Person("Kinga", "Domearzka", 10, 0);
        person.makeOrder();

        List<Product> productList = new ArrayList<>();
        productList.add(new Product("Produkt 1", ProductType.Electronic, 1, 1));

        person.getCurrent().setProductList(productList);
        person.buyByCard();
        person.buyInCash();

    }
}