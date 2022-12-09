package design_patterns.src.com.daniel.designpatterns.StatePattern;

public class Driving implements TravelMode{

    @Override
    public Object getETA() {
        // TODO Auto-generated method stub
        System.out.println("Calculating ETA (driving)");
        return 1;
    }

    @Override
    public Object getDirection() {
        // TODO Auto-generated method stub
        System.out.println("Calculating Direction (driving)");
        return 1;
    }

    
}
