package forgevale;

import forgevale.objects.Board;
import forgevale.objects.Test;
import java.util.Optional;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.ButtonType;
import javafx.stage.Stage;

/**
 *
 * @author ampirolli
 */
public class ForgeVale extends Application {
    
    @Override
    public void start(Stage stage) throws Exception {
        
        Alert alert = new Alert(AlertType.CONFIRMATION);
        alert.setTitle("Forge Vale");
        alert.setHeaderText("Welcome to Forge Vale");
        alert.setContentText("This application is to be used for testing and balancing existing card within Forge Vale."
                + " Press 'OK' to begin testing.");
        Optional<ButtonType> result = alert.showAndWait();
        if (result.get() == ButtonType.OK){
            Parent root = FXMLLoader.load(getClass().getResource("FXMLDocument.fxml"));
        
            Scene scene = new Scene(root);

            stage.setScene(scene);
            stage.show();
        } else {
            stop();// ... user chose CANCEL or closed the dialog
        }
        
        
        
        
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
