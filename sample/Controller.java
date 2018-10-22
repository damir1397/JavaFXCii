package sample;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;


import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.stage.Stage;

public class Controller  {
    public static boolean exit=true;
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
    private  TextArea textArea;

    @FXML
    private static Button output;


    @FXML
    void initialize() {
        loop(textArea);
        swithM(textArea);

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
        output.setOnAction(event ->{
            String num=textArea.getText();
            System.out.println(num);
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
    private static void loop(TextArea textArea){

   }
public static void swithM(TextArea textArea){
    do {
        textArea.setText("1::За какую цену вы хотите разместить вашу рекламу! \n" +
                "2::В каких местах! \n" +
                "3::Для каких целей!\n" +
                "4::C каким расчетом аудитории!\n" +
                "5::Категория аудитории для кого она предназначена!\n" +
                "6::Совет для новичков!");
        switch ("1"){
            case "1":
                System.out.println("Ведите цену::");

                String n=textArea.getText();
                System.out.println(n);
                //int nInt=Integer.parseInt("1");
                /*for(int i=0;i<mas.length;i++) {
                    if (mas[i]<=nInt) {
                        int b=i;

                        System.out.println(b);
                    }
                }*/
                break;
            case "2":

                break;

            case "3":

                break;
            case "4":

                break;
            case "5":

                break;
            case "6":

                break;
            case "exit":
                exit = false;
                break;
        }
    } while (exit);
    }
    public static void buttonInt(TextArea textarea){
        output.setOnAction(event -> {
            int mas[]={100,500,5000,
                        250,6400,50000,
                        100,700,10000,
                        500,3000,15000,
                        500,7000,20000,
                        3000,8000,40000,
                        300,1000,6000,
                        100,500,5000,
                        50,300,1000};
            String textInt=textarea.getText();
            int nInt=Integer.parseInt("1");
                for(int i=0;i<mas.length;i++) {
                    if (mas[i]<=nInt) {
                        int b=i;
                        System.out.println(b);
                    }


                }
        });
    }
}
