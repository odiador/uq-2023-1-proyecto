package co.edu.uniquindio.concesionariouq.util;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import com.itextpdf.text.BadElementException;
import com.itextpdf.text.Chunk;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Element;
import com.itextpdf.text.Font;
import com.itextpdf.text.Image;
import com.itextpdf.text.Font.FontFamily;
import com.itextpdf.text.Font.FontStyle;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.Phrase;
import com.itextpdf.text.pdf.PdfPTable;

import co.edu.uniquindio.concesionariouq.model.Vehiculo;

public class PdfUtility {

	public static Paragraph generarParrafoTitulo(String nombreReporte) {
		Font fontSuperior = new Font(FontFamily.HELVETICA, 20, FontStyle.BOLD.ordinal());
		Paragraph paragraph = new Paragraph(nombreReporte, fontSuperior);
		paragraph.setAlignment(Element.ALIGN_CENTER);
		return paragraph;
	}

	public static Image generarImagenLogo() throws BadElementException, MalformedURLException, IOException {
		URL resource = new PdfUtility().getClass().getResource("/resources/images/logo.png");
		Image image = Image.getInstance(resource);
		image.scalePercent(20);
		image.setAlignment(Chunk.ALIGN_CENTER);
		return image;
	}

	public static void agregarHeaderDocumento(Document document, String nombreReporte)
			throws DocumentException, BadElementException, MalformedURLException, IOException {
		document.add(generarImagenLogo());
		document.add(generarParrafoTitulo(nombreReporte));
		document.add(new Paragraph(" "));
	}

	public static void agregarTablaVehiculosDocumento(Document document, List<Vehiculo> listaVehiculos)
			throws DocumentException {
		Font font = new Font(FontFamily.HELVETICA, 10, FontStyle.BOLD.ordinal());
		PdfPTable tabla = new PdfPTable(9);
		tabla.addCell(new Phrase("Tipo de Vehiculo", font));
		tabla.addCell(new Phrase("Placa", font));
		tabla.addCell(new Phrase("Marca", font));
		tabla.addCell(new Phrase("Modelo", font));
		tabla.addCell(new Phrase("Cilindraje", font));
		tabla.addCell(new Phrase("Velocidad Maxima", font));
		tabla.addCell(new Phrase("Combustible", font));
		tabla.addCell(new Phrase("Estado", font));
		tabla.addCell(new Phrase("Tipo de Cambio", font));
		listaVehiculos.stream().forEach(vehiculo -> {
			tabla.addCell(vehiculo.getTipoVehiculo().getTipo());
			tabla.addCell(vehiculo.getPlaca());
			tabla.addCell(vehiculo.getMarca());
			tabla.addCell(vehiculo.getModelo());
			tabla.addCell(vehiculo.getCilindraje().toString());
			tabla.addCell(vehiculo.getVelocidadMaxima().toString());
			tabla.addCell("Gasolina"); // TODO Cambiar
			tabla.addCell(vehiculo.getEstado().getText());
			tabla.addCell(vehiculo.getTipo().getText());
		});
		document.add(tabla);
	}

}
