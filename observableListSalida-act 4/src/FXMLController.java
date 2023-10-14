import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.scene.input.KeyEvent;
import javafx.scene.input.MouseEvent;

public class FXMLController implements Initializable {
    @FXML
    private TextField nField;
    @FXML
    private ListView<String> myListView;
    @FXML
    private Button insert;
    @FXML
    private Button remove;
    @FXML
    private Button update;

    ObservableList<String> listInstance = FXCollections.observableArrayList();

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        listInstance.addAll("Henry", "Jercz", "Doms");
        myListView.getItems().addAll(listInstance);
    }

    @FXML
    private void insert(javafx.event.ActionEvent event) {
       String newName = nField.getText();
       System.out.println(newName);

       if (!newName.isEmpty()) {
           myListView.getItems().add(newName);
           nField.clear();
           insert.setDisable(true);
           disableButton();
       }
    }

    @FXML
    private void remove(ActionEvent event) {
        int row = myListView.getSelectionModel().getSelectedIndex();
        myListView.getItems().remove(row);
        nField.clear();
        disableButton();
    }

    @FXML
    private void selectRow(MouseEvent event) {
        String selectedRow = myListView.getSelectionModel().getSelectedItem();
        nField.setText(selectedRow);
        insert.setDisable(true);
        enableButton();
    }

    @FXML
    private void update(ActionEvent event) {
        int row = myListView.getSelectionModel().getSelectedIndex();
        String name = nField.getText();
        myListView.getItems().set(row, name);
        nField.clear();
        insert.setDisable(true);
        disableButton();
    }

    @FXML
    private void feildType(KeyEvent event) {
        System.out.println(nField.getText());
        if(!nField.getText().isEmpty()){
            insert.setDisable(false);
        }else{
            insert.setDisable(true);
        }
    }
    public void enableButton(){
        remove.setDisable(false);
        update.setDisable(false);
    }
    public void disableButton(){
        remove.setDisable(true);
        update.setDisable(true);
    }
}