package sample;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.TextField;

import static java.lang.Integer.parseInt;

public class Expert extends Controller {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button output;

    @FXML
    private TextField textFild;

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
    void initialize() {
        output.setOnAction(event -> {
            int mas[]={ 100, 500,   5000,//1
                    250, 6400, 50000,//2
                    100, 700,  10000,//3
                    500, 3000, 15000,//4
                    500, 7000, 20000,//5
                    3000,8000, 40000,//6
                    300, 1000,  6000,//7
                    100, 500,   5000,//8
                    50,  300,   1000};//9

            for(int i=0;i<mas.length;i++) {
                if (mas[i] <= parseInt(textFild.getText())) {
                    if (i == 0 || i == 1 || i == 2) {
                   windomAdd("View/add.fxml");
                    } else if (i == 3 || i == 4 || i == 5) {
                        System.out.println("Наружная реклама\n");
                    } else if (i == 6 || i == 7 || i == 8) {
                        System.out.println("Печатная реклама\n\n");
                    } else if (i == 9 || i == 10 || i == 11) {
                        System.out.println("Аудиовизуальная реклама\n");
                    } else if (i == 12 || i == 13 || i == 14) {
                        System.out.println("Радиореклама \n");
                    } else if (i == 15 || i == 16 || i == 17) {
                        System.out.println("Телевизионная реклама \n");
                    } else if (i == 18 || i == 19 || i == 20) {
                        System.out.println("Рекламные сувениры  \n");
                    } else if (i == 21 || i == 22 || i == 23) {
                        System.out.println("Интернет-реклама  \n");
                    } else if (i == 24 || i == 25 || i == 26) {
                        System.out.println("Реклама на МТС  \n");
                    }

                }
            }
            });
         /*;

        checkBoxTR ;
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
}

