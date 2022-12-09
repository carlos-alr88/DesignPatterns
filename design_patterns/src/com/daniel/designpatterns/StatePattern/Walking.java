package design_patterns.src.com.daniel.designpatterns.StatePattern;

public class Walking implements TravelMode {

    @Override
    public Object getETA() {
        // TODO Auto-generated method stub
        System.out.println("Calculating ETA (walking)");
        return 4;
    }

    @Override
    public Object getDirection() {
        // TODO Auto-generated method stub
        System.out.println("Calculating Direction (walking)");
        return 4;
    }

    
}
