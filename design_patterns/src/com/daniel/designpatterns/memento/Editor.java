package design_patterns.src.com.daniel.designpatterns.memento;

public class Editor {
    private String content;
    private String font;
    private int fontSize;

    public EditorState createState(){
        return new EditorState(content);
    }
    public void restore(EditorState state){
        content=state.getContent();
    }
    public void setContent(String content) {
        this.content = content;
    }
    public String getContent() {
        return content;
    }
    public String getFont() {
        return font;
    }
    public void setFont(String font) {
        this.font = font;
    }
    public int getFontSize() {
        return fontSize;
    }
    public void setFontSize(int fontSize) {
        this.fontSize = fontSize;
    }
}
