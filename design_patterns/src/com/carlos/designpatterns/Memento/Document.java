package design_patterns.src.com.carlos.designpatterns.Memento;

public class Document {
    DocumentState currentState = new DocumentState();

    public void restore(DocumentState state) {
        currentState = state;
    }

    public DocumentState createState() {
        DocumentState state = new DocumentState();
        state.setContent(currentState.getContent());
        state.setFontName(currentState.getFontName());
        state.setFontSize(currentState.getFontSize());
        return state;
    }

    public void print() {
        System.out.println(currentState.getContent() + " " 
        + currentState.getFontName()+ " " 
        + currentState.getFontSize());
    }


}
