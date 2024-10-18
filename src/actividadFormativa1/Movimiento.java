package actividadFormativa1;

public class Movimiento {

	private float saldoCuenta = 0;
	private float Cantidad;
	private String Concepto;
	private int idMovimiento=0;
	
	public Movimiento(String Concepto) {
		this.Concepto = Concepto;
	}
	
	public float getSaldoCuenta() {
		return saldoCuenta;
	}
	public float getCantidad() {
		return Cantidad;
	}
	public String getConcepto() {
		return Concepto;
	}
	public int getIdMovimiento() {
		return idMovimiento;
	}

	public class MovimientosBancarios {
		public int Nomina=1200;
		public int facturaTelefonia=-80;
		public int facturaLuz=-150;	
		
	
	
	public void Movimiento() {
	
		saldoCuenta = saldoCuenta + Nomina;
		idMovimiento++;
		
	}
	
	public void Movimiento2() {
		
		saldoCuenta = saldoCuenta + facturaTelefonia;
		idMovimiento++;
		
	}
	
	public void Movimiento3() {
		
		saldoCuenta = saldoCuenta + facturaLuz;
		idMovimiento++;
}
}	
	
	public static void main(String[] args) {
		Movimiento Movimiento1 = new Movimiento("Movimientos para cobro de factura" );
		
		System.out.println("se realizaron " + Movimiento1.getConcepto());
		System.out.println("tu cuenta bancaria es de : " + Movimiento1.getSaldoCuenta());
		System.out.println("se realizaron " + Movimiento1.getIdMovimiento());
	
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
