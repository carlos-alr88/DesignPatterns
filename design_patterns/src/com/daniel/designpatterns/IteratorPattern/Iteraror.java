package design_patterns.src.com.daniel.designpatterns.IteratorPattern;

public interface Iteraror {
    boolean hasNext();
    Product current();
    void next();
}
