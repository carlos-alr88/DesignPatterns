package design_patterns.src.com.daniel.designpatterns.StatePattern;

public class Transit implements TravelMode {

    @Override
    public Object getETA() {
        // TODO Auto-generated method stub
        System.out.println("Calculating ETA (transit)");
        return 3;
    }

    @Override
    public Object getDirection() {
        // TODO Auto-generated method stub
        System.out.println("Calculating Direction (transit)");
        return 3;
    }

    
}
