package View;

import javafx.application.Application;
import javafx.stage.Stage;

public class JavaFXApplication3 extends Application {
    
     @Override
    public void start(Stage stage) throws Exception {
      viewMan.openLogin();
    }
    
    public static void main(String[] args) {
        launch(args);
    }
    
}
