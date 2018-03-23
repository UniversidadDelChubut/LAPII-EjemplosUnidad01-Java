
package ar.edu.udc.lap.unidad1.bitwise;

public class PreferenciasUsuario { 

	public final static int PROVEER_SUGERENCIAS_BUSQUEDA      =   1;
	public final static int BAJAR_ARCHIVOS_SIN_PREGUNTAR      =   2;
	public final static int MANDAR_MAIL_AVISO_ACCESOS_NUEVOS  =   4;
	public final static int MOSTRAR_MENSAJES_AYUDA            =   8;
	public final static int MOSTRAR_MENSAJES_ADVERTENCIA      =  16;
	public final static int MOSTRAR_BARRA_DE_HERRAMIENTAS     =  32;
	
	private String usuario;
	private int banderasBooleanas;
	
	public PreferenciasUsuario(String usuario) {
		this.usuario = usuario;
	}
	
	
	private void encenderBit(int mascaraBits){
		banderasBooleanas = banderasBooleanas | mascaraBits;
	}
	
	private void apagarBit(int mascaraBits){
		banderasBooleanas = banderasBooleanas & ~mascaraBits;
	}
	
	private boolean isBitEncendido(int bit) {
		return 0 < (this.banderasBooleanas & bit);
	}
	
	private void setGenerico (boolean valor, int mascara){
		if (valor)
			this.encenderBit(mascara);
		else
			this.apagarBit(mascara);
	}
	
	@Override
	public String toString() {
		return this.usuario+ " " + Integer.toBinaryString(this.banderasBooleanas) +
				"\nSugerencias busqueda : " + (this.isSugerenciasBusqueda() ? "SI" : "NO") ;
	}
	
	public boolean isSugerenciasBusqueda() {
		return this.isBitEncendido(PROVEER_SUGERENCIAS_BUSQUEDA);
	}
	
	public void setSugerenciasBusqueda(boolean sugerenciasBusqueda){
		setGenerico(sugerenciasBusqueda, PROVEER_SUGERENCIAS_BUSQUEDA);
	}

	
	public boolean isMostrarMensajesAyuda() {
		return this.isBitEncendido(MOSTRAR_MENSAJES_AYUDA);
	}
	
	public void setMostrarMensajesAyuda(boolean mostrarMensajesAyuda){
		setGenerico(mostrarMensajesAyuda, MOSTRAR_MENSAJES_AYUDA);
	}
	
}
