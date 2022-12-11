package design_patterns.src.com.daniel.designpatterns.IteratorPattern;

public class IteratorPatternMain {
    public static void main(String[] args) {
        var products = new ProductCollection();
        products.add(new Product(1, "Paper"));
        products.add(new Product(2, "Pencil"));
        products.add(new Product(3, "Block"));

        Iteraror iterator = products.createIterator();
        while (iterator.hasNext()){
            var product = iterator.current();
            System.out.println(product.toString()); 
            iterator.next();;
        }
    }
}
