package design_patterns.src.com.carlos.designpatterns.Template;

public class TemplateMain {
    public static void main(String[] args) {
        WindowOpen op = new WindowOpen();
        op.execute();

        WindowClose op2 = new WindowClose();
        op2.execute();
        // Note: op.doExecute(); is still visible because this class (TemplateMain)
        // is in the same package as the Task abstract class
        
    }
    
}
