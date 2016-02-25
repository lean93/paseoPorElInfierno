package unPaseoPorElInfierno;

/**
 * Representacion espiritual de los seres que habitan este mundo. Presa de los demonios, en donde 
 * la forma de salvarse es que dicha alma sea fuerte en bondad y valor.. solo asi podra vencer a los 
 * demonios y sufrir lo menos posible
 * 
 * @author leandrorodriguez
 *
 */
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
