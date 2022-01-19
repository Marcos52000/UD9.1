import javax.swing.JOptionPane;

public class ElectrodomesticosApp {

	public static Electrodomestico electrodomesticos[] = new Electrodomestico[10];

	public static void main(String[] args) {
		crearTV();
		crearLavadoras();
		int totalLavadoras = 0;
		int totalTv = 0;
		int total = 0;
		for (int i = 0; i < electrodomesticos.length; i++) {
			if (electrodomesticos[i] instanceof Lavadora) {
				totalLavadoras += electrodomesticos[i].precioFinal();
			} else {
				totalTv += electrodomesticos[i].precioFinal();
			}
			total += electrodomesticos[i].precioFinal();
		}
		System.out.println("Precio de todas las lavadoras: " + totalLavadoras);
		System.out.println("Precio de todas los televisores: " + totalTv);
		System.out.println("Precio total de los electrodomesticos: " + total);

	}

	public static void crearTV() {
		for (int i = 0; i < 5; i++) {
			int precioBase = Integer.parseInt(JOptionPane.showInputDialog("Precio base"));
			String color = JOptionPane.showInputDialog("Color");
			char consumo = JOptionPane.showInputDialog("Consumo energetico").charAt(0);
			double peso = Double.parseDouble(JOptionPane.showInputDialog("Peso"));
			int resolucion = Integer.parseInt(JOptionPane.showInputDialog("Resolucion"));
			Television t1 = new Television(precioBase, color, consumo, peso, resolucion, false);
			if (t1.comprobarColor(color)) {
				if (t1.comprobarConsumoEnergetico(consumo)) {
					electrodomesticos[i] = t1;

				} else {
					t1.setConsumoEnergetico('F');
					electrodomesticos[i] = t1;
				}

			} else {
				t1.setColor("blanco");
				if (t1.comprobarConsumoEnergetico(consumo)) {
					electrodomesticos[i] = t1;

				} else {
					t1.setConsumoEnergetico('F');
					electrodomesticos[i] = t1;
				}
			}
		}
	}

	public static void crearLavadoras() {
		for (int i = 5; i < 10; i++) {
			int precioBase = Integer.parseInt(JOptionPane.showInputDialog("Precio base"));
			String color = JOptionPane.showInputDialog("Color");
			char consumo = JOptionPane.showInputDialog("Consumo energetico").charAt(0);
			double peso = Double.parseDouble(JOptionPane.showInputDialog("Peso"));
			int carga = Integer.parseInt(JOptionPane.showInputDialog("Carga"));
			Lavadora l1 = new Lavadora(precioBase, color, consumo, peso, carga);

			if (l1.comprobarColor(color)) {
				if (l1.comprobarConsumoEnergetico(consumo)) {
					electrodomesticos[i] = l1;

				} else {
					l1.setConsumoEnergetico('F');
					electrodomesticos[i] = l1;
				}

			} else {
				l1.setColor("blanco");
				if (l1.comprobarConsumoEnergetico(consumo)) {
					electrodomesticos[i] = l1;

				} else {
					l1.setConsumoEnergetico('F');
					electrodomesticos[i] = l1;
				}
			}
		}
	}
}
