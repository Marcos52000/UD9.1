
public class Lavadora extends Electrodomestico {
	// Atributos
	private int carga;

	// Constructores
	public Lavadora() {
		super();
		this.carga = 5;
	}

	public Lavadora(int precioBase, double peso) {
		super(precioBase, peso);
		this.carga = 5;
		// TODO Auto-generated constructor stub
	}

	public Lavadora(int precioBase, String color, char consumoEnergetico, double peso, int carga) {
		super(precioBase, color, consumoEnergetico, peso);
		this.carga = carga;

		// TODO Auto-generated constructor stub
	}

	public int precioFinal() {
		int precioFinal = super.precioFinal();
		if (this.carga >= 30) {
			precioFinal += 50;
		}
		return precioFinal;

	}

	// Getters
	public int getCarga() {
		return carga;
	}

	

}
