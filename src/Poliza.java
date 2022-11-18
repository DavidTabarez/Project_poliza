import java.util.Scanner;

public class Poliza {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		byte tipo_auto = 0, años = 0;
		double total = 0;
		double cuota = 0;
		byte alcohol = 0, lentes = 0, enfermedad = 0, anos = 0;
		double almacen_alcohol = 0, almacen_lentes = 0, almacen_enfermedad = 0, almacen_anos = 0;
		
		System.out.println("Ingrese el tipo de auto: ");
		System.out.println("Tipo A (1): ");
		System.out.println("Tipo B (2): ");
		tipo_auto = entrada.nextByte();
		
		switch (tipo_auto) {
		case 1:
			
			System.out.println("Condicia alcoholizado: ");
			System.out.println("Si (1)");
			System.out.println("No (2)");
			alcohol = entrada.nextByte();
			if (alcohol < 2) {
				almacen_alcohol = (1200 * 0.10);
				System.out.println("almacen: " + almacen_alcohol);
			} else {
				almacen_alcohol = (0);
				System.out.println("almacen: " + almacen_alcohol);
			}
				
			System.out.println("Padese lentes: ");
			System.out.println("Si (1)");
			System.out.println("No (2)");
			lentes = entrada.nextByte();
			if (lentes < 2) {
				almacen_lentes = (1200 * 0.05);
				System.out.println("almacen: " + almacen_lentes);
			} else {
				almacen_lentes = (0);
				System.out.println("almacen: " + almacen_lentes);
			}
			
			System.out.println("Padese una enfermedad: ");
			System.out.println("Si (1)");
			System.out.println("No (2)");
			enfermedad = entrada.nextByte();
			if (enfermedad < 2) {
				almacen_enfermedad =  (1200 * 0.05);
				System.out.println("almacen: " + almacen_enfermedad);
			} else {
				almacen_enfermedad = (0);
				System.out.println("almacen: " + almacen_enfermedad);
			}
			
			System.out.println("Tiene una edad mayor a 40 años: ");
			System.out.println("Si (1)");
			System.out.println("No (2)");
			anos = entrada.nextByte();
			if (anos < 2) {
				almacen_anos =  (1200 * 0.20);
				System.out.println("almacen: " + almacen_anos);
			} else {
				almacen_anos = (1200 * 0.10);
				System.out.println("almacen: " + almacen_anos);
			}
			
			break;
			
		case 2:
			
			
			
			break;

		default:
			break;
		}

	}

}
