package OnlineShop;

import Bank.InsufficientFundsException;
import Bank.Konto;

import java.util.ArrayList;

public class ShoppingCart {
    private final ArrayList<Product> products = new ArrayList<>();
    private boolean discount = false;
    private double discountPercentage;

    Storage storage;

    public ShoppingCart(Storage storage){
        this.setStorage(storage);
    }

    private double priceAfterDiscount;

    public void addProduct(Product product, int amount){
        this.products.add(product);
        product.setAmount(amount);
    }

    public void removeProduct(Product product){
        this.products.remove(product);
        setCheckForExceptions(true);
        this.priceAfterDiscount = 0;
        discount();
    }

    public void setStorage(Storage storage){
        this.storage = storage;
    }

    public double sumCart(){
        double sum = 0;
        for (Product product : products){
            sum += product.getPrice() * product.getAmount();
        }
        return sum;
    }

    public void setAmountInCart(Product product, int amount){
        if (amount == 0) {
            removeProduct(product);
        }else{
            product.setAmount(amount);
            setCheckForExceptions(true);
            this.priceAfterDiscount = 0;
            discount();
        }
    }

    public ArrayList<Product> getProducts(){
        return this.products;
    }

    public void printAllProducts(){
        for (Product product : products){
            System.out.println(product + " Amount: " + product.getAmount());
        }
    }

    public Product getProduct(int id){
        for(Product product : products){
            if(product.getID() == id){
                return product;
            }
        }
        return null;
    }

    private void discount(){
        for(Product product : products){
            if(product.getDiscountable()){
                setPriceAfterDiscount(product);
            }else{
                this.priceAfterDiscount += product.getPrice() * product.getAmount();
            }

        }
    }

    private void setPriceAfterDiscount(Product product){
        this.priceAfterDiscount += (product.getPrice() * product.getAmount()) * (1 - (discountPercentage / 100));
    }

    public double getNewPrice(){
        return priceAfterDiscount;
    }

    public void setDiscount(double discountPercentage){
        this.discount = true;
        this.discountPercentage = discountPercentage;
        discount();
    }

    private boolean checkForExceptions = true;

    private void setCheckForExceptions(boolean bool){
        checkForExceptions = bool;
    }

    private boolean getCheckForException(){
        return checkForExceptions;
    }

    private boolean checkStocksAndProducts(){
        for (Product product : products) {
            try{
                storage.getAvailibility(product);
            }catch (NoStockException e){
                // nach Lagerbestand gucken
                System.out.println("Product " + product + " has missing stock of " + (product.getAmount() - product.getStock()) + " pieces.");
                System.out.println("Remove missing pieces to process the order.");
                setCheckForExceptions(false);
                // this.priceAfterDiscount -= product.getPrice() * (product.getAmount() - product.getStock());
            }catch (NoProductException e){
                // gucken ob es Produkt im Lager gibt, wenn nicht dann Produkt nicht vorhanden
                System.out.println(e.getMessage());
                System.out.println("Remove Product from Cart");
                setCheckForExceptions(false);
                // this.priceAfterDiscount -= product.getPrice() * product.getAmount();
            }
        }
        return getCheckForException();
    }

    public void order(Konto konto){ // nicht fertig
        if(checkStocksAndProducts()){
            try{
                if(discount){
                    konto.payOut(this.getNewPrice());
                }else{
                    konto.payOut(this.sumCart());
                }
                for (Product product : products) {
                    this.storage.changeStock(product, -(product.getAmount()));
                }
                System.out.println("Order succesfully created! Thank you " + konto.getName() + " for your oder!");
            } catch (InsufficientFundsException e) {
                System.out.println("Not enough money on account!");
            }
        }
    }
}
