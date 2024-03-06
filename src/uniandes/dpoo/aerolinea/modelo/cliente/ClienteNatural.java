package uniandes.dpoo.aerolinea.modelo.cliente;

public class ClienteNatural {
	private String nombre;

    public void ClientePersonal(String nombre) {
        super();
        this.nombre = nombre;
    }

    public String getIdentificador() {
        return nombre;
    }

    public String getTipoCliente() {
        return "Personal";
    }

}
