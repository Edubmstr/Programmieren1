package OnlineShop;

public class NoProductException extends Exception{

    public NoProductException(){
        super("Product not available in Storage");
    }
}
