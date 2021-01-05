package Prueba;

import java.util.Scanner;

public class PruebaObjetos {
	// command+shif+l muestra todos los atajos de teclado
	// Declaración de variables
	private int tam = 20;
	int num = 0;
	private String vNombres[] = new String[tam];
	private String vNumeros[] = new String[tam];

	// Declaramos constructores
	public PruebaObjetos() {
		this.tam = 20;
		this.num = 0;
		this.vNombres = new String[tam];
		this.vNumeros = new String[tam];
	}
	
	public PruebaObjetos(int tam, int num, String[] vNombres, String[] vNumeros) {
		this.tam = tam;
		this.num = num;
		this.vNombres = vNombres;
		this.vNumeros = vNumeros;
	}

	// Comienzo objetos

	public void PintarMenu() {
		
		InicializarVectores();

		while (num != 6) {

			Scanner leer = new Scanner(System.in);

			System.out.println("Pulsa 1 para añadir");
			System.out.println("Pulsa 2 para editar");
			System.out.println("Pulsa 3 para eliminar");
			System.out.println("Pulsa 4 para buscar");
			System.out.println("Pulsa 5 para mostrar los contactos");
			System.out.println("Pulsa 6 para salir de la aplicación");

			num = leer.nextInt();

			switch (num) {
			case 1: {
				RellenarVectores();
				break;

			}
			case 2: {
				EditarContacto();
				break;
			}
			case 3: {
				BorrarContacto();
				break;
			}
			case 4: {
				BuscarContacto();
				break;
			}
			case 5: {
				MostrarContactos();
				break;
			}
			}
		}

	}

	public void InicializarVectores() {

		for (int i = 0; i < vNombres.length; i++) {
			vNombres[i] = "";
		}
		for (int i = 0; i < vNumeros.length; i++) {
			vNumeros[i] = "";
		}
	}

	public void RellenarVectores() {

		Scanner leer = new Scanner(System.in);

		for (int i = 0; i < vNombres.length; i++) {
			if ((vNombres[i].equals("")) && (vNumeros[i].equals(""))) {
				System.out.println("Dime el nombre del contacto que quieres guardar.");
				vNombres[i] = leer.next();
				System.out.println("Dime el número de teléfono del contacto");
				vNumeros[i] = leer.next();
				break;
			}

		}

	}

	public void BuscarContacto() {

		String busqueda = "";

		Scanner leer = new Scanner(System.in);
		System.out.println("Dime el nombre del contacto que deseas buscar.");
		busqueda = leer.next();

		for (int i = 0; i < vNombres.length; i++) {
			if ((vNombres[i].equalsIgnoreCase(busqueda)) || (vNumeros[i] == busqueda)) {
				System.out.println("El nombre del contacto es: " + vNombres[i] + " y su teléfono es: " + vNumeros[i]);
			}
		}
	}

	public void EditarContacto() {

		String edit = "";

		Scanner leer = new Scanner(System.in);
		System.out.println("Dime el nombre o el telefono de la persona que deseas editar.");
		edit = leer.next();

		for (int i = 0; i < vNombres.length; i++) {
			if ((vNombres[i].equalsIgnoreCase(edit)) || (vNumeros[i].equals(edit))) {
				System.out.println("Dime el nuevo nombre del contacto.");
				vNombres[i] = leer.next();
				System.out.println("Dime el nuevo numero del contacto.");
				vNumeros[i] = leer.next();
			}
		}
	}

	public void BorrarContacto() {
		String nom = "";
		Scanner leer = new Scanner(System.in);

		System.out.println("Dime el nombre del contacto que quieres borrar.");
		nom = leer.next();

		for (int i = 0; i < vNombres.length; i++) {
			if (nom.equalsIgnoreCase(vNombres[i])) {
				vNombres[i] = "";
				vNumeros[i] = "";
				break;
			}

		}
	}

	public void MostrarContactos() {

		for (int i = 0; i < vNombres.length; i++) {
			if (!(vNombres[i].equals("")) && !(vNumeros[i].equals("")))
				System.out.println(vNombres[i] + " " + vNumeros[i]);
		}
	}
}
