package ar.edu.udc.lap.unidad1.bitwise;

public class TestEncuesta {

public static void main(String[] args) {
		
		EncuestaTrabajador encuesta = new EncuestaTrabajador("Alberto");
		encuesta.setTieneFamilia(true);
		encuesta.setTieneExperiencia(true);
		System.out.println(encuesta);
	}
}
