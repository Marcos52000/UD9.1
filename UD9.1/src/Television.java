
public class Television extends Electrodomestico {
	// Atributos
	private int resolucion;
	private boolean sintonizadorTDT;
	
	// Constructores 
	public Television() {
		super();
		this.resolucion = 20;
		this.sintonizadorTDT = false;
	}

	public Television(int precioBase, double peso) {
		super(precioBase, peso);
		this.resolucion = 20;
		this.sintonizadorTDT = false;
		// TODO Auto-generated constructor stub
	}

	public Television(int precioBase, String color, char consumoEnergetico, double peso,int resolucion,boolean sintonizadorTDT ) {
		super(precioBase, color, consumoEnergetico, peso);
		this.resolucion = resolucion;
		this.sintonizadorTDT = sintonizadorTDT;
		// TODO Auto-generated constructor stub
	}
	
	
	public int precioFinal() {
		int precioFinal = super.precioFinal();
		if (this.resolucion >= 40) {
			precioFinal = (int) (precioFinal * 0.3);
		} 
		if (sintonizadorTDT == true) {
			precioFinal+= 50;
		}
		return precioFinal;
		
	}

	//Getters
	public int getResolucion() {
		return resolucion;
	}

	public boolean isSintonizadorTDT() {
		return sintonizadorTDT;
	}
	

}
