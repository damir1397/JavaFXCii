package sample;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

public class Controller {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button adverPress;

    @FXML
    private Button adverNaruj;

    @FXML
    private Button adverPrint;

    @FXML
    private Button adverAudi;

    @FXML
    private Button adverRadio;

    @FXML
    private Button adverTelv;

    @FXML
    private Button adverSuven;

    @FXML
    private Button adverInter;

    @FXML
    private Button adverMTS;

    @FXML
    void initialize() {
        adverNaruj.setOnAction(event ->{
            System.out.println("привет!");
        });
        adverPress.setOnAction(event ->{
            System.out.println("привет мир!");
        });
        adverPrint.setOnAction(event ->{
            System.out.println("привет!");
        });
        adverAudi.setOnAction(event ->{
            System.out.println("привет!");
        });
        adverRadio.setOnAction(event ->{
            System.out.println("привет!");
        });
        adverTelv.setOnAction(event ->{
            System.out.println("привет!");
        });
        adverSuven.setOnAction(event ->{
            System.out.println("привет!");
        });
        adverInter.setOnAction(event ->{
            System.out.println("привет!");
        });
        adverMTS.setOnAction(event ->{
            System.out.println("привет!");
        });

    }
}
