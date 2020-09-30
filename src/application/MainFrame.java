package application;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Pane;


public class MainFrame {

    @FXML // ResourceBundle that was given to the FXMLLoader
    private ResourceBundle resources;

    @FXML // URL location of the FXML file that was given to the FXMLLoader
    private URL location;

    @FXML
    private AnchorPane window;

    @FXML
    private Label screen;

    @FXML
    private Pane keys;

    @FXML
    private Button zero, one, two, three, four, five, six, seven, eight, nine, dot;

    @FXML
    private Button percent, division, multiplication, subtraction, addition, equal, backstep, clear;

    @FXML // This method is called by the FXMLLoader when initialization is complete
    void initialize() {

    }
}
