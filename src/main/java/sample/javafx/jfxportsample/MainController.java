package sample.javafx.jfxportsample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.Region;

import java.net.URL;
import java.util.ResourceBundle;

public class MainController implements Initializable
{
	@FXML private Label label;
	@FXML private Button helloButton;
	@FXML private Region region;

	@FXML
	public void handleButtonAction(ActionEvent event) {
		label.setText("You clicked the button!");
	}

	@Override
	public void initialize(URL url, ResourceBundle rb) {
		assert label != null : "fx:id=\"label\" was not injected: check your FXML file 'main_view.fxml'.";
		assert helloButton != null : "fx:id=\"helloButton\" was not injected: check your FXML file 'main_view.fxml'.";
		assert region != null : "fx:id=\"region\" was not injected: check your FXML file 'main_view.fxml'.";
	}
}
