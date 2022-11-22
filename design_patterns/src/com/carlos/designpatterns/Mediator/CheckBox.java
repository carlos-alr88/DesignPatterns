package design_patterns.src.com.carlos.designpatterns.Mediator;

public class CheckBox extends UIControl{
    private boolean isChecked;

    public boolean isChecked() {
        return isChecked;
    }

    public void setChecked(boolean isChecked) {
        this.isChecked = isChecked;
        notifyObservers();
    }

}
