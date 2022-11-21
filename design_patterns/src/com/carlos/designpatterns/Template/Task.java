package design_patterns.src.com.carlos.designpatterns.Template;

public abstract class Task {

    public  void execute() {
        System.out.println("Execute code before action");
        this.doExecute();
    }
    
    protected abstract void doExecute();
}
