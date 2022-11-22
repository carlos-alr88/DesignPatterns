package design_patterns.src.com.carlos.designpatterns.Mediator;

public class Button extends UIControl{
    private boolean isEnabled;

    public boolean isEnabled() {
        return isEnabled;
    }

    public void setEnabled(boolean isEnabled) {
        this.isEnabled = isEnabled;
        notifyObservers();
    }
}
