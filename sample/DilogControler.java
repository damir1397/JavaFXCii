package sample;

import java.net.URL;
import java.util.ResourceBundle;
import java.util.Scanner;

import javafx.fxml.FXML;
import javafx.scene.control.TextArea;

public class DilogControler {
    public static Scanner scan = new Scanner(System.in);
    public static boolean exit=true;
    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TextArea arrayText;

    @FXML
    void initialize() {
        do {

           String text=arrayText.getText();
            switch (text) {
                case "1":
                    arrayText.setText("hellou damir!");
                case "2":

                    break;

                case "3":
                    break;
                case "4":

                    break;
                case "5":

                case "6":

                    break;
                case "7":

                    break;
                case "8":

                    break;
                case "9":

                    break;
                case "exit":
                    exit = false;
                    break;

            }
        } while (exit);
    }


    }

