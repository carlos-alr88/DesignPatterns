package design_patterns.src.com.carlos.designpatterns.Observer;

/**
 * Main
 */
public class Main {
    public static void main(String[] args) {
        Stock stock = new Stock();
        StatusBar bar = new StatusBar(stock);
        StockList slist = new StockList(stock);
        stock.addObserver(bar);
        stock.addObserver(slist);

        stock.setStockPrice(10);
        stock.update();
        stock.setStockPrice(20);
        stock.setStockPrice(50);
        stock.update();
    }

}