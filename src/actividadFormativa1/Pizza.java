package actividadFormativa1;

public class Pizza {

	private String Tamano;
	private String Tipo;
	private static int totalPedidas = 0;
	private static int totalServidas = 0;
	private String estado;

	public Pizza(String Tamano, String Tipo) {

		this.Tamano = Tamano;
		this.Tipo = Tipo;
		this.estado = "Pedida";
		totalPedidas++;

	}

	public void servir() {

		estado = "servida";
		totalServidas++;
	}

	public static int gettotalPedidas() {
		return totalPedidas;
	}

	public static int gettotalServidas() {
		return totalServidas;
	}

	public String getTipo() {
		return Tipo;
	}
	
	public String getTamano() {
		return Tamano;
	}
	public String getEstado() {
		return estado;
	}
	

	public static void main(String[] args) {

		Pizza pizza1 = new Pizza("Familiar", "barbacoa");
		pizza1.servir();

		System.out.println("El numero de pizzas pedidas es: " + Pizza.gettotalPedidas());
		System.out.println("El numero de pizzas servidas es: " + Pizza.gettotalServidas());
		System.out.println("El tipo de pizza pedida es: " + pizza1.getTipo());
		System.out.println("El tama�o de pizza pedidas es: " + pizza1.getTamano());
		
	}
	
}

