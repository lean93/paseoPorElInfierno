package ejercicio1;

public class Main {

	public static void main(String args[]) {

		Cliente cliente = new Cliente(6000);
		Paquete paquete = new Paquete(200, 1.2, new SegunSaldoCliente());
		
		
		System.out.println("Saldo del Cliente antes de compra:" + cliente.getSaldo());
		cliente.comprarPaquete(paquete);
		System.out.println("Saldo del Cliente despues de la compra:" + cliente.getSaldo());
		
		cliente.comprarPaquete(paquete);
		
		System.out.println("Saldo del Cliente despues de la compra:" + cliente.getSaldo());
		
		System.out.println(cliente.getCantidadDeCompras());
		System.out.println(cliente.getTotalGastado());
	}
}
