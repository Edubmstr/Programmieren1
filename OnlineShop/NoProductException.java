package OnlineShop;

public class NoProductException extends Exception{

    public NoProductException(Product product){
        super("Product " + product + " not available in Storage");
    }
}
