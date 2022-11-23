package design_patterns.src.com.daniel.designpatterns.memento;

public class EditorState {
    private String content;
    public EditorState(String content) {
        this.content = content;
    }
    public String getContent() {
        return content;
    }
}
