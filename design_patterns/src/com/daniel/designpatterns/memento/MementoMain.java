package design_patterns.src.com.daniel.designpatterns.memento;

public class MementoMain {
    public static void main(String[] args) {
        Editor document =new Editor();
        History history=new History();

        document.setContent("a");
        document.setFont("Itallic");
        document.setFontSize(14);
        history.push(document.createState());
        
        document.setContent("b");
        document.setFont("Itallic");
        document.setFontSize(24);
        history.push(document.createState());

        document.setContent("c");
        document.setFont("Arial");
        document.setFontSize(24);
        history.push(document.createState());

        document.restore(history.pop());
        document.restore(history.pop());

        System.out.println(document.getContent());
        System.out.println(document.getFont());
        System.out.println(document.getFontSize());

    }
}
