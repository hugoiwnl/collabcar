package sample;

import javafx.collections.FXCollections;
import javafx.event.ActionEvent;
import javafx.fxml.Initializable;
import javafx.scene.control.*;

import javax.swing.*;
import java.net.URL;
import java.time.LocalDate;
import java.util.ResourceBundle;

public class Controller implements Initializable {
    public TextField statusCB;
    public ChoiceBox avtoCB;
    public Spinner hisnaCB;
    public Spinner izkusnje;
    public Spinner vrateCB;
    public DatePicker datePickup;
    public TextField ulica;
    public TextField kraj;
    public TextField priimek;
    public TextField ime;
    public Button shrani;
    public Button preveri;
    public DatePicker datumRojstva;
    public TextField tablice;
    public RadioButton prometNE;
    public RadioButton prometDA;
    public DatePicker prveRegistracije;
    public TextField znamka;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        shrani.setDisable(true);

        LocalDate trenutni = LocalDate.now();
        datePickup.setDayCellFactory(d ->
                new DateCell() {
                    @Override public void updateItem(LocalDate item, boolean empty) {
                        super.updateItem(item, empty);
                        setDisable(item.isBefore(trenutni));
                    }});

        String[] kvalitet = new String[3];
        kvalitet [ 0 ] = "Regular";
        kvalitet [ 1 ] = "Plus";
        kvalitet [ 2 ] = "Luxury";

        avtoCB.setItems(FXCollections.observableArrayList(kvalitet));

        hisnaCB.setValueFactory(new SpinnerValueFactory.IntegerSpinnerValueFactory(1,10));
        izkusnje.setValueFactory(new SpinnerValueFactory.IntegerSpinnerValueFactory(1,25));
        vrateCB.setValueFactory(new SpinnerValueFactory.IntegerSpinnerValueFactory(1,8));
    }

    public void closeCB(ActionEvent actionEvent) {
        System.exit(0);
    }

    public void aboutCB(ActionEvent actionEvent) {
        infoBox("Zivjo! Dobro dosli v nasa aplikacija! Aplikacijo uporabljate takoj da vsi informacije morate" +
                " vnosit in potem pritinisnite na preveri information gumb kjer ne morete uporabit shranjevanje brez da pre" +
                "verite info ,\n potem boste dobili odgovor ce je vse vredu, Imejte lep dan in upam da bo vse vredu," +
                "Vas Uber Tim. ","IMPORTANT");
    }

    public void shraniCB(ActionEvent actionEvent) {
        String nesreca = "";
        if (prometDA.isSelected()){
            nesreca = "DA";
        } else {
            nesreca = "NE";
        }
        statusCB.setText("Nov driver registriran, Lepa voznja!");
        statusCB.setStyle("-fx-control-inner-background: #7FFF00");
        infoBox("Ime: " + ime.getText() + " " + priimek.getText() + "\n" +
                "Datum rojstva: " + datumRojstva.getValue() + ", " + "Ulica: " + ulica.getText() + " " + kraj.getText() + "\n" +
                "---------------------------------" + "\n" + "Znamka: " + znamka.getText() + " Registracija: " + prveRegistracije.getValue() + "\n" +
                "Tablice: " + tablice.getText() + " Nesreca: " + nesreca + "\n" + "Luxury: " + avtoCB.getValue() + "\n" +
                "---------------------------------","Driver");
    }

    public static void infoBox(String infoMessage, String titleBar) {
        JOptionPane.showMessageDialog(null, infoMessage, titleBar, JOptionPane.INFORMATION_MESSAGE);
    }

    public void preveriCB(ActionEvent actionEvent) {
        shrani.setDisable(false);
        if ((Integer) izkusnje.getValue() < 10){
            statusCB.setText("Neki ste naredili napacno");
            statusCB.setStyle("-fx-control-inner-background: red");
            izkusnje.setStyle("-fx-control-inner-background: red");
        }
        if (ime.getText().equals("")){
            statusCB.setText("Neki ste naredili napacno");
            statusCB.setStyle("-fx-control-inner-background: red");
            ime.setStyle("-fx-control-inner-background: red");
        }
        if (priimek.getText().equals("")){
            statusCB.setText("Neki ste naredili napacno");
            statusCB.setStyle("-fx-control-inner-background: red");
            priimek.setStyle("-fx-control-inner-background: red");
        }
        if (kraj.getText().equals("")){
            statusCB.setText("Neki ste naredili napacno");
            statusCB.setStyle("-fx-control-inner-background: red");
            kraj.setStyle("-fx-control-inner-background: red");
        }
        if (ulica.getText().equals("")){
            statusCB.setText("Neki ste naredili napacno");
            statusCB.setStyle("-fx-control-inner-background: red");
            ulica.setStyle("-fx-control-inner-background: red");
        }
    }
}
