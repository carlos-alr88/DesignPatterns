package design_patterns.src.com.daniel.designpatterns.memento;

public class EditorState {
    private String content;
    private String font;
    private int fontSize;

    public EditorState(String content, String font, int fontSize) {
        this.content = content;
        this.font = font;
        this.fontSize = fontSize;
    }
    
    public String getContent() {
        return content;
    }
    public String getFont() {
        return font;
    }
    public int getFontSize() {
        return fontSize;
    }
}
