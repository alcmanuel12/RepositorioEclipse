package actividadFormativa1;

public class Movil {
	
	private String marca;
	private String modelo;
	private static int numero = (int) (Math.random() * 999999999) + 111111111; ;
	private String memoria;
	private String creado;
	
	public Movil (String marca, String modelo, String memoria) {
		
		this.marca = marca;
		this.modelo = modelo;
		this.memoria = memoria;
		
	}
	
	public void creado() {
		creado = "fabricado" ;
	}
	
	public int getnumero() {
		return numero;
	}
	
	public String getmarca() {
		return marca;
	}
	
	public String getmodelo() {
		return modelo;
	}
	
	public String getmemoria() {
		return memoria;
	}
	
	public String getCreado() {
		return creado;
	}

	
	public static void main(String[] args) {
		
		Movil Movil1 = new Movil ("Iphone", "x", "10Gb");
		Movil1.creado();
		
		System.out.println("La marca del movil es: " + Movil1.getmarca());
		System.out.println("El modelo del movil es: " + Movil1.getmodelo());
		System.out.println("El numero del movil es: +34 " + numero);
		System.out.println("La memoria del movil es: " + Movil1.getmemoria());
		
		Movil Movil2 = new Movil ("Iphone", "12", "124Gb");
		Movil1.creado();
		
		System.out.println("La marca del movil es: " + Movil2.getmarca());
		System.out.println("El modelo del movil es: " + Movil2.getmodelo());
		System.out.println("El numero del movil es: +34 " + numero);
		System.out.println("La memoria del movil es: " + Movil2.getmemoria());
	}
}