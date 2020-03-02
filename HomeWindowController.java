import javafx.application.Application;
import javafx.scene.control.*;
import javafx.fxml.FXML;

import java.io.IOException;

public class HomeWindowController {
    @FXML
    private TextField SearchFieldProduct;
    @FXML
    private TableView TableProduct;
    @FXML
    private TableColumn ProductID, ProductName, ProductInventoryLevel, ProductPPU;
    @FXML
    private TextField SearchFieldPart;
    @FXML
    private TableView TablePart;
    @FXML
    private TableColumn PartID, PartName, PartInventoryLevel, PartPPU;

    public void initialize() {
        System.out.println("Home controller initialised.");
    }

    public void setMainApp(Application mainApp) {
        System.out.println("Set main application.");
    }

    public void PartSearchOnAction() {
        System.out.println("Search for part");
    }
}
