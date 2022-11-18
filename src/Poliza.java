import java.util.Scanner;

public class Poliza {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		byte tipo_auto = 0, años = 0, tipo = 0;
		double total = 0;
		double cuota = 0;
		byte alcohol = 0, lentes = 0, enfermedad = 0, anos = 0;
		double almacen_alcohol = 0, almacen_lentes = 0, almacen_enfermedad = 0, almacen_anos = 0;
		
		int contenido1 = 1200;
		int contenido2 = 950;
		
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
			} // fin del if else del tipo A
			
			break;
			
		case 2:
			
			System.out.println("Condicia alcoholizado: ");
			System.out.println("Si (1)");
			System.out.println("No (2)");
			alcohol = entrada.nextByte();
			if (alcohol < 2) {
				almacen_alcohol = (950 * 0.10);
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
				almacen_lentes = (950 * 0.05);
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
				almacen_enfermedad =  (950 * 0.05);
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
				almacen_anos =  (950 * 0.20);
				System.out.println("almacen: " + almacen_anos);
			} else {
				almacen_anos = (950 * 0.10);
				System.out.println("almacen: " + almacen_anos);
			} // fin del if else de tipo B
			
			break;

		default:
			System.out.println("Opcion de auto no valida");
			break;
		}
		
		cuota = (almacen_anos + almacen_enfermedad + almacen_lentes + almacen_alcohol); 
		System.out.println();
		System.out.println("Tu cuota es de: " + cuota);
		
		System.out.println("Ingrese de nuevo su tipo de poliza para hacer el cargo final"); // se pregunta de nuevo el tipo d carro para hacer los cargos finales
		System.out.println("Tipo A (1): ");
		System.out.println("Tipo B (2): ");
		tipo_auto = entrada.nextByte();
		
		if (tipo_auto < 2) {
			total = (contenido1 - cuota);
			
		} else {
			total = (contenido2 - cuota);
		} // fin del if else
		
		System.out.println("Los cargos finales son de: " + total);
		
	}

}
