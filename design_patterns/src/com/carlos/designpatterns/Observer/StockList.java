package design_patterns.src.com.carlos.designpatterns.Observer;

/**
 * StockList
 */
public class StockList implements Observer{
    private Stock stock;
    
    public StockList(Stock stock) {
        this.stock = stock;
    }

    @Override
    public void update() {
        System.out.println("New Value "+ stock.getStockPrice());
        
    }

    
}