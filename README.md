## Requirements
- [OpenJFX Runtime](https://gluonhq.com/products/javafx/)
- [Java 11+](https://openjfx.io/openjfx-docs/#install-java)

## Compile
```bash
javac InventorySystem.java HomeWindowController.java -p <path/to/openjfx/lib> --add-modules=javafx.graphics,javafx.fxml,javafx.controls -d .
```

## Package
```bash
jar -cfe inventory.jar InventorySystem  InventorySystem.class HomeWindow.fxml HomeWindowController.class
```

## Run!
```bash
java -p <path/to/openjfx/lib> --add-modules=javafx.graphics,javafx.fxml,javafx.controls -jar inventory.jar
```

Replace `<path/to/openjfx/lib>` with the path to the lib folder in the openjfx runtime you downloaded
