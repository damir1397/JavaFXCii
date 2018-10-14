package sample;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.application.Application;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class Controller  {

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
        adverPress.setOnAction(event ->{
        System.out.println("привет мир!");
        });
        adverNaruj.setOnAction(event ->{
            windomAdd("View/add.fxml");
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
    public void windomAdd(String windom){
        FXMLLoader loader=new FXMLLoader();
        loader.setLocation(getClass().getResource(windom));
        try {
            loader.load();
        }catch (IOException e){
            e.printStackTrace();
        }
        Parent root=loader.getRoot();
        Stage stage=new Stage();
        stage.setScene(new Scene(root));
        stage.showAndWait();

    }
}
