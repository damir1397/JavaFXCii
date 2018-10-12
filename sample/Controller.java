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
            Data[] mas = {data.valueOf("BANER"), data.valueOf("PLENCA"), data.valueOf("PBANER"), data.valueOf("PPLENCA")};
            System.out.println(mas[n]);
            if (n == 0) {
                double m2 = sizeX * sizeY;
                sum = m2 * 150.0;
                System.out.printf(m2 + "м2 " + sum + "-цена\n");
            } else if (n == 1) {
                double m2 = sizeX * sizeY;
                sum = m2 * 160.0;
                System.out.println(m2 + "м2 " + sum + "-цена\n");
            } else if (n == 2) {
                double m2 = sizeX * sizeY;
                sum = m2 * 180.0;
                System.out.println(m2 + "м2 " + sum + "-цена\n");
            } else if (n == 3) {
                double m2 = sizeX * sizeY;
                sum = m2 * 165.0;
                System.out.printf(m2 + "м2 " + sum + "-цена\n");


        });

    }
}
