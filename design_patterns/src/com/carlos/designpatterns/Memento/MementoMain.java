package design_patterns.src.com.carlos.designpatterns.Memento;

public class MementoMain {
    public static void main(String[] args) {
        Document doc = new Document();
        History stateHistory = new History();
        DocumentState state = doc.createState();
        state.setContent("C2");
        state.setFontName("Font1");
        state.setFontSize(10);
        doc.restore(state);
        stateHistory.push(state);
        
        doc.print();

        DocumentState state2 = doc.createState();
        state2.setFontSize(11);
        doc.restore(state2);
        stateHistory.push(state2);
        doc.print();

        DocumentState state3 = doc.createState();
        state3.setContent("C3");
        doc.restore(state3);
        doc.print();

        doc.restore(stateHistory.pop());
        doc.print();    

    }
}
