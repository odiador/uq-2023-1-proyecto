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

import co.edu.uniquindio.concesionariouq.exceptions.ConcesionarioException;
import co.edu.uniquindio.concesionariouq.model.Concesionario;
import co.edu.uniquindio.concesionariouq.model.Diesel;
import co.edu.uniquindio.concesionariouq.model.EstadoVehiculo;
import co.edu.uniquindio.concesionariouq.model.Gasolina;
import co.edu.uniquindio.concesionariouq.model.TipoCambio;
import co.edu.uniquindio.concesionariouq.model.Vehiculo;
import co.edu.uniquindio.concesionariouq.util.PdfUtility;
import co.edu.uniquindio.concesionariouq.util.ProjectUtility;

public class TestPdfs {
	@Test
	public void testGenerarPdf() throws ConcesionarioException {
		Concesionario concesionario = new Concesionario("", "");
		concesionario.agregarMoto("AAAA", "mazda", "2020", 200d, 200d, new Gasolina(), EstadoVehiculo.NUEVO,
				TipoCambio.AUTOMATICO);
		concesionario.agregarDeportivo("XG", "mazda", "2020", 1000d, 100d, new Gasolina(), EstadoVehiculo.NUEVO,
				TipoCambio.MANUAL, 5, 2, 3, 40, 4);
		concesionario.agregarMoto("ASAAS", "maxda", "2020", 200d, 200d, new Gasolina(), EstadoVehiculo.NUEVO,
				TipoCambio.AUTOMATICO);
		concesionario.agregarMoto("AAAV", "mazda", "2020", 200d, 200d, new Gasolina(), EstadoVehiculo.NUEVO,
				TipoCambio.AUTOMATICO);
		concesionario.agregarMoto("AAAZ", "mazda", "2020", 200d, 200d, new Diesel(), EstadoVehiculo.NUEVO,
				TipoCambio.AUTOMATICO);
		System.out.println(concesionario.listarVehiculos());
		generarPdf("Reporte de Vehiculos", concesionario.listarVehiculos());
	}

	@Test
	public void sendMailPdf() throws MessagingException, IOException {
		File file = new File("Reporte de Vehiculos.pdf");
		ProjectUtility.enviarCorreoReporte("perdomocardenas18@gmail.com", "Juancho", "Reporte de Vehiculos",
				"de cilindraje, placa, tipo de vehiculo", file);
		file.delete();
	}

	private static void generarPdf(String titulo, List<Vehiculo> listaVehiculos) {
		try {
			Document document = new Document(PageSize.A4.rotate(), 0, 0, 0, 0);
			PdfWriter.getInstance(document, new FileOutputStream(titulo + ".pdf"));
			document.open();
			document.addAuthor("Concesionario UQ");

			PdfUtility.agregarHeaderDocumento(document, titulo);
			PdfUtility.agregarTablaVehiculosDocumento(document, listaVehiculos);
			document.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
