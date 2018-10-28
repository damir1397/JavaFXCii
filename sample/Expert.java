package sample;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.TextField;
import javafx.scene.control.TextArea;
import javafx.stage.Stage;

import static java.lang.Integer.parseInt;

public class Expert  {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button output;


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
    private CheckBox checkBoxInfo;

    @FXML
    private CheckBox checkBoxUvishy;

    @FXML
    private CheckBox checkBoxNapomin;

    @FXML
    private CheckBox checkBoxRegion;
    @FXML
    private TextField textFild;

    @FXML
    private TextArea dialogP;
    @FXML
    private Button viewButton;




    @FXML
    void initialize() {

        output.setOnAction(event -> {
            int mas[] = {100, 500, 5000,//1
                    250, 6400, 50000,//2
                    100, 700, 10000,//3
                    500, 3000, 15000,//4
                    500, 7000, 20000,//5
                    3000, 8000, 40000,//6
                    300, 1000, 6000,//7
                    100, 500, 5000,//8
                    500, 300, 1000};//9
            dialogP.setText("За "+textFild.getText()+" сом\n");
            for ( int i = 0; i < mas.length; i+=5) {
                if (mas[i] <= parseInt(textFild.getText())) {
                    if (i == 0 || i == 1 || i == 2) {
                        dialogP.appendText("0::Рекламма на прессе\n");
                    } else if (i == 3 || i == 4 || i == 5) {
                        dialogP.appendText("1::Наружная реклама\n");
                    } else if (i == 6 || i == 7 || i == 8) {
                        dialogP.appendText("2::Печатная реклама\n");
                    } else if (i == 9 || i == 10 || i == 11) {
                        dialogP.appendText("3::Аудиовизуальная реклама\n");
                    } else if (i == 12 || i == 13 || i == 14) {
                        dialogP.appendText("4::Радиореклама\n");
                    } else if (i == 15 || i == 16 || i == 17) {
                        dialogP.appendText("5::Телевизионная реклама \n");
                    } else if (i == 18 || i == 19 || i == 20) {
                        dialogP.appendText("6::Рекламные сувениры\n");
                    } else if (i == 21 || i == 22 || i == 23) {
                        dialogP.appendText("7::Интернет-реклама \n");
                    } else if (i == 24 || i == 25 ) {
                        dialogP.appendText("8::Реклама на МТС\n");
                    }
                }
                }

            dialogP.appendText("\n");
            dialogP.appendText("Выберите из этих вариантов !\n");

        });
        viewButton.setOnAction(event -> {
            String text=dialogP.getText();
            if ("0".equals(text)) {
                windomADD("View/adverPress.fxml");
            }else if (text.equals("1")) {
                windomADD("View/add.fxml");
            }else if (text.equals("2")) {
                windomADD("View/adverPrint.fxml");
            }else if (text.equals("3")) {
                windomADD("View/adverAudi.fxml");
            }else if (text.equals("4")) {
                windomADD("View/adverRadio.fxml");
            }else if (text.equals("5")) {
                windomADD("View/adverTelv.fxml");
            }else if (text.equals("6")) {
                windomADD("View/adverSuven.fxml");
            }else if (text.equals("7")) {
                windomADD("View/adverInter.fxml");
            }else if (text.equals("8")) {
                windomADD("View/adverMTS.fxml");
            }
        });


        /*;
         checkBoxObsh  ;
         checkBoxTC   ;
         checkBoxDemog  ;
         checkBoxSocial ;
         checkBoxGograf  ;
         checkBoxPsyh ;
         checkBoxInfo  ;
         checkBoxUvishy  ;
         checkBoxNapomin  ;
         checkBoxRegion  ;
*/
    }
    public void windomADD(String windom){
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

