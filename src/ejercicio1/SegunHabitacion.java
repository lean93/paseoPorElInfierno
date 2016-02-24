package ejercicio1;

public class SegunHabitacion implements TipoPaquete{
	
	private int cantidadHabitaciones;
	private double precioHabitaciones;
	
	public SegunHabitacion(int unaCantidad, double unPrecio){
		cantidadHabitaciones = unaCantidad;
		precioHabitaciones = unPrecio;
		
	}
	public double calcularPrecioBase(Paquete unPaquete, Cliente unCliente){
		return cantidadHabitaciones * precioHabitaciones;
	}

}
