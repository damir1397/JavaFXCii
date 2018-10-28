package sample;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.scene.control.TextArea;
public class AdverNaruj {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private AnchorPane checkBoxD;

    @FXML
    private TextField inputX;

    @FXML
    private TextField inputY;

    @FXML
    private CheckBox checkBoxTS;

    @FXML
    private CheckBox checkBoxTR;

    @FXML
    private CheckBox checkBoxObsh;

    @FXML
    private CheckBox checkBoxTC;

    @FXML
    private CheckBox checkBoxDemog;

    @FXML
    private CheckBox checkBoxSocial;

    @FXML
    private CheckBox checkBoxGograf;

    @FXML
    private CheckBox checkBoxPsyh;

    @FXML
    private CheckBox checkBoxBaner;

    @FXML
    private CheckBox checkBoxPlenca;

    @FXML
    private CheckBox checkBoxPBaner;

    @FXML
    private CheckBox checkBoxPPlenca;

    @FXML
    private Button buttonZac;

    public double sum=0;
    @FXML
    private TextArea textArea;

    @FXML
    void initialize() {


        buttonZac.setOnAction(event -> {
           double sizeX = Double.parseDouble(inputX.getText());
            double sizeY = (float) Double.parseDouble(inputY.getText());
            if (checkBoxBaner.isSelected()) {
                double m2 = sizeX * sizeY;
                sum = m2 * 150.0;
                textArea.appendText(m2 + "м2 " + sum + "-цена\n");
            } else if (checkBoxPlenca.isSelected()) {
                double m2 = sizeX * sizeY;
                sum = m2 * 160.0;
                textArea.appendText(m2 + "м2 " + sum + "-цена\n");
            } else if (checkBoxPBaner.isSelected()) {
                double m2 = sizeX * sizeY;
                sum = m2 * 180.0;
                textArea.appendText(m2 + "м2 " + sum + "-цена\n");
            } else if (checkBoxPPlenca.isSelected()) {
                double m2 = sizeX * sizeY;
                sum = m2 * 165.0;
                textArea.appendText(m2 + "м2 " + sum + "-цена\n");
            }
        });
    }
    }




























