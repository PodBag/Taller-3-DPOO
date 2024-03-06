package uniandes.dpoo.aerolinea.modelo.tarifas;

import uniandes.dpoo.aerolinea.modelo.Vuelo;
import uniandes.dpoo.aerolinea.modelo.cliente.Cliente;

public class CalculadoraTarifasTemporadaAlta {
	protected final int COSTO_POR_KM = 10; // Costo por kilómetro para temporada alta

    @Override
    public int calcularCostoBase(Vuelo vuelo, Cliente cliente) {
        int distancia = vuelo.getRuta().getDistancia();
        return COSTO_POR_KM * distancia;
    }

    @Override
    public double calcularPorcentajeDescuento(Cliente cliente) {
        return 0.0;
    }
}
