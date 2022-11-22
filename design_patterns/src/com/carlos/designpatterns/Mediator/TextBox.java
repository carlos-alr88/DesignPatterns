package design_patterns.src.com.carlos.designpatterns.Mediator;

public class TextBox extends UIControl{
    private String content;

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
        notifyObservers();
    }
}
