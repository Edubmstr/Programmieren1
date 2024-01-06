package OnlineShop;

import Bibliothek.Timestamp;

import java.util.ArrayList;

public class Receipt {

    private final double sum;


    public Receipt(ShoppingCart cart){
        Timestamp time = new Timestamp();
        sum = cart.getNewPrice();
    }
}
