import javafx.application.Application;
import javafx.scene.layout.AnchorPane;
import javafx.scene.Scene;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;

import java.io.IOException;

public class InventorySystem extends Application {
    private AnchorPane MainScreenView;
    private FXMLLoader viewLoader;

    public void initMainScreen(Stage window) throws IOException{

        viewLoader = new FXMLLoader();
        viewLoader.setLocation(InventorySystem.class.getResource("/HomeWindow.fxml"));
        MainScreenView = viewLoader.load();

        Scene scene = new Scene(MainScreenView);

        window.setScene(scene);
        window.show();
    }

    public void showMainScreen() throws IOException{
        HomeWindowController controller = viewLoader.getController();
        controller.setMainApp(this);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        primaryStage.setTitle("Inventory Mangement System"); 
        initMainScreen(primaryStage);
        showMainScreen();

    }

    public static void main(String[] args) {
        launch(args);
    }
}
