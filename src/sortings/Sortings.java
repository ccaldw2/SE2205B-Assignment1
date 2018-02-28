package sortings;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

/**
 *
 * @author cjcal
 */
public class Sortings extends Application {
@Override
    public void start(Stage stage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("SortingsView.fxml"));
        Scene scene = new Scene(root);
        
        stage.getIcons().add(new Image("file:src/Sortings/WesternLogo.png"));
        stage.setTitle("Sorting Engine");

        stage.setScene(scene);
        stage.show();
    }
}
