package uniandes.dpoo.aerolinea.modelo.cliente;

public class ClienteNatural {
	public static final java.lang.String NATURAL = null;
	private String nombre;

    public void ClientePersonal(String nombre) {
        this.nombre = nombre;
    }

    public String getIdentificador() {
        return nombre;
    }

    public String getTipoCliente() {
        return "Personal";
    }

}
