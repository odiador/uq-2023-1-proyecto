package co.edu.uniquindio.concesionariouq.tests;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

import javax.mail.MessagingException;

import org.junit.Test;

import com.itextpdf.text.Document;
import com.itextpdf.text.PageSize;
import com.itextpdf.text.pdf.PdfWriter;

import co.edu.uniquindio.concesionariouq.exceptions.NullException;
import co.edu.uniquindio.concesionariouq.exceptions.VehiculoYaExisteException;
import co.edu.uniquindio.concesionariouq.model.Concesionario;
import co.edu.uniquindio.concesionariouq.model.Deportivo;
import co.edu.uniquindio.concesionariouq.model.Diesel;
import co.edu.uniquindio.concesionariouq.model.EstadoVehiculo;
import co.edu.uniquindio.concesionariouq.model.Gasolina;
import co.edu.uniquindio.concesionariouq.model.Moto;
import co.edu.uniquindio.concesionariouq.model.TipoCambio;
import co.edu.uniquindio.concesionariouq.model.Vehiculo;
import co.edu.uniquindio.concesionariouq.util.PdfUtility;
import co.edu.uniquindio.concesionariouq.util.ProjectUtility;

public class TestPdfs {
	@Test
	public void testGenerarPdf() throws NullException, VehiculoYaExisteException {
		Concesionario concesionario = new Concesionario("", "");
		concesionario.agregarVehiculo("AAAA",
				new Moto("mazda", "2020", 200d, 200d, new Gasolina(), EstadoVehiculo.NUEVO, TipoCambio.AUTOMATICO));
		concesionario.agregarVehiculo("XG", new Deportivo("mazda", "2020", 200d, 200d, new Gasolina(),
				EstadoVehiculo.NUEVO, TipoCambio.MANUAL, 5, 2, 3, 40, 4));
		concesionario.agregarVehiculo("ASAAS",
				new Moto("mazda", "2020", 200d, 200d, new Gasolina(), EstadoVehiculo.NUEVO, TipoCambio.AUTOMATICO));
		concesionario.agregarVehiculo("AAAZ",
				new Moto("mazda", "2020", 200d, 200d, new Diesel(), EstadoVehiculo.NUEVO, TipoCambio.AUTOMATICO));
		concesionario.agregarVehiculo("AAAV",
				new Moto("mazda", "2020", 200d, 200d, new Diesel(), EstadoVehiculo.NUEVO, TipoCambio.AUTOMATICO));
		System.out.println(concesionario.listarVehiculos());
		generarPdf("Reporte de Vehiculos", concesionario.listarVehiculos());
	}

	@Test
	public void sendMailPdf() throws MessagingException, IOException {
		File file = new File("Reporte de Vehiculos.pdf");
		ProjectUtility.enviarCorreoReporte("juanito.amador.roa@gmail.com", "Amador", "Reporte de Vehiculos",
				"de cilindraje, placa, tipo de vehiculo", file);
		file.delete();
	}

	private static void generarPdf(String titulo, List<Vehiculo> listaVehiculos) {
		try {
			Document document = new Document(PageSize.A4, 40, 40, 40, 40);
			PdfWriter.getInstance(document, new FileOutputStream(titulo + ".pdf"));
			document.open();
			document.addAuthor("Concesionario UQ");

			PdfUtility.agregarHeaderDocumento(document, titulo);
//			PdfUtility.agregarTablaVehiculosDocumento(document, listaVehiculos);
			document.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
