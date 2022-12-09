package design_patterns.src.com.daniel.designpatterns.StatePattern;

public class StatePatternMain {
    public static void main(String[] args) {

        TravelMode travelMode= new Bicycling();
        travelMode.getETA();

        DirectionService service = new DirectionService();
        service.setTravelMode(travelMode);
        service.getDirection();
    }
}
