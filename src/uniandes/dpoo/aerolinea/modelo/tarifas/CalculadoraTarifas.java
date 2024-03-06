package uniandes.dpoo.aerolinea.modelo.tarifas;

import uniandes.dpoo.aerolinea.modelo.Vuelo;
import uniandes.dpoo.aerolinea.modelo.cliente.Cliente;

public class CalculadoraTarifas {
	public static final double IMPUESTO = 0.19; 

    public CalculadoraTarifas() {}

    protected abstract int calcularCostoBase(Vuelo vuelo, Cliente cliente);

    protected abstract double calcularPorcentajeDescuento(Cliente cliente);

    public int calcularTarifa(Vuelo vuelo, Cliente cliente) {
        int costoBase = calcularCostoBase(vuelo, cliente);
        double descuento = calcularPorcentajeDescuento(cliente);
        double costoConDescuento = costoBase * (1 - descuento);
        return (int) Math.round(costoConDescuento * (1 + IMPUESTO));
    }
}
