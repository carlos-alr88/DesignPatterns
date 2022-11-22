package design_patterns.src.com.carlos.designpatterns.Mediator;

public class DialogBox {
    private TextBox username = new TextBox();
    private TextBox password = new TextBox();
    private CheckBox terms = new CheckBox();
    private Button signup = new Button();

    public DialogBox () {
        // Using method reference operator as descrined here 
        // https://www.java67.com/2018/06/what-is-double-colon-operator-in-java-8.html#:~:text=The%20double%20colon%20%28%3A%3A%29%20operator%20is%20known%20as,can%20make%20your%20code%20more%20readable%20and%20concise.
        username.attach(this::handleDialog);
        password.attach(this::handleDialog);
        terms.attach(this::handleDialog);
    }

    public void simulateUser() {
        username.setContent("claguna");
        password.setContent("123");
        terms.setChecked(true);

    }

    public void handleDialog() {
        // This is the mediator code. 
        // All the logic to coordinate the objects is consolidated here.
        if (username.getContent() != null && !username.getContent().isEmpty() && 
        password.getContent()!= null && !password.getContent().isEmpty() &&
        terms.isChecked()) {
            signup.setEnabled(true);
            System.out.println("Setting Button to Enabled");
        } else {
            System.out.println("Button is not enabled");
        }

    }



    
}
