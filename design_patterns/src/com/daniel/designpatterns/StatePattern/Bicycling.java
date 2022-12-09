package design_patterns.src.com.daniel.designpatterns.StatePattern;

public class Bicycling implements TravelMode{

    @Override
    public Object getETA() {
        // TODO Auto-generated method stub
        System.out.println("Calculating ETA (bicycling)");
        return 2;
    }

    @Override
    public Object getDirection() {
        // TODO Auto-generated method stub
        System.out.println("Calculating Direction (bicycling)");
        return 2;
    }

    
}
