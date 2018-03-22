package ar.edu.udc.lap.unidad1.bitwise;

public class EncuestaTrabajador {

	public final static int TIENE_TRABAJO     = 1;
	public final static int TIENE_EXPERIENCIA = 2;
	public final static int TIENE_FAMILIA     = 4;
	public final static int TIENE_MOVILIDAD   = 8;

	private String nombre;
	private int banderasBooleanas;
	
	public EncuestaTrabajador(String nombre) {
		this.nombre = nombre;
	}
	
	
	private void encenderBit(int mascaraBits){
		banderasBooleanas = banderasBooleanas | mascaraBits;
	}
	
	private void apagarBit(int mascaraBits){
		banderasBooleanas = banderasBooleanas & ~mascaraBits;
	}
	/*
	public static void main(String[] args) {
		
		EncuestaTrabajador encuesta = new EncuestaTrabajador("Alberto");
		encuesta.encenderBit(TIENE_EXPERIENCIA);
		encuesta.encenderBit(TIENE_FAMILIA);
		encuesta.encenderBit(TIENE_MOVILIDAD);
		encuesta.apagarBit(TIENE_FAMILIA);
		System.out.println(encuesta);
	}*/
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.nombre + " " + Integer.toBinaryString(this.banderasBooleanas) +
				"\nTiene familia: " + (this.tieneFamilia() ? "SI" : "NO") ;
	}
	
	private boolean isBitEncendido(int bit) {
		return 0 < (this.banderasBooleanas & bit);
	}
	
	
	
	
	
	
	public boolean tieneFamilia() {
		return this.isBitEncendido(TIENE_FAMILIA);
	}
	
	private void setGenerico (boolean valor, int mascara){
		if (valor)
			this.encenderBit(mascara);
		else
			this.apagarBit(mascara);
		
	}
	
	public void setTieneFamilia(boolean tieneFamilia){
		setGenerico(tieneFamilia, TIENE_FAMILIA);
	}
	public void setTieneExperiencia(boolean tieneExperiencia){
		setGenerico(tieneExperiencia, TIENE_EXPERIENCIA);
	}
	
}
