
public class Electrodomestico {
	protected int precioBase;
	protected String color;
	protected char consumoEnergetico;
	protected double peso;

	final int PRECIO = 100;
	final String COLOR = "blanco";
	final char CONSUMO = 'F';
	final double PESO = 5;

	public Electrodomestico() {
		super();
		this.precioBase = PRECIO;
		this.color = COLOR;
		this.consumoEnergetico = CONSUMO;
		this.peso = PESO;
	}

	public Electrodomestico(int precioBase, double peso) {
		super();
		this.color = "blanco";
		this.consumoEnergetico = 'F';
		this.precioBase = precioBase;
		this.peso = peso;
	}

	public Electrodomestico(int precioBase, String color, char consumoEnergetico, double peso) {
		super();
		this.precioBase = precioBase;
		this.color = color;
		this.consumoEnergetico = consumoEnergetico;
		this.peso = peso;
	}

	public static boolean comprobarConsumoEnergetico(char letra) {

		if (letra == 'A' || letra == 'B' || letra == 'C' || letra == 'D' || letra == 'E' || letra == 'F') {
			return true;
		} else {
			return false;
		}
	}

	public static boolean comprobarColor(String color) {
		color.toLowerCase();
		if (color.equals("blanco") || color.equals("negro") || color.equals("rojo") || color.equals("azul")
				|| color.equals("gris")) {
			return true;
		} else {
			return false;
		}
	}

	public int precioFinal() {
		int precioFinal = this.precioBase;
		switch (this.consumoEnergetico) {
		case 'A':
			precioFinal += 100;
			break;
		case 'B':
			precioFinal += 80;
			break;
		case 'C':
			precioFinal += 60;
			break;
		case 'D':
			precioFinal += 50;
			break;
		case 'E':
			precioFinal += 30;
			break;
		case 'F':
			precioFinal += 10;
			break;
		
		}
		if (this.peso >= 0 && this.peso <=19) {
			precioFinal+=10;
		} else if (this.peso >= 20 && this.peso <=49) {
			precioFinal+=50;
		}else if (this.peso >= 50 && this.peso <=79) {
			precioFinal+=70;
		}else {
			precioFinal+=100;
		}
		
		return precioFinal;
	}

	

	public void setColor(String color) {
		this.color = color;
	}

	public void setConsumoEnergetico(char consumoEnergetico) {
		this.consumoEnergetico = consumoEnergetico;
	}

	public int getPrecioBase() {
		return precioBase;
	}

	public String getColor() {
		return color;
	}

	public char getConsumoEnergetico() {
		return consumoEnergetico;
	}

	public double getPeso() {
		return peso;
	}

	@Override
	public String toString() {
		return "Electrodomestico [precioBase=" + precioBase + ", color=" + color + ", consumoEnergetico="
				+ consumoEnergetico + ", peso=" + peso + "]";
	}

}
