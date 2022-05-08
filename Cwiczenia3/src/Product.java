public class Product {
    private String name;
    private ProductType productType;
    private double price;
    private int quantity;
    private Storage storage;

    public Product(String name, ProductType productType, double price, int quantity) {
        this.name = name;
        this.productType = productType;
        this.price = price;
        this.quantity = quantity;
    }

    public boolean isAvailable(){
        return quantity > 0;
    }
    public void sell(){
        quantity -= 1;
    }
    public void increaseQuantity(int quantity){
        if(quantity <= 0){
            throw new RuntimeException("Ilość nie może być mniejsza lub równa 0.");
        }
        this.quantity += quantity;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if(name == null){
            throw new RuntimeException("Nazwa produktu nie może być nullem.");
        }

        this.name = name;
    }

    public ProductType getProductType() {
        return productType;
    }

    public void setProductType(ProductType productType) {
        if(productType == null){
            throw new RuntimeException("Typ produktu nie może być nullem.");
        }
        this.productType = productType;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if(price < 0){
            throw new RuntimeException("Cena produktu nie może być mniejsza od 0.");
        }
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        if(price < 0){
            throw new RuntimeException("Ilość produktu nie może być mniejsza od 0.");
        }
        this.quantity = quantity;
    }

    public Storage getStorage() {
        return storage;
    }

    public void setStorage(Storage storage) {
        if(price < 0){
            throw new RuntimeException("Magazyn nie może być nullem.");
        }
        this.storage = storage;
    }
}
