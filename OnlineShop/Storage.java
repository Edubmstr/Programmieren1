package OnlineShop;

import java.util.ArrayList;

public class Storage implements Sorting {
    private ArrayList<Product> stock;

    public Storage(){
        this.stock = new ArrayList<>();
    }

    public void addProducts(Product product, int stock){
        this.stock.add(product);
        product.setStock(stock);
    }

    public boolean getAvailibility(Product product) throws NoStockException, NoProductException{// abfragen ob Produkt überhaupt im Lager vorhanden ist
        for (Product product1 : stock){
            if(product1.getID() == product.getID()){
                if(!(product.getAvailable())){
                    throw new NoStockException();
                }else{
                    return product1.getAvailable();
                }
            }
        }
        throw new NoProductException();
    }

    public ArrayList<Product> getProducts(){
        return this.stock;
    }

    public void changeStock(Product product,int change){
        product.changeStock(change);
    }

    @Override
    public void sortStock(){
        for (int i = 1; i < stock.size(); i++) {
            Product temp = stock.get(i);
            int j = i - 1;
            while(j >= 0 && stock.get(j).getAmount() > temp.getAmount()){
                stock.set(j + 1, stock.get(j));
                j--;
            }
            stock.set(j + 1, temp);
        }
    }
}
