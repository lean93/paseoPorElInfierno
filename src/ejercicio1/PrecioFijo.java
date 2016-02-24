package ejercicio1;

public class PrecioFijo implements TipoPaquete{
	
	public double calcularPrecioBase(Paquete unPaquete, Cliente unCliente){
		return unPaquete.getPrecioBase();
	}

}
