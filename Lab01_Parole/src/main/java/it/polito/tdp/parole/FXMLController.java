package it.polito.tdp.parole;

import it.polito.tdp.parole.model.*;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class FXMLController {

	
	Parole elenco;
	
    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TextField txtParola;

    @FXML
    private Button btnInserisci;

    @FXML
    private Button btnCancella;

    @FXML
    private TextArea txtResult;

    @FXML
    private Label lblTime;

    @FXML
    private Button btnReset;

    @FXML
    void DoDelete(ActionEvent event) {

    }

    @FXML
    void doInsert(ActionEvent event) {
    	
    	String parola = txtParola.getText();
    	
    	elenco.addParola(parola);
    	
    	txtResult.clear();
    	
    	for(String s : elenco.getElenco()) {
    		txtResult.appendText(s + "\n");
    	}

    }

    @FXML
    void doReset(ActionEvent event) {

    }

    @FXML
    void initialize() {
        assert txtParola != null : "fx:id=\"txtParola\" was not injected: check your FXML file 'Scene.fxml'.";
        assert btnInserisci != null : "fx:id=\"btnInserisci\" was not injected: check your FXML file 'Scene.fxml'.";
        assert btnCancella != null : "fx:id=\"btnCancella\" was not injected: check your FXML file 'Scene.fxml'.";
        assert txtResult != null : "fx:id=\"txtResult\" was not injected: check your FXML file 'Scene.fxml'.";
        assert lblTime != null : "fx:id=\"lblTime\" was not injected: check your FXML file 'Scene.fxml'.";
        assert btnReset != null : "fx:id=\"btnReset\" was not injected: check your FXML file 'Scene.fxml'.";

    }
}
