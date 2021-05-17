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

    public TextField krajTrip;
    public TextField zacetekTrip;
    public TextField statusCar;
    public TextField karticaC;
    public TextField CCV;
    public ComboBox carQuality;
    public ComboBox izborCar;
    public DatePicker datePickup;
    public Spinner rateSpinner;
    public TextField requests;
    public RadioButton cashCB;
    public RadioButton karticaCB;
    public TextField username;
    public Button preveri;
    public Button shrani;


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

        shrani.setDisable(true);
        rateSpinner.setValueFactory(new SpinnerValueFactory.IntegerSpinnerValueFactory(0,5));

        Trip trip = new Trip();
        trip.startMesto = zacetekTrip.getText();
        trip.endMesto = krajTrip.getText();

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

        String[] maliCar = new String[5];
        maliCar [ 0 ] = "Seat Ibiza";
        maliCar [ 1 ] = "Fiat 500";
        maliCar [ 2 ] = "Volkswagen Polo";
        maliCar [ 3 ] = "Renault Clio";
        maliCar [ 4 ] = "Mitsubishi Colat";

        String[] velikCar = new String[5];
        velikCar [ 0 ] = "Volvo V40";
        velikCar [ 1 ] = "Renault Scenic";
        velikCar [ 2 ] = "Ford Mondeo";
        velikCar [ 3 ] = "Volkswagen Touareg";
        velikCar [ 4 ] = "Mercedes E30";

        String[] exoticCar = new String[5];
        exoticCar [ 0 ] = "Ferrari 488 Pista";
        exoticCar [ 1 ] = "Porsche Carrera GT";
        exoticCar [ 2 ] = "Mercedes-Benz SLS Black Series";
        exoticCar [ 3 ] = "McLaren 720S";
        exoticCar [ 4 ] = "Lamborghini Aventador SVJ";


        carQuality.setItems(FXCollections.observableArrayList(kvalitet));

        carQuality.valueProperty().addListener((obs, oldValue, newValue) -> {
            if (newValue == null) {
                izborCar.getItems().clear();
                izborCar.setDisable(true);
            }
            if (carQuality.getValue().equals("Regular")){
                izborCar.getItems().setAll(maliCar);
                izborCar.setDisable(false);
            }
            if (carQuality.getValue().equals("Plus")){
                izborCar.getItems().setAll(velikCar);
                izborCar.setDisable(false);
            }
            if (carQuality.getValue().equals("Luxury")){
                izborCar.getItems().setAll(exoticCar);
                izborCar.setDisable(false);
            }
        });
    }

    public void preveriInfo(ActionEvent actionEvent) {
        shrani.setDisable(false);
        if (karticaC.getText().equals("")){
            statusCar.setText("Neki ste naredili napacno");
            statusCar.setStyle("-fx-control-inner-background: red");
            karticaC.setStyle("-fx-control-inner-background: red");
        }
        if (CCV.getText().equals("")){
            statusCar.setText("Neki ste naredili napacno");
            statusCar.setStyle("-fx-control-inner-background: red");
            CCV.setStyle("-fx-control-inner-background: red");
        }
        if (username.getText().equals("")){
            statusCar.setText("Neki ste naredili napacno");
            statusCar.setStyle("-fx-control-inner-background: red");
            username.setStyle("-fx-control-inner-background: red");
        }
        if (zacetekTrip.getText().equals("")){
            statusCar.setText("Neki ste naredili napacno");
            statusCar.setStyle("-fx-control-inner-background: red");
            zacetekTrip.setStyle("-fx-control-inner-background: red");
        }
        if (krajTrip.getText().equals("")){
            statusCar.setText("Neki ste naredili napacno");
            statusCar.setStyle("-fx-control-inner-background: red");
            krajTrip.setStyle("-fx-control-inner-background: red");
        }

    }

    public static void infoBox(String infoMessage, String titleBar) {
        JOptionPane.showMessageDialog(null, infoMessage, titleBar, JOptionPane.INFORMATION_MESSAGE);
    }

    public void howTo(ActionEvent actionEvent) {
        infoBox("Zivjo! Dobro dosli v nasa aplikacija! Aplikacijo uporabljate takoj da vsi informacije morate" +
                " vnosit in potem pritinisnite na preveri information gumb kjer ne morete uporabit shranjevanje brez da pre" +
                "verite info ,\n potem boste dobili odgovor ce je vse vredu, Imejte lep dan in upam da bo vse vredu," +
                "Vas Uber Tim. ","IMPORTANT");
    }

    public void shraniInfo(ActionEvent actionEvent) {
        statusCar.setText("Nova voznja ostvarjena, Lepa voznja!");
        statusCar.setStyle("-fx-control-inner-background: #7FFF00");
        String method = "";
        if (karticaCB.isSelected()){
            method += karticaCB.getText();
        } else {
            method += cashCB.getText();
        }
        String kartica = maskCardNumber(karticaC.getText().replaceAll("-",""),"XXXX-XXXX-XXXX-####");
        String CCVnumber = CCV.getText().replaceAll("^(0|[1-9][0-9]*)$","XXX");
        karticaC.setText(kartica);
        infoBox("User: " + username.getText() + ", \n" + "Start: " + zacetekTrip.getText() + " ------- " + "End: " + krajTrip.getText() + "\n"
                + "Datum: " + datePickup.getValue() + "\n" + "Car: " + izborCar.getValue() + "\n" + "------------------------------------" + "\n" +
                "Metoda Placevanje: " + method + ", " + kartica + " " + CCVnumber + "\n" + "Requests: " + requests.getText(),"Ticket");
    }

    public static String maskCardNumber(String cardNumber, String mask) {
        int index = 0;
        StringBuilder maskedNumber = new StringBuilder();
        for (int i = 0; i < mask.length(); i++) {
            char c = mask.charAt(i);
            if (c == '#') {
                maskedNumber.append(cardNumber.charAt(index));
                index++;
            } else if (c == 'x') {
                maskedNumber.append(c);
                index++;
            } else {
                maskedNumber.append(c);
            }
        }
        return maskedNumber.toString();
    }
}
