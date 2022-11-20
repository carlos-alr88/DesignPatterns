package Observer;

public class StatusBar implements Observer{
    private Stock stock;

    public StatusBar(Stock stock) {
        this.stock = stock;
    }

    @Override
    public void update() {
        System.out.println("Status Bar new value "+ stock.getStockPrice());
        
    }


}
