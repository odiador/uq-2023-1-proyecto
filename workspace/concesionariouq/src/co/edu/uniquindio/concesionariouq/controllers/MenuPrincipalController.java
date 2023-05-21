package co.edu.uniquindio.concesionariouq.controllers;

import co.edu.uniquindio.concesionariouq.model.Empleado;
import co.edu.uniquindio.concesionariouq.util.FxUtility;
import javafx.animation.KeyFrame;
import javafx.animation.KeyValue;
import javafx.animation.Timeline;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.ButtonType;
import javafx.scene.control.Label;
import javafx.scene.control.SplitPane;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.BorderPane;
import javafx.util.Duration;

public class MenuPrincipalController {
	@FXML
	private ImageView imgLogo;

	@FXML
	private ImageView imgUsuario;

	@FXML
	private ImageView imgMenuBarra;

	@FXML
	private BorderPane menuPane;

	@FXML
	private SplitPane mainPane;

	@FXML
	private BorderPane contentPane;

	@FXML
	private Label labelNombre;

	private boolean barraBloqueada;

	private Empleado empleado;

	public MenuPrincipalController(Empleado empleado) {
		this.empleado = empleado;
	}

	public void updateNameField() {
		labelNombre.setText(empleado.getNombre());
	}

	@FXML
	void initialize() {
		imgLogo.fitWidthProperty().bind(menuPane.widthProperty().multiply(0.8));
		imgUsuario.fitHeightProperty().bind(menuPane.widthProperty().subtract(15));
	}

	@FXML
	void extenderMenuEvent(MouseEvent event) {
		extenderMenuAction();
	}

	private void extenderMenuAction() {
		if (!barraBloqueada) {
			cambiarMenuTam(1);
			labelNombre.setVisible(true);
		}
	}

	private void cambiarMenuTam(int num) {
		mainPane.getDividers().forEach(divider -> {
			KeyValue kv = new KeyValue(divider.positionProperty(), divider.getPosition() + num);
			KeyFrame kf = new KeyFrame(Duration.millis(1000), kv);
			Timeline timeline = new Timeline(kf);
			timeline.play();
		});
	}

	@FXML
	void contraerMenuEvent(MouseEvent event) {
		contraerMenuAction();
	}

	private void contraerMenuAction() {
		if (!barraBloqueada) {
			cambiarMenuTam(-1);
			labelNombre.setVisible(false);
		}
	}

	@FXML
	void agregarMenuEvent(ActionEvent event) {

	}

	@FXML
	void eliminarEvent(ActionEvent event) {

	}

	@FXML
	void venderEvent(ActionEvent event) {

	}

	@FXML
	void comprarEvent(ActionEvent event) {

	}

	@FXML
	void alquilarEvent(ActionEvent event) {

	}

	@FXML
	void reportesEvent(ActionEvent event) {

	}

	@FXML
	void bloquearBarraEvent(ActionEvent event) {
		ButtonType btnExtendido = new ButtonType("Extendido");
		ButtonType btnContraido = new ButtonType("Contraido");
		ButtonType btnNo = new ButtonType("Quitar");
		ButtonType botonAlerta = FxUtility.crearDecisionAlerta("Decision", "Que tipo de bloqueo quieres tener",
				"Eligue el tipo de bloqueo que deseas para la barra lateral de la ventana", AlertType.INFORMATION, 600,
				btnExtendido, btnContraido, btnNo);
		barraBloqueada = false;
		if (botonAlerta == btnExtendido) {
			extenderMenuAction();
			imgMenuBarra.setImage(new Image("/resources/images/Candado Bloqueado.png"));
			barraBloqueada = true;
		} else if (botonAlerta == btnContraido) {
			contraerMenuAction();
			imgMenuBarra.setImage(new Image("/resources/images/Candado Bloqueado.png"));
			barraBloqueada = true;
		} else {
			imgMenuBarra.setImage(new Image("/resources/images/Candado Libre.png"));
			contraerMenuAction();
		}
	}
}
