import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ShoppingCart {
    private static Set<ShoppingCart> shoppingCarts = new HashSet<>();
    private static int index = 0;

    private int id;
    private List<Product> productList = new ArrayList<>();

    public ShoppingCart(){
        this.id = ++index;
        shoppingCarts.add(this);
    }

    public void sell(){
        if(!productList.isEmpty()){
            for (Product product : productList) {
                product.sell();
            }
        }
    }

    public double getTotalPrice(){
        if(!productList.isEmpty()){
            double totalPrice = 0;
            for (Product product : productList) {
                totalPrice += product.getPrice();
            }
            return totalPrice;
        }else{
            return 0;
        }
    }

    public double getTotalDeliveryTime(){
        if(!productList.isEmpty()){
            double totalDeliveryTime = 0;
            for (Product product : productList) {
                Storage storage = product.getStorage();

                if(storage == null){
                    continue;
                }

                totalDeliveryTime += storage.getDeliveryTime();
            }
            return totalDeliveryTime;
        }else{
            return 0;
        }
    }

    public int getId() {
        return id;
    }

    public List<Product> getProductList() {
        return productList;
    }

    public void setProductList(List<Product> productList) {
        this.productList = productList;
    }
}
