package unPaseoPorElInfierno;

public class Alma {

	private int bondad;
	private int valor;
	private boolean esFriolenta;
	
	public Alma(int unaBondad, int unValor, boolean tieneFrio){
		bondad = unaBondad;
		valor = unValor;
		esFriolenta = tieneFrio;
	}
	
	public int getBondad() {
		return bondad;
	}
	public void setBondad(int bondad) {
		this.bondad = bondad;
	}
	public int getValor() {
		return valor;
	}
	public void setValor(int valor) {
		this.valor = valor;
	}
	public boolean isEsFriolenta() {
		return esFriolenta;
	}
	public void setEsFriolenta(boolean esFriolenta) {
		this.esFriolenta = esFriolenta;
	}
	
	public void reducirBondad(int unaCantidad){
		bondad = bondad - unaCantidad;
	}
	

	
}
