package sample;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;


import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;


public class Controller {
    public static boolean exit = true;
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
    private Button expert;

    @FXML
    void initialize() {

        expert.setOnAction(event -> {
            windomAdd("View/Expert.fxml");
        });
        adverPress.setOnAction(event ->{
            windomAdd("View/adverPress.fxml");
        });
        adverNaruj.setOnAction(event ->{
            windomAdd("View/add.fxml");
            });

        adverPrint.setOnAction(event ->{
            windomAdd("View/adverPrint.fxml");
        });
        adverAudi.setOnAction(event ->{
            windomAdd("View/adverAudi.fxml");
        });
        adverRadio.setOnAction(event ->{
            windomAdd("View/adverRadio.fxml");
        });
        adverTelv.setOnAction(event ->{
            windomAdd("View/adverTelv.fxml");
        });
        adverSuven.setOnAction(event ->{
            windomAdd("View/adverSuven.fxml");
        });
        adverInter.setOnAction(event ->{
            windomAdd("View/adverInter.fxml");
        });
        adverMTS.setOnAction(event ->{
            windomAdd("View/adverMTS.fxml");
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
