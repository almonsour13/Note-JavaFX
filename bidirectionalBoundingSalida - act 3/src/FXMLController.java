import javafx.fxml.FXML;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;

public class FXMLController{
    @FXML
    private TextField textField1;

    @FXML
    private TextField textField2;
    
    @FXML
    private TableView table;

    public void initialize() {
        // Bind the text properties bidirectionally
        textField1.textProperty().bindBidirectional(textField2.textProperty());
    }
}
