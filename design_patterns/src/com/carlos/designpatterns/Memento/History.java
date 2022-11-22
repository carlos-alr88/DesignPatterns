package design_patterns.src.com.carlos.designpatterns.Memento;

import java.util.LinkedList;
import java.util.List;

public class History {
    List<DocumentState> stateHistory = new LinkedList<>();
    
    public void push(DocumentState state) {
        stateHistory.add(state);
    }

    public DocumentState pop() {
        return stateHistory.remove(stateHistory.size()-1);
    }

}
