package uniandes.dpoo.aerolinea.modelo.tarifas;

import uniandes.dpoo.aerolinea.modelo.Vuelo;
import uniandes.dpoo.aerolinea.modelo.cliente.Cliente;
import uniandes.dpoo.aerolinea.modelo.cliente.ClienteCorporativo;

public class CalculadoraTarifasTemporadaBaja {
	protected final int COSTO_POR_KM_NATURAL = 1200;
    protected final int COSTO_POR_KM_CORPORATIVO = 900;
    protected final double DESCUENTO_PEQ = 0.1;
    protected final double DESCUENTO_MEDIANAS = 0.15;
    protected final double DESCUENTO_GRANDES = 0.2;

    public CalculadoraTarifasTemporadaBaja() {
    }

    @Override
    public int calcularCostoBase(Vuelo vuelo, Cliente cliente) {
        int distancia = vuelo.getRuta().getDistancia();
        if (cliente.getTipoCliente().equals("Natural")) {
            return COSTO_POR_KM_NATURAL * distancia;
        } else {
            return COSTO_POR_KM_CORPORATIVO * distancia;
        }
    }

    @Override
    public double calcularPorcentajeDescuento(Cliente cliente) {
        if (cliente.getTipoCliente().equals("Corporativo")) {
            String tipoEmpresa = ((ClienteCorporativo) cliente).getNombreEmpresa();
            if (tipoEmpresa.equals("Pequeña")) {
                return DESCUENTO_PEQ;
            } else if (tipoEmpresa.equals("Mediana")) {
                return DESCUENTO_MEDIANAS;
            } else if (tipoEmpresa.equals("Grande")) {
                return DESCUENTO_GRANDES;
            }
        }
        return 0;
}
