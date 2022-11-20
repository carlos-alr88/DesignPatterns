package Observer;

public class Stock extends Subject{
    private float stockPrice;

    public float getStockPrice() {
        return stockPrice;
    }

    public void setStockPrice(float stockPrice) {
        this.stockPrice = stockPrice;
    }

}
