package uniandes.dpoo.aerolinea.modelo.cliente;

import org.json.JSONObject;

/**
 * Esta clase se usa para representar a los clientes de la aerolínea que son empresas
 */
public class ClienteCorporativo extends Cliente
{
    // TODO completar
	private static final String CORPORATIVO = "Corporativo";
    public static final int PEQUENA = 0;
    public static final int MEDIANA = 1;
    public static final int GRANDE = 2;
    
    private String nombreEmpresa;
    private int tamanoEmpresa;
    
    public ClienteCorporativo(String nombreEmpresa, int tamano) {
        this.nombreEmpresa = nombreEmpresa;
        this.tamanoEmpresa = tamano;
    }
    
    public String getNombreEmpresa() {
        return nombreEmpresa;
    }
    
    public int getTamanoEmpresa() {
        return tamanoEmpresa;
    }
    @Override
    public String getTipoCliente() {
        return CORPORATIVO;
    }
    
    @Override
    public String getIdentificador() {
        return nombreEmpresa;
    }
    
    public static ClienteCorporativo cargarDesdeJSON( JSONObject cliente )
    {
        String nombreEmpresa = cliente.getString( "nombreEmpresa" );
        int tam = cliente.getInt( "tamanoEmpresa" );
        return new ClienteCorporativo( nombreEmpresa, tam );
    }

    public JSONObject salvarEnJSON( )
    {
        JSONObject jobject = new JSONObject( );
        jobject.put( "nombreEmpresa", this.nombreEmpresa );
        jobject.put( "tamanoEmpresa", this.tamanoEmpresa );
        jobject.put( "tipo", CORPORATIVO );
        return jobject;
    }
}
