package co.edu.uniquindio.concesionariouq.tests;

import org.junit.Test;

import co.edu.uniquindio.concesionariouq.exceptions.ConcesionarioException;
import co.edu.uniquindio.concesionariouq.model.Concesionario;
import co.edu.uniquindio.concesionariouq.model.EstadoVehiculo;
import co.edu.uniquindio.concesionariouq.model.Gasolina;
import co.edu.uniquindio.concesionariouq.model.TipoCambio;

public class Test1 {
	Concesionario concesionario = new Concesionario("Nombre", "id");

	@Test
	public void test() throws ConcesionarioException {
		concesionario.agregarMoto("AAAA", "mazda", "2020", 200d, 200d, new Gasolina(), EstadoVehiculo.NUEVO,
				TipoCambio.AUTOMATICO);
		concesionario.agregarMoto("AAAG", "mazda", "2020", 200d, 200d, new Gasolina(), EstadoVehiculo.NUEVO,
				TipoCambio.AUTOMATICO);
		concesionario.agregarMoto("AAAS", "mazda", "2020", 200d, 200d, new Gasolina(), EstadoVehiculo.NUEVO,
				TipoCambio.AUTOMATICO);
		concesionario.agregarMoto("AAAV", "mazda", "2020", 200d, 200d, new Gasolina(), EstadoVehiculo.NUEVO,
				TipoCambio.AUTOMATICO);
		concesionario.agregarMoto("AAAZ", "mazda", "2020", 200d, 200d, new Gasolina(), EstadoVehiculo.NUEVO,
				TipoCambio.AUTOMATICO);
		System.out.println(concesionario.listarVehiculos());
	}

}
