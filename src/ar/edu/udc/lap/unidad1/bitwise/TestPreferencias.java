package ar.edu.udc.lap.unidad1.bitwise;



public class TestPreferencias {

	public static void main(String[] args) {
		PreferenciasUsuario prefs = new PreferenciasUsuario("sdellatorre");
		prefs.setSugerenciasBusqueda(true);
		prefs.setMostrarMensajesAyuda(true);
		prefs.setSugerenciasBusqueda(false);
		System.out.println(prefs);
	}
	
}
