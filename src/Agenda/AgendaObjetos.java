package Agenda;

import java.util.Scanner;

public class AgendaObjetos {

	//Declaración de variables
	private int tam = 20;
	int num = 0;
	private String vNombres[]= new String [tam];
	private int vNumeros[]= new int [tam];
	
	//Declaramos constructores
	public AgendaObjetos() {
		this.tam = 20;
		this.num = 0;
		this.vNombres = new String [tam];
		this.vNumeros = new int [tam];
	}
	
	//Comienzo objetos
	
	public void PintarMenu() {
		
		do {
			
	         Scanner leer=new Scanner(System.in);
	         
	         System.out.println("Pulsa 1 para añadir");
	         System.out.println("Pulsa 2 para editar");
	         System.out.println("Pulsa 3 para eliminar");
	         System.out.println("Pulsa 4 para buscar");
	         System.out.println("Pulsa 5 para mostrar los contactos");
	         System.out.println("Pulsa 6 para eliminar");
	         
	         num=leer.nextInt();
	         
	         switch (num) {
	         case 1: {
	             InicializarVectores();
	             RellenarVectores();

	         }

	         }
	         
	    } while (num!=6);
		
		
	}
	
	public void InicializarVectores() {
		
		for (int i = 0; i < vNombres.length; i++) {
			vNombres[i] = "";
		}
		for (int i = 0; i < vNumeros.length; i++) {
			vNumeros[i] = 0;
		}
	}

	public void RellenarVectores() {
		
		Scanner leer = new Scanner(System.in);
		
		for (int i = 0; i < vNombres.length; i++) {
			if ((vNombres[i].equals("")) && (vNumeros[i]==0)) {
				System.out.println("Dime el nombre del contacto que quieres guardar.");
				vNombres[i] = leer.next();
				System.out.println("Dime el número de teléfono del contacto");
				vNumeros[i] = leer.nextInt();
				break;
			}
		}
		
	}
	
}
