package co.edu.uniquindio.concesionariouq.view.menu;

import co.edu.uniquindio.concesionariouq.util.Utility;
import co.edu.uniquindio.concesionariouq.view.agregarVehiculo.PanelConVolver;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.VBox;

public class PanelElectrico extends PanelConVolver{

	private VBox box;
	private TextField tfAutonomiaCarga;
	private TextField tfTiempoDemora;

	@Override
	public void handle(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void initComponents() {
		box = new VBox();
		tfAutonomiaCarga = new TextField();
		tfTiempoDemora = new TextField();
		
		box.getChildren().add(Utility.generarHBox("Ingresa la autonomia con carga completa", tfAutonomiaCarga));
		box.getChildren().add(Utility.generarHBox("Ingresa el tiempo que demora en cargar", tfTiempoDemora));
		
		Utility.setAsNumberTextfield(tfAutonomiaCarga);
		Utility.setAsNumberTextfield(tfTiempoDemora);
		
		setCenter(box);
		box.setId("centered-box");
		
	}

}
