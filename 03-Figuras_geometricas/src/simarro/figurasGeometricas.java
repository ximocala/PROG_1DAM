package simarro;

import java.util.Scanner;

public class figurasGeometricas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		cuadradoRelleno();
		cuadradoVacio();
		
	}
	

	public static void cuadradoRelleno() {
		Scanner teclado = new Scanner (System.in);
		System.out.println("Introducir lado del cuadrado relleno: ");
		int lado = teclado.nextInt();
		
		for(int fila=1; fila<=lado; fila++) {
			for(int colu=1; colu<=lado; colu++) {
					System.out.print("* ");
			}
			System.out.println();
		}
		
	}
	
	public static void cuadradoVacio() {
		Scanner teclado = new Scanner (System.in);
		System.out.println("Introducir lado del cuadrado vacio: ");
		int lado = teclado.nextInt();
		
		for(int fila=1; fila<=lado; fila++) {
			for(int colu=1; colu<=lado; colu++) {
				if(fila==1 || fila==lado || colu==1 || colu==lado) {
					System.out.print("* ");
				} else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
		
	}

}
