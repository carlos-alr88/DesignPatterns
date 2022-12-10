package design_patterns.src.com.daniel.designpatterns.IteratorPattern;

import java.util.ArrayList;
import java.util.List;

public class ProductCollection {
  private List<Product> products = new ArrayList<>();

  public void add(Product product) {
    products.add(product);
  }

  public Product pop(){
    var lastIndex = products.size()-1;
    var lastProdcut =products.get(lastIndex);
    products.remove(lastProdcut);
    return lastProdcut;
  }

  public Iteraror createIterator(){
    return new ListIterator(this);
  }

  public class ListIterator implements Iteraror{
    private ProductCollection productsI;
    private int index;

    public ListIterator (ProductCollection products){
      this.productsI=products;
    }

    @Override
    public boolean hasNext() {
      // TODO Auto-generated method stub
      return (index<productsI.products.size());
    }

    @Override
    public Product current() {
      // TODO Auto-generated method stub
      return productsI.products.get(index);
    }

    @Override
    public void next() {
      // TODO Auto-generated method stub
      index++;
    }

  }

}
